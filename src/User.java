
import java.util.ArrayList;

public class User {

    public ArrayList<Company> companyList = new ArrayList<>();

    public void run(Api api){
        logIn(api);
        DatabaseHandler.avanzaConnection();
    }
    private void logIn(Api api){
        if(api == Api.Avanza){

        }
        else if(api == Api.Binance){

        }

    }

}
