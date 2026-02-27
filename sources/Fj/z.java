package Fj;

import Ej.InterfaceC0231i;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements InterfaceC0231i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dj.r f1682a;

    public z(Dj.r rVar) {
        this.f1682a = rVar;
    }

    @Override // Ej.InterfaceC0231i
    public final Object emit(Object obj, InterfaceC1526a interfaceC1526a) {
        Object objM = ((Dj.q) this.f1682a).f1200d.m(interfaceC1526a, obj);
        return objM == EnumC1578a.f17050a ? objM : Unit.f18162a;
    }
}
