package Dj;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1164b;
    public static final a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f1165d;

    static {
        a aVar = new a("SUSPEND", 0);
        f1163a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f1164b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f1165d = aVarArr;
        v0.h(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1165d.clone();
    }
}
