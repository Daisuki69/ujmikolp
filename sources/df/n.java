package df;

import androidx.webkit.ProxyConfig;
import com.dynatrace.android.agent.Global;
import defpackage.AbstractC1414e;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import nf.C1945c;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f16458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1359a f16459b;
    public final SocketFactory c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f16460d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f16461g;
    public final SSLSocketFactory h;
    public final C1945c i;
    public final r j;

    public n(String str, int i, InterfaceC1359a interfaceC1359a, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, C1945c c1945c, r rVar, o oVar, List list, List list2, ProxySelector proxySelector) {
        y yVar = new y();
        String str2 = sSLSocketFactory != null ? ProxyConfig.MATCH_HTTPS : ProxyConfig.MATCH_HTTP;
        if (str2.equalsIgnoreCase(ProxyConfig.MATCH_HTTP)) {
            yVar.f16502a = ProxyConfig.MATCH_HTTP;
        } else {
            if (!str2.equalsIgnoreCase(ProxyConfig.MATCH_HTTPS)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            yVar.f16502a = ProxyConfig.MATCH_HTTPS;
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String strF = ef.c.f(z.d(str, 0, str.length(), false));
        if (strF == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        yVar.f16504d = strF;
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException(We.s.f(i, "unexpected port: "));
        }
        yVar.e = i;
        this.f16458a = yVar.a();
        if (interfaceC1359a == null) {
            throw new NullPointerException("dns == null");
        }
        this.f16459b = interfaceC1359a;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.c = socketFactory;
        if (oVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f16460d = oVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.e = Collections.unmodifiableList(new ArrayList(list));
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f = Collections.unmodifiableList(new ArrayList(list2));
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f16461g = proxySelector;
        this.h = sSLSocketFactory;
        this.i = c1945c;
        this.j = rVar;
    }

    public final boolean a(n nVar) {
        return this.f16459b.equals(nVar.f16459b) && this.f16460d.equals(nVar.f16460d) && this.e.equals(nVar.e) && this.f.equals(nVar.f) && this.f16461g.equals(nVar.f16461g) && Objects.equals(this.h, nVar.h) && Objects.equals(this.i, nVar.i) && Objects.equals(this.j, nVar.j) && this.f16458a.e == nVar.f16458a.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f16458a.equals(nVar.f16458a) && a(nVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.j) + ((Objects.hashCode(this.i) + ((Objects.hashCode(this.h) + ((this.f16461g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.f16460d.hashCode() + ((this.f16459b.hashCode() + AbstractC1414e.c(527, 31, this.f16458a.h)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        z zVar = this.f16458a;
        sb2.append(zVar.f16508d);
        sb2.append(Global.COLON);
        sb2.append(zVar.e);
        sb2.append(", proxySelector=");
        sb2.append(this.f16461g);
        sb2.append("}");
        return sb2.toString();
    }
}
