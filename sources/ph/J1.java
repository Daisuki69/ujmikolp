package ph;

import fh.InterfaceC1486b;
import hh.InterfaceC1573f;
import ih.EnumC1604b;
import ih.InterfaceC1606d;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class J1 extends AtomicReference implements Runnable, InterfaceC1573f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L1 f19232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19233b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19234d;

    public J1(L1 l12) {
        this.f19232a = l12;
    }

    @Override // hh.InterfaceC1573f
    public final void accept(Object obj) {
        InterfaceC1486b interfaceC1486b = (InterfaceC1486b) obj;
        EnumC1604b.c(this, interfaceC1486b);
        synchronized (this.f19232a) {
            try {
                if (this.f19234d) {
                    ((InterfaceC1606d) this.f19232a.f19259a).a(interfaceC1486b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19232a.e(this);
    }
}
