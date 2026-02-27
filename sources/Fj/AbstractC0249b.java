package Fj;

import Ej.InterfaceC0230h;
import defpackage.AbstractC1414e;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;

/* JADX INFO: renamed from: Fj.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0249b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC1526a[] f1643a = new InterfaceC1526a[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Gj.t f1644b = new Gj.t("NULL", 0);
    public static final Gj.t c = new Gj.t("UNINITIALIZED", 0);

    public static /* synthetic */ InterfaceC0230h a(t tVar, Bj.A a8, int i, Dj.a aVar, int i4) {
        CoroutineContext coroutineContext = a8;
        if ((i4 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f18170a;
        }
        if ((i4 & 2) != 0) {
            i = -3;
        }
        if ((i4 & 4) != 0) {
            aVar = Dj.a.f1163a;
        }
        return tVar.a(coroutineContext, i, aVar);
    }

    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, InterfaceC1526a frame) {
        Object objInvoke;
        Object objC = Gj.v.c(coroutineContext, obj2);
        try {
            A a8 = new A(frame, coroutineContext);
            if (AbstractC1414e.u(function2)) {
                D.d(2, function2);
                objInvoke = function2.invoke(obj, a8);
            } else {
                objInvoke = hj.h.c(function2, obj, a8);
            }
            Gj.v.a(coroutineContext, objC);
            if (objInvoke == EnumC1578a.f17050a) {
                kotlin.jvm.internal.j.g(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th2) {
            Gj.v.a(coroutineContext, objC);
            throw th2;
        }
    }
}
