package Classes.BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter fatih = new Fighter("Fatih Karaoğlu", 18, 100, 96, 10);
        Fighter utku = new Fighter("Utku Duhan Onan", 16, 85, 88, 20);
        Ring octagon = new Ring(fatih, utku, 80, 100);
        octagon.match();
    }
}
