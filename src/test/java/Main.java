public class Main {

    public static void main(String[] args) {
        // Входные данные — можно менять значения
        int currentBalance = 100;      // текущий счёт клиента
        int depositAmount = 1100;      // сумма пополнения

        int bonus = 0;

        // Проверка: если пополнение больше 1000, начисляем бонус
        if (depositAmount > 1000) {
            // Бонус: по 1 рублю за каждые полные 100 рублей пополнения
            bonus = depositAmount / 100;
        }

        // Итоговая сумма на счёте
        int finalBalance = currentBalance + depositAmount + bonus;

        System.out.println("Сумма пополнения: " + depositAmount + " руб.");
        System.out.println("Начислено бонусов: " + bonus + " руб.");
        System.out.println("Итоговая сумма на счету: " + finalBalance + " руб.");
    }
}
