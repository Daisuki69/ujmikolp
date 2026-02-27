package Q;

import dOYHB6.tiZVw8.numX49;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5195b;
    public static final a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f5196d;

    static {
        a aVar = new a(numX49.tnTj78("bPrP"), 0);
        f5194a = aVar;
        a aVar2 = new a(numX49.tnTj78("bPrb"), 1);
        f5195b = aVar2;
        a aVar3 = new a(numX49.tnTj78("bPr2"), 2);
        c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f5196d = aVarArr;
        v0.h(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5196d.clone();
    }
}
