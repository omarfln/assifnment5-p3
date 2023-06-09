// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer("hp", "Intel", 64, 3.4);
        Computer comp2 = new Computer("hp", "Intel", 64, 3.4);

        System.out.println(comp1.equals(comp2));

        System.out.println("Hash code of comp1: " + comp1.hashCode());
        System.out.println("Hash code of comp2: " + comp2.hashCode());

    }
}