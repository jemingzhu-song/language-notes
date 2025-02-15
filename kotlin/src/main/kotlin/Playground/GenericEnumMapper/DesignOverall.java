package Playground.GenericEnumMapper;

public class DesignOverall {
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

    public DesignOverall(Long id, String ari, String displayName, Type type, Status status, String url) {
        this.id = id;
        this.ari = ari;
        this.displayName = displayName;
        this.type = type;
        this.status = status;
        this.url = url;
    }

    @Override
    public String toString() {
        return "DesignOverall | id: " + this.id + " | ari: " + this.ari + " | displayName: "
            + this.displayName + " | type: " + this.type.name() + " | status: " + this.status.name() + " | url: "
            + this.url;
    }
}
