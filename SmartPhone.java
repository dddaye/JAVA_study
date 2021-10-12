package first;
//v0.5
public class SmartPhone {
    String model;
    String ui;
    int year;
    int v;
    String usb;

    public SmartPhone(String model, String ui, int year, int v, String usb){
        this.model = model;
        this.ui = ui;
        this.year = year;
        this.v = v;
        this.usb = usb;
    }

    public void printInfo() {
        System.out.println("모델명 : " + model);
        System.out.println("운영체제 : " + ui);
        System.out.println("출시년도 : " + year);
        System.out.println("배터리용량 : " + v);
        System.out.println("USB타입 : " + usb);
    }
}

