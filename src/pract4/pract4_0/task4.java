package pract4.pract4_0;

public class task4 {
    public static void main(String[] args) {

    }
}
class Computer{
    Processor processor;
    Memory memory;
    Monitor monitor;
    Brand brand;

    Computer(){
        this.processor = new Processor();
        this.memory = new Memory();
        this.monitor = new Monitor();
        this.brand = Brand.LENOVO;
    }
}
class Processor{
    String brand;
    int transistorSizeNm;
    int architecture;

    Processor(){
        this.brand = "Intel";
        this.transistorSizeNm = 5;
        this.architecture = 64;
    }
}
class Memory{
    int memoryGb;
    Memory(){
        this.memoryGb = 256;
    }
}
class Monitor{
    float inch;
    String resolution;
    Monitor(){
        this.inch = 29.1f;
        this.resolution = "1920x1080";
    }
}
enum Brand{
    HP, APPLE, MSI, HUAWEI, LENOVO, SONY
}