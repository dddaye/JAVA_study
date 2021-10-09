package first;
import java.util.Scanner;

public class mainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String modelName;
        String color;

        System.out.println("모델명 : ");
        modelName = sc.nextLine();
        System.out.println("색상 : ");
        color = sc.nextLine();
        System.out.println("저는 " + modelName + " 핸드폰을 사고 싶고, " + color + " 색상을 사고 싶어요!");
    }

}


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
