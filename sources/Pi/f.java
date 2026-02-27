package Pi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f5191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f5192b;
    public static final f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f5193d;

    static {
        f fVar = new f("SPLITS", 0);
        f5191a = fVar;
        f fVar2 = new f("MY_SEGMENTS", 1);
        f5192b = fVar2;
        f fVar3 = new f("MY_LARGE_SEGMENTS", 2);
        c = fVar3;
        f5193d = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f5193d.clone();
    }
}
