package adapter;

public class SmartPhone implements UsbTypeC{
    private String data;
    private UsbTypeC UsbTypeCDevice;

    public void downloadData(){
        this.data = this.UsbTypeCDevice.getData(this);
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
    public String getData(){
        return data;
    }
}
