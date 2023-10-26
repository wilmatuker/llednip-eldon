import java.util.Scanner;

class nums {
    public static void main(String[] args) {
        double nums[] = {Double.NaN}
        Scanner skannear = new Scanner(System.in);
        System.out.println("How many numbers do you want to put in? (positive answers only)");
        int ans = skannear.nextInt();
        

        if (ans > 0){
            double nums[] = new double[ans];
            System.out.println(nums.length);
        }
        
        if (nums[0] != Double.NaN) {
            System.out.println("Enter a number");
        }
    }    
}