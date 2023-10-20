package pract4.pract4_0;

public class task1 {
    public void iLoveSeason(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("I love winter");
            case SPRING:
                System.out.println("I love spring");
            case SUMMER:
                System.out.println("I love summer");
            case AUTUMN:
                System.out.println("I love autumn");
        }
    }

    public static void main(String[] args) {
        Seasons season = Seasons.SUMMER;
        System.out.printf("Season: %s, number: %d\n", season, season.ordinal() + 1);
        for (Seasons s : Seasons.values()) {
            System.out.printf("Season: %s, average temp: %.1f, description: %s\n", s, s.avgTemp, s.getDescription());
        }
    }
}

enum Seasons {
    WINTER(-9.2f) {
        public String getDescription() {
            return "Cold season";
        }
    },
    SPRING(6.5f) {
        public String getDescription() {
            return "Green season";
        }
    },
    SUMMER(24.6f) {
        public String getDescription() {
            return "Warm season";
        }
    },
    AUTUMN(14.1f) {
        public String getDescription() {
            return "Rain season";
        }
    };

    public abstract String getDescription();

    float avgTemp;

    Seasons(float avgTemp) {
        this.avgTemp = avgTemp;
    }
}