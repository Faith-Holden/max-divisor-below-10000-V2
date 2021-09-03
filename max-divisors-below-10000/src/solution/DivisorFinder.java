package solution;

public class DivisorFinder {
    public static void main(String[] args){
        int biggestDivisorCount = 0;
        int [] divisorArray = new int [10000];
        for (int i=1; i<=10000; i++){
            int divisorCounter = 0;
            for (int j = 1; j<=i; j++){
                if(i%j==0){
                    divisorCounter++;
                }
            }

            divisorArray[i-1]=divisorCounter;
            if(divisorCounter>biggestDivisorCount){
                biggestDivisorCount = divisorCounter;
            }
        }

        System.out.println("Among the numbers between 1 and 10,000,");
        System.out.print("the maximum number of divisors was ");
        System.out.println(biggestDivisorCount+".");
        System.out.println("The numbers with " + biggestDivisorCount +" divisors were...");
        for (int i = 0;i<divisorArray.length; i++) {
            if (divisorArray[i] == biggestDivisorCount) {
                System.out.println(i+1);
            }
        }
    }
}
