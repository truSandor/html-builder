package com.github.trusandor.html_builder.interfaces;

public interface Container extends Element {
    void appendChild(Element child);
    void removeChild(Element child);
    void removeFirstChild(String tag);
    void removeAllChildren(String tag);
}
