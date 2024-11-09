package Tasks;

public class SmallestEvenMultiple {
    public static int smallestEvenMultiple(int n) {
        int smallestEvenMultiple;
        if(n%2 == 0){
            smallestEvenMultiple = n;
            System.out.println(smallestEvenMultiple);
            return smallestEvenMultiple;
        }else{
             smallestEvenMultiple =n*2;
            System.out.println(smallestEvenMultiple);
            return smallestEvenMultiple;
        }
    }
}
