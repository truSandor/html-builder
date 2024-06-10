package com.github.trusandor.html_builder.implementations;

import com.github.trusandor.html_builder.abstractClasses.Document;
import com.github.trusandor.html_builder.implementations.elements.HTML;

public class HtmlDocument extends Document {

    private final HTML html;

    public HtmlDocument() {
        docType = "html";
        html = new HTML(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("<!DOCTYPE %s>", docType))
                .append(System.lineSeparator())
                .append(html);
        return sb.toString();
    }
}
