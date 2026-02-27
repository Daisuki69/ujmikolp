package df;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class u {
    public static final u e;
    public static final u f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16490b;
    public final String[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f16491d;

    static {
        s sVar = s.f16482q;
        s sVar2 = s.f16483r;
        s sVar3 = s.f16484s;
        s sVar4 = s.f16477k;
        s sVar5 = s.m;
        s sVar6 = s.f16478l;
        s sVar7 = s.f16479n;
        s sVar8 = s.f16481p;
        s sVar9 = s.f16480o;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9};
        s[] sVarArr2 = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, s.i, s.j, s.f16476g, s.h, s.e, s.f, s.f16475d};
        t tVar = new t(true);
        tVar.a(sVarArr);
        EnumC1358D enumC1358D = EnumC1358D.TLS_1_3;
        EnumC1358D enumC1358D2 = EnumC1358D.TLS_1_2;
        tVar.b(enumC1358D, enumC1358D2);
        if (!tVar.f16486a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        tVar.f16488d = true;
        new u(tVar);
        t tVar2 = new t(true);
        tVar2.a(sVarArr2);
        tVar2.b(enumC1358D, enumC1358D2);
        if (!tVar2.f16486a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        tVar2.f16488d = true;
        e = new u(tVar2);
        t tVar3 = new t(true);
        tVar3.a(sVarArr2);
        tVar3.b(enumC1358D, enumC1358D2, EnumC1358D.TLS_1_1, EnumC1358D.TLS_1_0);
        if (!tVar3.f16486a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        tVar3.f16488d = true;
        new u(tVar3);
        f = new u(new t(false));
    }

    public u(t tVar) {
        this.f16489a = tVar.f16486a;
        this.c = tVar.f16487b;
        this.f16491d = tVar.c;
        this.f16490b = tVar.f16488d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f16489a) {
            return false;
        }
        String[] strArr = this.f16491d;
        if (strArr != null) {
            if (!ef.c.p(strArr, sSLSocket.getEnabledProtocols(), ef.c.h)) {
                return false;
            }
        }
        String[] strArr2 = this.c;
        if (strArr2 != null) {
            return ef.c.p(strArr2, sSLSocket.getEnabledCipherSuites(), s.f16474b);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        u uVar = (u) obj;
        boolean z4 = uVar.f16489a;
        boolean z5 = this.f16489a;
        if (z5 != z4) {
            return false;
        }
        if (z5) {
            return Arrays.equals(this.c, uVar.c) && Arrays.equals(this.f16491d, uVar.f16491d) && this.f16490b == uVar.f16490b;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f16489a) {
            return ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.f16491d)) * 31) + (!this.f16490b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        if (!this.f16489a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        List listUnmodifiableList2 = null;
        String[] strArr = this.c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(s.a(str));
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        } else {
            listUnmodifiableList = null;
        }
        sb2.append(Objects.toString(listUnmodifiableList, "[all enabled]"));
        sb2.append(", tlsVersions=");
        String[] strArr2 = this.f16491d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(EnumC1358D.a(str2));
            }
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        }
        sb2.append(Objects.toString(listUnmodifiableList2, "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return We.s.s(sb2, this.f16490b, ")");
    }
}
