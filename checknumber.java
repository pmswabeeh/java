class checknumber
{
 public static void main(String arg[])
{
 int n = Integer.parseInt(arg [0]);
if(n>0)
{
 System.out.println(n+"+ve number");
}
 else if(n<0)
{
   System.out.println(n+"-ve number");
}
 else{
   System.out.println(n+"is zero");
}
 }
   }