package Sqlexp;

public  interface Crud{
    public String[] create(int i);
    public String[] insert(String[] ar,int i,String names );
    public String[] update(String[] ar,int i,String names);
    public String[] delete(String[] ar,int i);
    public void read(String[] ar);

}
