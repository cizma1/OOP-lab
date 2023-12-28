package Week13.task4;

interface OldDevice{
    void operateOldFunction();
}


interface NewDevice{
    void operateNewFunction();
}

class OldDeviceImp1 implements OldDevice{
    @Override
    public void operateOldFunction(){
        System.out.println("Old device is performing an old function.");
    }
}

class NewDeviceImp1 implements NewDevice{
    @Override
    public void operateNewFunction(){
        System.out.println("New device is preformin an new function.");
    }
}
class DeviceAdapter implements NewDevice {
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void operateNewFunction() {
        // Translate the old function to the new function
        oldDevice.operateOldFunction();
        System.out.println("Adapter is translating old function to new function.");
    }
}
public class Start {
    public static void main(String[] args) {
        NewDevice newDevice = new NewDeviceImp1();
        newDevice.operateNewFunction();

        // Utilizing the DeviceAdapter to interact with an instance of OldDeviceImpl seamlessly
        OldDevice oldDevice = new OldDeviceImp1();
        NewDevice adaptedDevice = new DeviceAdapter(oldDevice);
        adaptedDevice.operateNewFunction();
    }
}
