public class Main {

    public static void main(String[] args) {
        Telephone Test = new Telephone("IPhone", 15,
                293721342);
        Test.Sending_SMS("Hello, it's John", 29374823);

        Car Car_test = new Car("1", "Black",
                "RR", 2, 100);

        Car_test.Selling_the_car(100);
        String b = Car_test.getBrand();
        String c = Car_test.getColor();
        System.out.println("The colour of the car is "+c+" The brand of the car is "+b);


        double oldEC = Car_test.getEngine_Capacity();
        System.out.println("Old engine capacity is " + oldEC);
        Car_test.setEngine_Capacity(5);
        double newEC = Car_test.getEngine_Capacity();
        System.out.println("New engine capacity is " + newEC);

    }
}
