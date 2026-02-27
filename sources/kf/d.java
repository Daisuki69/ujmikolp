package kf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements nf.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f18127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f18128b;

    public d(X509TrustManager x509TrustManager, Method method) {
        this.f18128b = method;
        this.f18127a = x509TrustManager;
    }

    @Override // nf.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f18128b.invoke(this.f18127a, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18127a.equals(dVar.f18127a) && this.f18128b.equals(dVar.f18128b);
    }

    public final int hashCode() {
        return (this.f18128b.hashCode() * 31) + this.f18127a.hashCode();
    }
}
