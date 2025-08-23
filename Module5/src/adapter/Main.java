package adapter;

public class Main {  // флешка -(usb)- переходник otg -(usb type c)- смартфон
    public static void main(String[] args){
        FlashDrive flash = new FlashDrive("Информация с флешки");
        SmartPhone phone = new SmartPhone();
        Computer comp = new Computer("Информация с компьютера");

        // проверим два устройства с одним usbtypec
        comp.connectUsbTypeCDevice(phone);
        System.out.println("Computer: " + comp.getData());
        System.out.println("SmartPhone: " + phone.getData());

        phone.downloadData();

        System.out.println("\nComputer: " + comp.getData());
        System.out.println("SmartPhone: " + phone.getData() + "\n");

        // два устройства с разными разъёмами, с помощью адаптера
        OtgAdapter adapter = new OtgAdapter(flash, phone);

        System.out.println("FlashDrive: " + flash.getData());
        System.out.println("SmartPhone: " + phone.getData());
        System.out.println("OtgAdapter: " + adapter.getData());

        phone.downloadData();

        System.out.println("\nFlashDrive: " + flash.getData());
        System.out.println("SmartPhone: " + phone.getData());
    }
}
