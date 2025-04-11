package Creational.Builder.JavaEquivalent;

public class BuilderDriver {
    // Usage
    DesignField designField1 = DesignField.builder()
        .id(1L)
        .ari("ari-1")
        .displayName("design-field-1")
        .type(DesignField.Type.FIGMA)
        .active(true)
        .url("design-field-url-1")
        .build();
}
