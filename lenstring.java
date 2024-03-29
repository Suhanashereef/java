class String_1
{
    public static void main(String args[]) {
        String str = "java programming lab";
        System.out.println("The string is " + str + "");
        System.out.println("Length of the String is " + str.length());
        System.out.println("Character at second and fourth position is " + str.charAt(1) + "," + str.charAt(3));
        System.out.println("The sub string using start index only is " + str.substring(5));
        System.out.println("The sub string using start index only is " + str.substring(0, 4));
    }
}

output
------
C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Users\mlm\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=65285:C:\Users\mlm\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\add.java\out\production\add.java String_1
The string is java programming lab
Length of the String is 20
Character at second and fourth position is a,a
The sub string using start index only is programming lab
The sub string using start index only is java

Process finished with exit code 0
