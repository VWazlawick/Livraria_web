/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.unipar.jokenpo.resources;

/**
 *
 * @author vwaz
 */
public enum Jogada {
    
    PEDRA(1), 
    PAPEL(2), 
    TESOURA(3);
    
    private int id;

    private Jogada(int id) {
        this.id = id;
    }

    
    
}
