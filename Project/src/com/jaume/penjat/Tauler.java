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
    private int vides;
    private String palabraEndevinada;
    private String paraulaSecreta;

    public int getIntents() {
        return intents;
    }

    public void setIntents(int intents) {
        this.intents = intents;
    }

    public int getVides() {
        return vides;
    }

    public void setVides(int vides) {
        this.vides = vides;
    }

    public String getPalabraEndevinada() {
        return palabraEndevinada;
    }

    public void setPalabraEndevinada(String palabraEndevinada) {
        for (int i=0; i < palabraEndevinada.length(); i++){
            if (palabraEndevinada.charAt(i) != ' '){
                char[] myNameChars = palabraEndevinada.toCharArray();
                myNameChars[i] = '_';
                palabraEndevinada = String.valueOf(myNameChars);
            }
        }
        this.palabraEndevinada = palabraEndevinada;
    }

    public String getParaulaSecreta() {
        return paraulaSecreta;
    }

    public void setParaulaSecreta(String paraulaSecreta) {
        this.paraulaSecreta = paraulaSecreta;
    }    
    
    public void inicialitzarPartida(String paraula, int intents){
        setParaulaSecreta(paraula);
        setPalabraEndevinada(paraula);
        setIntents(intents);
        setVides(intents);
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
    
    public boolean hasGuanyat(){
        if (palabraEndevinada.equals(palabraEndevinada)){
            return true;
        } else {
            return false;
        }
    }

    public void hasGuanyat() {

    }

}
