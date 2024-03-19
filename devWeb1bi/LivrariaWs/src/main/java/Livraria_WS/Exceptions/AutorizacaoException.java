package Livraria_WS.Exceptions;

import jakarta.xml.ws.WebFault;

@WebFault
public class AutorizacaoException extends Exception{

    public AutorizacaoException() {
        super("Usuário ou senha Incorretos");
    }
    
    
    
    
}
