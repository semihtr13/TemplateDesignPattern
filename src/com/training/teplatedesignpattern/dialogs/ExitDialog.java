package com.training.teplatedesignpattern.dialogs;

import com.training.teplatedesignpattern.pattern.Dialog;

public class ExitDialog extends Dialog {

    @Override
    public void initialize() {
        System.out.println("diloag İnitializing...");
    }

    @Override
    public void show() {
        System.out.println("dialog showing...");
    }

    @Override
    public void hide() {
        System.out.println("dialog hiding...");
    }
}
