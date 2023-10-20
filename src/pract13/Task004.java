package pract13;

class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nDescription: " + description + "\nColor: " + color + "\nSize: " + size + "\n";
    }
}

public class Task004 {
    public static void main(String[] args) {
        String[] shirtsData = {
                "S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L", "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M", "S005,Tan Polo Shirt,Tan,XL", "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL", "S008,White T-Shirt,White,L", "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S", "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirts = new Shirt[shirtsData.length];

        for (int i = 0; i < shirtsData.length; i++) {
            String[] shirtInfo = shirtsData[i].split(",");
            String id = shirtInfo[0];
            String description = shirtInfo[1];
            String color = shirtInfo[2];
            String size = shirtInfo[3];
            shirts[i] = new Shirt(id, description, color, size);
        }

        // Выводим информацию о рубашках на консоль
        for (Shirt shirt : shirts) {
            System.out.println(shirt);
        }
    }
}

