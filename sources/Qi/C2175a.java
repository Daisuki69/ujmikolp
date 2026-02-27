package qi;

import io.split.android.client.dtos.KeyImpression;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.C1781b;
import ki.h;
import ph.C2070f1;

/* JADX INFO: renamed from: qi.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2175a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2070f1 f19787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zi.b f19788b;
    public final C1781b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qi.c f19789d;
    public final h e;
    public final AtomicBoolean f = new AtomicBoolean(true);

    public C2175a(C2070f1 c2070f1, zi.b bVar, C1781b c1781b, h hVar, Qi.c cVar) {
        Bi.c cVar2 = new Bi.c(this, 2);
        this.f19787a = c2070f1;
        bVar.a(cVar2);
        this.f19788b = bVar;
        this.c = c1781b;
        this.e = hVar;
        Objects.requireNonNull(cVar);
        this.f19789d = cVar;
    }

    @Override // qi.g
    public final void a(fi.b bVar) {
        bVar.f16763g = this.f19787a.j(bVar);
        KeyImpression keyImpressionFromImpression = KeyImpression.fromImpression(bVar);
        zi.b bVar2 = this.f19788b;
        if (bVar2.c(keyImpressionFromImpression) && this.f.get()) {
            this.c.l(this.e.b(), bVar2);
        }
        this.f19789d.n(Oi.g.f4845a);
    }
}
