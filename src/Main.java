public class Main {

    public static void main(String[] args) {
        Telephone Test = new Telephone("IPhone", 15,
                293721342);
        Test.Sending_SMS("Hello, it's John", 29374823);

        Car Car_test = new Car("1", "Black",
                "RR", 2, 100);

        Car_test.Selling_the_car(100);
    }
}
