
public class SevenNumber {

    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (isMultipleOfSeven(i) || hasSeven(i)) {
                System.out.println("i = " + i + "clap!");
            } else {
                System.out.println("i = " + i);
            }
        }
    }
    
    public static boolean isMultipleOfSeven(int n) {
        if (n % 7 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean hasSeven(int n) {
        if (n / 100 == 7 || (n / 10) % 10 == 7 || n % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }

}
