package adapter;

public interface UsbTypeC {
    void setUsbTypeCDevice(UsbTypeC device);

    String getData(UsbTypeC device);

    String getData();

    void connectUsbTypeCDevice(UsbTypeC device);
}
