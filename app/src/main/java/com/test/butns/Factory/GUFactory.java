package com.test.butns.Factory;

import com.test.butns.Button.Button;
import com.test.butns.checkbox.Checkbox;

public interface GUFactory {
    Checkbox createCheckbox();

    Button createButton();
}
