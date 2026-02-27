package e3;

import Ej.InterfaceC0231i;
import bj.InterfaceC1031b;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.C1786a;
import kotlin.jvm.internal.InterfaceC1791f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements InterfaceC0231i, InterfaceC1791f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f16582a;

    public n(AtomicReference atomicReference) {
        this.f16582a = atomicReference;
    }

    @Override // Ej.InterfaceC0231i
    public final Object emit(Object obj, InterfaceC1526a interfaceC1526a) {
        this.f16582a.set((j) obj);
        Unit unit = Unit.f18162a;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return unit;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0231i) && (obj instanceof InterfaceC1791f)) {
            return getFunctionDelegate().equals(((InterfaceC1791f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC1791f
    public final InterfaceC1031b getFunctionDelegate() {
        return new C1786a(this.f16582a, "set", 2, "set(Ljava/lang/Object;)V", 4, AtomicReference.class);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
