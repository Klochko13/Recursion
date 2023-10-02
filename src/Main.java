import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Введите число");
        int n = kb.nextInt();
        System.out.printf("Факториал числа %2$d равен %1$d \n", factorial(n), n);
        System.out.printf("Введите степень в которую хотите возвести число %d: \n", n);
        int step = kb.nextInt();
        System.out.printf("Число %d в степени %d составляет %d", n, step, power(n,step));
    }
        static int factorial (int n){

            if (n == 0){
                return 1;
            }
            return n * factorial(n-1);
        }
        static int power (int n, int step) {

        if (step == 1)
            return n;
        return n*power(n,step-1);
        }




    /*static void Elevator (int floor){
        if(floor == 0){
            System.out.println("Вы в подвале");
            return;
        }
        System.out.println("Вы на " + floor + " этаже");
        Elevator(floor-1);
        System.out.println("Вы на " + floor + " этаже");
    }*/
}