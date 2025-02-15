package Playground.GenericEnumMapper;

public class Driver {
    public static void main(String[] args) {
        DesignOverall.Type type1 = convertEnum(DesignOverall.Type.class, Design.Type.FILE, DesignOverall.Type.UNKNOWN);
        System.out.println(type1);

        Design design1 = new Design(
            1L,
            "ari",
            "DisplayName1",
            Design.Type.PROTOTYPE,
            Design.Status.READY_FOR_DEVELOPMENT,
            "url"
        );

        DesignOverall designOverall1 = new DesignOverall(
            design1.getId(),
            design1.getAri(),
            design1.getDisplayName(),
            convertEnum(DesignOverall.Type.class, design1.getType(), DesignOverall.Type.UNKNOWN),
            convertEnum(DesignOverall.Status.class, design1.getStatus(), DesignOverall.Status.NONE),
            design1.getUrl()
        );

        System.out.println(designOverall1.toString());
    }

    public static <E extends Enum<E>, T extends Enum<T>> T convertEnum(Class<T> targetType, E sourceValue, T defaultValue) {
        T result;
        try {
            result = Enum.valueOf(targetType, sourceValue.name());
        } catch (IllegalArgumentException e) {
            result = defaultValue;
        }
        return result;
    }
}
