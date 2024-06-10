package com.github.trusandor.html_builder.implementations.elements;

import com.github.trusandor.html_builder.abstractClasses.HtmlElement;
import com.github.trusandor.html_builder.implementations.HtmlDocument;

public class HTML extends HtmlElement {
    public HTML(HtmlDocument document) {
        super(document);
        elements.add(new Head(document));
        elements.add(new Body(document));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>")
                .append(System.lineSeparator());
        for (HtmlElement e : elements) {
            sb.append(" ".repeat(document.getIndentation()))
                    .append(e.toString())
                    .append(System.lineSeparator());
        }
        sb.append(System.lineSeparator())
                .append("</html>");

        return sb.toString();
    }
}
