class Nand {
	int out;
 public  int run(int a , int b)  {
	 if ((a==1 || a==0) && (b==1 || b==0) ) {
	 out = (a==1 && b==1)?0:1 ;
	 return (out); }
	 else {  throw new ArithmeticException("Values doesn't match the pins width");   }
 }	

}