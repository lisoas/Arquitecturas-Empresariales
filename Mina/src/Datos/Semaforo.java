/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Usuario
 */
import java.util.Observable;

public class Semaforo {

    public class EstadoEvent {

        private Semaforo semaforo;
        private char estado;

        public EstadoEvent(Semaforo semaforo, char estado) {
            this.semaforo = semaforo;
            this.estado = estado;
        }

        public Semaforo getSemaforo() {
            return semaforo;
        }

        public char getEstado() {
            return estado;
        }
    }

    private static final SemaforoObservable OBSERVABLE;

    private char estado;

    static {
        OBSERVABLE = new SemaforoObservable();
    }

    public static Observable getObservable() {
        return OBSERVABLE;
    }

    public Semaforo(char estado) {
        this.estado = estado;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        EstadoEvent event = new EstadoEvent(this,this.estado);

        this.estado = estado;

        synchronized (OBSERVABLE) {
            OBSERVABLE.setChanged();
            OBSERVABLE.notifyObservers(event);
        }
    }

    private static class SemaforoObservable extends Observable {

        @Override
        public synchronized void setChanged() {
            super.setChanged();
        }
    }

}
