/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Datos.Semaforo.EstadoEvent;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Usuario
 */
public class Notificaciones implements Observer{
    char estadoSemaforo;
   //Metodo el cual observa el estado de los semaforos
    @Override
    public void update(Observable o, Object o1) {
        if (o1 instanceof EstadoEvent) {
            EstadoEvent evento = (EstadoEvent) o1;
            System.out.printf("El estado del semaforo ha cambiado ", evento.getEstado());
           estadoSemaforo = evento.getEstado();
        }
    }
    
}
