public class scope {
    int var;
    static int vari;
    static String s;
    public static void method(scope s)
    {
        int fvar=10;
        System.out.println(fvar);
        System.out.println(vari);
        System.out.println(s.var);
        System.out.println(s);
    }
    public static void main(String [] args)
    {
        scope s = new scope();
        s.var = 4;
        scope.method(s);
    }

}
