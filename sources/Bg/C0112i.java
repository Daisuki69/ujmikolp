package Bg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C1790e;

/* JADX INFO: renamed from: Bg.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0112i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0105b f531b = new C0105b(6);
    public static final Rg.a c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f532a;

    static {
        kotlin.jvm.internal.F fC;
        C1790e c1790eA = kotlin.jvm.internal.z.a(C0112i.class);
        try {
            fC = kotlin.jvm.internal.z.c(C0112i.class);
        } catch (Throwable unused) {
            fC = null;
        }
        c = new Rg.a("DefaultRequest", new Wg.a(c1790eA, fC));
    }

    public C0112i(Function1 function1) {
        this.f532a = function1;
    }
}
