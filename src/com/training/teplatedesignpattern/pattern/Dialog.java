package com.training.teplatedesignpattern.pattern;

public abstract class Dialog {
     public abstract void initialize();
     public abstract void show();
     public abstract void hide();

     public void showDialog(){
         initialize();
         show();
     }
}
