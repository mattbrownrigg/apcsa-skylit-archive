package Ch04.Exercises.Book;
    /**
     * Write a description of class BookTest here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    
    public class BookTest
    {
        public static void main(String[] args)
        {
            System.out.println("-------------------------------------");
            
            Book libro = new Book(3);
            
            System.out.println("You are now on Page " + libro.getCurrentPage());
            
            for(int i = 0; 3 > i; i++)
                libro.nextPage();
            
        }
    }
