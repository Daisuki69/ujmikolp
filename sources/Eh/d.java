package Eh;

import Kh.I;
import n3.C1916a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1364a = new b(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mg.c f1365b = new mg.c(2);
    public static final C1916a c = new C1916a(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I f1366d = new I(3);

    public static void a(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(androidx.media3.datasource.cache.c.h(i, str, " > 0 required but it was "));
        }
    }
}
