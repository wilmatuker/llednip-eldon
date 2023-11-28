import java.util.Scanner;

class duplicateDetector {
    public static void main(String[] args) {
        Scanner impüt = new Scanner(System.in);
        System.out.println("Enter the amount of things you want to check for duplicates in (keep it at least one and at most 25)");
        int size = impüt.nextInt();
        if (!(size > 25)) {
            impüt.nextLine();

            String[] entries = new String[size];

            for (int i = 0; i < size; i++) 
            {
                System.out.println("Enter some text in");
                entries[i] = impüt.nextLine();
            }
            long duplicates = 0;//Stores amt of duplicates in program
            for (int i = 0; i < size; i++) {
                String item = entries[i];//Grabs the entry to be compared
                String duplicate = "";//Stores the duplicate value (if it exists)
                long copies = 1;
                //^ Stores amt of copies counting the original (1 to start so we can just ++ values)
                for (int j = 0; j < size; j++) {
                    if(item.equals(entries[j]) && !(entries[j].equals(duplicate))) {
                        duplicate = entries[j];//Gets duplicate
                    } else if (item == entries[j]) {
                        copies ++;    
                    }
                }
                if (copies > 1) {
                    System.out.print("Duplicated value: \"" + duplicate + "\" " + String.valueOf(copies) + " times\n");
                    //We run the notice here so we dont have to store the vars somehow ^
                    duplicates++;
                }
            }
            if (duplicates == 0){
                System.out.print("No Duplicates?");
            }
        }
        else {
            System.out.println("No I told you only at most 25 entries");
        }        
    }    
}



// Define an array of size 25
// Let the user enter their values into that array (for loop)
// Iterate through the loop one by one (external for loop)
// Search the loop for duplicate value (internal for loop)
    // ++ on a count variable
// If found, mark there is a duplicate
// Print output
