package second;

import java.sql.SQLOutput;
import java.util.Scanner;

public class mainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartPhone smartPhone1 = new SmartPhone("Galaxy s21", "Android", 2021, 4100, "C");
        FolderPhone folderPhone1 = new FolderPhone("Corby F", 2010, true);

        System.out.println("안녕하세요. 인하 핸드폰 매장입니다.\n" +
                "핸드폰을 선택해주세요\n" +
                "1. Galaxy s21 / 2. Corby F");
        switch (sc.nextInt()) {
            case 1 :
                smartPhone1.printInfo();
                smartPhone1.call("오일남", "영상통화");
                smartPhone1.sendMessage("오일남", "우린 깐부잖아");
                smartPhone1.launchCamera("파노라마");
                smartPhone1.exitCamera();
                smartPhone1.notEnoughBattery();
                smartPhone1.update();
                break;
            case 2 :
                folderPhone1.printInfo();
                folderPhone1.call("오일남", "영상통화");
                folderPhone1.sendMessage("오일남", "우린 깐부잖아");
                folderPhone1.launchCamera("파노라마");
                folderPhone1.exitCamera();
                folderPhone1.notEnoughBattery();
                folderPhone1.folder();
                break;
            default:
                System.out.println("잘못된 번호입니다.");
        }
    }
}
