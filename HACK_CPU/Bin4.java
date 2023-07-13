class Bin4 {
	public static int[] con (int a) {
		int m=1;
		int[] bit =new int [4];
		for (int i=3;i>=0;i--) {
			int temp = a>>i;
			bit[i] = temp&m;
			
		}
		return bit;
	}

public static void main(String[] args) {
	int[] j=Bin4.con(4);
	for (int i=0;i<=3;i++) {
	System.out.print(j[i]); }
}
}
