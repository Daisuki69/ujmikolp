package Bg;

import kotlin.jvm.internal.C1790e;
import yg.InterfaceC2532a;

/* JADX INFO: renamed from: Bg.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0109f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rg.a f524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rg.a f525b;
    public static final Cg.c c;

    static {
        kotlin.jvm.internal.F fC;
        C1790e c1790eA = kotlin.jvm.internal.z.a(InterfaceC2532a.class);
        kotlin.jvm.internal.F fC2 = null;
        try {
            fC = kotlin.jvm.internal.z.c(InterfaceC2532a.class);
        } catch (Throwable unused) {
            fC = null;
        }
        f524a = new Rg.a("UploadProgressListenerAttributeKey", new Wg.a(c1790eA, fC));
        C1790e c1790eA2 = kotlin.jvm.internal.z.a(InterfaceC2532a.class);
        try {
            fC2 = kotlin.jvm.internal.z.c(InterfaceC2532a.class);
        } catch (Throwable unused2) {
        }
        f525b = new Rg.a("DownloadProgressListenerAttributeKey", new Wg.a(c1790eA2, fC2));
        c = jk.b.f("BodyProgress", new A5.j(4), new Ag.a(2));
    }
}
