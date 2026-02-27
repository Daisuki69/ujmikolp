package si;

import bi.h;
import bi.i;
import dOYHB6.tiZVw8.numX49;
import io.split.android.client.dtos.SegmentsChange;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import ki.InterfaceC1782c;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements InterfaceC1782c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f20131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f20132b;
    public final Li.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f20133d;
    public final boolean e;
    public final Qi.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20134g;
    public final i h;
    public final Pi.f i;

    public f(Li.b bVar, boolean z4, Set set, Long l6, h hVar, Qi.c cVar, g gVar) {
        Objects.requireNonNull(bVar);
        this.c = bVar;
        this.f20131a = set;
        this.f20132b = Long.valueOf(l6 == null ? -1L : l6.longValue());
        this.e = z4;
        Objects.requireNonNull(hVar);
        this.f20133d = hVar;
        Objects.requireNonNull(cVar);
        this.f = cVar;
        this.f20134g = gVar.f20136a;
        this.h = gVar.f20137b;
        this.i = gVar.c;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f20131a.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) numX49.tnTj78("bFAu"));
            }
        }
        return sb2.toString();
    }

    @Override // ki.InterfaceC1782c
    public final Ff.f execute() {
        String strTnTj78 = numX49.tnTj78("bFAV");
        i iVar = this.h;
        h hVar = this.f20133d;
        Long l6 = this.f20132b;
        boolean z4 = this.e;
        String strTnTj782 = numX49.tnTj78("bFAS");
        Pi.f fVar = this.i;
        Qi.c cVar = this.f;
        Set<String> set = this.f20131a;
        Li.b bVar = this.c;
        int i = this.f20134g;
        if (!z4) {
            try {
                Set all = bVar.getAll();
                if (all.removeAll(set)) {
                    bVar.j(SegmentsChange.create((Set<String>) all, l6));
                    hVar.a(iVar);
                }
                cVar.z(fVar);
                Ri.a.d(numX49.tnTj78("bFAi") + a());
                return Ff.f.k(i);
            } catch (Exception e) {
                Ri.a.g(strTnTj78 + (numX49.tnTj78("bFAE") + a() + strTnTj782 + e.getLocalizedMessage()));
                return Ff.f.d(i);
            }
        }
        try {
            Set all2 = bVar.getAll();
            boolean z5 = false;
            for (String str : set) {
                if (!all2.contains(str)) {
                    all2.add(str);
                    z5 = true;
                }
            }
            if (z5) {
                bVar.j(SegmentsChange.create((Set<String>) all2, l6));
                hVar.a(iVar);
            }
            cVar.z(fVar);
            Ri.a.d(numX49.tnTj78("bFAj") + a());
            return Ff.f.k(i);
        } catch (Exception e7) {
            Ri.a.g(strTnTj78 + (numX49.tnTj78("bFAd") + a() + strTnTj782 + e7.getLocalizedMessage()));
            return Ff.f.d(i);
        }
    }
}
