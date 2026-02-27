package J9;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f2493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f2494b;
    public static final d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f2495d;

    static {
        d dVar = new d("VERIFIED", 0);
        f2493a = dVar;
        d dVar2 = new d("UNVERIFIED", 1);
        f2494b = dVar2;
        d dVar3 = new d("NO_EMAIL", 2);
        c = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        f2495d = dVarArr;
        v0.h(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2495d.clone();
    }
}
