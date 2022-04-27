package designpatterns.homework_7.anjela_melqonyan.singleton;

public class Singleton3 {
    private static volatile Singleton3 instanse;
    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        if( instanse == null){
            synchronized (Singleton3.class){
                if( instanse == null){
                    instanse = new Singleton3();
                }

            }
        }
        return instanse;
    }
}
