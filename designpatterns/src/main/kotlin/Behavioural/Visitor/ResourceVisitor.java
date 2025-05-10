package Behavioural.Visitor;

import Behavioural.Visitor.Models.Directory;
import Behavioural.Visitor.Models.Site;
import Behavioural.Visitor.Models.Workspace;

public interface ResourceVisitor<T> {
    T visit(Directory resource);

    T visit(Site resource);

    T visit(Workspace resource);
}
