import java.io.*;
import java.util.*;
class df {
 public void philospher(int[] array,int i) {
 if(array[i]==0) {
  take(array,i);
  if(array[i]==2) {
    System.out.println("Eating in progress.");
  }
  put_down(array,i);
 }
}
 public void put_down(int[] array,int i) {
  array[i]=0;
  System.out.println(i+"Completed eating.");
  test(array,(i+4)%5);
  test(array,(i+1)%5);
 }
 public void take(int[] array,int i) {
  array[i]=1;
  test(array,i);
 }
 public void test(int[] array,int i) {
  if(array[i]==1 && array[(i+1)%5]!=2 && array[(i+1)%5]!=2) {
    array[i]=2;
  }
 }
 public static void main(String[] a) {
  df ob = new df();
  int[] array= new int[5];
  for(int i=0;i<5;i++) {
    array[i]=0;
  }
  for(int i=0;i<5;i++) {
    ob.philospher(array,i);
  }
 }
}




//0-thinking,1-hungry,2-eating