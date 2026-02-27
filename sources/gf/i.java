package gf;

import com.google.firebase.messaging.r;
import hf.InterfaceC1565c;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import jf.l;
import jf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends of.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f16833l;

    public /* synthetic */ i(Object obj, int i) {
        this.f16832k = i;
        this.f16833l = obj;
    }

    private final void n() {
        ((t) this.f16833l).b(6);
        jf.k kVar = ((t) this.f16833l).f17798d;
        synchronized (kVar) {
            try {
                long j = kVar.m;
                long j6 = kVar.f17765l;
                if (j < j6) {
                    return;
                }
                kVar.f17765l = j6 + 1;
                kVar.f17766n = System.nanoTime() + 1000000000;
                try {
                    kVar.h.execute(new l(kVar, new Object[]{kVar.f17762d}));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // of.d
    public IOException h(IOException iOException) {
        switch (this.f16832k) {
            case 1:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            case 2:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
            default:
                return super.h(iOException);
        }
    }

    @Override // of.d
    public final void m() {
        r rVar;
        e eVar;
        switch (this.f16832k) {
            case 0:
                k kVar = (k) this.f16833l;
                synchronized (kVar.f16836b) {
                    kVar.m = true;
                    rVar = kVar.j;
                    d dVar = kVar.h;
                    if (dVar == null || (eVar = dVar.f16812g) == null) {
                        eVar = kVar.i;
                    }
                    break;
                }
                if (rVar != null) {
                    ((InterfaceC1565c) rVar.e).cancel();
                    return;
                } else {
                    if (eVar != null) {
                        ef.c.i(eVar.f16814d);
                        return;
                    }
                    return;
                }
            case 1:
                n();
                return;
            default:
                Socket socket = (Socket) this.f16833l;
                try {
                    socket.close();
                    return;
                } catch (AssertionError e) {
                    if (e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed")) {
                        throw e;
                    }
                    of.k.f18829a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                    return;
                } catch (Exception e7) {
                    of.k.f18829a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e7);
                    return;
                }
        }
    }

    public void o() throws IOException {
        if (l()) {
            throw h(null);
        }
    }
}
