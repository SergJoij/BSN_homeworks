package adapter;

/** Флешка */
public class FlashDrive implements Usb{
    private String data;
    private Usb usbDevice;

    public FlashDrive(String text){
        this.data = text;
    }

    public void connectUsbDevice(Usb device){
        this.usbDevice = device;
        this.usbDevice.setUsbDevice(this);
    }

    @Override
    public void setUsbDevice(Usb device){
        this.usbDevice = device;
    }

    @Override
    public String getData(Usb device){
        return data;
    }

    @Override
    public String getData(){
        return data;
    }
}
