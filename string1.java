class string
{
    public static void main(String args[])
    {
        String str="HELLO";
        String toCheckstr="HELLO";
        if(str.startsWith(toCheckstr))
        {
            System.out.println("The string does start with "+toCheckstr);

        }
        else
        {
            System.out.println("The string does not start with "+toCheckstr);
        }
    }
}

output
------
 C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Users\mlm\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=65400:C:\Users\mlm\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\add.java\out\production\add.java string
The string does start with HELLO

Process finished with exit code 0



