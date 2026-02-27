package ff;

import We.s;
import Y.e;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import bg.AbstractC0983W;
import com.google.firebase.messaging.p;
import com.google.firebase.messaging.r;
import com.tencent.cloud.ai.network.okhttp3.internal.connection.h;
import df.C1364f;
import df.C1365g;
import df.C1366h;
import df.EnumC1355A;
import df.InterfaceC1360b;
import df.InterfaceC1361c;
import df.i;
import df.j;
import df.k;
import df.q;
import ef.c;
import gf.C1519b;
import gf.C1520c;
import gf.d;
import hf.C1564b;
import hf.InterfaceC1565c;
import hf.f;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.util.logging.Logger;
import jk.b;
import of.m;
import of.n;

/* JADX INFO: renamed from: ff.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1483a implements InterfaceC1361c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16755a;

    public /* synthetic */ C1483a(int i) {
        this.f16755a = i;
    }

    @Override // df.InterfaceC1361c
    public final k intercept(InterfaceC1360b interfaceC1360b) throws Throwable {
        i iVar;
        j jVarD;
        j jVarD2 = null;
        switch (this.f16755a) {
            case 0:
                System.currentTimeMillis();
                C1564b c1564b = (C1564b) interfaceC1360b;
                C1365g c1365g = c1564b.e;
                p pVar = new p(c1365g, 8);
                if (c1365g != null) {
                    q qVarA = c1365g.f;
                    if (qVarA == null) {
                        qVarA = q.a(c1365g.c);
                        c1365g.f = qVarA;
                    }
                    if (qVarA.j) {
                        pVar = new p(null, 8);
                    }
                }
                C1365g c1365g2 = (C1365g) pVar.f9799b;
                if (c1365g2 == null) {
                    j jVar = new j();
                    jVar.e = c1564b.e;
                    jVar.f = EnumC1355A.HTTP_1_1;
                    jVar.f16445b = TypedValues.PositionType.TYPE_PERCENT_HEIGHT;
                    jVar.f16444a = "Unsatisfiable Request (only-if-cached)";
                    jVar.i = c.c;
                    jVar.c = -1L;
                    jVar.f16446d = System.currentTimeMillis();
                    return jVar.a();
                }
                c1365g2.getClass();
                k kVarA = c1564b.a(c1365g2);
                j jVarC = kVarA.c();
                jVarC.f16448k = null;
                if (kVarA != null && kVarA.f16453g != null) {
                    j jVarC2 = kVarA.c();
                    jVarC2.i = null;
                    kVarA = jVarC2.a();
                }
                if (kVarA != null) {
                    if (kVarA.f16453g != null) {
                        throw new IllegalArgumentException("networkResponse".concat(".body != null"));
                    }
                    if (kVarA.h != null) {
                        throw new IllegalArgumentException("networkResponse".concat(".networkResponse != null"));
                    }
                    if (kVarA.i != null) {
                        throw new IllegalArgumentException("networkResponse".concat(".cacheResponse != null"));
                    }
                    if (kVarA.j != null) {
                        throw new IllegalArgumentException("networkResponse".concat(".priorResponse != null"));
                    }
                }
                jVarC.j = kVarA;
                return jVarC.a();
            case 1:
                C1564b c1564b2 = (C1564b) interfaceC1360b;
                C1365g c1365g3 = c1564b2.e;
                gf.k kVar = c1564b2.f17034b;
                boolean z4 = !c1365g3.f16440b.equals(ShareTarget.METHOD_GET);
                synchronized (kVar.f16836b) {
                    if (kVar.f16841n) {
                        throw new IllegalStateException("released");
                    }
                    if (kVar.j != null) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                    }
                }
                d dVar = kVar.h;
                C1364f c1364f = kVar.f16835a;
                dVar.getClass();
                C1564b c1564b3 = (C1564b) interfaceC1360b;
                int i = c1564b3.f17036g;
                int i4 = c1564b3.h;
                int i6 = c1564b3.i;
                c1364f.getClass();
                try {
                    InterfaceC1565c interfaceC1565cC = dVar.b(i, c1364f.f16434t, z4, i4, i6).c(c1364f, (C1564b) interfaceC1360b);
                    InetSocketAddress inetSocketAddress = interfaceC1565cC.connection().c.c;
                    if (inetSocketAddress != null) {
                        b.f17824a.q("socketAddress:" + inetSocketAddress);
                    }
                    r rVar = new r(kVar, kVar.f16837d, kVar.h, interfaceC1565cC, 18);
                    synchronized (kVar.f16836b) {
                        kVar.j = rVar;
                        kVar.f16839k = false;
                        kVar.f16840l = false;
                        break;
                    }
                    return c1564b2.b(c1365g3, kVar, rVar);
                } catch (h e) {
                    dVar.e();
                    throw e;
                } catch (IOException e7) {
                    dVar.e();
                    throw new h(e7);
                }
            default:
                C1564b c1564b4 = (C1564b) interfaceC1360b;
                r rVar2 = c1564b4.c;
                if (rVar2 == null) {
                    throw new IllegalStateException();
                }
                InterfaceC1565c interfaceC1565c = (InterfaceC1565c) rVar2.e;
                C1365g c1365g4 = c1564b4.e;
                long jCurrentTimeMillis = System.currentTimeMillis();
                mg.c cVar = (mg.c) rVar2.c;
                try {
                    if (cVar == null) {
                        throw null;
                    }
                    interfaceC1565c.b(c1365g4);
                    boolean zB = AbstractC0983W.b(c1365g4.f16440b);
                    e eVar = b.f17824a;
                    gf.k kVar2 = (gf.k) rVar2.f9803b;
                    if (!zB || (iVar = c1365g4.f16441d) == null) {
                        kVar2.a(rVar2, true, false, null);
                    } else {
                        if ("100-continue".equalsIgnoreCase(c1365g4.c.g("Expect"))) {
                            try {
                                interfaceC1565c.b();
                                jVarD = rVar2.d(true);
                            } catch (IOException e10) {
                                rVar2.f(e10);
                                throw e10;
                            }
                        } else {
                            jVarD = null;
                        }
                        if (jVarD == null) {
                            long j = ((C1366h) iVar).f16443b;
                            cVar.getClass();
                            C1519b c1519b = new C1519b(rVar2, interfaceC1565c.e(c1365g4, j), j);
                            Logger logger = of.k.f18829a;
                            m mVar = new m(c1519b);
                            C1366h c1366h = (C1366h) iVar;
                            if (mVar.c) {
                                throw new IllegalStateException("closed");
                            }
                            of.e eVar2 = mVar.f18831a;
                            byte[] bArr = c1366h.c;
                            int i10 = c1366h.f16443b;
                            eVar2.k(i10, bArr);
                            mVar.g();
                            StringBuilder sb2 = new StringBuilder("current url: ");
                            sb2.append(c1365g4.f16439a);
                            sb2.append(" date size:");
                            sb2.append(i10);
                            eVar.q(sb2.toString());
                            mVar.close();
                        } else {
                            kVar2.a(rVar2, true, false, null);
                            if (interfaceC1565c.connection().h == null) {
                                interfaceC1565c.connection().k();
                            }
                        }
                        jVarD2 = jVarD;
                    }
                    try {
                        interfaceC1565c.c();
                        if (jVarD2 == null) {
                            jVarD2 = rVar2.d(false);
                        }
                        jVarD2.e = c1365g4;
                        jVarD2.f16447g = interfaceC1565c.connection().f;
                        jVarD2.c = jCurrentTimeMillis;
                        jVarD2.f16446d = System.currentTimeMillis();
                        k kVarA2 = jVarD2.a();
                        int i11 = kVarA2.c;
                        if (i11 == 100) {
                            j jVarD3 = rVar2.d(false);
                            jVarD3.e = c1365g4;
                            jVarD3.f16447g = interfaceC1565c.connection().f;
                            jVarD3.c = jCurrentTimeMillis;
                            jVarD3.f16446d = System.currentTimeMillis();
                            kVarA2 = jVarD3.a();
                            i11 = kVarA2.c;
                        }
                        j jVarC3 = kVarA2.c();
                        try {
                            String strB = kVarA2.b(RtspHeaders.CONTENT_TYPE);
                            long jA = interfaceC1565c.a(kVarA2);
                            C1520c c1520c = new C1520c(rVar2, interfaceC1565c.c(kVarA2), jA);
                            Logger logger2 = of.k.f18829a;
                            jVarC3.i = new f(strB, jA, new n(c1520c));
                            k kVarA3 = jVarC3.a();
                            if ("close".equalsIgnoreCase(kVarA3.f16450a.c.g(RtspHeaders.CONNECTION)) || "close".equalsIgnoreCase(kVarA3.b(RtspHeaders.CONNECTION))) {
                                interfaceC1565c.connection().k();
                            }
                            df.m mVar2 = kVarA3.f16453g;
                            if ((i11 == 204 || i11 == 205) && mVar2.c() > 0) {
                                StringBuilder sbT = s.t(i11, "HTTP ", " had non-zero Content-Length: ");
                                sbT.append(mVar2.c());
                                throw new ProtocolException(sbT.toString());
                            }
                            if (mVar2 != null) {
                                eVar.q("response size: " + mVar2.c());
                            }
                            return kVarA3;
                        } catch (IOException e11) {
                            rVar2.f(e11);
                            throw e11;
                        }
                    } catch (IOException e12) {
                        rVar2.f(e12);
                        throw e12;
                    }
                } catch (IOException e13) {
                    cVar.getClass();
                    rVar2.f(e13);
                    throw e13;
                }
        }
    }
}
