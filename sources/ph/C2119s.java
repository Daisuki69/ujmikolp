package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ph.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2119s extends AtomicBoolean implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19626b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable f19627d;
    public InterfaceC1486b e;
    public final ArrayDeque f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f19628g;

    public C2119s(ch.r rVar, int i, int i4, Callable callable) {
        this.f19625a = rVar;
        this.f19626b = i;
        this.c = i4;
        this.f19627d = callable;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.e.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        while (true) {
            ArrayDeque arrayDeque = this.f;
            boolean zIsEmpty = arrayDeque.isEmpty();
            ch.r rVar = this.f19625a;
            if (zIsEmpty) {
                rVar.onComplete();
                return;
            }
            rVar.onNext(arrayDeque.poll());
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f.clear();
        this.f19625a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        long j = this.f19628g;
        this.f19628g = 1 + j;
        long j6 = j % ((long) this.c);
        ArrayDeque arrayDeque = this.f;
        ch.r rVar = this.f19625a;
        if (j6 == 0) {
            try {
                Object objCall = this.f19627d.call();
                jh.e.b(objCall, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                arrayDeque.offer((Collection) objCall);
            } catch (Throwable th2) {
                arrayDeque.clear();
                this.e.dispose();
                rVar.onError(th2);
                return;
            }
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            Collection collection = (Collection) it.next();
            collection.add(obj);
            if (this.f19626b <= collection.size()) {
                it.remove();
                rVar.onNext(collection);
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.e, interfaceC1486b)) {
            this.e = interfaceC1486b;
            this.f19625a.onSubscribe(this);
        }
    }
}
