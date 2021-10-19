package courseLection8;

public class Palindrome {
    public static boolean isPalindrome(String string) {
        string = string.toLowerCase();

        int startSymbolIndex = 0;
        int endSymbolIndex = string.length() - 1;

        while (startSymbolIndex <= endSymbolIndex) {
            char startSymbol = string.charAt(startSymbolIndex);
            char endSymbol = string.charAt(endSymbolIndex);

            if (!Character.isLetter(startSymbol) && !Character.isLetter(endSymbol)) {
                startSymbolIndex++;
                endSymbolIndex--;
            } else if (Character.isLetter(startSymbol) && Character.isLetter(endSymbol)) {
                if (startSymbol != endSymbol) {
                    return false;
                }

                startSymbolIndex++;
                endSymbolIndex--;
            } else if (!Character.isLetter(startSymbol)) {
                startSymbolIndex++;
            } else {
                endSymbolIndex--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String string = ".,Аргентина .ман,ит негра,";

        System.out.println("Данная строка является палиндромом - " + isPalindrome(string));
    }
}
