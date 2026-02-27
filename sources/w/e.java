package W;

import Ag.l;
import Bj.H;
import Bj.U;
import D.S;
import java.util.ArrayList;
import kotlin.time.a;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f6162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f6163b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f6164d;
    public final d e;
    public final Gj.c f;

    public e(l lVar, S s9) {
        a.C0097a c0097a = kotlin.time.a.f18208b;
        long jD = kotlin.time.a.d(kotlin.time.b.e(5, Aj.b.e));
        this.f6162a = lVar;
        this.f6163b = s9;
        this.c = jD;
        this.f6164d = new ArrayList();
        this.e = new d(this);
        Ij.e eVar = U.f603a;
        this.f = H.c(Ij.d.f2362a.limitedParallelism(4));
    }
}
