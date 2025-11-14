class Arithmetic
{
public static void main(String arg[]){
if (arg.length !=2){
System.out.println(" please provide exactly two numbers as command line arguments ");
return;
}
int num1 = Integer.parseInt(arg[0]);
int num2 = Integer.parseInt(arg[1]);
int sum  =num1+num2;
int difference =num1-num2;
System.out.println("Number 1:" +num1);
System.out.println("Number 2:" +num2);
System.out.println("Sum:" +sum);
System.out.println("Difference:" +difference);
if(num2 !=0){
int quotient = num1/num2;
int remainder = num1%num2;
System.out.println("quotient "+quotient);
System.out.println("remainder"+remainder);
}
else
{
System.out.println("division by zero is not allowed");
}
}
}






