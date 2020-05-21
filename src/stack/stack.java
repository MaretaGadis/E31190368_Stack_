/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author acer
 */
public class stack {
    static Stack Mareta = new Stack();
    static Scanner in = new Scanner(System.in);
    static String a;
    static String arr;
    static int max_st;
    static int i=0;
    static int top =-1;
    static void pushh(Stack Mareta, String a){
        Mareta.push((a).toString());
        System.out.println("Stack: " + Mareta);
    }
public int find(){
    return (int) (top=top+1);
    }
static void popp(Stack Mareta, String a ){
    a = (String) Mareta.pop();
    System.out.println("stack: " + Mareta);
    }
public static void main(String[] args) {
    System.out.print("Masukkan Max_Stack : "); 
    max_st=in.nextInt();
        for (int i = 0; i < max_st; i++) {
            System.out.print("PUSH -> ");
            a=in.next();
            pushh(Mareta, a);   
        }
    System.out.println("POP = y / anykeys=stop");
      while(!a.equals("n")){
        System.out.print("POP ->  ");
            a=in.next();
            if (a.equals("y") && !Mareta.isEmpty()) {
                popp(Mareta, a);
            }else{
                System.out.println("apa stack kosong?  "+Mareta.isEmpty());
                break;
            }
        System.out.println("apa stack kosong?  "+Mareta.isEmpty());
            if (Mareta.isEmpty()) {
                System.out.println("stop");
                    break;
            }
      }
}
}