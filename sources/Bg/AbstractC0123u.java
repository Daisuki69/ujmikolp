package Bg;

import kotlin.Unit;
import kotlin.jvm.internal.C1790e;

/* JADX INFO: renamed from: Bg.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0123u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rg.a f558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rg.a f559b;
    public static final Cg.c c;

    static {
        kotlin.jvm.internal.F fC;
        C1790e c1790eA = kotlin.jvm.internal.z.a(Unit.class);
        kotlin.jvm.internal.F fC2 = null;
        try {
            fC = kotlin.jvm.internal.z.c(Unit.class);
        } catch (Throwable unused) {
            fC = null;
        }
        f558a = new Rg.a("SkipSaveBody", new Wg.a(c1790eA, fC));
        C1790e c1790eA2 = kotlin.jvm.internal.z.a(Unit.class);
        try {
            fC2 = kotlin.jvm.internal.z.c(Unit.class);
        } catch (Throwable unused2) {
        }
        f559b = new Rg.a("ResponseBodySaved", new Wg.a(c1790eA2, fC2));
        c = jk.b.f("DoubleReceivePlugin", C0122t.f557a, new Ag.a(3));
    }
}
