package iteratorPattern;

public class IteratorFactory extends Factory {
	private static final int FORWARD = 0;
	private static final int REVERSE = 1;

    @Override
    protected Iterator createProduct(Aggregate list, int type) {
        if (type == FORWARD) {
            return new BookShelfIterator((BookShelf) list);
        }
        else if (type == REVERSE) {
        	return new BookShelfReverseIterator((BookShelf) list);
        }
        return null;
    }

}
