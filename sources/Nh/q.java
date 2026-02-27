package Nh;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends AtomicReferenceArray implements Runnable, Callable, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f4478b = new Object();
    public static final Object c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f4479d = new Object();
    public static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f4480a;

    public q(Runnable runnable, Dh.c cVar) {
        super(3);
        this.f4480a = runnable;
        lazySet(0, cVar);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == e) {
                return;
            }
            if (obj == c) {
                future.cancel(false);
                return;
            } else if (obj == f4479d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = e;
            if (obj6 == obj || obj6 == (obj4 = c) || obj6 == (obj5 = f4479d)) {
                break;
            }
            boolean z4 = get(2) != Thread.currentThread();
            if (z4) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z4);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f4478b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((Dh.c) obj2).e(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3 = f4479d;
        Object obj4 = c;
        Object obj5 = f4478b;
        Object obj6 = e;
        lazySet(2, Thread.currentThread());
        try {
            this.f4480a.run();
            lazySet(2, null);
            Object obj7 = get(0);
            if (obj7 != obj5 && compareAndSet(0, obj7, obj6) && obj7 != null) {
                ((Dh.c) obj7).e(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3) {
                    return;
                }
            } while (!compareAndSet(1, obj2, obj6));
        } catch (Throwable th2) {
            try {
                E1.c.k(th2);
                throw th2;
            } catch (Throwable th3) {
                lazySet(2, null);
                Object obj8 = get(0);
                if (obj8 != obj5 && compareAndSet(0, obj8, obj6) && obj8 != null) {
                    ((Dh.c) obj8).e(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj4 || obj == obj3) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj6));
                throw th3;
            }
        }
    }
}
