package adapter;

public class Computer implements UsbTypeC{
    private String data;
    private UsbTypeC UsbTypeCDevice;

    public Computer(String info){
        this.data = info;
    }

    public void connectUsbTypeCDevice(UsbTypeC device){
        this.UsbTypeCDevice = device;
        this.UsbTypeCDevice.setUsbTypeCDevice(this);
    }

    @Override
    public void setUsbTypeCDevice(UsbTypeC device) {
        this.UsbTypeCDevice = device;
    }

    @Override
    public String getData(UsbTypeC device) {
        return data;
    }

    @Override
    public String getData() {
        return data;
    }
}
