class And16 {
  int[] a = new int[16];
  int[] b = new int[16];
  int[] out = new int[16];
  And x;
  And16(int[] a, int[] b ) {
	  this.a=a;
	  this.b=b;
  }
  public int[] run() {
	  x=new And();
	  for (int i=15; i>=0; --i) {
		 out[i]=x.run(this.a[i], this.b[i]); 
	  }
	  return out;
  }
}
