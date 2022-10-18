import java.util.List;

public class ReadBook extends Book{

    public ReadBook(String title, List<String> page){
        super(title, page);
    }

    public void printToScreen() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}