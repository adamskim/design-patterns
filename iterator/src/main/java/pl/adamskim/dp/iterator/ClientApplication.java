package main.java.pl.adamskim.dp.iterator;

public class ClientApplication {

	public static void main(String[] args) {
		String[] names = new String[] {"Ania", "Maria", "Lila", "Adam"};
		
		// first collection implementation
		HasIterator nameList = new NameList(names);
		printNames(nameList);
		
		// second/new collection implementation
		HasIterator sortedNameList = new SortedNameList(names);
		printNames(sortedNameList);
	}

	private static void printNames(HasIterator nameList) {
		System.out.println("----- Print names ------");
		NameIterator iterator = nameList.createIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
