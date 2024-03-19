/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria_WS.Services;

import Livraria_WS.Interfaces.PessoaWebInterface;
import Livraria_WS.Model.Livro;
import Livraria_WS.Model.Pessoa;
import Livraria_WS.Repositores.PessoaRepository;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vwaz
 */
public class PessoaService{

    public ArrayList<Pessoa> listAll() throws SQLException {
        PessoaRepository pr = new PessoaRepository();
        return pr.listAll();
    }

        public Pessoa findById(int id) throws SQLException {
        PessoaRepository pr = new PessoaRepository();
        return pr.findById(id);
    }

    public Pessoa insert(Pessoa pessoa) throws SQLException {
        PessoaRepository pr = new PessoaRepository();
        return pr.insert(pessoa);
    }

    public Pessoa update(Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
