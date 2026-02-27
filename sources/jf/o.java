package jf;

import com.paymaya.domain.store.L;
import df.C1364f;
import df.C1365g;
import df.EnumC1355A;
import df.x;
import df.z;
import hf.C1564b;
import hf.InterfaceC1565c;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import of.C1976a;
import okhttp3.internal.http2.Header;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements InterfaceC1565c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f17780g;
    public static final List h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1564b f17781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gf.e f17782b;
    public final k c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile t f17783d;
    public final EnumC1355A e;
    public volatile boolean f;

    static {
        String[] strArr = {"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8};
        byte[] bArr = ef.c.f16663a;
        f17780g = Collections.unmodifiableList(Arrays.asList((Object[]) strArr.clone()));
        h = Collections.unmodifiableList(Arrays.asList((Object[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"}.clone()));
    }

    public o(C1364f c1364f, gf.e eVar, C1564b c1564b, k kVar) {
        this.f17782b = eVar;
        this.f17781a = c1564b;
        this.c = kVar;
        List list = c1364f.f16423b;
        EnumC1355A enumC1355A = EnumC1355A.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(enumC1355A) ? enumC1355A : EnumC1355A.HTTP_2;
    }

    @Override // hf.InterfaceC1565c
    public final long a(df.k kVar) {
        return hf.e.c(kVar);
    }

    @Override // hf.InterfaceC1565c
    public final void b() {
        this.c.flush();
    }

    @Override // hf.InterfaceC1565c
    public final void c() throws IOException {
        this.f17783d.g().close();
    }

    @Override // hf.InterfaceC1565c
    public final void cancel() {
        this.f = true;
        if (this.f17783d != null) {
            this.f17783d.b(6);
        }
    }

    @Override // hf.InterfaceC1565c
    public final gf.e connection() {
        return this.f17782b;
    }

    @Override // hf.InterfaceC1565c
    public final df.j d(boolean z4) throws IOException {
        x xVar;
        t tVar = this.f17783d;
        synchronized (tVar) {
            tVar.i.k();
            while (tVar.e.isEmpty() && tVar.f17800k == 0) {
                try {
                    tVar.j();
                } catch (Throwable th2) {
                    tVar.i.o();
                    throw th2;
                }
            }
            tVar.i.o();
            if (tVar.e.isEmpty()) {
                IOException iOException = tVar.f17801l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new com.tencent.cloud.ai.network.okhttp3.internal.http2.v(tVar.f17800k);
            }
            xVar = (x) tVar.e.removeFirst();
        }
        EnumC1355A enumC1355A = this.e;
        ArrayList arrayList = new ArrayList(20);
        int iE = xVar.e();
        F.i iVarC = null;
        for (int i = 0; i < iE; i++) {
            String strB = xVar.b(i);
            String strF = xVar.f(i);
            if (strB.equals(Header.RESPONSE_STATUS_UTF8)) {
                iVarC = F.i.c("HTTP/1.1 " + strF);
            } else if (!h.contains(strB)) {
                M2.b.c.getClass();
                arrayList.add(strB);
                arrayList.add(strF.trim());
            }
        }
        if (iVarC == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        df.j jVar = new df.j();
        jVar.f = enumC1355A;
        jVar.f16445b = iVarC.c;
        jVar.f16444a = (String) iVarC.f1504d;
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        L l6 = new L(6);
        Collections.addAll((ArrayList) l6.f11367b, strArr);
        jVar.h = l6;
        if (z4) {
            M2.b.c.getClass();
            if (jVar.f16445b == 100) {
                return null;
            }
        }
        return jVar;
    }

    @Override // hf.InterfaceC1565c
    public final of.r e(C1365g c1365g, long j) {
        return this.f17783d.g();
    }

    @Override // hf.InterfaceC1565c
    public final void b(C1365g c1365g) throws IOException {
        int i;
        t tVar;
        if (this.f17783d != null) {
            return;
        }
        boolean z4 = true;
        boolean z5 = c1365g.f16441d != null;
        x xVar = c1365g.c;
        ArrayList arrayList = new ArrayList(xVar.e() + 4);
        arrayList.add(new a(a.f, C1976a.d(c1365g.f16440b)));
        C1976a c1976a = a.f17738g;
        z zVar = c1365g.f16439a;
        int length = zVar.f16506a.length() + 3;
        String str = zVar.h;
        int iIndexOf = str.indexOf(47, length);
        String strSubstring = str.substring(iIndexOf, ef.c.b(iIndexOf, str.length(), str, "?#"));
        String strI = zVar.i();
        if (strI != null) {
            strSubstring = strSubstring + '?' + strI;
        }
        arrayList.add(new a(c1976a, C1976a.d(strSubstring)));
        String strG = c1365g.c.g("Host");
        if (strG != null) {
            arrayList.add(new a(a.i, C1976a.d(strG)));
        }
        arrayList.add(new a(a.h, C1976a.d(c1365g.f16439a.f16506a)));
        int iE = xVar.e();
        for (int i4 = 0; i4 < iE; i4++) {
            String lowerCase = xVar.b(i4).toLowerCase(Locale.US);
            if (!f17780g.contains(lowerCase) || (lowerCase.equals("te") && xVar.f(i4).equals("trailers"))) {
                arrayList.add(new a(lowerCase, xVar.f(i4)));
            }
        }
        k kVar = this.c;
        boolean z8 = !z5;
        synchronized (kVar.f17772t) {
            synchronized (kVar) {
                try {
                    if (kVar.f > 1073741823) {
                        kVar.b(5);
                    }
                    if (kVar.f17763g) {
                        throw new com.tencent.cloud.ai.network.okhttp3.internal.http2.a();
                    }
                    i = kVar.f;
                    kVar.f = i + 2;
                    tVar = new t(i, kVar, z8, false, null);
                    if (z5 && kVar.f17768p != 0 && tVar.f17797b != 0) {
                        z4 = false;
                    }
                    if (tVar.i()) {
                        kVar.c.put(Integer.valueOf(i), tVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            kVar.f17772t.m(arrayList, i, z8);
        }
        if (z4) {
            u uVar = kVar.f17772t;
            synchronized (uVar) {
                if (uVar.e) {
                    throw new IOException("closed");
                }
                uVar.f17803a.flush();
            }
        }
        this.f17783d = tVar;
        if (this.f) {
            this.f17783d.b(6);
            throw new IOException("Canceled");
        }
        gf.i iVar = this.f17783d.i;
        long j = this.f17781a.h;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iVar.b(j);
        this.f17783d.j.b(this.f17781a.i);
    }

    @Override // hf.InterfaceC1565c
    public final of.s c(df.k kVar) {
        return this.f17783d.f17799g;
    }
}
