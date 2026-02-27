package Q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f5217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f5218b;
    public static final g c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g[] f5219d;

    static {
        g gVar = new g("FORCE_NONE", 0);
        f5217a = gVar;
        g gVar2 = new g("FORCE_SQUARE", 1);
        f5218b = gVar2;
        g gVar3 = new g("FORCE_RECTANGLE", 2);
        c = gVar3;
        f5219d = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f5219d.clone();
    }
}
