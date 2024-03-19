package Livraria_WS.infrastructure;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class ConnectionFactory {

    private static final String RESOURC_NAME = "postgresResource";
    
    private DataSource getDatasource() throws NamingException{
        Context c = new InitialContext();
        
        return (DataSource) c.lookup((RESOURC_NAME));
    }
    
    public Connection getConnection(){
        try {
            return getDatasource().getConnection();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
