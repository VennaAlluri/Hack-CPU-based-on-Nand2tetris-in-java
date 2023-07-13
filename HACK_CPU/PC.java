class PC {
	int[] in = new int[16];
	private int[] out = Bin.con(0);
	private int inc, l, re;

	PC(int[] a) {
	this.in=a;
}
public int[] optr (int x, int y, int z) {
	Inc(x);
	load(y);
	reset(z);
	return output();
}
public int[] Inc(int inc) {
	this.inc=inc;
	Inc16 i = new Inc16(out);
	Mux16 m = new Mux16(out,i.sum());
	int[] o1 = m.sel(inc);
	return o1;
}
public int[] load (int load) {
	this.l=load;
	Mux16 m = new Mux16(Inc(this.inc),in);
	int[] o2 = m.sel(load);
	return o2;
}
public int[] reset(int re) {
	this.re=re;
	Mux16 m =new Mux16(load(this.l),Bin.con(0));
	int[] o3 = m.sel(re);
	return o3;
}
public int[] output() {
	Register r =new Register(reset(this.re));
	this.out=r.load(1);
	return this.out;
}

public static void main(String[] args) {
	int[] i=Bin.con(7);
	PC obj = new PC(i);
	int[] o = obj.optr(0, 1, 0);
	o=obj.optr(0, 0, 1);
    System.out.println(Dec.con(o));
}












}
