package Ej;

import Bj.C0151l;
import Fj.AbstractC0248a;
import Fj.AbstractC0249b;
import Fj.AbstractC0250c;
import bj.C1037h;
import gj.InterfaceC1526a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends AbstractC0248a implements O, InterfaceC0230h, Fj.t {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    public h0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // Fj.t
    public final InterfaceC0230h a(CoroutineContext coroutineContext, int i, Dj.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != Dj.a.f1164b) ? W.o(this, coroutineContext, i, aVar) : this;
    }

    @Override // Ej.N
    public final boolean b(Object obj) {
        h(obj);
        return true;
    }

    /* JADX WARN: Path cross not found for [B:36:0x008b, B:38:0x0091], limit reached: 66 */
    /* JADX WARN: Path cross not found for [B:38:0x0091, B:36:0x008b], limit reached: 66 */
    /* JADX WARN: Path cross not found for [B:38:0x0091, B:46:0x00ac], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:28:0x0075, B:30:0x007d, B:33:0x0084, B:34:0x0088, B:36:0x008b, B:46:0x00ac, B:49:0x00bc, B:50:0x00d6, B:56:0x00ea, B:59:0x00f3, B:53:0x00dd, B:55:0x00e3, B:38:0x0091, B:42:0x0098, B:21:0x004d, B:24:0x0057, B:27:0x0066), top: B:64:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:28:0x0075, B:30:0x007d, B:33:0x0084, B:34:0x0088, B:36:0x008b, B:46:0x00ac, B:49:0x00bc, B:50:0x00d6, B:56:0x00ea, B:59:0x00f3, B:53:0x00dd, B:55:0x00e3, B:38:0x0091, B:42:0x0098, B:21:0x004d, B:24:0x0057, B:27:0x0066), top: B:64:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:28:0x0075, B:30:0x007d, B:33:0x0084, B:34:0x0088, B:36:0x008b, B:46:0x00ac, B:49:0x00bc, B:50:0x00d6, B:56:0x00ea, B:59:0x00f3, B:53:0x00dd, B:55:0x00e3, B:38:0x0091, B:42:0x0098, B:21:0x004d, B:24:0x0057, B:27:0x0066), top: B:64:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00bb -> B:28:0x0075). Please report as a decompilation issue!!! */
    @Override // Ej.InterfaceC0230h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(Ej.InterfaceC0231i r14, gj.InterfaceC1526a r15) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.h0.collect(Ej.i, gj.a):java.lang.Object");
    }

    @Override // Fj.AbstractC0248a
    public final AbstractC0250c d() {
        return new i0();
    }

    @Override // Fj.AbstractC0248a
    public final AbstractC0250c[] e() {
        return new i0[2];
    }

    @Override // Ej.N, Ej.InterfaceC0231i
    public final Object emit(Object obj, InterfaceC1526a interfaceC1526a) {
        h(obj);
        return Unit.f18162a;
    }

    @Override // Ej.f0
    public final Object getValue() {
        Gj.t tVar = AbstractC0249b.f1644b;
        Object obj = f.get(this);
        if (obj == tVar) {
            return null;
        }
        return obj;
    }

    public final void h(Object obj) {
        if (obj == null) {
            obj = AbstractC0249b.f1644b;
        }
        i(null, obj);
    }

    public final boolean i(Object obj, Object obj2) {
        int i;
        AbstractC0250c[] abstractC0250cArr;
        Gj.t tVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.j.b(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.j.b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i4 = this.e;
            if ((i4 & 1) != 0) {
                this.e = i4 + 2;
                return true;
            }
            int i6 = i4 + 1;
            this.e = i6;
            AbstractC0250c[] abstractC0250cArr2 = this.f1640a;
            Unit unit = Unit.f18162a;
            while (true) {
                i0[] i0VarArr = (i0[]) abstractC0250cArr2;
                if (i0VarArr != null) {
                    for (i0 i0Var : i0VarArr) {
                        if (i0Var != null) {
                            AtomicReference atomicReference = i0Var.f1452a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (tVar = W.c)) {
                                    Gj.t tVar2 = W.f1423b;
                                    if (obj4 != tVar2) {
                                        while (!atomicReference.compareAndSet(obj4, tVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        C1037h.a aVar = C1037h.f9166b;
                                        ((C0151l) obj4).resumeWith(Unit.f18162a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, tVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i6) {
                        this.e = i6 + 1;
                        return true;
                    }
                    abstractC0250cArr = this.f1640a;
                    Unit unit2 = Unit.f18162a;
                }
                abstractC0250cArr2 = abstractC0250cArr;
                i6 = i;
            }
        }
    }
}
