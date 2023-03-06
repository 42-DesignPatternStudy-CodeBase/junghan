package visitorPattren;

public abstract class Entry {
	  public abstract String getName();
	    public abstract int getSize();
	    public Entry add(Entry entry) throws FileTreatmentException {
	        throw new FileTreatmentException();
	    }
	    public Iterator iterator() throws FileTreatmentException {
	        throw new FileTreatmentException();
	    }
	    public String toString() {
	        return getName() + " (" + getSize() + ")";
	    }
}
