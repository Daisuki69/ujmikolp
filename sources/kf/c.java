package kf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends X5.f {
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Method f18126g;

    public c(Object obj, Method method) {
        this.f = obj;
        this.f18126g = method;
    }

    @Override // X5.f
    public final List d(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return (List) this.f18126g.invoke(this.f, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e7) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e7.getMessage());
            sSLPeerUnverifiedException.initCause(e7);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof c;
    }

    public final int hashCode() {
        return 0;
    }
}
