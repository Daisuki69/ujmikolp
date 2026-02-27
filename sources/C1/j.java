package c1;

import aj.InterfaceC0716a;
import com.paymaya.domain.store.L;
import j1.C1659g;
import j1.InterfaceC1656d;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC0716a f9232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d3.c f9233b;
    public InterfaceC0716a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public L f9234d;
    public InterfaceC0716a e;
    public InterfaceC0716a f;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((C1659g) ((InterfaceC1656d) this.e.get())).close();
    }
}
