package vh;

import hh.InterfaceC1568a;
import hh.InterfaceC1573f;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: vh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2351b extends CountDownLatch implements InterfaceC1573f, InterfaceC1568a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f20498a;

    @Override // hh.InterfaceC1573f
    public final void accept(Object obj) {
        this.f20498a = (Throwable) obj;
        countDown();
    }

    @Override // hh.InterfaceC1568a
    public final void run() {
        countDown();
    }
}
