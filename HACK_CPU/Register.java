class Register  {
	int[] a= new int[16];
	int[] out= new int[16];
	
Register(int[] a) {
		this.a=a;
	}
public int[] load(int l) {
	for(int i=15; i>=0; --i) {
	Bit_Reg bit = new Bit_Reg(this.a[i]);
	out[i]=bit.load(l);
	}
	return out;
}
public static void main(String... args){
	int a[]=Bin.con(4);
    Register obj=new Register(a);
    int[] out = obj.load(1);
	for(int i=0; i<=15; ++i) {
		 System.out.print(out[i]);
		// System.out.println();
	}
}


}