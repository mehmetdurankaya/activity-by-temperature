package activitybytemperature;

import java.util.Scanner;

public class ActivityByTemperature {
    public static void main(String[] args) {
        int heat;
        Scanner scan=new Scanner(System.in);
        System.out.println("Bu uygulama sizden tamsayı cinsinden bir sıcaklık değeri ister" +
                           "vermiş olduğunuz sıcaklık değerine istinaden size öneride bulunur.");
        System.out.print("Sıcaklık giriniz: ");
        heat=scan.nextInt();
        if(heat<=5){
            System.out.println("Kayak yapmanızı öneririm");
        }else if (heat>=5 && heat <=10){
            System.out.println("Sinemaya gitmenizi öneririm.");
        }else if(heat>11 && heat<=15) {
            System.out.println("Spor Yapmanızı öneririm");
        }else if(heat>15 && heat<=20){
            System.out.println("Piknik etkinliğini öneririm. ");
        }else if(heat>20 && heat<25){
            System.out.println("Dondurma yeme etkinliği öneririm.");
        }else{
            System.out.println("Yüzme etkinliğini öneririm.");
        }

    }

}
