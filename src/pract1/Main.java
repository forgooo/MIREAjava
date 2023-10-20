package pract1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void z3(){
        Scanner sc = new Scanner(System.in);
        int[] data = new int[10];
        float sum = 0;
        for(int i = 0; i < 10; i++){
            data[i] = sc.nextInt();
            sum += data[i];
        }
        System.out.printf("Sum is %f", sum);
        System.out.printf("Avg is %f", sum/10);
    }

    static void z4(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>(10);

        int a;
        while(true){
            a = sc.nextInt();
            if(a == 0) break;
            else data.add(a);
        }

        int sum = 0;
        int c = data.size();
        int i = 0;
        while(c != i){
            sum += data.get(i);
            i++;
        }
        System.out.printf("While = %d", sum);
        System.out.println();
        sum = 0;
        i = 0;
        do {
            sum += data.get(i);
            i++;
        } while(c != i);
        System.out.printf("While = %d", sum);
        System.out.println();
        Collections.sort(data);
        System.out.printf("Min is %d, max is %d", data.get(0), data.get(data.size()-1));
    }

    static void z5(String[] args){
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    static void z6(){
        for (int i = 1; i < 11; i++) {
            System.out.println(1./i);
        }
    }

    static int z7(int n){
        if(n == 0) return 1;
        else return(n*z7(n-1));
    }

    public static void main(String[] args) {
        z3();
        z4();
        z5(args);
        z6();
        System.out.println(z7(5));
    }
}

