/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Livraria_WS.Interfaces;

import Livraria_WS.Model.Livro;
import Livraria_WS.Model.Pessoa;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vwaz
 */
@WebService
public interface PessoaWebInterface {

    @WebMethod
    ArrayList<Pessoa> listAll()throws SQLException;
    
    @WebMethod
    Pessoa findById(int id)throws SQLException;
    
    @WebMethod
    Pessoa insert(Pessoa pessoa) throws SQLException;
    
    @WebMethod
    Pessoa update(Pessoa pessoa);
    
    void delete(int id);
    
}
