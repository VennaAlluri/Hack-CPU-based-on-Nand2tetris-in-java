class Bit_Reg {
	int a;
	int out=0;
    DFF d; Mux m;
Bit_Reg(int a){
		this.a=a; }

public int load(int l) {
      m=new Mux(out,this.a);
      d=new DFF(m.sel(l));
      out= d.clocked();
      return out;
}
public static void main(String... args){
    Bit_Reg obj=new Bit_Reg(0);
    System.out.println(obj.load(1));
    //System.out.println(obj.load(0));
}	

}
