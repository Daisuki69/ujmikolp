package Ej;

import Fj.AbstractC0249b;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import kotlin.Unit;

/* JADX INFO: renamed from: Ej.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0229g implements InterfaceC0230h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0230h f1448a;

    public C0229g(InterfaceC0230h interfaceC0230h) {
        this.f1448a = interfaceC0230h;
    }

    @Override // Ej.InterfaceC0230h
    public final Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f18195a = AbstractC0249b.f1644b;
        Object objCollect = this.f1448a.collect(new C0228f(this, yVar, interfaceC0231i), interfaceC1526a);
        return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
    }
}
