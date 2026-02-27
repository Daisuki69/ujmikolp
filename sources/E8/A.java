package E8;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ A[] f1264a;

    static {
        A[] aArr = {new A("DETECTOR", 0), new A("GLARE", 1), new A("BLUR", 2)};
        f1264a = aArr;
        v0.h(aArr);
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f1264a.clone();
    }
}
