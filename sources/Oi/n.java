package Oi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f4869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f4870b;
    public static final n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f4871d;
    public static final n e;
    public static final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f4872g;
    public static final n h;
    public static final /* synthetic */ n[] i;

    static {
        n nVar = new n("SPLITS", 0);
        f4869a = nVar;
        n nVar2 = new n("IMPRESSIONS", 1);
        f4870b = nVar2;
        n nVar3 = new n("IMPRESSIONS_COUNT", 2);
        c = nVar3;
        n nVar4 = new n("EVENTS", 3);
        f4871d = nVar4;
        n nVar5 = new n("TELEMETRY", 4);
        e = nVar5;
        n nVar6 = new n("TOKEN", 5);
        f = nVar6;
        n nVar7 = new n("MY_SEGMENT", 6);
        f4872g = nVar7;
        n nVar8 = new n("MY_LARGE_SEGMENT", 7);
        h = nVar8;
        i = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) i.clone();
    }
}
