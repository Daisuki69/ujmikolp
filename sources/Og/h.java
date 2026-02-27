package Og;

import Bj.H;
import Bj.U;
import Ng.C0496d;
import Ng.v;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import io.ktor.utils.io.w;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Qg.c f4797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0496d f4798b;

    public h(Qg.c cVar, C0496d c0496d) {
        this.f4797a = cVar;
        this.f4798b = c0496d;
    }

    @Override // Og.f
    public final Long a() {
        return null;
    }

    @Override // Og.f
    public final C0496d b() {
        return this.f4798b;
    }

    @Override // Og.f
    public final v d() {
        return null;
    }

    public final Object e(w wVar, AbstractC1616j abstractC1616j) throws Throwable {
        Object objC;
        g gVar = new g(wVar, this, null);
        boolean zB = false;
        try {
            Method method = (Method) b.f4793a.getValue();
            if (method != null) {
                zB = j.b(method.invoke(null, null), Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
        if (zB) {
            objC = gVar.invoke(abstractC1616j);
            if (objC != EnumC1578a.f17050a) {
                objC = Unit.f18162a;
            }
        } else {
            Ij.e eVar = U.f603a;
            objC = H.C(new a(gVar, null), Ij.d.f2362a, abstractC1616j);
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (objC != enumC1578a) {
                objC = Unit.f18162a;
            }
            if (objC != enumC1578a) {
                objC = Unit.f18162a;
            }
        }
        return objC == EnumC1578a.f17050a ? objC : Unit.f18162a;
    }
}
