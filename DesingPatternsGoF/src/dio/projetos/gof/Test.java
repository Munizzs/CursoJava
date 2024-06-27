package dio.projetos.gof;

import dio.projetos.gof.facade.Facade;
import dio.projetos.gof.singleton.SingletonEager;
import dio.projetos.gof.singleton.SingletonLazy;
import dio.projetos.gof.singleton.SingletonLazyHolder;
import dio.projetos.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        System.out.println();

        //Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        System.out.println();

        //Facade

        Facade facade = new Facade();

        facade.migrarCliente("João","04823-020");
    }
}
