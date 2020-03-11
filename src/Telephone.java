public class Telephone {
    String brand;
    double screen_resolution;
    long phone_number;


    public Telephone( String brand, double screen_resolution, long phone_number) {
        this.brand = brand;
        this.screen_resolution = screen_resolution;
        this.phone_number = phone_number;
    }


    public void Sending_SMS(String X_message, long Y_Number) {
        System.out.println("Sending the message "+ X_message +" to number " + Y_Number);
    }


}
