package l5;

import Bj.E;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f18242b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, String str, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f18242b = kVar;
        this.c = str;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new j(this.f18242b, this.c, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f18241a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            this.f18241a = 1;
            if (k.a(this.f18242b, this.c, this) == enumC1578a) {
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
