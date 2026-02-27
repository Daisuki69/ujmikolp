package zg;

import Bg.X;
import cj.P;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C1790e;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.z;
import kotlin.reflect.KTypeProjection;
import xj.r;

/* JADX INFO: renamed from: zg.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC2572g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rg.a f21433a;

    static {
        F f;
        C1790e c1790eA = z.a(Map.class);
        try {
            KTypeProjection.c.getClass();
            KTypeProjection kTypeProjection = KTypeProjection.f18203d;
            C1790e c1790eA2 = z.a(InterfaceC2571f.class);
            List listSingletonList = Collections.singletonList(kTypeProjection);
            A a8 = z.f18196a;
            a8.getClass();
            F fB = A.b(c1790eA2, listSingletonList, false);
            r rVar = r.f21013a;
            KTypeProjection kTypeProjection2 = new KTypeProjection(rVar, fB);
            KTypeProjection kTypeProjection3 = new KTypeProjection(rVar, z.c(Object.class));
            C1790e c1790eA3 = z.a(Map.class);
            List listAsList = Arrays.asList(kTypeProjection2, kTypeProjection3);
            a8.getClass();
            F fB2 = A.b(c1790eA3, listAsList, false);
            f = new F(fB2.f18179a, fB2.f18180b, 2 | fB2.c);
        } catch (Throwable unused) {
            f = null;
        }
        f21433a = new Rg.a("EngineCapabilities", new Wg.a(c1790eA, f));
        P.b(X.f506a);
    }
}
