package calculate;

public class Calculator {

    void addition(int a, int b)
    {
        System.out.println(a+b);
    }

    void subtraction(int a, int b)
    {
        System.out.println(a-b);
    }

    void multiplication(int a, int b)
    {
        System.out.println(a*b);
    }
    void division(int a , int b)
    {
        System.out.println(a/b);
    }

    void calculateResult(int a, int b, char symbol){

        if(symbol== '+')
        {
            addition(a,b);
        } else if (symbol=='-')
        {
            subtraction(a,b);
        } else if(symbol=='*')
        {
            multiplication(a,b);
        } else if (symbol == '/')
        {
            division(a,b);
        }

    }


}
