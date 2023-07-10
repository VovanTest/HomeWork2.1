public class main {
    public static void main(String[] args) {
        int Balance = 100; // баланс
        int AddBalance = 1100; // пополнение баланса
        int bonus;

        if (AddBalance > 1000) {
            bonus = AddBalance / 100;
        } else {
            bonus = 0;
        }
        Balance = Balance + AddBalance + bonus;
        System.out.println("Ваш баланс после пополнения в 1100р: " + Balance + " рублей.");
        System.out.println("Бонус: " + bonus + " рублей.");




        int BalanceFirst = 100; // баланс
        int AddBalanceFirst = 300; // пополнение баланса
        int bonusFirst;
        if (AddBalanceFirst > 1000) {
            bonusFirst = AddBalanceFirst / 100;
        } else {
            bonusFirst = 0;
        }

        BalanceFirst = BalanceFirst + AddBalanceFirst + bonusFirst;
        System.out.println("Ваш баланс после пополнения в 300р: " + BalanceFirst + " рублей.");
        System.out.println("Ваш бонус: " + bonusFirst + " рублей.");


    }

}





