public class bonus {

    public static void main(String[] args) {

        int balanse = 100;
        int x = 1289;
        if (x > 1000) {

            System.out.println("Ваш баланс: " + (balanse + x / 100 + x) + " рублей");
            System.out.println("Вам начисленно: " + (x / 100) + " бонусных рублей");

        }
        if (x < 1000) {

            System.out.println("Ваш баланс: " + (x + balanse) + " рублей(ля)");

        }

    }

}
