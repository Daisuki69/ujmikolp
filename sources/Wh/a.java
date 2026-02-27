package Wh;

import ch.r;
import fh.InterfaceC1486b;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicBoolean implements InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f6435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f6436b;

    public a(r rVar, b bVar) {
        this.f6435a = rVar;
        this.f6436b = bVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.f6436b.d(this);
        }
    }
}
