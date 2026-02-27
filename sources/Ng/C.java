package Ng;

import androidx.webkit.ProxyConfig;
import cj.C1132s;
import cj.L;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class C {
    public static final C c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f4408d;
    public static final LinkedHashMap e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4410b;

    static {
        C c10 = new C(ProxyConfig.MATCH_HTTP, 80);
        c = c10;
        C c11 = new C(ProxyConfig.MATCH_HTTPS, 443);
        f4408d = c11;
        List listG = C1132s.g(c10, c11, new C("ws", 80), new C("wss", 443), new C("socks", 1080));
        int iB = L.b(cj.t.l(listG, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj : listG) {
            linkedHashMap.put(((C) obj).f4409a, obj);
        }
        e = linkedHashMap;
    }

    public C(String str, int i) {
        this.f4409a = str;
        this.f4410b = i;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f4409a.equals(c10.f4409a) && this.f4410b == c10.f4410b;
    }

    public final int hashCode() {
        return (this.f4409a.hashCode() * 31) + this.f4410b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("URLProtocol(name=");
        sb2.append(this.f4409a);
        sb2.append(", defaultPort=");
        return We.s.m(sb2, this.f4410b, ')');
    }
}
