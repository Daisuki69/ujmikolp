package df;

import com.paymaya.domain.store.T;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import nf.C1945c;

/* JADX INFO: renamed from: df.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1364f implements Cloneable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final List f16420B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final List f16421y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.r f16422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16423b;
    public final List c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16424d;
    public final List e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f16425g;
    public final N4.d h;
    public final SocketFactory i;
    public final SSLSocketFactory j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final X5.f f16426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1945c f16427l;
    public final r m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f16428n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f16429o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final T f16430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1359a f16431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f16432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f16433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f16434t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f16435u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f16436v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f16437w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f16438x;

    static {
        EnumC1355A[] enumC1355AArr = {EnumC1355A.HTTP_2, EnumC1355A.HTTP_1_1};
        byte[] bArr = ef.c.f16663a;
        f16421y = Collections.unmodifiableList(Arrays.asList((Object[]) enumC1355AArr.clone()));
        f16420B = Collections.unmodifiableList(Arrays.asList((Object[]) new u[]{u.e, u.f}.clone()));
        M2.b.c = new M2.b(21);
    }

    public C1364f(C1363e c1363e) {
        boolean z4;
        this.f16422a = c1363e.f16405a;
        this.f16423b = c1363e.f16406b;
        List list = c1363e.c;
        this.c = list;
        this.f16424d = Collections.unmodifiableList(new ArrayList(c1363e.f16407d));
        this.e = Collections.unmodifiableList(new ArrayList(c1363e.e));
        this.f = c1363e.f;
        this.f16425g = c1363e.f16408g;
        this.h = c1363e.h;
        this.i = c1363e.i;
        Iterator it = list.iterator();
        loop0: while (true) {
            z4 = false;
            while (it.hasNext()) {
                z4 = (z4 || ((u) it.next()).f16489a) ? true : z4;
            }
        }
        if (z4) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            kf.f fVar = kf.f.f18131a;
                            SSLContext sSLContextK = fVar.k();
                            sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.j = sSLContextK.getSocketFactory();
                            this.f16426k = fVar.a(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw new AssertionError("No System TLS", e);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e7) {
                throw new AssertionError("No System TLS", e7);
            }
        }
        this.j = null;
        this.f16426k = null;
        if (this.j != null) {
            kf.f.f18131a.getClass();
        }
        this.f16427l = c1363e.j;
        X5.f fVar2 = this.f16426k;
        r rVar = c1363e.f16409k;
        this.m = Objects.equals(rVar.f16473b, fVar2) ? rVar : new r(rVar.f16472a, fVar2);
        this.f16428n = c1363e.f16410l;
        this.f16429o = c1363e.m;
        this.f16430p = c1363e.f16411n;
        this.f16431q = c1363e.f16412o;
        this.f16432r = c1363e.f16413p;
        this.f16433s = c1363e.f16414q;
        this.f16434t = c1363e.f16415r;
        this.f16435u = c1363e.f16416s;
        this.f16436v = c1363e.f16417t;
        this.f16437w = c1363e.f16418u;
        this.f16438x = c1363e.f16419v;
        if (this.f16424d.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f16424d);
        }
        if (this.e.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.e);
        }
    }
}
