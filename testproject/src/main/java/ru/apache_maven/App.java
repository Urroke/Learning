package ru.apache_maven;

class A{
    private int a;
    private int b;

    public A(){;}

    public A(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void Print()
    {
        System.out.print(a + "\t" + b + "\n");
    }
}

class B extends A{
    private String c;

    public B(){;}

    public B(int a, int b, String c)
    {
        super(a, b);
        this.c = c;
    }

    public void Print() {
        super.Print();
        System.out.println("\b\t" + c + "\n");
    }
}

public class App 
{
    public static void main( String[] args )
    {
        A a = new A(1, 2);
        B b = new B(2, 3, "Hi my name is Jane");
        b.Print();
    }
}
