
public class ArrayDuplicaton {

	static int[][] a = { { 2, 3 }, { 1, 5 }, { 2, 3}, { 4, 5 }, { 4, 5 }, { 4, 5 } };
	static int[][] b = new int[7][2];

	public static int search(int k) { 
		int f = 0,i=0,j=0;
		//System.out.println(k);
		
		for ( i = 0; i < b.length; i++) {
			f = 0;
			for (j = 0; j < b[i].length; j++) {
				//System.out.println(b[i][j]);
				if (a[k][j] != b[i][j]) {
					f = 0;
					break;
				}
				else {
					f=1;
				}
			}
			if(f==1) {
				return 1;
			}
		}
		return 0 ;
	}

	public static void main(String[] args) {
		
		
		System.out.println("Before removing Duplication");
		for ( int i = 0; i < a.length; i++) {
			System.out.print("a");
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("[ "+a[i][j]+" ] ");
				}
			}
		System.out.println(" ");
		System.out.println("After removing Duplication");
		for ( int i = 0; i < a.length; ++i) {
			if (search(i)==0) {
				
				
				for (int j = 0; j < a[i].length; ++j) {
					b[i][j] = a[i][j];
					
					System.out.print("[ "+b[i][j]+" ] ");
				}
			}
		}
	}
}
