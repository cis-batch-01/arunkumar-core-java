package com.technocis.booksandauthor.DaoImplTest;

import com.technocis.booksandauthor.Dao.BooksDao;
import com.technocis.booksandauthor.DaoImpl.BooksDaoImpl;

public class BooksTest {
	public static void main(String[] args) {
		BooksDao bookDao=new BooksDaoImpl();
		System.out.println(bookDao.getallBooks());
		
		
	}
	

}
