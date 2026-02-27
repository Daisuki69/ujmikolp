package Z9;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f6919a;

    static {
        a[] aVarArr = {new a("MAYA_CREDIT", 0), new a("MAYA_WALLET", 1)};
        f6919a = aVarArr;
        v0.h(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6919a.clone();
    }
}
