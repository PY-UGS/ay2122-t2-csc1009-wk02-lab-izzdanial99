public class Lab2_Q3{


    public static void main(String[] args){
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        long currentSeconds = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHours = totalHours%60;

        System.out.printf("Current time is %d:%d:%d GMT",currentHours,currentMinutes,currentSeconds);
    }
}