public class Phone {
    public int number;

    public String model;

    public double weight;

    public static String makerCountry;

    public Phone() {
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, double weight) {
        new Phone (number, "", weight);
    }

    public Phone(int number, String model) {
        new Phone (number, model, 0);
    }

    public void receiveCall(String name){
        receiveCall (name, 0);
    }

    public void receiveCall(String name, int number){
        System.out.println("Звонит абонент по имени " + name + (number!=0 ? ", номер " + number : ""));
    }
}
