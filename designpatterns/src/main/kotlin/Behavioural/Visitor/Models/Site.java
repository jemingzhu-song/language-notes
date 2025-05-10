package Behavioural.Visitor.Models;

import Behavioural.Visitor.ResourceVisitor;

public class Site implements Resource {
    private String id;

    public Site(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public <T> T accept(ResourceVisitor<T> resourceVisitor) {
        return resourceVisitor.visit(this);
    }
}
