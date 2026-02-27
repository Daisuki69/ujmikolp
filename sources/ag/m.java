package Ag;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import io.ktor.utils.io.D;
import io.ktor.utils.io.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f299b;
    public final /* synthetic */ Og.f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Og.f fVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = fVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        m mVar = new m(this.c, interfaceC1526a);
        mVar.f299b = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((D) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f298a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            D d10 = (D) this.f299b;
            Og.h hVar = (Og.h) this.c;
            w wVar = d10.f17517a;
            this.f298a = 1;
            if (hVar.e(wVar, this) == enumC1578a) {
                return enumC1578a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
        }
        return Unit.f18162a;
    }
}
