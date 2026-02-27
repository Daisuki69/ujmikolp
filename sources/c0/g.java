package c0;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f9194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f9195b;
    public static final g c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f9196d;
    public static final /* synthetic */ g[] e;

    static {
        g gVar = new g("ENDPOINT_SPIKY", 0);
        f9195b = gVar;
        g gVar2 = new g("ENDPOINT_A1", 1);
        c = gVar2;
        g gVar3 = new g("ENDPOINT_HELLO", 2);
        g gVar4 = new g("ENDPOINT_DEFINE_VARS", 3);
        f9196d = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
        e = gVarArr;
        v0.h(gVarArr);
        f9194a = new i();
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) e.clone();
    }
}
