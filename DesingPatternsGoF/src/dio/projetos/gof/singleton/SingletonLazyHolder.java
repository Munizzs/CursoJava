package dio.projetos.gof.singleton;

public class SingletonLazyHolder {

    public static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstancia(){
        return Holder.instancia;
    }
}
