package app ;

public class DAONews {

    public News getNews(int id) {
        DbManager connection ;

        connection.
        result = state.executeQuery("SELECT * FROM news WHERE id =" + id);
        result.first();
    }


}