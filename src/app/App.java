package app;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Informations
                String BDD = "test";
                String url = "jdbc:mysql://localhost:3306/" + BDD;
                String user = "root";
                String passwd = "";
                // On essaye de se connecter
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, user, passwd);
                    System.out.println("Connexion etablie.");
                } catch (Exception e) {
                    System.out.println("Impossible de se connecter a la base de donnees.");
                    System.exit(0);
                }
            }
        });
    }
}