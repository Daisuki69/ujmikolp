package w4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2380d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2380d f20690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2380d f20691b;
    public static final EnumC2380d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC2380d[] f20692d;

    static {
        EnumC2380d enumC2380d = new EnumC2380d("IDLE", 0);
        f20690a = enumC2380d;
        EnumC2380d enumC2380d2 = new EnumC2380d("SYNCING", 1);
        f20691b = enumC2380d2;
        EnumC2380d enumC2380d3 = new EnumC2380d("STOPPED", 2);
        c = enumC2380d3;
        f20692d = new EnumC2380d[]{enumC2380d, enumC2380d2, enumC2380d3};
    }

    public static EnumC2380d valueOf(String str) {
        return (EnumC2380d) Enum.valueOf(EnumC2380d.class, str);
    }

    public static EnumC2380d[] values() {
        return (EnumC2380d[]) f20692d.clone();
    }
}
