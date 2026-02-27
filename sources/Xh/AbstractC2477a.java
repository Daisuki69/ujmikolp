package xh;

import Xh.i;
import ch.r;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: xh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC2477a implements r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f20995a = new AtomicReference();

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this.f20995a);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        AtomicReference atomicReference = this.f20995a;
        Class<?> cls = getClass();
        jh.e.b(interfaceC1486b, "next is null");
        while (!atomicReference.compareAndSet(null, interfaceC1486b)) {
            if (atomicReference.get() != null) {
                interfaceC1486b.dispose();
                if (atomicReference.get() != EnumC1604b.f17147a) {
                    i.A(cls);
                    return;
                }
                return;
            }
        }
    }
}
