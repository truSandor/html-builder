package com.github.trusandor.html_builder.implementations;

import com.github.trusandor.html_builder.abstractClasses.Document;
import com.github.trusandor.html_builder.implementations.elements.HTML;

public class HtmlDocument extends Document {

    private final HTML html;
    private int indentation = 2;

    public HtmlDocument() {
        docType = "html";
        html = new HTML(this);
    }

    public int getIndentation() {
        return indentation;
    }

    public void setIndentation(int indentation) {
        this.indentation = indentation;
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
