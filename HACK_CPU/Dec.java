class Dec {
public static int con(int[] a) {
     int m=0,n,f;
     for(int i=a.length-1; i>=0; i--) {
    	 n=(a.length-1)  - i;
    	 f= (int) Math.pow(2,n);
    	 m=m+(a[i] * f);  }
    	return m;
}
public static void main(String[] args) {
System.out.println(Dec.con(Bin.con(-1)));   }
}