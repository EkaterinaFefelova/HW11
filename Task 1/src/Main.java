public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(3456872, "iPhone X", 384 );
        Phone.makerCountry = "China";
        Phone phone3 = new Phone(5674839, "Xiaomi Mi", 300 );
        Phone phone4 = new Phone(4857364, "Huawei P30");
        Phone phone5 = new Phone(5693748, 345);

        phone1.receiveCall("Василий");
        phone2.receiveCall("Анатолий", 48573628);
    }
}
