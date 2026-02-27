package F;

import dOYHB6.tiZVw8.numX49;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f1510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f1511b;
    public static final l c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l[] f1512d;

    static {
        l lVar = new l(numX49.tnTj78("PcP"), 0);
        f1510a = lVar;
        l lVar2 = new l(numX49.tnTj78("Pcb"), 1);
        f1511b = lVar2;
        l lVar3 = new l(numX49.tnTj78("Pc2"), 2);
        c = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        f1512d = lVarArr;
        v0.h(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f1512d.clone();
    }
}
