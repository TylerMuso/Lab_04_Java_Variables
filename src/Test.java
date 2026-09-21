public class Test {
    static void main()
    {
        // int - a number with no fraction, can be negative
        // double - a number with a fractional part (decimal)

        int age = 0;
        double salary = 23.50;
        String name = "Tom";
        String greeting = "Hello World";
        boolean isRaining = false;


        IO.println("Hello World!");  // Literal
        IO.println(greeting);
        IO.println(isRaining);

        // *,/,+,-,%
        int intOperandA = 17;
        int intOperandB = 45;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        intSum = intOperandA + intOperandB; // sum of 17 and 45
        IO.println("The sum of " + intOperandA + " + " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        IO.println("The product of " + intOperandA + " * " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        IO.println("The difference of " + intOperandA + " - " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        IO.println("The quotient of " + intOperandA + " / " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        IO.println("The modulo of " + intOperandA + " % " + intOperandB + " is " + intModulo);

        double doubleOperandA = 17.25;
        double doubleOperandB = 45.50;
        double doubleSum = 0.0;
        double doubleProduct = 0.0;
        double doubleDifference = 0.0;
        double doubleQuotient = 0.0;

        doubleSum = doubleOperandA + doubleOperandB;
        IO.println("The sum of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        IO.println("The product of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        IO.println("The difference of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        IO.println("The quotient of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);
        

        int numKids;
        String isRaining;
        double gallonPrice;
        int favNumber;
        double shoeSize;
        String birthMonth;
        String fullName;
    }
}
