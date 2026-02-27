package lh;

import ch.r;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import vh.C2356g;

/* JADX INFO: renamed from: lh.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1834e extends AtomicReference implements r, InterfaceC1486b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f18302b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f18303a;

    public C1834e(LinkedBlockingQueue linkedBlockingQueue) {
        this.f18303a = linkedBlockingQueue;
    }

    public final boolean a() {
        return get() == EnumC1604b.f17147a;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (EnumC1604b.a(this)) {
            this.f18303a.offer(f18302b);
        }
    }

    @Override // ch.r
    public final void onComplete() {
        this.f18303a.offer(vh.h.f20506a);
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f18303a.offer(new C2356g(th2));
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f18303a.offer(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this, interfaceC1486b);
    }
}
