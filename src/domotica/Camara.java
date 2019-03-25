/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

/**
 *
 * @author Mouad
 */
public class Camara {

    private boolean estado;
    private String ip;

    public Camara(boolean estado, String ip) {
        this.estado = estado;
        this.ip = ip;
    }

    public Camara() {

    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Camara{" + "estado=" + estado + ", ip=" + ip + '}';
    }

}
