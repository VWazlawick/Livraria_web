/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package br.unipar.calculadora.ws;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

/**
 *
 * @author vwaz
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    public int soma(int n1, int n2){
        return n1 + n2;
    }
    public int subtracao(int n1, int n2){
        return n1-n2;
    }
    public double divisao(int n1, int n2){
        return n1/n2;
    }
    public int multiplicacao(int n1, int n2){
        return n1*n2;
    }
}
