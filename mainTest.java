package first;

import java.util.Scanner;

public class mainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartPhone smartphone1 = new SmartPhone("Galaxy s21", "Android", 2021, 4100, "C");
        SmartPhone smartphone2 = new SmartPhone("Iphone XS", "IOS", 2018, 2658, "8pin");
        SmartPhone smartphone3 = new SmartPhone("V50 ThinQ", "Android", 2019, 4000, "C");

        System.out.println("안녕하세요. 인하 핸드폰 매장입니다.\n" +
                "핸드폰을 선택해주세요.\n" +
                "1. Galaxy s21 / 2. Iphone XS / 3. ThinQ");
        switch (sc.nextInt()) {
            case 1 :
                smartphone1.printInfo();
                break;
            case 2 :
                smartphone2.printInfo();
                break;
            case 3 :
                smartphone3.printInfo();
                break;
            default:
                System.out.println("잘못된 번호입니다.");
        }


    }
}



//import java.util.Scanner;
//
//public class mainTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String modelName;
//        String color;
//
//        System.out.println("모델명 : ");
//        modelName = sc.nextLine();
//        System.out.println("색상 : ");
//        color = sc.nextLine();
//        System.out.println("저는 " + modelName + " 핸드폰을 사고 싶고, " + color + " 색상을 사고 싶어요!");
//    }
//
//}


//version 0.1
//public class mainTest {
//    public static void main(String[] args) {
//        String modelName;
//        String color;
//
//                modelName = "Galaxy Z Fold 3";
//                color = "Lavender";
//            System.out.println("저는 " + modelName + " 핸드폰을 사고 싶고, " + color + " 색상을 가지고 싶어요!");
//            }
//
//        }
