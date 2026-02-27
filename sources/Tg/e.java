package Tg;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mg.c f5832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e[] f5833b;
    public static final /* synthetic */ jj.b c;

    static {
        e[] eVarArr = {new e("JANUARY", 0), new e("FEBRUARY", 1), new e("MARCH", 2), new e("APRIL", 3), new e("MAY", 4), new e("JUNE", 5), new e("JULY", 6), new e("AUGUST", 7), new e("SEPTEMBER", 8), new e("OCTOBER", 9), new e("NOVEMBER", 10), new e("DECEMBER", 11)};
        f5833b = eVarArr;
        c = v0.h(eVarArr);
        f5832a = new mg.c(15);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f5833b.clone();
    }
}
