import java.util.Scanner;
class palindrome {
    public static void main(String args[])
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();


        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);

        }
        if(rev.toLowerCase().equals(str.toLowerCase()))
        {
            System.out.println("The string is palindrome");

        }
        else {
            System.out.println("The string is not  palindrome");
        }
    }
}


            output
      --------------------
C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Users\mlm\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=50394:C:\Users\mlm\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\add.java\out\production\add.java palindrome
Enter a string:
malayalam
The string is palindrome

Process finished with exit code 0
