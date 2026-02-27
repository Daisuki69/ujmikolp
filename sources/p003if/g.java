package p003if;

import F.i;
import M2.b;
import com.paymaya.domain.store.L;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import df.C1364f;
import df.C1365g;
import df.EnumC1355A;
import df.j;
import df.k;
import df.x;
import df.y;
import df.z;
import ef.c;
import gf.e;
import hf.InterfaceC1565c;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;
import of.m;
import of.n;
import of.r;
import of.s;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements InterfaceC1565c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1364f f17143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f17144b;
    public final n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f17145d;
    public int e = 0;
    public long f = 262144;

    public g(C1364f c1364f, e eVar, n nVar, m mVar) {
        this.f17143a = c1364f;
        this.f17144b = eVar;
        this.c = nVar;
        this.f17145d = mVar;
    }

    @Override // hf.InterfaceC1565c
    public final long a(k kVar) {
        if (!hf.e.e(kVar)) {
            return 0L;
        }
        if (numX49.tnTj78("bShj").equalsIgnoreCase(kVar.b(numX49.tnTj78("bShS")))) {
            return -1L;
        }
        return hf.e.c(kVar);
    }

    @Override // hf.InterfaceC1565c
    public final void b() {
        this.f17145d.flush();
    }

    @Override // hf.InterfaceC1565c
    public final void c() {
        this.f17145d.flush();
    }

    @Override // hf.InterfaceC1565c
    public final void cancel() {
        e eVar = this.f17144b;
        if (eVar != null) {
            c.i(eVar.f16814d);
        }
    }

    @Override // hf.InterfaceC1565c
    public final e connection() {
        return this.f17144b;
    }

    @Override // hf.InterfaceC1565c
    public final j d(boolean z4) {
        String strTnTj78;
        int i = this.e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException(numX49.tnTj78("bShQ") + this.e);
        }
        y yVar = null;
        try {
            String strG = this.c.g(this.f);
            this.f -= (long) strG.length();
            i iVarC = i.c(strG);
            int i4 = iVarC.c;
            j jVar = new j();
            jVar.f = (EnumC1355A) iVarC.f1503b;
            jVar.f16445b = i4;
            jVar.f16444a = (String) iVarC.f1504d;
            jVar.h = h().a();
            if (z4 && i4 == 100) {
                return null;
            }
            if (i4 == 100) {
                this.e = 3;
                return jVar;
            }
            this.e = 4;
            return jVar;
        } catch (EOFException e) {
            e eVar = this.f17144b;
            if (eVar != null) {
                z zVar = eVar.c.f16395a.f16458a;
                zVar.getClass();
                String strTnTj782 = numX49.tnTj78("bSht");
                try {
                    y yVar2 = new y();
                    yVar2.b(zVar, strTnTj782);
                    yVar = yVar2;
                } catch (IllegalArgumentException unused) {
                }
                yVar.getClass();
                yVar.f16503b = z.c(numX49.tnTj78("bShU"), 0, 0, numX49.tnTj78("bShe"), false, false, false, true);
                yVar.c = z.c(numX49.tnTj78("bSh8"), 0, 0, numX49.tnTj78("bShC"), false, false, false, true);
                strTnTj78 = yVar.a().h;
            } else {
                strTnTj78 = numX49.tnTj78("bSh4");
            }
            throw new IOException(AbstractC1414e.h(numX49.tnTj78("bSho"), strTnTj78), e);
        }
    }

    @Override // hf.InterfaceC1565c
    public final r e(C1365g c1365g, long j) {
        df.i iVar = c1365g.f16441d;
        boolean zEqualsIgnoreCase = numX49.tnTj78("bShw").equalsIgnoreCase(c1365g.c.g(numX49.tnTj78("bShK")));
        String strTnTj78 = numX49.tnTj78("bShc");
        if (zEqualsIgnoreCase) {
            if (this.e == 1) {
                this.e = 2;
                return new b(this);
            }
            throw new IllegalStateException(strTnTj78 + this.e);
        }
        if (j == -1) {
            throw new IllegalStateException(numX49.tnTj78("bShm"));
        }
        if (this.e == 1) {
            this.e = 2;
            return new e(this);
        }
        throw new IllegalStateException(strTnTj78 + this.e);
    }

    public final d f(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new d(this, j);
        }
        throw new IllegalStateException(numX49.tnTj78("bShD") + this.e);
    }

    public final void g(x xVar, String str) {
        if (this.e != 0) {
            throw new IllegalStateException(numX49.tnTj78("bShN") + this.e);
        }
        m mVar = this.f17145d;
        mVar.a(str);
        String strTnTj78 = numX49.tnTj78("bShh");
        mVar.a(strTnTj78);
        int iE = xVar.e();
        for (int i = 0; i < iE; i++) {
            mVar.a(xVar.b(i));
            mVar.a(numX49.tnTj78("bShM"));
            mVar.a(xVar.f(i));
            mVar.a(strTnTj78);
        }
        mVar.a(strTnTj78);
        this.e = 1;
    }

    public final x h() throws EOFException {
        L l6 = new L(6);
        while (true) {
            String strG = this.c.g(this.f);
            this.f -= (long) strG.length();
            if (strG.length() == 0) {
                return new x(l6);
            }
            b.c.getClass();
            String strTnTj78 = numX49.tnTj78("bSh6");
            int iIndexOf = strG.indexOf(strTnTj78, 1);
            ArrayList arrayList = (ArrayList) l6.f11367b;
            if (iIndexOf != -1) {
                String strSubstring = strG.substring(0, iIndexOf);
                String strSubstring2 = strG.substring(iIndexOf + 1);
                arrayList.add(strSubstring);
                arrayList.add(strSubstring2.trim());
            } else {
                boolean zStartsWith = strG.startsWith(strTnTj78);
                String strTnTj782 = numX49.tnTj78("bSha");
                if (zStartsWith) {
                    String strSubstring3 = strG.substring(1);
                    arrayList.add(strTnTj782);
                    arrayList.add(strSubstring3.trim());
                } else {
                    arrayList.add(strTnTj782);
                    arrayList.add(strG.trim());
                }
            }
        }
    }

    @Override // hf.InterfaceC1565c
    public final void b(C1365g c1365g) {
        Proxy.Type type = this.f17144b.c.f16396b.type();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c1365g.f16440b);
        sb2.append(' ');
        z zVar = c1365g.f16439a;
        if (zVar.f16506a.equals(numX49.tnTj78("bShd")) || type != Proxy.Type.HTTP) {
            int length = zVar.f16506a.length() + 3;
            String str = zVar.h;
            int iIndexOf = str.indexOf(47, length);
            String strSubstring = str.substring(iIndexOf, c.b(iIndexOf, str.length(), str, numX49.tnTj78("bShi")));
            String strI = zVar.i();
            if (strI != null) {
                strSubstring = strSubstring + '?' + strI;
            }
            sb2.append(strSubstring);
        } else {
            sb2.append(zVar);
        }
        sb2.append(numX49.tnTj78("bShE"));
        g(c1365g.c, sb2.toString());
    }

    @Override // hf.InterfaceC1565c
    public final s c(k kVar) {
        if (!hf.e.e(kVar)) {
            return f(0L);
        }
        boolean zEqualsIgnoreCase = numX49.tnTj78("bShH").equalsIgnoreCase(kVar.b(numX49.tnTj78("bShF")));
        String strTnTj78 = numX49.tnTj78("bShO");
        if (zEqualsIgnoreCase) {
            z zVar = kVar.f16450a.f16439a;
            if (this.e == 4) {
                this.e = 5;
                return new c(this, zVar);
            }
            throw new IllegalStateException(strTnTj78 + this.e);
        }
        long jC = hf.e.c(kVar);
        if (jC != -1) {
            return f(jC);
        }
        if (this.e == 4) {
            this.e = 5;
            this.f17144b.k();
            return new f(this);
        }
        throw new IllegalStateException(strTnTj78 + this.e);
    }
}
