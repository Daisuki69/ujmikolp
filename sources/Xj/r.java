package xj;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f21013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ r[] f21014b;

    static {
        r rVar = new r("INVARIANT", 0);
        f21013a = rVar;
        r[] rVarArr = {rVar, new r("IN", 1), new r("OUT", 2)};
        f21014b = rVarArr;
        v0.h(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f21014b.clone();
    }
}
