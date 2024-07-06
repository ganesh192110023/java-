public class scope {
    int var;
    static int vari;
    public static void method(scope s)
    {
        int fvar=10;
        System.out.println(fvar);
        System.out.println(vari);
        System.out.println(s.var);
    }
    public static void main(String [] args)
    {
        scope s = new scope();
        s.var = 4;
        scope.method(s);
    }

}
