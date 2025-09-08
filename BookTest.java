public class BookTest {
    public static void main(String[] args) {
        Book brh = new Book("Terima Kasih Pak Jokowi", 1965, 2014.2024);
        brh.display();

        Book jarah = new Book("Hasil Jarahan dari Rumah Syahroni", 2025, 34000);
        jarah.display();
        System.out.println(jarah.title +", "+brh.title);
    }
}
