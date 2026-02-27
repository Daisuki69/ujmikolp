package df;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC1358D f16498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f16499b;
    public final List c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16500d;

    public w(EnumC1358D enumC1358D, s sVar, List list, List list2) {
        this.f16498a = enumC1358D;
        this.f16499b = sVar;
        this.c = list;
        this.f16500d = list2;
    }

    public static w a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        List listUnmodifiableList;
        List listUnmodifiableList2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        s sVarA = s.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC1358D enumC1358DA = EnumC1358D.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        if (peerCertificates != null) {
            byte[] bArr = ef.c.f16663a;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) peerCertificates.clone()));
        } else {
            listUnmodifiableList = Collections.EMPTY_LIST;
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            byte[] bArr2 = ef.c.f16663a;
            listUnmodifiableList2 = Collections.unmodifiableList(Arrays.asList((Object[]) localCertificates.clone()));
        } else {
            listUnmodifiableList2 = Collections.EMPTY_LIST;
        }
        return new w(enumC1358DA, sVarA, listUnmodifiableList, listUnmodifiableList2);
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Certificate certificate = (Certificate) it.next();
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f16498a.equals(wVar.f16498a) && this.f16499b.equals(wVar.f16499b) && this.c.equals(wVar.c) && this.f16500d.equals(wVar.f16500d);
    }

    public final int hashCode() {
        return this.f16500d.hashCode() + ((this.c.hashCode() + ((this.f16499b.hashCode() + ((this.f16498a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Handshake{tlsVersion=" + this.f16498a + " cipherSuite=" + this.f16499b + " peerCertificates=" + b(this.c) + " localCertificates=" + b(this.f16500d) + '}';
    }
}
