class Alu {
	int[] a = new int[16];
	int[] b = new int[16];
	private int zx,nx,zy,ny,f,no;
	private int[] out = new int[16];
	
	Alu(int[] a,int[] b) {
		this.a=a;
		this.b=b;
	}
	public int[] optr(int x1,int x2,int y1,int y2, int f1,int n1) {
		zero_x(x1);
		Not_x(x2);
		zero_y(y1);
		Not_y(y2);
		func(f1);
		NotOutput(n1);
		//Check_zr();
		//Check_ng();
		return Output();
	}
	public int[] zero_x(int zx) {
		this.zx=zx;
		Mux16 mux = new Mux16(this.a,Bin.con(0));
		int[] Zx = mux.sel(zx);
		return Zx;
	}
	public int[] Not_x(int nx) {
		this.nx=nx;
		Not16 not = new Not16(zero_x(this.zx));
		int[] notx =not.run();
		Mux16 mux = new Mux16(zero_x(this.zx),notx);
		int[] Nx=mux.sel(nx);
		return Nx;
	}
	public int[] zero_y(int zy) {
		this.zy=zy;
		Mux16 mux = new Mux16(this.b,Bin.con(0));
		int[] Zy = mux.sel(zy);
		return Zy;
	}
	public int[] Not_y(int ny) {
		this.ny=ny;
		Not16 not = new Not16(zero_y(this.zy));
		int[] noty =not.run();
		Mux16 mux = new Mux16(zero_y(this.zy),noty);
		int[] Ny=mux.sel(ny);
		return Ny;
	}
	
	public int[] func(int f) {
		this.f=f;
		Add16 add = new Add16(Not_x(this.nx),Not_y(this.ny));
		int[] sum = add.sum();
		And16 and = new And16(Not_x(this.nx),Not_y(this.ny));
		int[] d=and.run();
		Mux16 mux = new Mux16(d,sum);
		int[] F = mux.sel(f);
		return F;
		
	}
	public int[] NotOutput(int no) {
		this.no=no;
		Not16 not=new Not16(func(this.f));
		int[] not_o=not.run();
		Mux16 mux = new Mux16(func(this.f),not_o);
		int[] No=mux.sel(no);
		return No;
	}
	public int[] Output() {
		Or16 o=new Or16(NotOutput(this.no),Bin.con(0));
		out=o.run();
		return out;
	}
	public int  Check_zr() {
		Or16way or = new Or16way(NotOutput(this.no));
		Not o=new Not();
		int Zr=o.run(or.run());
		//System.out.printf("Zr = %d\n",Zr);
		return Zr;
	}
	public int Check_ng() {
		And16 ng=new And16(Bin.con(65535),NotOutput(this.no));
		int[] Ng=ng.run();
		//System.out.printf("Ng = %d\n",Ng[1]);
		return Ng[0];
	}
	 
	//
	public static void main(String[] args) {
		int[] a= Bin.con(4);
		int[] b= Bin.con(5);
		Alu obj = new Alu(a,b);
		int[] out= obj.optr(0,0,0,0,1,0);
		for (int i=0;i<=15;++i) {
			System.out.print(out[i]);
		}
	}
}










