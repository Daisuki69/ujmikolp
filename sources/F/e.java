package F;

import dOYHB6.tiZVw8.numX49;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f1495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f1496b;
    public static final /* synthetic */ e[] c;

    static {
        e eVar = new e(numX49.tnTj78("PcI"), 0);
        f1495a = eVar;
        e eVar2 = new e(numX49.tnTj78("Pcq"), 1);
        f1496b = eVar2;
        e[] eVarArr = {eVar, eVar2};
        c = eVarArr;
        v0.h(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) c.clone();
    }
}
