
import java.lang.reflect.Array;
import java.util.ArrayList;

class Book{
    String title;
    String author;
    int ISBM;
    private static ArrayList<Book> bookCollection =new ArrayList<Book>(); 

    public Book(String title,
    String author,
    int ISBM){
        this.title=title;
        this.author=author;
        this.ISBM=ISBM;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public int getISBM(){
        return ISBM;
    }
    public void setISBM(int ISBM){
        this.ISBM=ISBM;
    }
    public static void addBook(Book book){
        bookCollection.add(book);
    }
    public static void removeBook(Book book)
    {
        bookCollection.remove(book);
    }
    public static ArrayList<Book> getCollection(){
        return bookCollection;
    }

}
public class  P6{
    public static void main(String[] args)
    {
        Book book1=new Book("C programming","me",123);
        Book book2=new Book("Java Programming","you",456);
        Book.addBook(book1);
        Book.addBook(book2);
        ArrayList<Book> bookCollection=Book.getCollection();
        for(Book book : bookCollection)
        {
            System.out.println(book.getTitle()+" ,"+book.getAuthor()+","+book.getISBM());
        }
    }
}