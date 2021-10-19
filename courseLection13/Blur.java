package courseLection13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {
    public static int sat(double colorIntensity) {
        if (colorIntensity < 0) {
            return 0;
        }

        return (int) Math.min(colorIntensity, 255);
    }

    public static void main(String[] args) throws IOException {
        BufferedImage originalImage = ImageIO.read(new File("image.jpg"));
        WritableRaster originalImageRaster = originalImage.getRaster();

        BufferedImage resultImage = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_INT_RGB);
        WritableRaster resultImageRaster = resultImage.getRaster();

        double[][] matrix = new double[3][3];
        double matrixSize = (double) matrix.length * matrix[0].length;

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                matrix[y][x] = 1 / matrixSize;
            }
        }

        int width = originalImageRaster.getWidth();
        int height = originalImageRaster.getHeight();

        int matrixOffset = matrix.length / 2;

        final int COLORS_COUNT_IN_RGB = 3;
        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        int[] neighboringPixel = new int[COLORS_COUNT_IN_RGB];
        double[] colorIntensity = new double[COLORS_COUNT_IN_RGB];
        int bottomBound = height - matrixOffset;
        int rightBound = width - matrixOffset;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                originalImageRaster.getPixel(x, y, pixel);

                if (y >= matrixOffset && x >= matrixOffset && y < bottomBound && x < rightBound) {
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            originalImageRaster.getPixel(x - matrixOffset + j, y - matrixOffset + i, neighboringPixel);

                            for (int k = 0; k < COLORS_COUNT_IN_RGB; k++) {
                                colorIntensity[k] += neighboringPixel[k] * matrix[i][j];
                            }
                        }
                    }

                    for (int i = 0; i < COLORS_COUNT_IN_RGB; i++) {
                        pixel[i] = sat((int) colorIntensity[i]);
                        colorIntensity[i] = 0;
                    }
                }

                resultImageRaster.setPixel(x, y, pixel);
            }
        }

        ImageIO.write(resultImage, "png", new File("out3.png"));
    }
}
