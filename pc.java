import java.io.*;
import java.util.*;
class pc {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int x=-1,p=0,c=0,b=0,n=10;
    do {
     System.out.println("Choose the option from the menu:");
     System.out.println("1.Produce an item.");
     System.out.println("2.Consume an item.");
     System.out.println("3.Add to buffer.");
     System.out.println("4.Display all the information.");
     System.out.println("5.Exit");
     x=sc.nextInt();
     switch(x) {
      case 1: 
       p++;
      break;
      case 2:
       if(b>0) {
        c++;
        b--;
       } else {
        System.out.println("Buffer is empty");
       }
      break;
      case 3:
       if(b<n) {
        if(p>0) {
         b++;
         p--;
       } else {
       System.out.println("The producer count is 0.");
       }
      }
      System.out.println("The buffer is empty.");
      break;
      case 4:
       System.out.println("The buffer is:"+b);
       System.out.println("The producer is:"+p);
       System.out.println("The consumer is:"+c);
       break;
      case 5:
        System.out.println("Bye.");
        break;
     }
    }while(x<5);
   }
  }
      