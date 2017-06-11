package main.java.pl.adamskim.dp.iterator;

public class NameList implements HasIterator {
	private String[] names;
	
	public NameList(String ...names) {
		this.names = names;
	}
	
	@Override
	public NameIterator createIterator() {
		return new NameListIterator();
	}
	
	private class NameListIterator implements NameIterator {
		
		private int currentIndex = 0;

		@Override
		public String next() {
			if (hasNext()) {
				return names[currentIndex++];
			} else {
				return null;
			}
		}

		@Override
		public boolean hasNext() {
			return currentIndex < names.length;
		}
	}
}
