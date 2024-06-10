package com.github.trusandor.html_builder.abstractClasses;

import com.github.trusandor.html_builder.implementations.HtmlDocument;

import java.util.HashMap;
import java.util.List;

public abstract class HtmlElement {
    protected final HtmlDocument document;
    protected List<HtmlElement> elements;
    protected HashMap<String, String> attributes;

    public HtmlElement(HtmlDocument document) {
        this.document = document;
    }

    public abstract String toString();
}
