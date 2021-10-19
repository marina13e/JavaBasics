package lection12;

public class Url {
    public static String getServerName(String url) {
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf("/", startIndex);

        if (endIndex == -1) {
            endIndex = url.length();
        }

        return url.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String url = "http://someservername/";

        String serverName = getServerName(url);
        System.out.println("Наименование сервера: " + serverName);
    }
}
