package gf;

import com.paymaya.domain.store.A0;
import df.n;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f16828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0 f16829b;
    public final mg.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16830d;
    public int e;
    public List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f16831g;

    public h(n nVar, A0 a02, mg.c cVar) {
        List list = Collections.EMPTY_LIST;
        this.f16830d = list;
        this.f = list;
        this.f16831g = new ArrayList();
        this.f16828a = nVar;
        this.f16829b = a02;
        this.c = cVar;
        List<Proxy> listSelect = nVar.f16461g.select(nVar.f16458a.k());
        this.f16830d = (listSelect == null || listSelect.isEmpty()) ? Collections.unmodifiableList(Arrays.asList((Object[]) new Proxy[]{Proxy.NO_PROXY}.clone())) : Collections.unmodifiableList(new ArrayList(listSelect));
        this.e = 0;
    }

    public final boolean a() {
        return this.e < this.f16830d.size();
    }
}
