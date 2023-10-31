import java.util.Scanner;

class stringRev {
    public static void main(String[] args) 
{   
        Scanner sconner = new Scanner(System.in);
        String revString = "";
        System.out.println("Type anything in here to reverse it");
        String string = sconner.nextLine();
        for (int l = -1; l < string.length() + 3; l++) {
            for (int i = 1; i < string.length()+1; i++) 
            {
                revString += string.charAt(string.length()-i);
                revString += " ";
            }
            System.out.println(revString);
            revString = "";
            string = string.substring(0, string.length() - 1);
        }
        sconner.close();
    }    
}
