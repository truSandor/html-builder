package com.github.trusandor.html_builder.implementations.elements;

import com.github.trusandor.html_builder.abstractClasses.HtmlElement;
import com.github.trusandor.html_builder.implementations.HtmlDocument;

public class Head extends HtmlElement {

    public Head(HtmlDocument document) {
        super(document);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<head>")
                .append(System.lineSeparator());
        for (HtmlElement e : elements) {
            sb.append(document.getIndentation())
                    .append(e)
                    .append(System.lineSeparator());
        }
        sb.append("</head>")
                .append(System.lineSeparator());
        return sb.toString();
    }
}
