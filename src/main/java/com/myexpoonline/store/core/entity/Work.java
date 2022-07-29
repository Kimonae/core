/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myexpoonline.store.core.entity;

/**
 *
 * @author Kimonae
 */
public class Work {

    private String title;
    private int year;
    private String description;
    private String author;
    private String style;
    
    
  public Work (String title, int year, String description, String author, String style)
{
this.title =title;
this.year =year;
this.description =description;
this.author =author;
this.style =style;

}  

public Work ()
{

}

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getStyle() {
        return style;
    }



}