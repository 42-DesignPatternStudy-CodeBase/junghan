package iteratorPattern;

public class BookShelfReverseIterator implements Iterator{

	private BookShelf bookShelf;
	int index;
	
	public BookShelfReverseIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = bookShelf.getNumOfBooks() - 1;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index >= 0;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Book book = bookShelf.getBook(index);
		index--;
		return book;
	}

}
