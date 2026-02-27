package Uh;

import Ah.j;
import Qh.f;
import Qh.g;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a[] f5974g = new a[0];
    public static final a[] h = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f5975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f5976b;
    public final Lock c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lock f5977d;
    public final AtomicReference e;
    public long f;

    public b(U5.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock.readLock();
        this.f5977d = reentrantReadWriteLock.writeLock();
        this.f5976b = new AtomicReference(f5974g);
        this.f5975a = new AtomicReference(aVar);
        this.e = new AtomicReference();
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (this.e.get() != null) {
            bVar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ah.h
    public final void h(j jVar) {
        a aVar = new a(jVar, this);
        jVar.a(aVar);
        while (true) {
            AtomicReference atomicReference = this.f5976b;
            a[] aVarArr = (a[]) atomicReference.get();
            if (aVarArr == h) {
                Throwable th2 = (Throwable) this.e.get();
                if (th2 == Qh.e.f5385a) {
                    jVar.onComplete();
                    return;
                } else {
                    jVar.onError(th2);
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.f5973g) {
                j(aVar);
                return;
            }
            if (aVar.f5973g) {
                return;
            }
            synchronized (aVar) {
                try {
                    if (aVar.f5973g) {
                        return;
                    }
                    if (aVar.c) {
                        return;
                    }
                    b bVar = aVar.f5971b;
                    Lock lock = bVar.c;
                    lock.lock();
                    aVar.h = bVar.f;
                    Object obj = bVar.f5975a.get();
                    lock.unlock();
                    aVar.f5972d = obj != null;
                    aVar.c = true;
                    if (obj == null || aVar.test(obj)) {
                        return;
                    }
                    aVar.a();
                    return;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference atomicReference = this.f5976b;
            a[] aVarArr2 = (a[]) atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (aVarArr2[i] == aVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                aVarArr = f5974g;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i);
                System.arraycopy(aVarArr2, i + 1, aVarArr3, i, (length - i) - 1);
                aVarArr = aVarArr3;
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // Ah.j
    public final void onComplete() {
        AtomicReference atomicReference = this.e;
        Qh.d dVar = Qh.e.f5385a;
        while (!atomicReference.compareAndSet(null, dVar)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        g gVar = g.f5387a;
        Lock lock = this.f5977d;
        lock.lock();
        this.f++;
        this.f5975a.lazySet(gVar);
        lock.unlock();
        for (a aVar : (a[]) this.f5976b.getAndSet(h)) {
            aVar.b(this.f, gVar);
        }
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        if (th2 == null) {
            throw Qh.e.b("onError called with a null Throwable.");
        }
        Qh.d dVar = Qh.e.f5385a;
        AtomicReference atomicReference = this.e;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                E1.c.k(th2);
                return;
            }
        }
        f fVar = new f(th2);
        Lock lock = this.f5977d;
        lock.lock();
        this.f++;
        this.f5975a.lazySet(fVar);
        lock.unlock();
        for (a aVar : (a[]) this.f5976b.getAndSet(h)) {
            aVar.b(this.f, fVar);
        }
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        if (obj == null) {
            throw Qh.e.b("onNext called with a null value.");
        }
        Qh.d dVar = Qh.e.f5385a;
        if (this.e.get() != null) {
            return;
        }
        Lock lock = this.f5977d;
        lock.lock();
        this.f++;
        this.f5975a.lazySet(obj);
        lock.unlock();
        for (a aVar : (a[]) this.f5976b.get()) {
            aVar.b(this.f, obj);
        }
    }
}
