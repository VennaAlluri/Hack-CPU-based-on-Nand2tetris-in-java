class Inc16 extends Add16 {
	Inc16(int[] a){
    super(a,Bin.con(1));
	}
	public int[] sum() {
	    int c=0;
		for (int i=15; i>=0; --i) {
			x=new Adder(this.a[i],this.b[i], c);
			out[i]=x.sum();
			c=x.carry();
		}
		return out;
	}
}
