package i1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1584d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1584d f17073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1584d f17074b;
    public static final EnumC1584d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1584d[] f17075d;

    static {
        EnumC1584d enumC1584d = new EnumC1584d("NETWORK_UNMETERED", 0);
        f17073a = enumC1584d;
        EnumC1584d enumC1584d2 = new EnumC1584d("DEVICE_IDLE", 1);
        f17074b = enumC1584d2;
        EnumC1584d enumC1584d3 = new EnumC1584d("DEVICE_CHARGING", 2);
        c = enumC1584d3;
        f17075d = new EnumC1584d[]{enumC1584d, enumC1584d2, enumC1584d3};
    }

    public static EnumC1584d valueOf(String str) {
        return (EnumC1584d) Enum.valueOf(EnumC1584d.class, str);
    }

    public static EnumC1584d[] values() {
        return (EnumC1584d[]) f17075d.clone();
    }
}
