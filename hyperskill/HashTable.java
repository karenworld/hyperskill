package hyperskill;


public class HashTable<T> {
	private final int size; // we assume it is fixed hence we assigned a final
	private TableEntry[]table;

	//not this way
	//	public HashTable(int size, TableEntry[] table) {
	//		super();
	//		this.size = size;
	//		this.table = table;
	//	}

	public HashTable(int size) {
		this.size = size;
		table = new TableEntry[size];
	}


	public String toString() {
		StringBuilder tableStringBuilder = new StringBuilder();
		for(int i = 0; i < table.length; i++) {
			if(table[i] == null) {

				tableStringBuilder.append(i + ": null");
			}else {
				tableStringBuilder.append(i + ": key=" + table[i].getKey()
						+ ": value=" + table[i].getValue());
			}
			if(i < table.length - 1) {
				tableStringBuilder.append("\n");
			}
		}
		return tableStringBuilder.toString();
	}

	private int findEntryIndex(int key) {
		int hash = key % size;
		while (!(table[hash] == null || table[hash].getKey() == key)) {
			hash = (hash + 1)% size;
			if (hash == key% size) {
				return -1;
			}
		}
		return hash;
	}


	public boolean put(int key, T value) {
		int idx = findEntryIndex(key);

		if (idx == -1) {
			return false;
		}
		table[idx] = new TableEntry(key, value);
		return true;

	}
	public static void main(String[] args) {
		HashTable<String>table = new HashTable(5);
		table.put(21, "John");
		table.put(1, "Mike");
		table.put(11, "Lohn");
		//String name = table.get(21); // why cannot?
		//update table
		if(table.put(21, "Anna")){
			System.out.println(table);
		}
				
	}


}


