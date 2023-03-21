import java.util.Scanner;

public class Q12Time {

    public static int clock_degree(int m, int h){
        int degree_hour = 30*h + m/2; //hour needle moves 30 degrees/hour.
        int degree_minute = m*6; //minute needle

        if(degree_hour-degree_minute>=0) return degree_hour-degree_minute; //to prevent 0

        else return 360+degree_hour-degree_minute;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();

        if(m==60){
            h++;
            m-=60;
        }

        h%=12; //modulo by 12 because there are only 12 hour points on a clock
        System.out.println(Q12Time.clock_degree(m,h));

    }
}
