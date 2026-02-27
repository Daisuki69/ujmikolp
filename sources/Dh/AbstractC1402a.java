package dh;

import C.h;
import android.os.Looper;
import eh.AbstractC1443b;
import eh.e;
import fh.InterfaceC1486b;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: dh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1402a implements InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f16510a = new AtomicBoolean();

    public abstract void a();

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f16510a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a();
                return;
            }
            e eVar = AbstractC1443b.f16674a;
            if (eVar == null) {
                throw new NullPointerException("scheduler == null");
            }
            eVar.d(new h(this, 18));
        }
    }
}
