class Adder {
  int a,b,c;
 private int s,c1;
  Half_Adder h,k;
  Or o;
 Adder(int a, int b,int c){
	  this.a=a;
	  this.b=b;
	  this.c=c;
  }
  public int sum() {
	  	h= new Half_Adder(this.a,this.b);
	  	int o1 = h.sum();
	  	k=new Half_Adder(this.c,o1);
	  	s=k.sum();
	  return s;
  }
  public int carry() {
	  	o=new Or();
	  	c1=o.run(h.carry(),k.carry());
	 return c1;
  }
  
  
  public static void main(String[] args) {
	  	Adder obj =new Adder(1,1,0);
	  System.out.println(obj.sum());
	  System.out.println(obj.carry());
  }
  
}
