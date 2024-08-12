package dio.gof.strategy;

import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;

public class Robo {
    private Comportamento comportamento;

    public void mover() {
        comportamento.mover();
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }


}
