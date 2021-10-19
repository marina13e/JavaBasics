package lection9;

public class ProgramParameters {
    public static void main(String[] args) {
        System.out.println("Args count = " + args.length);

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
