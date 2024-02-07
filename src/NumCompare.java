public class NumCompare
{
    public static void main(String[] args)
    { //determining variables
        double firstNumber = 0.0;
        double secondNumber = 0.0;
        boolean invalidInput = false;
        //output
        System.out.println("Enter the first number:");
        //fake input
        firstNumber = 11.0;
        System.out.println("Enter the second number:");
        //fake input
        secondNumber = 11.0;
        //bullet proofing
        while(!invalidInput){
            if (Double.isNaN(firstNumber) || Double.isNaN(secondNumber)) {
                System.out.println("Invalid entry! Please enter valid numbers.");
                invalidInput = true; //if entry is a number, invalidInput never turns true program never finishes and moves on/stops.
                //comparing numbers
            }else{
                if (firstNumber == secondNumber) {
                    System.out.println(firstNumber + " and " + secondNumber + " are equal!");
                }else if(firstNumber > secondNumber) {
                    System.out.println(firstNumber + " is larger than " + secondNumber + "!");
                } else  {
                        System.out.println(firstNumber + " is smaller than " + secondNumber + "!");

    }
                invalidInput = true;
            }
    }

}}