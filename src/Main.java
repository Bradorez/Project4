import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        boolean flag = true,big_flag=true;
        String line ="Hello",symbol = "y";
        int length = 0;
        Scanner scan = new Scanner(System.in);
        // #######PART1#######
        while (flag)
            {
                flag = false;
            }
        do
            {
                System.out.println("hi");
            }while(flag);
        for (int i = 0; i < 10; i++)
            {
                System.out.println(i);
            }
        for (int j = 10; j > 0 ; j--)
            {
                System.out.println(j);
            }
        for (int i = 0; i < line.length(); i++)
            {
                System.out.println(line.charAt(i));
            }
        for (int i = 0; i < 10; i++)
            {
                System.out.println("i = " + i);
                for (int j = 0; j < 10; j++)
                    {
                        System.out.println("j = " + j);
                    }
            }
        // #######PART2#######
        do
        {
            System.out.println("do you want to stay in the loop?");
            line = scan.nextLine();
            line = line.toUpperCase();
            length = line.length();


            System.out.println("line = " + line + " line length = " + length);


        }while(line.equals("Y"));
        // #######PART3#######
        flag = true;
        while (flag)
            {
                System.out.println("print smth");
                line = scan.nextLine();
                for (int i = line.length()-1; i >= 0 ; i--)
                    {
                        System.out.print(line.charAt(i));
                    }
                System.out.println("\ndo you want to stay in the loop?");
                line = scan.nextLine();
                line = line.toUpperCase();
                if (line.equals("Y"))
                    {
                        flag = true;
                    }
                else
                    {
                        flag = false;
                    }

            }
        // #######PART4#######
        while (big_flag)
            {
                flag = true;
                System.out.println("Hello");
                while (flag)
                {
                    System.out.println("print smth");
                    line = scan.nextLine();
                    for (int i = line.length()-1; i >= 0 ; i--)
                    {
                        System.out.print(line.charAt(i));
                    }
                    System.out.println("\ndo you want to stay in the loop?");
                    line = scan.nextLine();
                    line = line.toUpperCase();
                    if (line.equals("Y"))
                    {
                        flag = true;
                    }
                    else
                    {
                        flag = false;
                    }

                }
                System.out.println("if you want to continue print y or Y");
                line = scan.nextLine();
                line = line.toUpperCase();
                if (line.equals("Y"))
                {
                    big_flag = true;
                }
                else
                {
                    big_flag = false;
                }

            }

        }

}