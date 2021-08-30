/* 
QUESTION - Create a resource called message 
○Message will have text as the field and isEmpty as the condition
○It has two synchronized functions read and write
 ●Create a writer thread that writes resource
 ●Create a reader thread that reads resource
*/

import java.util.*;
import java.lang.*;


class Message extends Thread
{
    String text;
    boolean isEmpty;

    Message(String text){
        this.text = text;
        this.isEmpty = false ;
    }
    
    public synchronized void write(String text){
        System.out.println("In synchronized write");
        if(this.isEmpty){
            try{
                this.text = text;
                this.isEmpty = false ;
                System.out.println("Writing text");
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            } 
        }
        else{
            System.out.println("Text is not empty.");
        }
    }

    public synchronized void read(){
        System.out.println("synchronized section");
        if(this.isEmpty){
            System.out.println(" empty.");
        }
        else{
            // System.out.println(text);
            this.isEmpty = true ;
            System.out.println("Reading text: "+ this.text);
        }
    }
}

class Q4DriverClass
{
    public static void main(String[] args){
        Message msg1 = new Message("Hello");
        Message msg2 = new Message("Good Morning");

        // reading the text and making empty
        msg1.read();
        msg2.read();

        // writing new text 
        msg1.write("New message");
        msg2.write("New message 2");

        msg1.read();
        msg2.read();
    }
}
