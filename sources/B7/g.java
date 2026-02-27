package b7;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f8546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f8547b;
    public static final /* synthetic */ g[] c;

    static {
        g gVar = new g("FULL", 0);
        f8546a = gVar;
        g gVar2 = new g("SHORT", 1);
        f8547b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        c = gVarArr;
        v0.h(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) c.clone();
    }
}
