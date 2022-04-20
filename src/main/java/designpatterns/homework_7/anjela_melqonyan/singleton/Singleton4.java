package designpatterns.homework_7.anjela_melqonyan.singleton;

public class Singleton4 {
    private static volatile Singleton4 instanse;
    private  Singleton4(){

    }

    public static Singleton4 getInstance(){
        Singleton4 result = instanse;

         if(result == null){
             synchronized (Singleton4.class){
                 if(result == null){
                     instanse = result = new Singleton4();
                 }
             }

         }
         return result;
    }
}
