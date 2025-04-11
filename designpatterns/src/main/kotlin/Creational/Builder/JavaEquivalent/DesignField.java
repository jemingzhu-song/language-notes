package Creational.Builder.JavaEquivalent;

public class DesignField {
    private Long id;
    private String ari;
    private String displayName;
    private Type type;
    private boolean active;
    private String url;

    // Private Constructor
    private DesignField(Long id, String ari, String displayName, Type type, boolean active, String url) {
        this.id = id;
        this.ari = ari;
        this.displayName = displayName;
        this.type = type;
        this.active = active;
        this.url = url;
    }

    // Get Builder
    public static DesignFieldBuilder builder() {
        return new DesignFieldBuilder();
    }

    // Static Builder Class
    public static class DesignFieldBuilder {
        private Long id;
        private String ari;
        private String displayName;
        private Type type;
        private boolean active;
        private String url;

        public DesignField build() {
            return new DesignField(id, ari, displayName, type, active, url);
        }

        public DesignFieldBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public DesignFieldBuilder ari(String ari) {
            this.ari = ari;
            return this;
        }

        public DesignFieldBuilder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public DesignFieldBuilder type(Type type) {
            this.type = type;
            return this;
        }

        public DesignFieldBuilder active(boolean active) {
            this.active = active;
            return this;
        }

        public DesignFieldBuilder url(String url) {
            this.url = url;
            return this;
        }
    }


    public enum Type {
        FIGMA,
        CANVA,
        UNKNOWN,
    }
}
