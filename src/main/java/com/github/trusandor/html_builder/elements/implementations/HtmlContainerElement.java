package com.github.trusandor.html_builder.elements.implementations;

import com.github.trusandor.html_builder.elements.interfaces.Container;
import com.github.trusandor.html_builder.elements.interfaces.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HtmlContainerElement extends HtmlElement implements Container {
    private List<HtmlElement> children = new ArrayList<>();

    public HtmlContainerElement(String tag) {
        super(tag);
    }

    public HtmlContainerElement(String tag, HashMap<String, String> attributes) {
        super(tag, attributes);
    }

    @Override
    public void appendChild(Element child) {
        children.add((HtmlElement) child);
    }

    @Override
    public void removeChild(Element child) {
        children.remove((HtmlElement) child);
    }

    @Override
    public void removeFirstChild(String tag) {
        Iterator<HtmlElement> itr = children.iterator();
        while (itr.hasNext()) {
            if (itr.next().getTag().equals(tag)) {
                itr.remove();
                break;
            }
        }
    }

    @Override
    public void removeAllChildren(String tag) {
        children.removeAll(children.stream().filter(c -> c.getTag().equals(tag)).toList());
        children.forEach(c -> removeAllChildren(tag));
    }

}
