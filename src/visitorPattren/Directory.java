package visitorPattren;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    String name;
    int size;
	private ArrayList<Entry> list = new ArrayList<Entry>();

	public Directory(String name) {
		this.name = name;
        this.size = 0;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int totalSize = 0;
		for (Entry child : list) {
			totalSize += child.getSize();
		}
		return totalSize;
	}

	@Override
	public Entry add(Entry entry) throws FileTreatmentException {
        this.list.add(entry);
		return entry;
	}

	@Override
	public Iterator<Entry> iterator() throws FileTreatmentException {
		return list.iterator();
	}
	
}
