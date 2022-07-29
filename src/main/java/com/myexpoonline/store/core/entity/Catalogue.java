/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myexpoonline.store.core.entity;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Kimonae
 */
public class Catalogue{
    
     public static void main(String[] args) {
         
      HashSet<String> listOfWorks = new HashSet<String>();
    
      listOfWorks.add("cata1");
      listOfWorks.add("cata2");
      listOfWorks.add("cata3");
      listOfWorks.add("cata4");
  
      System.out.println(listOfWorks.size());
  
       
      if (listOfWorks.contains("cata2")){
      listOfWorks.remove("cata2"); }
      
     
      for(String valeur:listOfWorks)
        System.out.println(valeur);
   }
}