/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibrary1;

import Book.Book;
import static Book.BookFactory.listOfBooks;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import student.Student;

/**
 *
 * @author Burak
 */
public class LibraryUtility {
    
    
    private static   ArrayList<Book> AvailableBooks;
	
	public LibraryUtility () throws FileNotFoundException {
		
		this.AvailableBooks= listOfBooks();	
	}


     ArrayList<Borrowings> History = new ArrayList<>();
        
	
    
    public  ArrayList<Book> Borrow(Book book, Student borrower, Date issuedDate) throws FileNotFoundException  {
      AvailableBooks.remove(book);
      Borrowings newBorrowing=new Borrowings(book,borrower,null,issuedDate);    
      History.add(newBorrowing);    
      return AvailableBooks;}
      
    /**
     *
     * @param book
     * @param borrower
     * @param dateReturned
     * @return
     * @throws FileNotFoundException
     */
    public  ArrayList<Book> returnTheBook(Book book, Student borrower, Date dateReturned) throws FileNotFoundException {
      AvailableBooks.add(book);
      Borrowings newBorrowing=new Borrowings(book,borrower,null,dateReturned);   
      History.add(newBorrowing);  
      return AvailableBooks;

    
}


}
