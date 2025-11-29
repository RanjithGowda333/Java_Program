class ObjectCar{
    String Model;
    int Year;
    double Price;
    String Type;

    ObjectCar(String model, int year, double price, String type) {
        this.Model = model;
        this.Year = year;
        this.Price = price;
        this.Type = type;
    }
    void displayclass29_9_1Info() {
    System.out.println("Model: " + Model);
    System.out.println("Year: " + Year);
    System.out.println("Price: " + Price);
    System.out.println("Type: " + Type);
    }
}