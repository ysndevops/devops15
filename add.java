class Addition
{
        public static void main(String args[])
        {
                int num1,num2,res;
                Scanner s = new Scanner(System.in);
                System.out.println("Welcome to Devops GCP Course");
                System.out.println("This is Prod branch code");
                System.out.println("Enter num1 value");
                num1=s.nextInt();
                System.out.println("Enter num2 value");
                num2=s.nextInt();
                res=num1-num2;
                System.out.println("The subtraction result is "+res);
                res=num1*num2;
                System.out.println("The Product result is "+res);
                System.out.println("Thank you");
        }
}
