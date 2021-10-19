package lection6;

public class Overload {
    public static int getTypeSize(byte a) {
        return 1;
    }

    public static int getTypeSize(short a) {
        return 2;
    }

    public static int getTypeSize(int a) {
        return 4;
    }

    public static int getTypeSize(long a) {
        return 8;
    }

    public static int getTypeSize(float a) {
        return 4;
    }

    public static int getTypeSize(double a) {
        return 8;
    }

    public static void main(String[] args) {
        int a = getTypeSize((byte) 1);
        int b = getTypeSize((short) 324);
        int c = getTypeSize(3245678);
        int d = getTypeSize((long) 45.48);
        int e = getTypeSize((float) 4654838.45);
        int f = getTypeSize(478.068);
        System.out.printf("Размер в байтах: %n1 число = %d %n2 число = %d %n3 число = %d %n4 число = %d %n5 число = %d %n6 число = %d", a, b, c, d, e, f);
    }
}
