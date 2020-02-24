package Ch04.Exercises.Book;
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private int numPages;
    private int currentPage = 1;
    
    public Book(int bookTotalPage) 
    {
        numPages = bookTotalPage;
        System.out.println("Your book is " + numPages + " pages long.");
    }
 
    public void nextPage()
    {
        if(currentPage < numPages)
        {
            currentPage++;
            System.out.println("You are now on Page " + currentPage);
        }
        else
        {
            System.out.println("You have exceeded the number of pages on the book, Please leave");
        }
    }
    public int getNumPages()
    {
        return numPages;
    }
    
    public int getCurrentPage()
    {
        return currentPage;
    }

}
