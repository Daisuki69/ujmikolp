package zg;

import Bj.C0154m0;
import Bj.E;
import Bj.InterfaceC0156n0;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import io.ktor.client.engine.ClientEngineClosedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: zg.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2567b extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2568c f21427b;
    public final /* synthetic */ Jg.d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2567b(InterfaceC2568c interfaceC2568c, Jg.d dVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f21427b = interfaceC2568c;
        this.c = dVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C2567b(this.f21427b, this.c, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2567b) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f21426a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            return obj;
        }
        AbstractC1039j.b(obj);
        InterfaceC2568c interfaceC2568c = this.f21427b;
        InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) interfaceC2568c.getCoroutineContext().get(C0154m0.f630a);
        if (!(interfaceC0156n0 != null ? interfaceC0156n0.isActive() : false)) {
            throw new ClientEngineClosedException(0);
        }
        this.f21426a = 1;
        Object objH = interfaceC2568c.h(this.c, this);
        return objH == enumC1578a ? enumC1578a : objH;
    }
}
