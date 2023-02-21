public class Main {
    public static void main(String[] args) {

        MobilePhone xiaomi = new MobilePhone(true, "Android", "Xiaomi");
        MobilePhone apple = new MobilePhone(true, "IOS", "Apple");
        MobilePhone samsung = new MobilePhone(true, "Android", "Samsung");
        MobilePhone nokia = new MobilePhone(false, "Symbian", "Nokia");

        System.out.println(xiaomi);
        System.out.println(apple);
        System.out.println(samsung);
        System.out.println(nokia);
        System.out.println("-------------------------------");

        iPhone iphone12 = new iPhone(true, "IOS", "Apple", "iPhone 12", 6, 128, 20);
        iPhone iphone14 = new iPhone(true, "IOS", "Apple", "iPhone 14", 8, 512, 40);

        System.out.println(iphone12);
        System.out.println(iphone14);
        System.out.println("-------------------------------");


        iphone12.setPrice(50000);
        iphone14.setPrice(130000);
        System.out.println(iphone12);
        System.out.println(iphone14);
        System.out.println("-------------------------------");

        Nokia nokia3310 = new Nokia(false, "Symbian", "Nokia", "3310", false, false, 2, false);
        Nokia nokia6600 = new Nokia(false, "Symbian", "Nokia", "6600", true, true, 5, true);
        System.out.println(nokia3310);
        System.out.println(nokia6600);
        System.out.println("-------------------------------");

        nokia3310.setPrice(5000);
        nokia6600.setPrice(15000);
        System.out.println(nokia3310);
        System.out.println(nokia6600);

    }
}