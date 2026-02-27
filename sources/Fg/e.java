package Fg;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f1602d;
    public static final e e;
    public static final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e[] f1603g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1605b;
    public final boolean c;

    static {
        e eVar = new e(true, 0, "ALL", true, true);
        f1602d = eVar;
        e eVar2 = new e(true, 1, "HEADERS", true, false);
        e = eVar2;
        e eVar3 = new e(true, 2, "BODY", false, true);
        e eVar4 = new e(true, 3, "INFO", false, false);
        e eVar5 = new e(false, 4, "NONE", false, false);
        f = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        f1603g = eVarArr;
        v0.h(eVarArr);
    }

    public e(boolean z4, int i, String str, boolean z5, boolean z8) {
        this.f1604a = z4;
        this.f1605b = z5;
        this.c = z8;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f1603g.clone();
    }
}
