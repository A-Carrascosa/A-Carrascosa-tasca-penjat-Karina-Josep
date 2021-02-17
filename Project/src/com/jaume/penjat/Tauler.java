/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaume.penjat;

/**
 *
 * @author Karina
 */
public class Tauler {

    private int intents;
    private String palabraEndevinada;
    private String paraulaSecreta;
    private int vides;

    public int getIntents() {
        return intents;
    }

    public void setIntents(int intents) {
        this.intents = intents;
    }

    public String getPalabraEndevinada() {
        return palabraEndevinada;
    }

    public void setPalabraEndevinada(String palabraEndevinada) {
        this.palabraEndevinada = palabraEndevinada;
    }

    public String getParaulaSecreta() {
        return paraulaSecreta;
    }

    public void setParaulaSecreta(String paraulaSecreta) {
        this.paraulaSecreta = paraulaSecreta;
    }

    public void inicialitzarPartida() {

    }

    public String imprimir() {
        return palabraEndevinada;
    }

    public String imprimirVides() {
        return "Et queden " + intents + " de " + vides;
    }

    public String verificar(String letra) {
        boolean encontrado = false;
        for (int i = 0; i < paraulaSecreta.length(); i++) {
            if (paraulaSecreta.charAt(i) == letra.charAt(0)) {
                char[] myNameChars = palabraEndevinada.toCharArray();
                myNameChars[i] = letra.charAt(0);
                palabraEndevinada = String.valueOf(myNameChars);
                encontrado = true;
            }
        }
        if (!encontrado) {
            intents -= 1;
        }
        return " ";
    }

    public void hasGuanyat() {

    }

}
