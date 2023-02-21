package iteratorPattern;

public class BookShelfIterator implements Iterator {

	private BookShelf bookShelf;
	int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return (index < bookShelf.getNumOfBooks());
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Book book = bookShelf.getBook(index);
		index++;
		return book;
	}

}
