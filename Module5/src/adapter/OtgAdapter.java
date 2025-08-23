package adapter;

public class OtgAdapter implements Usb, UsbTypeC{
    private Usb usbDevice;
    private UsbTypeC UsbTypeCDevice;
    private String intermediateData;

    public OtgAdapter(Usb usbDevice, UsbTypeC UsbTypeCDevice){
        this.usbDevice = usbDevice;
        this.usbDevice.setUsbDevice(this);

        this.UsbTypeCDevice = UsbTypeCDevice;
        this.UsbTypeCDevice.setUsbTypeCDevice(this);
    }

    @Override
    public String getData(){
        return null;
    }

    @Override
    public void connectUsbTypeCDevice(UsbTypeC device) {
        this.UsbTypeCDevice = device;
        this.UsbTypeCDevice.setUsbTypeCDevice(this);
    }

    @Override
    public void connectUsbDevice(Usb device) {
        this.usbDevice = device;
        this.usbDevice.setUsbDevice(this);
    }

    @Override
    public String getData(UsbTypeC device){
        return this.usbDevice.getData(this);
    }

    @Override
    public String getData(Usb device){
        return this.UsbTypeCDevice.getData(this);
    }

    @Override
    public void setUsbDevice(Usb device) {
        this.usbDevice = device;
    }


    @Override
    public void setUsbTypeCDevice(UsbTypeC device) {
        this.UsbTypeCDevice = device;
    }
}
