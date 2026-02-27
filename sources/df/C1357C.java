package df;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: df.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1357C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f16395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f16396b;
    public final InetSocketAddress c;

    public C1357C(n nVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (nVar == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f16395a = nVar;
        this.f16396b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1357C)) {
            return false;
        }
        C1357C c1357c = (C1357C) obj;
        return c1357c.f16395a.equals(this.f16395a) && c1357c.f16396b.equals(this.f16396b) && c1357c.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.f16396b.hashCode() + ((this.f16395a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + "}";
    }
}
