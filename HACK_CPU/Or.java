class Or {
	Nand l;
	int out;
	public int run(int a, int b) {
		l=new Nand();
		out = l.run(l.run(a,a), l.run(b,b));
    return out ;
}
}
