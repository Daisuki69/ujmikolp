package bd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0938a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0938a f8633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0938a f8634b;
    public static final /* synthetic */ EnumC0938a[] c;

    static {
        EnumC0938a enumC0938a = new EnumC0938a("EQUAL_SPACING", 0);
        f8633a = enumC0938a;
        EnumC0938a enumC0938a2 = new EnumC0938a("DASHBOARD", 1);
        f8634b = enumC0938a2;
        c = new EnumC0938a[]{enumC0938a, enumC0938a2, new EnumC0938a("MAYA_DASHBOARD", 2)};
    }

    public static EnumC0938a valueOf(String str) {
        return (EnumC0938a) Enum.valueOf(EnumC0938a.class, str);
    }

    public static EnumC0938a[] values() {
        return (EnumC0938a[]) c.clone();
    }
}
