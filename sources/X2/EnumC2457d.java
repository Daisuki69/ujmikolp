package x2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2457d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2457d f20882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2457d[] f20883b;

    static {
        EnumC2457d enumC2457d = new EnumC2457d("DEFAULT", 0);
        f20882a = enumC2457d;
        f20883b = new EnumC2457d[]{enumC2457d, new EnumC2457d("SIGNED", 1), new EnumC2457d("FIXED", 2)};
    }

    public static EnumC2457d valueOf(String str) {
        return (EnumC2457d) Enum.valueOf(EnumC2457d.class, str);
    }

    public static EnumC2457d[] values() {
        return (EnumC2457d[]) f20883b.clone();
    }
}
