package com.github.trusandor.html_builder.elements.implementations;

import com.github.trusandor.html_builder.elements.interfaces.Element;

import java.util.HashMap;

public class HtmlElement implements Element {
    private final String tag;
    private HashMap<String, String> attributes;

    public HtmlElement(String tag) {
        this.tag = tag;
    }

    public HtmlElement(String tag, HashMap<String, String> attributes) {
        this.tag = tag;
        this.attributes = attributes;
    }

    @Override
    public void setAttributes(HashMap<String, String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public HashMap<String, String> getAttributes() {
        return attributes;
    }

    public String getTag() {
        return tag;
    }
}
