package app;

public class News {
    private int    id ;
    private String title ;
    private String content ;
    private String date ;
    private String idJournalist ;

    public News(int id, String title, String content, String date, String idJournalist) {
        this.id             = id ;
        this.title          = title ;
        this.content        = content ;
        this.date           = date ;
        this.idJournalist   = idJournalist ;
    }

    public int getId() {
        return id ;
    }

    public void setId(int id) {
        this.id = id ;
    }

    public String getTitle() {
        return title ;
    }

    public void setTitle(String title) {
        this.title = title ;
    }

    public String getContent() {
        return content ;
    }

    public void setContent(String content) {
        this.content = content ;
    }

    public String getDate() {
        return date ;
    }

    public void setDate(String date) {
        this.date = date ;
    }

    public String getIdJournalist() {
        return idJournalist ;
    }

    public void setIdJournalist(String idJournalist) {
        this.idJournalist = idJournalist ;
    }
}