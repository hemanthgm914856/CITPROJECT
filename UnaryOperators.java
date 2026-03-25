public class UnaryOperators {
    public static void main(String[] args){
        int x=5;
        System.out.println("Original: "+x);
        //x++ post increment
        System.out.println("Before Post increment "+(x++));
        System.out.println("After Post increment: "+x);
        //++x Pre increment
        System.out.println("Before Pre increment "+(x));
        System.out.println("After Pre increment "+(++x));
        System.out.println("Before Pre decrement "+x);
        System.out.println("After Pre Decrement "+(--x));

    }
}
