/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package br.unipar.jokenpo.resources;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import java.util.Random;

/**
 *
 * @author vwaz
 */
@WebService(serviceName = "Jokenpo")
public class Jokenpo {
    String jogada = "";
    
    public Jogada jogar(){
        Random random = new Random();
        int nrRandom = random.nextInt(1,3);
        Jogada j1 = new Jogada();
        
        
        return
    } 
}
