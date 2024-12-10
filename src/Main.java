public class Main {
    public static void main(String[] args) {

        int praice = 45_739; // стоимость билета
        int rub = 20; // количество рублей для начисления 1 бонусной мили

        int miles = (praice / rub); // количество бонусных миль

        System.out.println(miles + " бонусных(ая) миль(а/и)");
    }
}