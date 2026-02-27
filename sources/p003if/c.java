package p003if;

import com.dynatrace.android.agent.Global;
import dOYHB6.tiZVw8.numX49;
import df.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import of.e;
import of.n;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC1601a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f17137d;
    public long e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f17138g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, z zVar) {
        super(gVar);
        this.f17138g = gVar;
        this.e = -1L;
        this.f = true;
        this.f17137d = zVar;
    }

    @Override // p003if.AbstractC1601a, of.s
    public final long a(long j, e eVar) throws IOException {
        e eVar2;
        long j6;
        byte bZ;
        String strTnTj78 = numX49.tnTj78("bShZ");
        if (this.f17134b) {
            throw new IllegalStateException(numX49.tnTj78("bShB"));
        }
        long j7 = -1;
        if (!this.f) {
            return -1L;
        }
        long j9 = this.e;
        g gVar = this.f17138g;
        if (j9 == 0 || j9 == -1) {
            if (j9 != -1) {
                gVar.c.g(Long.MAX_VALUE);
            }
            try {
                n nVar = gVar.c;
                nVar.k(1L);
                int i = 0;
                while (true) {
                    int i4 = i + 1;
                    boolean zF = nVar.f(i4);
                    eVar2 = nVar.f18833a;
                    if (!zF) {
                        j6 = j7;
                        break;
                    }
                    j6 = j7;
                    bZ = eVar2.z(i);
                    if ((bZ < 48 || bZ > 57) && ((bZ < 97 || bZ > 102) && (bZ < 65 || bZ > 70))) {
                        break;
                    }
                    j7 = j6;
                    i = i4;
                }
                if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bZ)));
                }
                this.e = eVar2.m();
                String strTrim = gVar.c.g(Long.MAX_VALUE).trim();
                if (this.e < 0 || !(strTrim.isEmpty() || strTrim.startsWith(Global.SEMICOLON))) {
                    throw new ProtocolException(strTnTj78 + this.e + strTrim + "\"");
                }
                if (this.e == 0) {
                    this.f = false;
                    hf.e.d(gVar.f17143a.h, this.f17137d, gVar.h());
                    b();
                }
                if (!this.f) {
                    return j6;
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        } else {
            j6 = -1;
        }
        long jA = super.a(Math.min(8192L, this.e), eVar);
        if (jA != j6) {
            this.e -= jA;
            return jA;
        }
        gVar.f17144b.k();
        ProtocolException protocolException = new ProtocolException(numX49.tnTj78("bShk"));
        b();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zO;
        if (this.f17134b) {
            return;
        }
        if (this.f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zO = ef.c.o(this, 100);
            } catch (IOException unused) {
                zO = false;
            }
            if (!zO) {
                this.f17138g.f17144b.k();
                b();
            }
        }
        this.f17134b = true;
    }
}
