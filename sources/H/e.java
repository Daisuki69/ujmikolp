package H;

import dOYHB6.tiZVw8.numX49;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f2065b;
    public static final e c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f2066d;
    public static final e e;
    public static final /* synthetic */ e[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2067a;

    static {
        e eVar = new e(numX49.tnTj78("Paq"), 0, numX49.tnTj78("PaI"));
        f2065b = eVar;
        e eVar2 = new e(numX49.tnTj78("Pal"), 1, numX49.tnTj78("Paz"));
        c = eVar2;
        e eVar3 = new e(numX49.tnTj78("PaW"), 2, "userProfiles");
        e eVar4 = new e(numX49.tnTj78("PaPP"), 3, numX49.tnTj78("PaP9"));
        e eVar5 = new e(numX49.tnTj78("PaP2"), 4, numX49.tnTj78("PaPb"));
        f2066d = eVar5;
        e eVar6 = new e(numX49.tnTj78("PaPL"), 5, "uninstallTimestamp");
        e eVar7 = new e(numX49.tnTj78("PaPZ"), 6, numX49.tnTj78("PaPr"));
        e = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, new e(numX49.tnTj78("PaPk"), 7, "userEventLogs")};
        f = eVarArr;
        v0.h(eVarArr);
    }

    public e(String str, int i, String str2) {
        this.f2067a = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f.clone();
    }
}
