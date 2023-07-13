public class fourbin {
    public static int[] con (int a) {
		int m=1;
		int[] bit =new int [16];
		for (int i=3;i>=0;i--) {
			int temp = a>>i;
		    bit[i] = temp&m;
		   //System.out.println(bit[i]);
		}
		return bit;
	}
	public static void main(String[] args) {
		int[] s=new int[4];
		s=fourbin.con(4);
		for (int i=3;i>=0;i--) {
			System.out.println(s[i]);
		}
  }
}
