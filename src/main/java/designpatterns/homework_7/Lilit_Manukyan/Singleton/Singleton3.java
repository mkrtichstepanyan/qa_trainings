package designpatterns.homework_7.Lilit_Manukyan.Singleton;

public class Singleton3 {
    private Singleton3() {

    }

    private static class Singleton3Holder {

        private static final Singleton3 instace = new Singleton3();

    }

    public static Singleton3 getInstance() {
        return Singleton3Holder.instace;
    }
}
