class constring
{
    public static void main(String args[])
    {
        String s1="Hello";
        String s2="World";
        String s3=s1.concat(s2);
        System.out.println(s3);
        String s4="Good " + "Morning";
        System.out.println(s4);
    }
}

output
------
C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Users\mlm\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=49266:C:\Users\mlm\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\add.java\out\production\add.java constring
HelloWorld
Good Morning

Process finished with exit code 0
