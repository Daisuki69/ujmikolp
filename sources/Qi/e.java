package qi;

import io.split.android.client.dtos.KeyImpression;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.C1781b;
import ki.h;
import oi.C1988f;
import ph.C2070f1;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2070f1 f19805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1988f f19806b;
    public final zi.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1781b f19807d;
    public final h e;
    public final Qi.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f19808g = new AtomicBoolean(true);
    public final long h;

    public e(C2070f1 c2070f1, C1988f c1988f, zi.b bVar, C1781b c1781b, h hVar, Qi.c cVar) {
        Bi.c cVar2 = new Bi.c(this, 4);
        this.f19805a = c2070f1;
        Objects.requireNonNull(c1988f);
        this.f19806b = c1988f;
        bVar.a(cVar2);
        this.c = bVar;
        this.f19807d = c1781b;
        this.e = hVar;
        Objects.requireNonNull(cVar);
        this.f = cVar;
        this.h = 3600000L;
    }

    @Override // qi.g
    public final void a(fi.b bVar) {
        Long lJ = this.f19805a.j(bVar);
        bVar.f16763g = lJ;
        if (lJ != null && lJ.longValue() != 0) {
            String str = bVar.f16761b;
            this.f19806b.b(bVar.f16762d, str);
        }
        KeyImpression keyImpressionFromImpression = KeyImpression.fromImpression(bVar);
        Long l6 = keyImpressionFromImpression.previousTime;
        Qi.c cVar = this.f;
        if (l6 != null) {
            long jLongValue = l6.longValue();
            long j = this.h;
            long j6 = jLongValue - (jLongValue % j);
            long j7 = keyImpressionFromImpression.time;
            if (j6 == j7 - (j7 % j)) {
                cVar.n(Oi.g.c);
                return;
            }
        }
        zi.b bVar2 = this.c;
        if (bVar2.c(keyImpressionFromImpression) && this.f19808g.get()) {
            this.f19807d.l(this.e.b(), bVar2);
        }
        cVar.n(Oi.g.f4845a);
    }
}
