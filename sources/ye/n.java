package ye;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f21143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f21144b;
    public static final n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f21145d;
    public static final n e;
    public static final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f21146g;
    public static final n h;
    public static final n i;
    public static final n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f21147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ n[] f21148l;

    static {
        n nVar = new n("IDLE", 0);
        f21143a = nVar;
        n nVar2 = new n("SLIDE_STARTED", 1);
        f21144b = nVar2;
        n nVar3 = new n("SLIDING", 2);
        c = nVar3;
        n nVar4 = new n("SLIDE_BACK", 3);
        f21145d = nVar4;
        n nVar5 = new n("SLIDE_AUTO_COMPLETING", 4);
        e = nVar5;
        n nVar6 = new n("SLIDE_COMPLETED", 5);
        f = nVar6;
        n nVar7 = new n("LOAD_EXPANDING", 6);
        f21146g = nVar7;
        n nVar8 = new n("LOAD_IN_PROGRESS", 7);
        h = nVar8;
        n nVar9 = new n("LOAD_FINISHING", 8);
        i = nVar9;
        n nVar10 = new n("FINISHED", 9);
        j = nVar10;
        n nVar11 = new n("RESETTING", 10);
        f21147k = nVar11;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11};
        f21148l = nVarArr;
        v0.h(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f21148l.clone();
    }
}
