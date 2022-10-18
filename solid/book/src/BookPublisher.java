


import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
        PublishBook book = new PublishBook("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToFile();
        //book.printToScreen();
    }
}
