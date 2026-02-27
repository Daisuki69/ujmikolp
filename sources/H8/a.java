package H8;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2141b;
    public static final a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2142d;
    public static final /* synthetic */ a[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2143a;

    static {
        a aVar = new a("FIRST_STEP", 0, 1, 33);
        f2141b = aVar;
        a aVar2 = new a("SECOND_STEP", 1, 2, 66);
        c = aVar2;
        a aVar3 = new a("THIRD_STEP", 2, 3, 100);
        f2142d = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        e = aVarArr;
        v0.h(aVarArr);
    }

    public a(String str, int i, int i4, int i6) {
        this.f2143a = i4;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) e.clone();
    }
}
