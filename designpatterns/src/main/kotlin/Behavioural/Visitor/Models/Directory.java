package Behavioural.Visitor.Models;

import Behavioural.Visitor.ResourceVisitor;

public class Directory implements Resource {
    private String id;

    public Directory(String id) {
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
