package com.github.trusandor.html_builder.elements.implementations;

import com.github.trusandor.html_builder.elements.interfaces.Container;
import com.github.trusandor.html_builder.elements.interfaces.Document;
import com.github.trusandor.html_builder.elements.interfaces.Element;

public class HtmlDocument implements Document {
    private final Element docType;
    private Container htmlContent;

    public HtmlDocument() {
        docType = new HtmlElement("!DOCTYPE html");
    }

    @Override
    public Element getDocType() {
        return docType;
    }

    @Override
    public Element getContent() {
        return htmlContent;
    }
}
