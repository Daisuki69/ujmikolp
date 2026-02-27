package ph;

import fh.InterfaceC1486b;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class T1 extends AtomicInteger implements InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X1 f19344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19345b;
    public Serializable c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f19346d;

    public T1(X1 x12, ch.r rVar) {
        this.f19344a = x12;
        this.f19345b = rVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f19346d) {
            return;
        }
        this.f19346d = true;
        this.f19344a.a(this);
        this.c = null;
    }
}
