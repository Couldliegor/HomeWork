package HomeWork5;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }
    public static void task1(){
        //exercise 1
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        //done
    }
    public static void  task2(){
        //exercise 2
        System.out.println("\n");
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }
        //done
    }
    public  static  void task3(){
        //exercise 3
        System.out.println("\n");
        for(int i = 0; i < 18; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    //done
    public static void task4(){
        //exercise 4
        System.out.println("\n");
        for(int i = 10; i > -11; i--){
            System.out.println(i);
        }
    }
    //done
    public static void task5(){
        //exercise 5
        System.out.println("\n");
        for(int i = 1904;i <= 2096; i = i + 4){
            System.out.println(i + " year is leap");
        }
    }
    //done
    public static void task6(){
     //exercise 6
     System.out.println("\n");
     for(int i = 7; i < 99; i = i + 7){
         System.out.println(i);
     }
    }
    //done
    public static void task7(){
        //exercise 7
        System.out.println("n");
        for ( int i = 1; i < 513; i = i * 2){
            System.out.println(i);
        }
    }
    //done
    public static void task8(){
        //exercise 8
        System.out.println("\n");
        int salaryInBank = 29000;
        for (int i = 1; i < 13; i++) {
            System.out.println("Month " + i + " value is " + salaryInBank + " rubles");
            salaryInBank = salaryInBank + 29000;
        }
        //done
    }
    public static void task9(){
       //exercise 9
        System.out.println("\n");
        int salaryInBank = 29000;
        int percents = 0;
        for (int i = 1; i < 13; i++) {
            percents = salaryInBank / 100;
            System.out.println("Month " + i + " value is " + salaryInBank + " rubles");
            salaryInBank = salaryInBank + 29000 + percents;
        }
    }
    //done
}