import util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.Objects;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Object obj=null;
        System.out.println("Please chooose phone, samsung(s) or Xiaomi(x)");
        String readResult=br.readLine();

        if(Objects.equals(readResult, "s")){
            obj=new Samsung();
        }else{
            obj=new Xiaomei();
        }


        ((Phone)obj).sendMessage();

        String test123="";


//        ((TestPhone)s).sendMessage();

//        Samsung s=new Samsung();
//        s.getImeiNo();
//        s.getSamsungAccount();
//
//        s.setImeiNo("123");
//        s.setBrandName("SAMSUNG");
//        s.setModelNo("S08");

        String test="Result("+"World"+1;

        try{
            runProgram();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    static void runProgram() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Choose what you want to do");
        System.out.println("1) Calculate Two Number.");
        System.out.println("2) Loop Triangle.");
        System.out.println("3) Loop Triangle (Reverse).");

        String readResult=br.readLine();
        switch(readResult){
            case "1":
                //call calculate function
                calculate();
                break;
            case "2":
                //call loop triangle function
                break;
            case "3":
                //call loop triangle function
                break;
            default:
                //method loop
                break;
        }
        doYouWantToContinue();
    }

    static void doYouWantToContinue() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Do you want to continue (Y/N)....");
        String result=br.readLine();
        if(result.equals("Y")){
            runProgram();
        }
    }

    static void calculate() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number : ");
        int num1=Integer.parseInt(br.readLine());

        System.out.print("Enter second number : ");
        int num2=Integer.parseInt(br.readLine());

        System.out.print("Enter operator : ");
        String operator=br.readLine();

        MyMath m=new MyMath();
        m.setNum1(num1);
        m.setNum2(num2);
        m.setOperator(operator);
        m.calculate();
    }
    static void loopTriangle(int num){
        for(int i=0;i<num;i++){
            //Star print loop
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void loopTriangle2(int num){
        for(int i=0;i<num;i++){
            //Star print loop
            for(int j=0;j<num-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

/*Identifier
 *public, private, protected
 */
//static, dynamic
/*Variable
int, string, char, float,double,decimal, boolean
 */
/*
if(operator=="+"){
    //do smth
}else if(operator=="-"){
    //do smth
}else if(operator=="*"){
    //do smth
}else{
    //do smth
}
 */
/*
switch(smth){
case "+":
    break;
case "-":
    break;
case "*":
    break;
default:
    break;
}
 */
