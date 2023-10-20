package pract11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task001 {
    public static void main(String[] args) {
        EmpTask empTask = new EmpTask("kolya", new Date());
        empTask.print();
    }

}
class EmpTask{
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 'at' hh:mm:ss");
    String devName;
    Date d;
    EmpTask(String devName, Date d){
        this.devName = devName;
        this.d = d;
    }
    void print(){
        System.out.println(this);
    }
    @Override
    public String toString(){
        return String.format("Name: %s\nDate: %s", devName, sdf.format(d));
    }
}