class Xor {
int out ;
Not n;
Nand x;
public int run (int a, int b) {
	n=new Not();
	x=new Nand();
	int o1 = x.run(n.run(a),b);
	int o2 = x.run(a,n.run(b));
	out=x.run(o1, o2);
	return out;
}
}
