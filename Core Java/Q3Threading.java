/*
Create a thread named  fetch Data using thread  extend method
Fetch data should  implement sleep method  with 5000ms time
Create a thread named  processData  using  runnable  interface
Make sure processData  starts its execution only after fetchData thread has  completed its execution with the timeout of 10000ms
*/

import java.util.*;
import java.lang.*;

class extendThread extends Thread
{
    public void sleep(){
        try{
            Thread.sleep(5000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public void run(){
        System.out.println("Thread is implementing with Thread class.");
    }
}

class implementsThread implements Runnable
{
    public void sleep(){
        try{
            Thread.sleep(10000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public void run(){
        System.out.println("Thread is implementing with Runnable interface.");
    }
}


class Q3Threading
{
    public static void main(String[] args){
       
        extendThread fetchData = new extendThread();
       
        implementsThread processData = new implementsThread();
       
        System.out.println("Threads created!");
        
        System.out.println("fetchData thread is undergoing a sleep of 5000 ms.");
        fetchData.sleep();
        fetchData.run();
        System.out.println("fetchData thread completed a sleep of 5000 ms.");

        System.out.println("processData thread is undergoing a sleep of 10000 ms.");
        processData.sleep();
        processData.run();
        System.out.println("processData thread completed a sleep of 10000 ms.");
        
        System.out.println("Execution Finished!");
    }
}
