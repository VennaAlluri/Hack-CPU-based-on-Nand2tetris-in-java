class Fouronemux {
    private Twoonemux s;
    private int out;
    public int run(int D0,int D1,int D2,int D3,int se0,int se1){
        s=new Twoonemux();
        out=s.run(s.run(D0,D1,se0),s.run(D2,D3,se0),se1);        
        return(out);
    }
    public static void main(String[] args){        
        Fouronemux obj=new Fouronemux();
        System.out.println(obj.run(0,1,0,0,1,0));
        }
}
