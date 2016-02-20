//OpenigScreen.java
//Kpolu:Jennifer:A00387022:csc122825
//Submission 05
//Constructors for opeing class.

import java.util.Scanner;
/**
 *
 * 
 */


public class OpeningScreen {
 
    public String firstLine;
    public String secondLine;
    public String thirdLine;
    public int numOfSpacesToIndent;
    public int numberOfBlankLinesBefore;
    public int numberOfBlankLinesAfter;
    
    
    public OpeningScreen(String firstLine, String secondLine,String thirdLine,
            int numOfSpacesToIndent, int numberOfBlankLinesBefore,
                     int numberOfBlankLinesAfter)
    {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
        this.numOfSpacesToIndent = numOfSpacesToIndent;
        this.numberOfBlankLinesAfter = numberOfBlankLinesAfter;
        this.numberOfBlankLinesBefore = numberOfBlankLinesBefore;
        
        
    }
    
    public OpeningScreen(String firstLine, String secondLine,String thirdLine,
            int numOfSpacesToIndent) 
    {
        this(firstLine, secondLine, thirdLine, 16, 11,11);
    }
    
    public OpeningScreen()
    {
        this("Kpolu:Jennifer:A00387022:csc122825",
                "Submission 5", 
                "Constructors for the Opening Screen Class ",16,11,11);
    }
    
    private static void pause()
    {
      System.out.println("Press Enter to Continue ... ");  
      Scanner kbd = new Scanner (System.in);
      kbd.nextLine();
     
    }
    
    public void display() 
    {
        
        
        String defIndent ="\t\t\t\t";
        String blankLines = "\n\n\n\n\n\n\n\n\n\n\n";
        
        /*
        Loop goes here.
        */
        
        System.out.println(this.firstLine); 
        System.out.println(this.secondLine);
        System.out.println(this.thirdLine);
        OpeningScreen.pause();
        
        
    }
    
    
    

    
    public static void main(String[] args) {
     
    }
    
}
