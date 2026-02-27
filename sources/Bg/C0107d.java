package Bg;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;

/* JADX INFO: renamed from: Bg.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0107d extends AbstractC1616j implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Jg.c f522a;

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0107d c0107d = new C0107d(3, (InterfaceC1526a) obj3);
        c0107d.f522a = (Jg.c) obj;
        c0107d.invokeSuspend(Unit.f18162a);
        return null;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        if (this.f522a.f.e(AbstractC0109f.f524a) == null) {
            return null;
        }
        throw new ClassCastException();
    }
}
