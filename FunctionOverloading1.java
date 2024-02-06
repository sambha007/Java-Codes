package distt.function;
// this is for undersanding the fuction overloading with diffrent data type


public class FunctionOverloading1 {
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static float sum(float a, float b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        int a=sum(4,5);
        float b=sum(4.4f,4.9f);
        System.out.println("this is int function of sum "+a);
        System.out.println("this is float fuction of sum "+b);

    }
    
}
