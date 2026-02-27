package Bg;

import java.util.ArrayList;
import kotlin.jvm.internal.C1790e;

/* JADX INFO: loaded from: classes4.dex */
public final class W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0105b f504b = new C0105b(8);
    public static final Rg.a c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f505a = new ArrayList();

    static {
        kotlin.jvm.internal.F fC;
        C1790e c1790eA = kotlin.jvm.internal.z.a(W.class);
        try {
            fC = kotlin.jvm.internal.z.c(W.class);
        } catch (Throwable unused) {
            fC = null;
        }
        c = new Rg.a("HttpSend", new Wg.a(c1790eA, fC));
    }
}
