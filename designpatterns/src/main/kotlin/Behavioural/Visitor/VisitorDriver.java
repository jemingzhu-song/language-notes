package Behavioural.Visitor;

import Behavioural.Visitor.Models.Directory;
import Behavioural.Visitor.Models.Resource;
import Behavioural.Visitor.Models.Site;
import Behavioural.Visitor.Models.Workspace;

import java.util.List;

/**
 * The Visitor Pattern allows you to offload class specific logic to a concrete "Visitor" implementation,
 * allowing you to spin up new concrete "Visitor" implementations with differint logic whenever you want.
 *
 * Suppose you have a {@link Resource} interface, and 3 concrete classes that implement this interface:
 * {@link Directory}, {@link Site} and {@link Workspace}. Now suppose you receive a {@link List<Resource>},
 * and want to perform class specific logic (depending on whether it's a Directory, Site or Workspace) on each
 * element in that List.
 *
 * To offload this class specific logic, create a {@link ResourceVisitor} interface that has 3 methods which each
 * take in a concrete class {@link Directory}, {@link Site} and {@link Workspace}.
 *
 * Then, in the {@link Resource} interface have a function that accepts a {@link ResourceVisitor}
 * and each of the concrete classes {@link Directory}, {@link Site} and {@link Workspace} implement this function,
 * which simply involves calling the {@link ResourceVisitor#visit(Directory)}, {@link ResourceVisitor#visit(Site)} or
 * {@link ResourceVisitor#visit(Workspace)} functions.
 *
 * Finally, in the "Driver" code, you can iterate over the list, and pass in an anonymous implementation class of the
 * {@link ResourceVisitor}, where you can write custom logic on how you want to handle each of the 3 concrete classes.
 *
 * You might wonder - well can't you just have a method directly on the {@link Resource} interface, called "handle" for example,
 * and each of the 3 concrete classes concrete class {@link Directory}, {@link Site} and {@link Workspace} each implement
 * their own custom logic for this "handle" method? Well, you can, this will work fine or even better if you only have
 * one specific "handle" case for each of the 3 concrete classes that will be applied everywhere - but if you need
 * multiple custom logic for each concrete class {@link Directory}, {@link Site} and {@link Workspace} in different places,
 * then the Visitor pattern gives you flexibility, because you can just declare an anonymous implementation of the
 * {@link ResourceVisitor}, and write your custom logic in there for a "one-time-use"
 *
 * To better explain that, in the example below, suppose we have a {@link List<Resource>} that we receive from the Database,
 * called "databaseResources". We need custom logic to handle this for each individual concrete classes
 * {@link Directory}, {@link Site} and {@link Workspace} in that List. We can just declare an anonymous class of {@link ResourceVisitor}.
 * Now suppose later on, we also receive a {@link List<Resource>} from an SQS Queue called "sqsResources". We also need
 * custom logic to handle this for each individual concrete class in that List. We also just declare an anonymous class of {@link ResourceVisitor}
 * for a "one-time-use". If we were to have a method directly on the {@link Resource} interface for each of those cases,
 * then we'd need to define two methods on the {@link Resource} interface: "handleDatabase" and "handleSqs" for example,
 * and have all 3 concrete classes implement them. This is harder to track their implementation, because they're all in
 * 3 different classes, compared to the anonymous {@link ResourceVisitor} implementation, where the logic for each 3 classes
 * are all located in one place.
 */

public class VisitorDriver {
    public static void main(String [] args) {
        List<Resource> databaseResources = List.of(
            new Directory("directory1"),
            new Directory("directory2"),
            new Site("site1"),
            new Workspace("workspace1"),
            new Site("site2")
        );

        databaseResources.stream()
            .forEach(resource -> {
                String result = resource.accept(new ResourceVisitor<>() {
                    @Override
                    public String visit(Directory resource) {
                        return String.format("Storing Directory Resource: %s in the Database", resource.getId());
                    }

                    @Override
                    public String visit(Site resource) {
                        return String.format("Storing Site Resource: %s in the Database\"", resource.getId());
                    }

                    @Override
                    public String visit(Workspace resource) {
                        return String.format("Storing Workspace Resource: %s in the Database\"", resource.getId());
                    }
                });

                System.out.println(result);
            });

        System.out.println("-----------");

        List<Resource> sqsResources = List.of(
            new Directory("directory1"),
            new Directory("directory2"),
            new Site("site1"),
            new Workspace("workspace1"),
            new Site("site2")
        );

        sqsResources.stream()
            .forEach(resource -> {
                String result = resource.accept(new ResourceVisitor<>() {
                    @Override
                    public String visit(Directory resource) {
                        return String.format("Handling Directory Resource: %s from SQS Queue", resource.getId());
                    }

                    @Override
                    public String visit(Site resource) {
                        return String.format("Handling Site Resource: %s from SQS Queue", resource.getId());
                    }

                    @Override
                    public String visit(Workspace resource) {
                        return String.format("Handling Workspace Resource: %s from SQS Queue", resource.getId());
                    }
                });

                System.out.println(result);
            });
    }
}
