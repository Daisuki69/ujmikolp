package S4;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b[] f5665a;

    static {
        b[] bVarArr = {new b("Granted", 0), new b("Denied", 1), new b("PermanentlyDenied", 2), new b("None", 3)};
        f5665a = bVarArr;
        v0.h(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5665a.clone();
    }
}
