import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the contacts function below.
     */
    static void contacts(String[][] queries) {
    	Trie words = new Trie();
    	for(int i=0; i<queries.length; i++) {
    		String command = queries[i][0];
    		String word = queries[i][1];
    		if(command.equals("find")) {
    			int cnt = words.wordCount(word);
    			System.out.println(cnt);
    		} else {
    			words.add(word);
    		}
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	int queriesRows = Integer.parseInt(scanner.nextLine().trim());

    	String[][] queries = new String[queriesRows][2];

    	for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++) {
    		String[] queriesRowItems = scanner.nextLine().split(" ");

    		for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
    			String queriesItem = queriesRowItems[queriesColumnItr];
    			queries[queriesRowItr][queriesColumnItr] = queriesItem;
    		}
    	}

    	contacts(queries);
    }
}

class TrieNode {

	private HashMap<Character,TrieNode> children; 
	public int size;

	public TrieNode() {
		this.children = new HashMap<Character,TrieNode>();
		size = 0;
	}

	public boolean contains(char c) {
		return this.children.containsKey(c);
	}

	public void add(char c) {
		TrieNode newChild = new TrieNode();
		this.children.put(c,newChild);
	}

	public TrieNode get(char c) {
		return this.children.get(c);
	}
}

class Trie {        

	private TrieNode root;

	public Trie() {
		this.root = new TrieNode();
	}

	public void add(String word) {
		word = word.toUpperCase();
		TrieNode cur = this.root;
		while(word.length()!=0) {
			cur.size++;
			char c = word.charAt(0);
			if(!cur.contains(c)) {
				cur.add(c);
			}
			cur = cur.get(c);
			word = word.substring(1,word.length());
		}
		cur.size++;
	}

	public int wordCount(String word) {
		word = word.toUpperCase();
		TrieNode cur = this.root;
		while(cur!=null) {
			if(word.length()==0) {
				return cur.size;
			}
			char c = word.charAt(0);
			if(!cur.contains(c)) {
				return 0;
			}
			cur = cur.get(c);
			word = word.substring(1,word.length());
		}
		return 0;
	}
}
