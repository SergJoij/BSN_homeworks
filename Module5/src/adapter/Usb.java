package adapter;

public interface Usb {
    void setUsbDevice(Usb device);

    String getData(Usb device);

    String getData();

    void connectUsbDevice(Usb device);
}
