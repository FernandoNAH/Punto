/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.punto;

/**
 *
 * @author Fer
 */
public interface Punto {

    Double getX();

    Double getY();

    void setX(Double x1);

    void setY(Double y1);

    Double getDistanciaAOtroPunto(Punto p);
}
