/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria_WS;

import Livraria_WS.Interfaces.PessoaWebInterface;
import Livraria_WS.Model.Livro;
import Livraria_WS.Model.Pessoa;
import Livraria_WS.Services.PessoaService;
import jakarta.jws.WebService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vwaz
 */
@WebService(endpointInterface = "Livraria_WS.Interfaces.PessoaWebService")
public class PessoaWebServiceImp implements PessoaWebInterface{

    @Override
    public ArrayList<Pessoa> listAll() throws SQLException{
        PessoaService ps = new PessoaService();
        return ps.listAll();
    }

    @Override
    public Pessoa findById(int id) throws SQLException{
        PessoaService ps = new PessoaService();
        return ps.findById(id);
    }

    @Override
    public Pessoa insert(Pessoa pessoa) throws SQLException {
        PessoaService ps = new PessoaService();
        return ps.insert(pessoa);
    }

    @Override
    public Pessoa update(Pessoa pessoa) {
        PessoaService ps = new PessoaService();
        return ps.update(pessoa);
    }

    @Override
    public void delete(int id) {
        PessoaService ps = new PessoaService();
        ps.delete(id);
    }
    
}
