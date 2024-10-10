package com.example.project;
public class StringProblems{
    //empty constructor
    public StringProblems(){}


    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x){
         if( x.length() > 2){
            if(x.substring(x.length()-2).equals("ly")){
            return true;
        } 
            
    }
    return false;
}


    // Given two strings, append them together (known as "concatenation") 
    // and return the result. However, if the concatenation creates a double-char, 
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2){
        if(s1.length()>1 && s2.length()>1){
        if(s1.substring(s1.length()-1).equals(s2.substring(0,1))){
            return s1 + s2.substring(1);
        }
}
return s1 + s2;
    }
    // Given a string, return a version without the first 2 chars. 
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    // deFront("aapple") -> "apple"
    // deFront("abeep") -> "abeep"
    public String deFront(String s1){
        boolean aV = s1.substring(0,1).equals("a");
        boolean bV = s1.substring(1,2).equals("b");
       
        if(aV && bV){
            return s1;
        }else if(aV){
            return s1.substring(0,1 ) + s1.substring(2);
        } else if(bV){
            return s1.substring(1);
        }else{
            return s1.substring(2);
        }
       
    }

    
    // Given a string, if the first or last chars are 'x', 
    // return the string without those 'x' chars, and otherwise 
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    public String withoutX(String s1){
        boolean xF = s1.substring(0,1).equals("x");
        boolean xB = s1.substring(s1.length()-1).equals("x");
        if(xF && xB){
            return s1.substring(1,s1.length()-1);
        }else if(xF){
            return s1.substring(1 );
        }else if(xB){
            return s1.substring(0, s1.length() -1);
        }else{
            return s1;
        }
       
    }

    // Given a string str, if the string starts with "f" return "Fizz".
    //  If the string ends with "b" return "Buzz". If both the "f" and "b" 
    //  conditions are true, return "FizzBuzz". In all other cases, return the 
    //  string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1){
        boolean f = s1.substring(0,1).equals("f");
        boolean b = s1.substring(s1.length()-1).equals("b");
        String fi = "Fizz";
        String bu = "Buzz";
        if(f && b){
            return fi + bu;

        }else if(f){
            return fi;
        }else if(b){
            return bu;
        }else{
            return s1;
        }
    }

    // Given an int n, return the string form of the number followed 
    // by "!". So the int 6 yields "6!". Except if the number is 
    // divisible by 3 use "Fizz" instead of the number, and if the 
    // number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    //  Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
    //   What will the remainder be when one number divides evenly into another? 
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"
    public String fizzString2(int x){
        
        boolean d3;
        boolean d5;
        if((x%3 == 0)){
        
            d3 = true;
        }else{
            d3 = false;
        }
        if((x%5 == 0)){
             d5 = true;
        }else{
             d5 = false;
        }
        
     
        if(d5 && d3){
            return "FizzBuzz!";
        }else if(d5){
            return "Buzz!";
        }else if(d3){
            return "Fizz!";
        }else{
            return ""+ x + "!";
        }
        
    }
}