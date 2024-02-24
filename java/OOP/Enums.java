package OOP;

public class Enums {
    public static void main(String[] args) {
        System.out.println(Difficulty.EASY);
        System.out.println(Difficulty.EASY.prettyPrint());
    }
}


enum Difficulty {
    EASY,
    MEDUM,
    HARD;

    public String prettyPrint() {
        return name().toLowerCase();
    }
}
