class Not {
  Nand o1;
  int out;
  public int run(int a) {
	  o1=new Nand();
	  out = o1.run(a, a);
	  return out;
  }
}
