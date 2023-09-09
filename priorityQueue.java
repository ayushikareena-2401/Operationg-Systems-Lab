import java.io.*;
import java.util.*;
class priorityQueue{
 public void algo(int[] bt,int[] pt){
  int s1=0,s2=0;
  for(int i=0;i<bt.length;i++) {
    for(int j=i+1;j<bt.length;j++) {
     if(pt[i]>pt[j]) {
       int temp=pt[i];
       pt[i]=pt[j];
       pt[j]=temp;
       int temp1=bt[i];
       bt[i]=bt[j];
       bt[j]=temp1;
     }
    }
  }
  int[] wt= new int[bt.length];
  int[] tat= new int[bt.length];
  for(int i=0;i<bt.length;i++) {
   if(i==0) {
    wt[i]=0;
   } else {
    wt[i]=wt[i-1]+bt[i-1];
   }
   tat[i]=wt[i]+bt[i];
   s1+=wt[i];
   s2+=tat[i];
  }
 System.out.println("Average Waiting time is:"+s1/bt.length);
 System.out.println("Average Turn around time is:"+s2/bt.length);
 }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of processes.");
  int n = sc.nextInt();
  int[] bt= new int[n];
  int[] pt= new int[n];
  System.out.println("Enter the burst time & priority of the processes.");
  for(int i=0;i<n;i++) {
    bt[i]=sc.nextInt();
    pt[i]=sc.nextInt();
  }
  priorityQueue ob = new priorityQueue();
  ob.algo(bt,pt);
 }
}


