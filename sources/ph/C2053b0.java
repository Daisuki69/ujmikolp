package ph;

import ch.InterfaceC1106e;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ph.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2053b0 extends AtomicReference implements InterfaceC1106e, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19414a;

    public C2053b0(ch.r rVar) {
        this.f19414a = rVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return androidx.media3.datasource.cache.c.l(C2053b0.class.getSimpleName(), "{", super.toString(), "}");
    }
}
