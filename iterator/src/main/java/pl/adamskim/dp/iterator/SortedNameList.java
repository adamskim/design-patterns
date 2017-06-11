package main.java.pl.adamskim.dp.iterator;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortedNameList implements HasIterator {
	
	private Set<String> names;

	public SortedNameList(String ... names) {
		this.names = new TreeSet<String>(Arrays.asList(names)); 
	}
	
	@Override
	public NameIterator createIterator() {
		return new SortedNameListIterator();
	}
	
	private class SortedNameListIterator implements NameIterator {

		private java.util.Iterator<String> it = names.iterator();
		
		@Override
		public String next() {
			return it.next();
		}

		@Override
		public boolean hasNext() {
			return it.hasNext();
		}
		
	}
	
}
