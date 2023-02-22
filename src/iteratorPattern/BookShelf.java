package iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
	
//	private Book[] bookShelf;
	private List<Book> bookShelf = new ArrayList<>();
	private int shelfSize = 1;
	private int numOfBooks = 0;
	
	BookShelf(int numOfBooks) {
		this.shelfSize = numOfBooks;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		
//		return new BookShelfIterator(this);
		return new IteratorFactory().createProduct(this, 0);
	}
	
	public Iterator reverseIterator() {
		// TODO Auto-generated method stub
		
//		return new BookShelfReverseIterator(this);
		return new IteratorFactory().createProduct(this, 1);
	}
	
	public void appendBook(Book newBook) {
		if (numOfBooks < shelfSize) {
			bookShelf.add(newBook);
			numOfBooks++;
		}
		else
			System.out.println("No space in the shelf");
	}
	
	public Book getBook(int index) {
		return bookShelf.get(index);
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return shelfSize;
	}
	
	public int getNumOfBooks() {
		// TODO Auto-generated method stub
		return numOfBooks;
	}
}
