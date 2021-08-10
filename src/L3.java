public class L3 {

    public static void main(String[] args) {
        int literalvalue = 5;
        int literalvalue2 = 6;
        int expression1 = 5+6;
        int expression2 = literalvalue + 6;
        int expression3 = literalvalue + literalvalue2;

        //example of literal values
        double literalExpression = 3.4;
        boolean literalExample2 = true;
        String literalExample3 = "apple";

        //Examples of Expressions
        double expressionExample = 5+6;
        boolean expressionExample2 = 5>6;
        //bad example
        //int badExample 5.4 - 0.4;
        //A string expression is callled string concatenation. You can combine string using the
        String expressionExample3 = "A fruit people eat is an " + literalExample3;

        //Example Program

        String message1 = "The store has ";
        String message2 = " apples in stock.";
        int numApples = 20;

        System.out.println("The store has 20 apples in stock.");
        System.out.println("The store has " + numApples + " apples in stock");
        System.out.println(message1 + numApples + message2);
    }
    
     
}
