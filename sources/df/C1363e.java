package df;

import com.paymaya.domain.store.T;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import lf.C1827a;
import nf.C1945c;

/* JADX INFO: renamed from: df.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1363e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f16408g;
    public final N4.d h;
    public final SocketFactory i;
    public final C1945c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f16409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f16410l;
    public final o m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final T f16411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1359a f16412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f16413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f16414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f16415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16416s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16417t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16418u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16419v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16407d = new ArrayList();
    public final ArrayList e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.r f16405a = new com.google.firebase.messaging.r(15);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16406b = C1364f.f16421y;
    public final List c = C1364f.f16420B;
    public final o f = new o(1, (byte) 0);

    public C1363e() {
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f16408g = proxySelector;
        if (proxySelector == null) {
            this.f16408g = new C1827a();
        }
        this.h = N4.d.f3528b;
        this.i = SocketFactory.getDefault();
        this.j = C1945c.f18728a;
        this.f16409k = r.c;
        o oVar = o.f16462b;
        this.f16410l = oVar;
        this.m = oVar;
        this.f16411n = new T();
        this.f16412o = InterfaceC1359a.f16401M;
        this.f16413p = true;
        this.f16414q = true;
        this.f16415r = true;
        this.f16416s = 0;
        this.f16417t = 10000;
        this.f16418u = 10000;
        this.f16419v = 10000;
    }
}
