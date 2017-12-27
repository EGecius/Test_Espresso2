package com.egecius.test_espresso2.dependencies;

public class RealTextProvider implements TextProvider {

    @Override
    public String getText() {
        return "from RealTextProvider";
    }
}
