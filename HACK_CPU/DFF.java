class DFF {
	private int a;
	private Nand r;
	private int out;
	
DFF(int a){
		this.a=a;
		  }
public  int clocked() {
	    r=new Nand();
		out=r.run(r.run(a,a),r.run(a,a));
		return(out);
 }

	
	public static void main(String[] args) {
		DFF obj = new DFF(1);
		System.out.println(obj.clocked());
	}
}

