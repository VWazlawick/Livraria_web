package Livraria_WS.Exceptions;

import jakarta.xml.ws.WebFault;

@WebFault
public class ValidacaoException extends Exception{

    
    public ValidacaoException(String mensagem) {
        super(mensagem);
    }

    
    
}
