package D8;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U f1022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f1023b;
    public static final /* synthetic */ U[] c;

    static {
        U u3 = new U("BIRTHDAY", 0);
        f1022a = u3;
        U u7 = new U("NATIONAL_ID", 1);
        f1023b = u7;
        U[] uArr = {u3, u7};
        c = uArr;
        v0.h(uArr);
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) c.clone();
    }
}
