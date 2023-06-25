public class BilanganGanjil    {
    public static void main(String[] args) {
        System.out.println("Bilangan ganjil yang merupakan kelipatan 3 antara 1 sampai 50:");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
