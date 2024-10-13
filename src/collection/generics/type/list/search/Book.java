package collection.generics.type.list.search;

public class Book {
    //atributos
    private final String title;
    private final String actor;
    private final int yearPublic;

    public Book(String title, String actor, int yearPublic) {
        this.title = title;
        this.actor = actor;
        this.yearPublic = yearPublic;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public String getActor() {
        return actor;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", actor='" + actor + '\'' +
                ", yearPublic=" + yearPublic +
                '}';
    }
}
