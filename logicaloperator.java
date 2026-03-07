public class logicaloperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a < 50 && b < 50)
            System.out.println("a and b are less then 50");
        else
            System.out.println("a and b are greater then 50");
//or
        if ( a < 20 || b > 50)
            System.out.println("true");
        else
            System.out.println("false");

//not
        if (!(a > b))
            System.out.println("a is not equal to b");
        else
            System.out.println("a is equal to b");
    }
}
