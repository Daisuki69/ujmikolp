package F;

import dOYHB6.tiZVw8.numX49;
import k2.v0;
import n3.C1916a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1916a f1507b;
    public static final k c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k[] f1508d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1509a;

    static {
        k kVar = new k(numX49.tnTj78("Pch"), 0, 0);
        c = kVar;
        k[] kVarArr = {kVar, new k(numX49.tnTj78("PcM"), 1, 1)};
        f1508d = kVarArr;
        v0.h(kVarArr);
        f1507b = new C1916a(3);
    }

    public k(String str, int i, int i4) {
        this.f1509a = i4;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f1508d.clone();
    }
}
