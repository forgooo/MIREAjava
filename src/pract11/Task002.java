package Prac011;

import java.util.Date;

public class Task002 {
    public static void main(String[] args) {
        Date d = new Date();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}

        CompareDates cd = new CompareDates(d);
        cd.compare();
    }
}
class CompareDates{
    Date userDate;
    CompareDates(Date userDate){
        this.userDate = userDate;
    }
    void compare(){
        long diff = new Date().getTime() - userDate.getTime();
        System.out.printf("%d millis", diff);
    }
}