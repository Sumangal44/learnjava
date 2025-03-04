public class variables {
    public static void main(String[] args) {
        int myNum = 5;
        byte mynum = 100;
        // Integer (whole number)
        float myFloatNum = 5.99f; // Floating point number
        char myLetter = 'D'; // Character
        boolean myBool = true; // Boolean
        String myText = "Hello";
        // String

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        System.out.println(mynum);

        short myum = 5000;
        System.out.println(myum);
        // You can also declare a variable without assigning the value, and assign the
        // value later:
        int myNum1;
        myNum1 = 15;
        System.out.println(myNum1);

        // Final Variables
        // To create a constant, use the final keyword.
        final int myNum2 = 15;
        // myNum2 = 20; // will generate an error: cannot assign a value to a final
        // variable
        System.out.println(myNum2);
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

    }
}
