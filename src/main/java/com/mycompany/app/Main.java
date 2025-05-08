/*-------------------------------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See https://go.microsoft.com/fwlink/?linkid=2090316 for license information.
 *-------------------------------------------------------------------------------------------------------------*/

package com.mycompany.app;

import static javax.xml.XMLConstants.XML_NS_PREFIX;

import java.util.Vector;

public class Main 
{
    public static void main( String[] args )
    {
       System.out.println("hello Munteanu e Cantea!!!");

       Vector<Character> lettere = new Vector<Character>();
       lettere.add('d');
       lettere.add('a');
       lettere.add('n');
       lettere.add('i');
       lettere.add('e');
       lettere.add('l');
       lettere.add(' ');
       lettere.add('e');
       lettere.add(' ');
       lettere.add('c');
       lettere.add('a');
       lettere.add('n');
       lettere.add('t');
       lettere.add('e');
       lettere.add('a');
       for (int i = 0; i < lettere.size(); i++) {
           System.out.println(lettere.get(i));
       }
    }
}
