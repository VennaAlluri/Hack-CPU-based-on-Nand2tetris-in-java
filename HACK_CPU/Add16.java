class Add16 {
	int []a = new int[16];
	int [] b=new int[16];
	int []out=new int[16];
	Adder x;
Add16(int[] a, int[] b){
	this.a=a;
	this.b=b;
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

