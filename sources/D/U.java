package D;

import dOYHB6.tiZVw8.numX49;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U f883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f884b;
    public static final U c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ U[] f885d;

    static {
        U u3 = new U(numX49.tnTj78("Peky"), 0);
        f883a = u3;
        U u7 = new U(numX49.tnTj78("Pekv"), 1);
        f884b = u7;
        U u9 = new U(numX49.tnTj78("Pek7"), 2);
        c = u9;
        U[] uArr = {u3, u7, u9};
        f885d = uArr;
        v0.h(uArr);
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f885d.clone();
    }
}
