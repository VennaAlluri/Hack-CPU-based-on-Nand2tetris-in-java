class Bin {
	public static int[] con (int a) {
		int m=1;
		int[] bit =new int [16];
		for (int i=15;i>=0;i--) {
			int temp = a>>i;
			bit[15-i] = temp&m;
			
		}
		return bit;
	}

public static void main(String[] args) {
	int[] j=Bin.con(65535);
	for (int i=0;i<=15;i++) {
		System.out.print("\n"+j[i]); }
}
}
