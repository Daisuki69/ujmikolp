package gf;

import A7.l;
import df.s;
import df.u;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: gf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1518a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16801b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16802d;

    public C1518a(List list) {
        this.f16800a = 0;
        this.f16802d = list;
    }

    public u a(SSLSocket sSLSocket) throws UnknownServiceException {
        u uVar;
        boolean z4;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i = this.f16800a;
        List list = (List) this.f16802d;
        int size = list.size();
        while (true) {
            if (i >= size) {
                uVar = null;
                break;
            }
            uVar = (u) list.get(i);
            if (uVar.a(sSLSocket)) {
                this.f16800a = i + 1;
                break;
            }
            i++;
        }
        if (uVar == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.c + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i4 = this.f16800a;
        while (true) {
            if (i4 >= list.size()) {
                z4 = false;
                break;
            }
            if (((u) list.get(i4)).a(sSLSocket)) {
                z4 = true;
                break;
            }
            i4++;
        }
        this.f16801b = z4;
        M2.b bVar = M2.b.c;
        boolean z5 = this.c;
        bVar.getClass();
        String[] strArr = uVar.c;
        if (strArr != null) {
            enabledCipherSuites = ef.c.l(sSLSocket.getEnabledCipherSuites(), strArr, s.f16474b);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = uVar.f16491d;
        if (strArr2 != null) {
            enabledProtocols = ef.c.l(sSLSocket.getEnabledProtocols(), strArr2, ef.c.h);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        l lVar = s.f16474b;
        byte[] bArr = ef.c.f16663a;
        int length = supportedCipherSuites.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i6 = -1;
                break;
            }
            if (lVar.compare(supportedCipherSuites[i6], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i6++;
        }
        if (z5 && i6 != -1) {
            String str = supportedCipherSuites[i6];
            int length2 = enabledCipherSuites.length;
            String[] strArr3 = new String[1 + length2];
            System.arraycopy(enabledCipherSuites, 0, strArr3, 0, enabledCipherSuites.length);
            strArr3[length2] = str;
            enabledCipherSuites = strArr3;
        }
        boolean z8 = uVar.f16489a;
        if (!z8) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (enabledCipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        String[] strArr4 = (String[]) enabledCipherSuites.clone();
        if (!z8) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (enabledProtocols.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        sSLSocket.setEnabledProtocols((String[]) enabledProtocols.clone());
        sSLSocket.setEnabledCipherSuites(strArr4);
        return uVar;
    }

    public C1518a(String str, int i, boolean z4, boolean z5) {
        this.f16800a = i;
        this.f16801b = z4;
        this.c = z5;
        this.f16802d = str;
    }
}
