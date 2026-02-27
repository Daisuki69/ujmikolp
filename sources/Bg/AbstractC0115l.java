package Bg;

import kotlin.Unit;
import kotlin.jvm.internal.C1790e;

/* JADX INFO: renamed from: Bg.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0115l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rg.a f540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ok.b f541b;

    static {
        kotlin.jvm.internal.F fC;
        C1790e c1790eA = kotlin.jvm.internal.z.a(Unit.class);
        try {
            fC = kotlin.jvm.internal.z.c(Unit.class);
        } catch (Throwable unused) {
            fC = null;
        }
        f540a = new Rg.a("ValidateMark", new Wg.a(c1790eA, fC));
        f541b = ok.d.b().a().a("io.ktor.client.plugins.DefaultResponseValidation");
    }
}
