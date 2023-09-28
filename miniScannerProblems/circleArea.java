import java.util.Scanner;


public class circleArea {
    public static void main(String[] args) {
        Scanner skenner = new Scanner(System.in);
        System.out.println("You are looking to see how much area you can close of staying a constant distance from something");
        System.out.println("What is the distance you want to keep (in feet)?");
        int dis = skenner.nextInt();
        System.out.println("The square feet you cover will be " + (Math.PI * Math.pow(dis, 2)) + "sq.ft if you can keep exact distance.");
    }    
}