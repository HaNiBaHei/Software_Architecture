

import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        ReadBook book = new ReadBook("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
        //book.printToFile();
    }
}
