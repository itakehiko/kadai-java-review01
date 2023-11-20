
public class Clock {

    public static void main(String[] args) {
        int result = getSeconds(18, 32, 47);
        
        System.out.println("経過秒数は " + result + " 秒です");
    }
    
    public static int getSeconds(int hour, int minutes, int seconds) {
        int result = hour * 60 * 60
                + minutes * 60
                + seconds;
        
        return result;
    }

}
