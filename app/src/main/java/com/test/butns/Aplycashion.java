package com.test.butns;

import com.test.butns.Button.Button;
import com.test.butns.Factory.GUFactory;
import com.test.butns.checkbox.Checkbox;

public class Aplycashion {
    private Button button;
    private Checkbox checkbox;

    public Aplycashion(GUFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        checkbox.paint();
        button.paint();
    }

}
