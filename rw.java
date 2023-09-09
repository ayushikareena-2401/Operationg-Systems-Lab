import java.io.*;
import java.util.*;
class rw{
  public static void main(String[] args) {
  int ch=5;
  Scanner sc = new Scanner(System.in);
  int sread=0,swrite=0,r=0;
  do {
   System.out.println("Select one from the menu");   
   System.out.println("1.Wants to read.");
   System.out.println("2.Wants to write.");
   System.out.println("3.Exit Reader.");
   System.out.println("4.Exit Writer.");
   System.out.println("5.Exit.");
   ch=sc.nextInt();
   switch(ch){
    case 1:
     if(swrite==0) {
       if(sread==0) {
        sread=1;
       }
       r++;
       System.out.println();
     } else {
     System.out.println("Cann't read.");
    }
     break;
    case 2:
     if(swrite==0 && sread==0) {
      swrite=1;
     }else {
      System.out.println("Cann't write.");
     }
     break;
    case 3:
     if(sread==1) {
       if(r==1) {
        sread=0;
       }
      r--;
     } else {
       System.out.println("No reader.");
     }
     break;
    case 4:
    if(swrite==1) {
        swrite=0;
     } else {
       System.out.println("No writer.");
     }
     break;
    case 5:
     System.out.println("Bye.");
     break;
   }
  } while(ch<5);
 }
}