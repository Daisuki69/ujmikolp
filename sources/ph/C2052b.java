package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import vh.AbstractC2353d;

/* JADX INFO: renamed from: ph.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2052b extends AtomicReference implements ch.r, Iterator, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rh.c f19411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f19412b;
    public final Condition c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f19413d;
    public volatile Throwable e;

    public C2052b(int i) {
        this.f19411a = new rh.c(i);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f19412b = reentrantLock;
        this.c = reentrantLock.newCondition();
    }

    public final boolean a() {
        return EnumC1604b.b((InterfaceC1486b) get());
    }

    public final void b() {
        ReentrantLock reentrantLock = this.f19412b;
        reentrantLock.lock();
        try {
            this.c.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this);
        b();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (!a()) {
            boolean z4 = this.f19413d;
            boolean zIsEmpty = this.f19411a.isEmpty();
            if (z4) {
                Throwable th2 = this.e;
                if (th2 != null) {
                    throw AbstractC2353d.d(th2);
                }
                if (zIsEmpty) {
                    return false;
                }
            }
            if (!zIsEmpty) {
                return true;
            }
            try {
                this.f19412b.lock();
                while (!this.f19413d && this.f19411a.isEmpty() && !a()) {
                    try {
                        this.c.await();
                    } catch (Throwable th3) {
                        this.f19412b.unlock();
                        throw th3;
                    }
                }
                this.f19412b.unlock();
            } catch (InterruptedException e) {
                EnumC1604b.a(this);
                b();
                throw AbstractC2353d.d(e);
            }
        }
        Throwable th4 = this.e;
        if (th4 == null) {
            return false;
        }
        throw AbstractC2353d.d(th4);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            return this.f19411a.poll();
        }
        throw new NoSuchElementException();
    }

    @Override // ch.r
    public final void onComplete() {
        this.f19413d = true;
        b();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.e = th2;
        this.f19413d = true;
        b();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f19411a.offer(obj);
        b();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this, interfaceC1486b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
