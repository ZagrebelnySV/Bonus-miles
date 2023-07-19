public class Main {

    public static void main(String[] args) {
        int ticketPrice = 15473; // стоимость билета
        int bonusAccrualCoefficient = 20; // коэффициент начисления бонусов 1 миля за 20 рублей
        int bonusMiles = ticketPrice / bonusAccrualCoefficient; // количество начисленных бонусных миль
        System.out.println("Начисленно " + bonusMiles + " миль.");
    }
}
