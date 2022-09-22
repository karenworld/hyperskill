package hyperskill;


//demo HashTable
public class TableEntry<T> {
	
	private final int key;
	private final T value;
	
	public TableEntry(int key, T value) {
		super();
		this.key = key;
		this.value = value;
	}
	public int getKey() {
		return key;
	}
	
	public T getValue() {
		return value;
	}
	
}
