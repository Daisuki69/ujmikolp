package gf;

import com.google.firebase.messaging.r;
import df.C1356B;
import df.C1364f;
import df.C1365g;
import hf.InterfaceC1565c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1364f f16835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f16836b;
    public final C1356B c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mg.c f16837d;
    public final i e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1365g f16838g;
    public d h;
    public e i;
    public r j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16839k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16840l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16841n;

    public k(C1364f c1364f, C1356B c1356b) {
        i iVar = new i(this, 0);
        this.e = iVar;
        this.f16835a = c1364f;
        M2.b.c.getClass();
        this.f16836b = (f) c1364f.f16430p.f11391b;
        this.c = c1356b;
        c1364f.f.getClass();
        this.f16837d = mg.c.c;
        long j = c1364f.f16435u;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iVar.b(j);
    }

    public final IOException a(r rVar, boolean z4, boolean z5, IOException iOException) {
        boolean z8;
        synchronized (this.f16836b) {
            try {
                r rVar2 = this.j;
                if (rVar != rVar2) {
                    return iOException;
                }
                boolean z9 = true;
                if (z4) {
                    z8 = !this.f16839k;
                    this.f16839k = true;
                } else {
                    z8 = false;
                }
                if (z5) {
                    if (!this.f16840l) {
                        z8 = true;
                    }
                    this.f16840l = true;
                }
                if (this.f16839k && this.f16840l && z8) {
                    ((InterfaceC1565c) rVar2.e).connection().m++;
                    this.j = null;
                } else {
                    z9 = false;
                }
                return z9 ? c(iOException, false) : iOException;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final IOException b(IOException iOException) {
        synchronized (this.f16836b) {
            this.f16841n = true;
        }
        return c(iOException, false);
    }

    public final IOException c(IOException iOException, boolean z4) {
        e eVar;
        Socket socketF;
        boolean z5;
        synchronized (this.f16836b) {
            if (z4) {
                try {
                    if (this.j != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            eVar = this.i;
            socketF = (eVar != null && this.j == null && (z4 || this.f16841n)) ? f() : null;
            if (this.i != null) {
                eVar = null;
            }
            z5 = this.f16841n && this.j == null;
        }
        ef.c.i(socketF);
        if (eVar != null) {
            this.f16837d.getClass();
        }
        if (z5) {
            boolean z8 = iOException != null;
            if (this.e.l()) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                if (iOException != null) {
                    interruptedIOException.initCause(iOException);
                }
                iOException = interruptedIOException;
            }
            if (z8) {
                this.f16837d.getClass();
                return iOException;
            }
            this.f16837d.getClass();
        }
        return iOException;
    }

    public final void d() {
        synchronized (this.f16836b) {
            try {
                if (this.f16841n) {
                    throw new IllegalStateException();
                }
                this.j = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        boolean z4;
        synchronized (this.f16836b) {
            z4 = this.m;
        }
        return z4;
    }

    public final Socket f() {
        int size = this.i.f16820p.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (((Reference) this.i.f16820p.get(i)).get() == this) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.i;
        eVar.f16820p.remove(i);
        this.i = null;
        if (!eVar.f16820p.isEmpty()) {
            return null;
        }
        eVar.f16821q = System.nanoTime();
        f fVar = this.f16836b;
        fVar.getClass();
        ThreadPoolExecutor threadPoolExecutor = f.f16822g;
        if (eVar.f16816k || fVar.f16823a == 0) {
            fVar.f16825d.remove(eVar);
            return eVar.e;
        }
        fVar.notifyAll();
        return null;
    }
}
