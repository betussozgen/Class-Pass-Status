//Kullanıcıdan veri alabilmek için Scanner sınıfını dahil ediyoruz.
import java.util.Scanner;
public class ClassPassStatus {
    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz.
        int math, physics, turkish, chemistry, music;
        double average = 0.0, sum = 0.0;

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        System.out.println("Pelease enter validgrade: 0-100");

        //Kullanıcıdan notlarını 0-100 arasında gireceği girmezse geçersiz not sayılacağı kod satırlarını yazıyoruz.
        System.out.print("Please enter math grade: ");
        math = input.nextInt();

        if (math >= 0 && math <= 100){
            sum += math;
        }
        else {
            System.out.println("INVALID NOTE");
        }


        System.out.print("Please enter physics grade: ");
        physics = input.nextInt();

        if (physics >= 0 && physics <= 100){
            sum += physics;
        }
        else {
            System.out.println("INVALID NOTE");
        }

        System.out.print("Please enter turkish grade: ");
        turkish = input.nextInt();
        if (turkish >= 0 && turkish <= 100){
            sum += turkish;
        }
        else {
            System.out.println("INVALID NOTE");
        }

        System.out.print("Please enter chemistry grade: ");
        chemistry = input.nextInt();

        if (chemistry >= 0 && chemistry <= 100){
            sum += chemistry;
        }
        else {
            System.out.println("INVALID NOTE");
        }

        System.out.print("Please enter music grade: ");
        music = input.nextInt();

        if (music >= 0 && music <= 100){
            sum += music;
        }
        else {
            System.out.println("INVALID NOTE");
        }

        //System.out.println("Sum:" +sum);

        //Ortalamayı hesaplıyoruz.
        average = (sum / 5.0);
        System.out.println("Average : " + average);

        //ortalama 55 ve üstündeyse geçti, değilse kaldı kararını if-else ile sağlıyoruz.
        if (average >= 55){
            System.out.println("You passed the class! ");
        }else {
            System.out.println("You failed the class!");
        }



    }
}