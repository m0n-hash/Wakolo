import java.io.Console;

public class main {
    static void askUser(){

        Console console=System.console();
        if (console == null) {
            System.out.println(
                    "No console available");
            return;
        }
        System.out.println("Enter Number 1");
        int num1=Integer.parseInt(console.readLine());
        System.out.println("Enter Number 2");
        int num2=Integer.parseInt(console.readLine());
        System.out.println("Enter Operator");
        String operator=console.readLine();
        calculate(num1,num2,operator);
    }
    public static void main(String[] args){
        askUser();
//        loopTriangle(5);
    }

    static void loopTriangle(int num){
        for(int i=0;i<num;i++){
            int star=i+1;
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void calculate(int num1, int num2, String operator){
        switch(operator){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            default:
                System.out.println(num1/num2);
                break;
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
