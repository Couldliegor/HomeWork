package HomeWork5;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
}