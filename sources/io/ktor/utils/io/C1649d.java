package io.ktor.utils.io;

import Bj.C0151l;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import gj.InterfaceC1526a;
import zj.C2579a;

/* JADX INFO: renamed from: io.ktor.utils.io.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1649d implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0151l f17523b;
    public final Throwable c;

    public C1649d(C0151l c0151l) {
        this.f17523b = c0151l;
        String property = System.getProperty("io.ktor.development");
        if (property == null || !Boolean.parseBoolean(property)) {
            return;
        }
        int iHashCode = c0151l.hashCode();
        C2579a.a(16);
        String string = Integer.toString(iHashCode, 16);
        kotlin.jvm.internal.j.f(string, "toString(...)");
        Throwable th2 = new Throwable("ReadTask 0x".concat(string));
        C1030a.b(th2);
        this.c = th2;
    }

    @Override // io.ktor.utils.io.e
    public final void a(Throwable th2) {
        Object objA;
        InterfaceC1526a interfaceC1526aC = c();
        if (th2 != null) {
            C1037h.a aVar = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        } else {
            g.f17525a.getClass();
            objA = C1647b.c;
        }
        ((C0151l) interfaceC1526aC).resumeWith(objA);
    }

    @Override // io.ktor.utils.io.e
    public final Throwable b() {
        return this.c;
    }

    public final InterfaceC1526a c() {
        return this.f17523b;
    }

    @Override // io.ktor.utils.io.e
    public final void resume() {
        InterfaceC1526a interfaceC1526aC = c();
        g.f17525a.getClass();
        ((C0151l) interfaceC1526aC).resumeWith(C1647b.c);
    }
}
