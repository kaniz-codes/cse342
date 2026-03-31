import java.util.*;

class Time{
    int hours, minutes, seconds;

    Time(){
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Time add_time(Time t1, Time t2){
        int s = t1.seconds + t2.seconds;
        int m = t1.minutes + t2.minutes;
        int h = t1.hours + t2.hours;

        if(s >= 60){
            m = m + (s/60);
            s = s % 60;
        }
        if(m >= 60){
            h = h + (m/60);
            m = m %60;
        }
        return new Time(h,m,s);
    }

    void display(){
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
public class task{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        Time t1 = new Time(h1,m1,s1);
        Time t2 = new Time(h2,m2,s2);

        Time obj = new Time();
        Time t3 = obj.add_time(t1,t2);

        t3.display();
    }
}