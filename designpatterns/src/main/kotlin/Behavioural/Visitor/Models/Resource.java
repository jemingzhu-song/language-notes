package Behavioural.Visitor.Models;

import Behavioural.Visitor.ResourceVisitor;

public interface Resource {
    <T> T accept(ResourceVisitor<T> resourceVisitor);
}
