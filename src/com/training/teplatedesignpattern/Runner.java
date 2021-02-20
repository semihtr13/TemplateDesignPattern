package com.training.teplatedesignpattern;

import com.training.teplatedesignpattern.dialogs.RateDialog;
import com.training.teplatedesignpattern.manager.DialogManager;
import com.training.teplatedesignpattern.pattern.Dialog;

public class Runner {
    public static void main(String[] args) {
        Dialog dialog =new RateDialog();
        DialogManager dialogManager=new DialogManager(dialog);
        dialogManager.show();
        dialogManager.hide();
    }

}
