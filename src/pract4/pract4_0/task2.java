package pract4.pract4_0;

import com.sun.security.auth.NTSid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        Atelier atelier = new Atelier();
        atelier.dressMan();
        atelier.dressWoman();
    }
}
enum Sizes{
    XXS(32){
        public String getDescription(){
            return "Child size";
        }
    }, XS(34), S(36), M(38), L(40);
    int euroSize;
    Sizes(int euroSize){
        this.euroSize = euroSize;
    }
    public String getDescription(){
        return "Adult size";
    }

}
interface MenClothing{
    void dressMan();
}
interface WomenClothing{
    void dressWoman();
}
abstract class Clothes {
    Sizes size;
    int price;
    String color;
    char gender;
}
class TShirt extends Clothes implements MenClothing, WomenClothing{

    @Override
    public void dressMan() {
        this.size = Sizes.M;
        this.price = 2999;
        this.color = "blue";
        this.gender = 'M';
    }

    @Override
    public void dressWoman() {
        this.size = Sizes.S;
        this.price = 1999;
        this.color = "rose";
        this.gender = 'F';
    }

    @Override
    public String toString(){
        return String.format("TShirt{size: %s, price: %d, color: %s, gender: %c}", this.size, this.price, this.color, this.gender);
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing{
    @Override
    public void dressMan() {
        this.size = Sizes.M;
        this.price = 3999;
        this.color = "black";
        this.gender = 'M';
    }

    @Override
    public void dressWoman() {
        this.size = Sizes.S;
        this.price = 2999;
        this.color = "white";
        this.gender = 'F';
    }

    @Override
    public String toString(){
        return String.format("Pants{size: %s, price: %d, color: %s, gender: %c}", this.size, this.price, this.color, this.gender);
    }
}

class Skirt extends Clothes implements WomenClothing{
    @Override
    public void dressWoman() {
        this.size = Sizes.XS;
        this.price = 999;
        this.color = "grey";
        this.gender = 'F';
    }
    @Override
    public String toString(){
        return String.format("Skirt{size: %s, price: %d, color: %s, gender: %c}", this.size, this.price, this.color, this.gender);
    }
}

class Tie extends Clothes implements MenClothing{
    @Override
    public void dressMan() {
        this.size = Sizes.M;
        this.price = 999;
        this.color = "red";
        this.gender = 'M';
    }
    @Override
    public String toString(){
        return String.format("Tie{size: %s, price: %d, color: %s, gender: %c}", this.size, this.price, this.color, this.gender);
    }
}

class Atelier implements MenClothing, WomenClothing{

    List<Clothes> clothes;
    Atelier(){
        TShirt tshirtMan = new TShirt();
        tshirtMan.dressMan();
        TShirt tshirtWoman = new TShirt();
        tshirtWoman.dressWoman();
        Pants pantsMan = new Pants();
        pantsMan.dressMan();
        Pants pantsWoman = new Pants();
        pantsWoman.dressWoman();
        Skirt skirtWomen = new Skirt();
        skirtWomen.dressWoman();
        Tie tieMan = new Tie();
        tieMan.dressMan();
        clothes = Arrays.asList(tshirtMan, tshirtWoman, pantsMan, pantsWoman, skirtWomen, tieMan);

    }
    @Override
    public void dressMan() {
        for (Clothes c:clothes) {
            if (c.gender == 'M')System.out.printf("%s\n", c);
        }
    }

    @Override
    public void dressWoman() {
        for (Clothes c:clothes) {
            if (c.gender == 'F')System.out.printf("%s\n", c);
        }
    }
}