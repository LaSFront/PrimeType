public class Main {
    public static void main(String[] args) {

        int x = 12_163; //рублей, стоимость билета
        int y = 20; //рублей, за одну милю
        int i = x / y; //начисленные мили за покупку билета
        System.out.println("Спасибо, что пользуетесь нашими авиалиниями!");
        System.out.println("Вам начислено:");
        System.out.println(i + " миль");
    }
}
