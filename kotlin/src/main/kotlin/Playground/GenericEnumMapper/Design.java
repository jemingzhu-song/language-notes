package Playground.GenericEnumMapper;

public class Design {
    public enum Status {
        READY_FOR_DEVELOPMENT,
        NONE,
        UNKNOWN
    }

    public enum Type {
        FILE,
        CANVAS,
        GROUP,
        NODE,
        PROTOTYPE,
        UNKNOWN
    }

    private final Long id;
    private final String ari;
    private final String displayName;
    private final Type type;
    private final Status status;
    private final String url;

    public Design(Long id, String ari, String displayName, Type type, Status status, String url) {
        this.id = id;
        this.ari = ari;
        this.displayName = displayName;
        this.type = type;
        this.status = status;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public String getAri() {
        return ari;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Type getType() {
        return type;
    }

    public Status getStatus() {
        return status;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Design | id: " + this.id + " | ari: " + this.ari + " | displayName: "
            + this.displayName + " | type: " + this.type.name() + " | status: " + this.status.name() + " | url: "
            + this.url;
    }
}
