/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.test;

import fp.punto.*;

/**
 *
 * @author Fer
 */
public class TestPunto extends Test {

    public static void main(String[] args) {
        Punto p = new PuntoImpl(2.0, 3.0);
        mostrar("Punto: ", p);
        p.setX(3.0);
        mostrar("Punto: ", p);
        p.setY(2.0);
        mostrar("Punto: ", p);

        Punto p2 = new PuntoImpl(-1.0, -3.0);
        Double distancia = p.getDistanciaAOtroPunto(p2);
        mostrar("Distancia entre los puntos: ", distancia);
    }
}
