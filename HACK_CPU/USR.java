class USR {
   private int S1=0,S2=0;
    private Fouronemux e;
    public int[] run(int s0,int s1,int m){
        e=new Fouronemux();
        int[] t=new int[4];
        t=Bin4.con(m);
        int[] out=new int[4];
        
        out[0]=e.run(t[3],S1,t[2],t[3],s0,s1);
        out[1]=e.run(t[2],t[3],t[1],t[2],s0,s1);
        out[2]=e.run(t[1],t[2],t[0],t[1],s0,s1);
        out[3]=e.run(t[0],t[1],S2,t[0],s0,s1);
        return(out);
        
    }
    public static void main(String[] args) {
		USR obj=new USR();
        int[] out=obj.run(0,1,5);
		for (int i=0;i<=3;i++) {
			System.out.print(out[i]);
		}
  }

}
