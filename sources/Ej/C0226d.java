package Ej;

import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ej.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0226d extends Fj.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1616j f1441d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0226d(Function2 function2, CoroutineContext coroutineContext, int i, Dj.a aVar) {
        super(coroutineContext, i, aVar);
        this.f1441d = (AbstractC1616j) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ij.j, kotlin.jvm.functions.Function2] */
    @Override // Fj.f
    public Object c(Dj.r rVar, InterfaceC1526a interfaceC1526a) {
        Object objInvoke = this.f1441d.invoke(rVar, interfaceC1526a);
        return objInvoke == EnumC1578a.f17050a ? objInvoke : Unit.f18162a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ij.j, kotlin.jvm.functions.Function2] */
    @Override // Fj.f
    public Fj.f d(CoroutineContext coroutineContext, int i, Dj.a aVar) {
        return new C0226d(this.f1441d, coroutineContext, i, aVar);
    }

    @Override // Fj.f
    public final String toString() {
        return "block[" + this.f1441d + "] -> " + super.toString();
    }
}
