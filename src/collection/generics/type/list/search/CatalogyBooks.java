package collection.generics.type.list.search;

import java.util.ArrayList;
import java.util.List;

public class CatalogyBooks {
    private final List<Book> bookList;

    public CatalogyBooks() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String actor, int yearPublic) {
        bookList.add(new Book(title, actor, yearPublic));
    }

    public List<Book> searcForActor(String actor) {
        List<Book> booksForActor = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book b: bookList) {
                if (b.getActor().equalsIgnoreCase(actor)){
                    booksForActor.add(b);
                }
            }
        }
        return booksForActor;
    }
    public List<Book> searchForIntervalYears(int yearInitial, int yearFinal) {
            List<Book> booksForInterval =  new ArrayList<>();

        if (!bookList.isEmpty()){
            for (Book b: bookList) {
                if(b.getYearPublic() >= yearInitial && b.getYearPublic() <= yearFinal) {
                    booksForInterval.add(b);
                }
              }
            return booksForInterval;
        }
        return booksForInterval;
    }

    public Book searchForTitle(String title) {
        Book bookForTitle = null;
        if(!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    bookForTitle = b;
                    break;
                }
            }
        }
        return bookForTitle;
    }


    public static void main(String[] args) {
        CatalogyBooks catalogyBooks = new CatalogyBooks();
        catalogyBooks.addBook("testeeee", "Matheus fabio", 2024);
        catalogyBooks.addBook("A volta", "Matheus fabio", 2000);
        catalogyBooks.addBook("Aprendendo a não programar", "Matheus fabio", 1999);

        System.out.println(catalogyBooks.bookList);
        System.out.println("------- SEARCH -------");
        System.out.println(catalogyBooks.searchForTitle("testeeee"));
//        System.out.println(catalogyBooks.searcForActor("Matheus fabio"));
//        System.out.println(catalogyBooks.searchForIntervalYears(2000, 2024));

    }

}
