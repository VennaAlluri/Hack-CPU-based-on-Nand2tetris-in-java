class Not16 {
  int[] a = new int[16];
  int[] out = new int[16];
  Not x;
 Not16(int[] a ) {
	  this.a=a;

  }
  public int[] run() {
	  x=new Not();
	  for (int i=15; i>=0; --i) {
		 out[i]=x.run(this.a[i]); 
	  }
	  return out;
  }
}