import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseHandler {

    public static Connection connection;
    public static Connection avanzaConnection(){
        if(connection == null){
            String dbUrl = "jdbc:mysql://root:Memeshaha123@localhost:3306/binance?serverTimezone=UTC";
            try{
                connection = DriverManager.getConnection(dbUrl);
                System.out.println("Anslutningen lyckades");
            }catch(Exception e){
                e.printStackTrace();
            }
            return connection;
        }
        else{
            return connection;
        }


    }

}

