package U5;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5943b;
    public static final a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f5944d;
    public static final a e;
    public static final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f5945g;

    static {
        a aVar = new a("CREATED", 0);
        f5942a = aVar;
        a aVar2 = new a("DESTROYED", 1);
        f5943b = aVar2;
        a aVar3 = new a("READY", 2);
        c = aVar3;
        a aVar4 = new a("READY_FROM_CACHE", 3);
        f5944d = aVar4;
        a aVar5 = new a("TIMED_OUT", 4);
        e = aVar5;
        a aVar6 = new a("UPDATED", 5);
        f = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        f5945g = aVarArr;
        v0.h(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5945g.clone();
    }
}
