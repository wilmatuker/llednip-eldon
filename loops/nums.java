import java.util.Scanner;

class nums {
    public static void main(String[] args) {
        Scanner skannear = new Scanner(System.in);
        double[] nums = new double[1];
        System.out.println("Please enter a number");
        nums[0] = skannear.nextDouble();
        while (skannear.next().toLowerCase() != "end") {
            if (skannear.next().toLowerCase() == "end") {
                if (nums.length == 1) {
                    System.out.println("There was only one number: " + String.valueOf(nums[0]));
                }
            }
            else {
                System.out.println("Please enter a number, or \"end\" if you want to stop");
                double num = skannear.nextDouble();
                int end = nums.length;
                nums = new double[nums.length + 1];
                nums[end] = num;
            }
        }
        System.out.println(nums);
    }    
}