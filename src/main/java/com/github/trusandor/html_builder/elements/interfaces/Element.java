package com.github.trusandor.html_builder.elements.interfaces;

import java.util.HashMap;

public interface Element {
    void setAttributes(HashMap<String, String> attributes);
    HashMap<String, String> getAttributes();
}
