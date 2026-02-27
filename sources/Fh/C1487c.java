package fh;

import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: fh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1487c extends AtomicReference implements InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16759a = 1;

    public /* synthetic */ C1487c() {
    }

    public final boolean a() {
        switch (this.f16759a) {
            case 0:
                return get() == null;
            default:
                return EnumC1604b.b((InterfaceC1486b) get());
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        Object andSet;
        switch (this.f16759a) {
            case 0:
                if (get() != null && (andSet = getAndSet(null)) != null) {
                    ((Runnable) andSet).run();
                    break;
                }
                break;
            default:
                EnumC1604b.a(this);
                break;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f16759a) {
            case 0:
                return "RunnableDisposable(disposed=" + a() + ", " + get() + ")";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C1487c(Object obj) {
        super(obj);
    }
}
