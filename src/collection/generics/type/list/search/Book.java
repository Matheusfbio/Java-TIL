package collection.generics.type.list.search;

public class Book {
    //atributos
    private String title;
    private String actor;
    private String yearPublic;

    public Book(String title, String actor, String yearPublic) {
        this.title = title;
        this.actor = actor;
        this.yearPublic = yearPublic;
    }

    public String getTitle() {
        return title;
    }

    public String getActor() {
        return actor;
    }

    public String getYearPublic() {
        return yearPublic;
    }

    @Override
    public String toString() {
        return "book{" +
                "title='" + title + '\'' +
                ", actor='" + actor + '\'' +
                ", yearPublic='" + yearPublic + '\'' +
                '}';
    }
}
