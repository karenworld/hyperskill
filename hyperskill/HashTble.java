package hyperskill;

import org.beryx.textio.StringInputReader;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;

public class HashTble {
	private final static int listSize=10;//max size of HashTable
	private static ListNode[] list= new ListNode[listSize];//holds the values of the hashTable
	private static int count;//count of items
	 
	    /**Defines the nodes which hold
	     * the values and keys*/
	    private class ListNode
	    {
	    String key;
	    String value;
	    ListNode next;
	         
	        private ListNode(String thisKey, String thisValue)
	        {
	        key=thisKey;
	        value=thisValue;
	        }
	    }
	     
	    /**adds an item to the list*/
	    public void put(String key, String value)
	    {
	    int location=(Math.abs(key.hashCode()) % listSize);
	    ListNode newNode=new ListNode(key, value);
	        if(list[location]==null)
	        {
	        list[location]=newNode;
	        return;
	        }
	        else
	        {
	        ListNode occupiedNode=list[location];
	            while(occupiedNode.next!=null)
	            {
	            occupiedNode=occupiedNode.next;
	            }
	        newNode=occupiedNode.next;
	        }
	    count++;//add 1 to count of items
	    }
	     
	    /**Returns the number of items in the array*/
	    public int size()
	    {
	    return count;
	    }
	     
	    /**returns true if the key is in the array*/
	    public boolean containsKey(String key)
	    {
	    int location=(Math.abs( key.hashCode() ) % listSize);
	    ListNode node=list[location];
	        while(node!=null)
	        {
	            if(node.key.equals(key))
	            return true;
	            else
	            node=node.next;
	        }
	    return false;//item not found
	    }
	     
	    /**Returns the value associated with the key.
	    If the key is not found, returns null*/
	    public String get(String key)
	    {
	    int location=(Math.abs(key.hashCode()) % listSize);
	    ListNode node=list[location];
	        do{
	            if(node.key.equals(key))
	            return node.value;
	            else
	            node=node.next;
	        }while(node!=null);
	    return null;//nothing found, returns null
	    }
	     
	    /**Removes the key and its associated value from the
	    hash table*/
	    public void remove(String key)
	    {
	    int location=Math.abs( key.hashCode()) % listSize;
	    ListNode node=list[location];
	        if(node==null)//Nothing is at the array index
	        return;
	        else if(node.key.equals(key))
	        {
	        list[location]=node.next;
	        count--;
	        return;
	        }
	        else
	        {
	            while(node.next!=null)
	            {
	            ListNode lastNode=node;
	            node=node.next;
	            ListNode nextNode=node.next;
	                if(node.key.equals(key))
	                {
	                lastNode.next=nextNode;
	                count--;
	                return;
	                }
	            }
	        }
	    }
	     
//	    public static void main(String[] args)
//	    {
//	    HashTble table=new HashTble();
//	    StringInputReader key;//the keys to be operated on, specified by user
//	    TextIO textIO = TextIoFactory.getTextIO();
//	    table.put("George Boole", "Computers");
//	    table.put("Albert Einstein", "Physics");
//	    table.put("Beethoven" , "Music");
//	    System.out.println("Which key should be removed?");
//	    key=TextIO.getln();
//	    key=TextIO.newStringInputReader();
//	    table.remove(key);
//	    System.out.println("Does the table contain beethoven?");
//	    System.out.println(table.containsKey("Beethoven"));
//	    System.out.println("Which key's value do you want?");
//	    key=TextIO.getIn();
//	    System.out.println(table.get(key));
	     
	    
	}

