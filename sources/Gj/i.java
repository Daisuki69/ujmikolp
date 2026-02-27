package Gj;

import Bj.H;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2016a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2017b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean c(i iVar, int i) {
        while (true) {
            i iVarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2017b;
            if (iVarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    iVarD = (i) obj;
                    if (!iVarD.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVarD);
                }
            }
            if (iVarD instanceof g) {
                return (((g) iVarD).f2015d & i) == 0 && iVarD.c(iVar, i);
            }
            atomicReferenceFieldUpdater.set(iVar, iVarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2016a;
            atomicReferenceFieldUpdater2.set(iVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(iVarD, this, iVar)) {
                if (atomicReferenceFieldUpdater2.get(iVarD) != this) {
                    break;
                }
            }
            iVar.e(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((Gj.o) r6).f2027a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Gj.i d() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Gj.i.f2017b
            java.lang.Object r1 = r0.get(r9)
            Gj.i r1 = (Gj.i) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = Gj.i.f2016a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.g()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof Gj.o
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            Gj.o r6 = (Gj.o) r6
            Gj.i r6 = r6.f2027a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            Gj.i r3 = (Gj.i) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.j.e(r6, r4)
            r4 = r6
            Gj.i r4 = (Gj.i) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Gj.i.d():Gj.i");
    }

    public final void e(i iVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2017b;
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (f2016a.get(this) != iVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                if (atomicReferenceFieldUpdater.get(iVar) != iVar2) {
                    break;
                }
            }
            if (g()) {
                iVar.d();
                return;
            }
            return;
        }
    }

    public final i f() {
        i iVar;
        Object obj = f2016a.get(this);
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar != null && (iVar = oVar.f2027a) != null) {
            return iVar;
        }
        kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (i) obj;
    }

    public boolean g() {
        return f2016a.get(this) instanceof o;
    }

    public String toString() {
        return new h(this, H.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + H.o(this);
    }
}
