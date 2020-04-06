package app ;
import java.sql.Connection ;
import java.sql.DriverManager ;

public class DbManager {

    private String BDD    = "test" ;
    private String url    = "jdbc:mysql://localhost:3306/" + BDD ;
    private String user   = "root" ;
    private String passwd = "" ;
    private static Connection connection ;

    private DbManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver") ;
            connection = DriverManager.getConnection(url, user, passwd) ;
            connection.setAutoCommit(false) ;
            System.out.println("Connexion etablie.") ;
        } catch (final Exception e) {
            System.out.println("Impossible de se connecter a la base de donnees.") ;
            System.exit(0) ;
        }
    }

    public static Connection getInstance(){
        if(connection == null)
            new DbManager() ;
        return connection ;   
    }   
}