package Oi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f4834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f4835b;
    public static final d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f4836d;
    public static final d e;
    public static final /* synthetic */ d[] f;

    static {
        d dVar = new d("NON_READY_USAGES", 0);
        f4834a = dVar;
        d dVar2 = new d("SDK_READY_TIME", 1);
        f4835b = dVar2;
        d dVar3 = new d("SDK_READY_FROM_CACHE", 2);
        c = dVar3;
        d dVar4 = new d("REDUNDANT_FACTORIES", 3);
        f4836d = dVar4;
        d dVar5 = new d("ACTIVE_FACTORIES", 4);
        e = dVar5;
        f = new d[]{dVar, dVar2, dVar3, dVar4, dVar5};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f.clone();
    }
}
