package ti;

import Ff.f;
import Mi.c;
import bi.C1026d;
import bi.i;
import dOYHB6.tiZVw8.numX49;
import io.split.android.client.dtos.RuleBasedSegment;
import java.util.Collections;
import java.util.Objects;
import ki.InterfaceC1782c;
import oi.C1986d;

/* JADX INFO: renamed from: ti.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2287b implements InterfaceC1782c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f20208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20209b;
    public final RuleBasedSegment c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1986d f20210d;
    public final C1026d e;

    public C2287b(c cVar, C1986d c1986d, C1026d c1026d, RuleBasedSegment ruleBasedSegment, long j) {
        Objects.requireNonNull(cVar);
        this.f20208a = cVar;
        this.c = ruleBasedSegment;
        Objects.requireNonNull(c1986d);
        this.f20210d = c1986d;
        this.e = c1026d;
        this.f20209b = j;
    }

    @Override // ki.InterfaceC1782c
    public final f execute() {
        try {
            C1986d c1986d = this.f20210d;
            RuleBasedSegment ruleBasedSegment = this.c;
            long j = this.f20209b;
            c1986d.getClass();
            C2286a c2286aC = C1986d.c(j, Collections.singletonList(ruleBasedSegment));
            if (this.f20208a.c(c2286aC.f20206a, c2286aC.f20207b, this.f20209b, null)) {
                this.e.a(i.f9160l);
            }
            Ri.a.p("Updated rule based segment");
            return f.k(22);
        } catch (Exception unused) {
            Ri.a.g(numX49.tnTj78("bFsP"));
            return f.d(22);
        }
    }
}
