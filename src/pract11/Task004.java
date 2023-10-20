package pract11;

import java.util.Calendar;
import java.util.Date;

public class Task004 {
    public static void main(String[] args) {
        DateGen dg = new DateGen(2017, 0, 23, 14, 50, 34);
        dg.generate();
    }
}
class DateGen{
    int[] elements = new int[6];
    DateGen(int... elements){
        for (int i = 0; i < this.elements.length; i++) {
            this.elements[i] = elements[i];
        }
    }
    void generate(){
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(Calendar.YEAR, elements[0]);
        cal.set(Calendar.MONTH, elements[1]);
        cal.set(Calendar.DAY_OF_MONTH, elements[2]);
        cal.set(Calendar.HOUR_OF_DAY, elements[3]);
        cal.set(Calendar.MINUTE, elements[4]);
        cal.set(Calendar.SECOND, elements[5]);

        System.out.println(cal.getTime());
    }
}