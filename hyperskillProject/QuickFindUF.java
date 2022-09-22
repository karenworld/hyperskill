package hyperskillProject;

import java.util.Arrays;

public class QuickFindUF {
	private int[]id;
	private int count;
	
	public QuickFindUF(int n) {
		count = n;
		id = new int[n];
		for(int i = 0; i < n; i++) {
			id[i] = i;
		}
	}
		
		public int count() {
			return count;
		}
		
	
		public int find(int p) {
			validate(p);
			return id[p];
	}
		
		//validate p is a valid index
		private void validate(int p) {
			int n = id.length;
			if(p < 0 || p>= n) {
				throw new IllegalArgumentException("index" + p + " is not betweeen 0 and " + 
				(n-1));
			}
		}
		public boolean connected(int p, int q) {
			validate(p);
			validate(q);
			return id[p] == id[q];
		}
		
		public void union(int p, int q) {
			validate(p);
			validate(q);
			int pID = id[p]; //needed for correctness
			int qID = id[q]; // to reduce the no of array accesses
			//p and q are already in the same component
			if(pID == qID)
				return;
			for(int i = 0; i < id.length; i++) {
				if(id[i] == pID)
					id[i] = qID;
				count--;
			}
			
			}
		
		public static void main(String[] args) {
			int n = 64;
			QuickFindUF uf = new QuickFindUF(n);
			for(int k = 0; k < n-1; k+=4) {
				uf.union(k, k+1);
				uf.union(k+2, k+1 );
				uf.union(k, k+3);
		}
			for(int k = 0; k < n-1; k+=16) {
				uf.union(k, k+4);
				uf.union(k, k+8);
				uf.union(k, k+12);
			}
			uf.union(0, 16);
			uf.union(0, 32);
			uf.union(0, 48);
			//System.out.print(uf.union(n, n));
		}
}
