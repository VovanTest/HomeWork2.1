public class Main {
    public static void main (String[] args) {
        int balance = 100; // баланс
        int addBalance = 300; // пополнение баланса
        int bonus;

        if (addBalance > 1000) {
            bonus = addBalance / 100;
        } else {
            bonus = 0;
        }
        balance = balance + addBalance + bonus;
        System.out.println("Ваш баланс после пополнения: " + balance + " рублей.");
        System.out.println("Бонус: " + bonus + " рублей.");
    }
}
