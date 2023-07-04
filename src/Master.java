public class Master {
    public static void main(String[] args) {
        int Balance = 100; // баланс
        int AddBalance = 300; // пополнение баланса
        int bonus;
        if (AddBalance > 1000) {
            bonus = AddBalance / 100;
        } else {
            bonus = 0;
        }

        Balance = Balance + AddBalance + bonus;
        System.out.println("Ваш баланс: " + Balance + " рублей.");
        System.out.println("Ваш бонус: " + bonus + " рублей.");
    }
}
