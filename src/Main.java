public class Main {
    public static void main(String[] args) {

        int initialBalance = 400; // начальное значение счёта
        int rechargeAmount = 1800; // сумма пополнения
        int bonus = (rechargeAmount / 100) * 1; // бонус 1 рубль за каждые полные 100 рублей

        if (rechargeAmount > 1000) {
            bonus = (rechargeAmount / 100) * 1;
        } else {
            bonus = 0;
            System.out.println("Бонусы не начисляются, так как сумма пополнения менее 1000 рублей.");
        }

        int totalBalance = initialBalance + rechargeAmount + bonus;

        System.out.println("Итоговый баланс на счёте: " + totalBalance + " рублей.");

    }
}
