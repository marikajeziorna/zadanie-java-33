public class Device {
    String code;
    String producer;
    String type;
    double price;

    Device(String code, String producer, String type, double price) {
        this(code, producer, type);
        this.price = price;
    }

    Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    void getInfo() {
        System.out.println("Code: " + code + ", " + " producer: " + producer + ", " + " type: " + type + ", " + " price: " + price);
    }
}
