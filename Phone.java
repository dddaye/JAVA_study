package second;

public abstract class Phone {

    abstract void printInfo();
    abstract void call(String receiver, String mode);
    abstract void sendMessage(String receiver, String message);
    abstract void launchCamera(String cameraMode);
    abstract void exitCamera();
    abstract void notEnoughBattery();

}
