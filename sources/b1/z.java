package b1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f8347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ z[] f8348b;

    /* JADX INFO: Fake field, exist only in values array */
    z EF2;

    static {
        z zVar = new z("UNKNOWN", 0);
        z zVar2 = new z("ANDROID_FIREBASE", 1);
        f8347a = zVar2;
        f8348b = new z[]{zVar, zVar2};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f8348b.clone();
    }
}
