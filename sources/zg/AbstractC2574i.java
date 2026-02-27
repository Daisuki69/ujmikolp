package zg;

import Bj.D;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C1790e;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.z;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: zg.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC2574i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f21434a = new D("call-context");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rg.a f21435b;

    static {
        F fB;
        C1790e c1790eA = z.a(wg.d.class);
        try {
            KTypeProjection.c.getClass();
            KTypeProjection kTypeProjection = KTypeProjection.f18203d;
            C1790e c1790eA2 = z.a(wg.d.class);
            List listSingletonList = Collections.singletonList(kTypeProjection);
            z.f18196a.getClass();
            fB = A.b(c1790eA2, listSingletonList, false);
        } catch (Throwable unused) {
            fB = null;
        }
        f21435b = new Rg.a("client-config", new Wg.a(c1790eA, fB));
    }
}
