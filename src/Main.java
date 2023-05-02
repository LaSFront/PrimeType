public class Main {
    public static void main(String[] args) {

        int price = 12_163; // цена билета, руб.
        int mileCost = 20; // за одну милю, руб.
        int miles = price / mileCost; // начисленные мили за покупку билета
        System.out.println("Спасибо, что пользуетесь нашими авиалиниями!");
        System.out.println("Вам начислено:");
        System.out.println(miles + " миль");
    }
}
