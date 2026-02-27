package Vg;

import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import gj.InterfaceC1526a;
import ij.InterfaceC1610d;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements InterfaceC1526a, InterfaceC1610d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6116a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f6117b;

    public k(l lVar) {
        this.f6117b = lVar;
    }

    @Override // ij.InterfaceC1610d
    public final InterfaceC1610d getCallerFrame() {
        InterfaceC1526a interfaceC1526a = j.f6115a;
        int i = this.f6116a;
        l lVar = this.f6117b;
        if (i == Integer.MIN_VALUE) {
            this.f6116a = lVar.f;
        }
        int i4 = this.f6116a;
        if (i4 < 0) {
            this.f6116a = Integer.MIN_VALUE;
            interfaceC1526a = null;
        } else {
            try {
                InterfaceC1526a interfaceC1526a2 = lVar.e[i4];
                if (interfaceC1526a2 != null) {
                    this.f6116a = i4 - 1;
                    interfaceC1526a = interfaceC1526a2;
                }
            } catch (Throwable unused) {
            }
        }
        if (interfaceC1526a instanceof InterfaceC1610d) {
            return (InterfaceC1610d) interfaceC1526a;
        }
        return null;
    }

    @Override // gj.InterfaceC1526a
    public final CoroutineContext getContext() {
        l lVar = this.f6117b;
        InterfaceC1526a[] interfaceC1526aArr = lVar.e;
        int i = lVar.f;
        InterfaceC1526a interfaceC1526a = interfaceC1526aArr[i];
        if (interfaceC1526a != this && interfaceC1526a != null) {
            return interfaceC1526a.getContext();
        }
        int i4 = i - 1;
        while (i4 >= 0) {
            int i6 = i4 - 1;
            InterfaceC1526a interfaceC1526a2 = lVar.e[i4];
            if (interfaceC1526a2 != this && interfaceC1526a2 != null) {
                return interfaceC1526a2.getContext();
            }
            i4 = i6;
        }
        throw new IllegalStateException("Not started");
    }

    @Override // gj.InterfaceC1526a
    public final void resumeWith(Object obj) {
        C1037h.a aVar = C1037h.f9166b;
        boolean z4 = obj instanceof C1038i;
        l lVar = this.f6117b;
        if (!z4) {
            lVar.e(false);
            return;
        }
        Throwable thA = C1037h.a(obj);
        kotlin.jvm.internal.j.d(thA);
        lVar.f(AbstractC1039j.a(thA));
    }
}
