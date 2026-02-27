package D8;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X f1026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X f1027b;
    public static final X c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ X[] f1028d;

    static {
        X x6 = new X("AMLC", 0);
        f1026a = x6;
        X x8 = new X("SSNE", 1);
        f1027b = x8;
        X x10 = new X("COMPLETE_PERSONAL_INFO", 2);
        c = x10;
        X[] xArr = {x6, x8, x10};
        f1028d = xArr;
        v0.h(xArr);
    }

    public static X valueOf(String str) {
        return (X) Enum.valueOf(X.class, str);
    }

    public static X[] values() {
        return (X[]) f1028d.clone();
    }
}
