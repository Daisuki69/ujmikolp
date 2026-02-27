package Fj;

import bj.C1037h;
import gj.InterfaceC1526a;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: renamed from: Fj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0248a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC0250c[] f1640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1641b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B f1642d;

    public final AbstractC0250c c() {
        AbstractC0250c abstractC0250cD;
        B b8;
        synchronized (this) {
            try {
                AbstractC0250c[] abstractC0250cArrE = this.f1640a;
                if (abstractC0250cArrE == null) {
                    abstractC0250cArrE = e();
                    this.f1640a = abstractC0250cArrE;
                } else if (this.f1641b >= abstractC0250cArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC0250cArrE, abstractC0250cArrE.length * 2);
                    kotlin.jvm.internal.j.f(objArrCopyOf, "copyOf(...)");
                    this.f1640a = (AbstractC0250c[]) objArrCopyOf;
                    abstractC0250cArrE = (AbstractC0250c[]) objArrCopyOf;
                }
                int i = this.c;
                do {
                    abstractC0250cD = abstractC0250cArrE[i];
                    if (abstractC0250cD == null) {
                        abstractC0250cD = d();
                        abstractC0250cArrE[i] = abstractC0250cD;
                    }
                    i++;
                    if (i >= abstractC0250cArrE.length) {
                        i = 0;
                    }
                } while (!abstractC0250cD.a(this));
                this.c = i;
                this.f1641b++;
                b8 = this.f1642d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (b8 != null) {
            b8.u(1);
        }
        return abstractC0250cD;
    }

    public abstract AbstractC0250c d();

    public abstract AbstractC0250c[] e();

    public final void f(AbstractC0250c abstractC0250c) {
        B b8;
        int i;
        InterfaceC1526a[] interfaceC1526aArrB;
        synchronized (this) {
            try {
                int i4 = this.f1641b - 1;
                this.f1641b = i4;
                b8 = this.f1642d;
                if (i4 == 0) {
                    this.c = 0;
                }
                kotlin.jvm.internal.j.e(abstractC0250c, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC1526aArrB = abstractC0250c.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (InterfaceC1526a interfaceC1526a : interfaceC1526aArrB) {
            if (interfaceC1526a != null) {
                C1037h.a aVar = C1037h.f9166b;
                interfaceC1526a.resumeWith(Unit.f18162a);
            }
        }
        if (b8 != null) {
            b8.u(-1);
        }
    }

    public final B g() {
        B b8;
        synchronized (this) {
            b8 = this.f1642d;
            if (b8 == null) {
                int i = this.f1641b;
                b8 = new B(1, Integer.MAX_VALUE, Dj.a.f1164b);
                b8.b(Integer.valueOf(i));
                this.f1642d = b8;
            }
        }
        return b8;
    }
}
