package com.training.teplatedesignpattern.manager;

import com.training.teplatedesignpattern.pattern.Dialog;

public class DialogManager implements IDialogManager {
    private Dialog dialog;

    public DialogManager(Dialog dialog) {
        this.dialog = dialog;
    }

    @Override
    public void show() {
        dialog.showDialog();
    }

    @Override
    public void hide() {
        dialog.hide();
    }
}
