package Bj;

/* JADX INFO: loaded from: classes4.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f595a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [Cj.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [Bj.I] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Bj.M] */
    /* JADX WARN: Type inference failed for: r0v9, types: [Bj.I] */
    static {
        String property;
        ?? r02;
        int i = Gj.u.f2033a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            Ij.e eVar = U.f603a;
            r02 = Gj.m.f2024a;
            Cj.d dVar = r02.c;
            if (!(r02 != 0)) {
                r02 = I.h;
            }
        } else {
            r02 = I.h;
        }
        f595a = r02;
    }
}
