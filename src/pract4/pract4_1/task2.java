package pract4.pract4_1;

public class task2 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("79231342343", "Apple Iphone 8", 176);
        phone1.receiveCall("Sam");
        phone1.receiveCall("Sam", "79231342337");
        phone1.getNumber();
        Phone phone2 = new Phone("79735703529", "Samsung Galaxy X", 199);
        phone2.receiveCall("Ben");
        phone2.receiveCall("Ben", "79735703536");
        phone2.getNumber();
        Phone phone3 = new Phone("79835295734", "Xiaomi Redmi A9", 189);
        phone3.receiveCall("Mike");
        phone3.receiveCall("Mike", "79835295724");
        phone3.getNumber();
        System.out.printf("%s\n%s\n%s\n", phone1, phone2, phone3);
        phone3.sendMessage("79231342343", "79231342337", "79231342345", "79231342322", "79238283337");
    }
}
class Phone{
    String number = "";
    String model = "";
    int weight = 0;
    Phone(String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }
    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    Phone(){}
    void receiveCall(String callerName){
        System.out.printf("%s calling...\n", callerName);
    }
    void receiveCall(String callerName, String callerNumber){
        System.out.printf("%s calling from number %s ...\n", callerName, callerNumber);
    }
    String getNumber(){
        return this.number;
    }
    void sendMessage(String... numbers){
        for (String number:numbers) {
            System.out.println(number);
        }
    }

    @Override
    public String toString(){
        return String.format("%s, %s, %d", number, model, weight);
    }
}