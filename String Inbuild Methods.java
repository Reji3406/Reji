import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the String");
        String x = data.nextLine(); 
        char y = x.charAt(0);
        System.out.println(y);
         
        int a = x.codePointAt(0);
        System.out.println(a);
        
        int b = x.codePointBefore(2);
        System.out.println(b);
    }
}


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the String1");
        String x = data.nextLine(); 
        System.out.println("Enter the String2");
        String y = data.nextLine();
        
        int a = x.codePointCount(0,4);
        System.out.println(a);
        
        int b = x.compareTo(y);
        System.out.println(b);
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the String1");
        String x = data.nextLine(); 
        System.out.println(x.contains("Re"));
        System.out.println(x.contains("ji"));
        System.out.println(x.contentEquals("Reji"));
        System.out.println(x.contentEquals("Re"));
        
    }
}


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
        Scanner data = new Scanner(System.in);
        char[] d = {'H','E','L','L','O'};
        String str = "hello";
        
        System.out.println(str.copyValueOf(d,0,5));
        System.out.println(str.endsWith("lo"));
        System.out.println(d.equals(str));
        
        
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the String:");
        String a = data.nextLine();
        System.out.println(a.equalsIgnoreCase("Reji"));
        String b ="Hi %s my age %d";
        String result = String.format(b,"Reji",19);
        System.out.println(result);
        
    }
}

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        String a = "New world";
        String y = "_Hello_World";
        String x = "Hello|World|Java";
        System.out.println("Hello".matches(x));
        System.out.println("World".matches(x));
        System.out.println("JavaScript".matches(x));
        System.out.println(y.regionMatches(7,a,4,5));
    }
}
