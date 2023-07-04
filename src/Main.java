public class Main {
    public static void main(String[] args) {
        int Balance = 100; // баланс
        int AddBalance = 1100; // пополнение баланса
        int bonus;

        if (AddBalance > 1000) {
            bonus = AddBalance / 100;
        } else {
            bonus =0; }
        Balance = Balance + AddBalance + bonus;
        System.out.println("Ваш баланс: " + Balance + " рублей.");
        System.out.println("Бонус: " + bonus + " рублей.");


    }


    }



