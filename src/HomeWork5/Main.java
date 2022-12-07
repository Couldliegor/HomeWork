package HomeWork5;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}