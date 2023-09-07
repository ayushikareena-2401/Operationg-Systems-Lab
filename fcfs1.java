//First Come, First Serve – CPU Scheduling | (Non Preemptive)
//Here, just the arrival time is diffrent.

import java.io.*;
import java.util.*;
class fcfs1{
 public void algo(int[] bt,int[] at) {
  int[] wt = new int[bt.length];
  int[] tt = new int[bt.length];
  int s1=0,s2=0;
  for(int i=0;i<bt.length;i++) {
   if(i==0) {
    wt[0]=0;
   } else {
    wt[i]=bt[i-1]+wt[i-1]+at[i-1]-at[i];
    s1+=wt[i];
   }
  }
  for(int i=0;i<bt.length;i++) {
    tt[i]=bt[i]+wt[i];
    s2+=tt[i];
  }
 System.out.println("According to Non Preemptive fcfs algorithm~");
 for(int i=0;i<bt.length;i++) {
  System.out.println(i+1+" "+bt[i]+" "+at[i]+" "+wt[i]+" "+tt[i]);
 }
 System.out.println("Average waiting time "+s1/(bt.length));
 System.out.println("Average turn around time "+s2/(bt.length));
 }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number of processes.");
 int num=sc.nextInt();
 int[] bt = new int[num];
 int[] at = new int[num];
 System.out.println("Enter the Burst time & arrival time of the processes.");
 for(int i=0;i<num;i++) {
   bt[i]=sc.nextInt();
   at[i]=sc.nextInt();
 }
 fcfs1 ob = new fcfs1();
 ob.algo(bt,at);
 }
}