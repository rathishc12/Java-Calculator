import java.util.Scanner;
class calci
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        while(true)
        {
        System.out.println("Enter the first number : ");
        int num1=scan.nextInt();
        
        System.out.println("Enter the operator(+,-,*,/) : ");
        char operator=scan.next().charAt(0);

        System.out.println("Enter the second number : ");
        int num2=scan.nextInt();
        int result=0;
        
            switch(operator)
            {
                case '+':
                result =num1+num2;
                break;

                case '-':
                result =num1-num2;
                break;

                case '*':
                result =num1*num2;
                break;

                case '/':
                if(num1 ==0|| num2==0)
                {
                    System.out.println("Infinity");
                }
                    result =num1/num2;
                    break;
            }  
            System.out.print("Result = "+result);
            System.out.println("\nDo you want to Conutinue? (yes or no) ");
            String choice =scan.next();
            if(choice.equalsIgnoreCase("no"))
            {
                break;
            }
        }
        scan.close();
        System.out.print("calculator closed !!");   
    }
}