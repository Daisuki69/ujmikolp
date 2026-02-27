package Oi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f4845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f4846b;
    public static final g c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g[] f4847d;

    static {
        g gVar = new g("IMPRESSIONS_QUEUED", 0);
        f4845a = gVar;
        g gVar2 = new g("IMPRESSIONS_DROPPED", 1);
        f4846b = gVar2;
        g gVar3 = new g("IMPRESSIONS_DEDUPED", 2);
        c = gVar3;
        f4847d = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f4847d.clone();
    }
}
