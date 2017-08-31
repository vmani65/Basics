package com.Servlets;

import org.slf4j.*;
import printer.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      System.out.println( "Hello World!" );    	
      new SystemPrinter().printerThis("Wow !! I am using my jar file exclusively !");
    }
}
