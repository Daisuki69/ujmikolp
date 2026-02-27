package Hj;

import Bj.AbstractC0129a;
import bj.AbstractC1039j;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final void a(InterfaceC1526a interfaceC1526a, AbstractC0129a abstractC0129a) {
        try {
            InterfaceC1526a interfaceC1526aB = h.b(interfaceC1526a);
            C1037h.a aVar = C1037h.f9166b;
            Gj.a.g(interfaceC1526aB, Unit.f18162a);
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            abstractC0129a.resumeWith(AbstractC1039j.a(th2));
            throw th2;
        }
    }

    public static final void b(Function2 function2, AbstractC0129a abstractC0129a, AbstractC0129a abstractC0129a2) {
        try {
            InterfaceC1526a interfaceC1526aB = h.b(h.a(abstractC0129a, abstractC0129a2, function2));
            C1037h.a aVar = C1037h.f9166b;
            Gj.a.g(interfaceC1526aB, Unit.f18162a);
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            abstractC0129a2.resumeWith(AbstractC1039j.a(th2));
            throw th2;
        }
    }
}
