package ag;

import android.content.Context;
import cj.C1112C;
import dOYHB6.tiZVw8.numX49;
import java.util.List;

/* JADX INFO: renamed from: ag.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0704n extends AbstractC0698h {
    public static final C0702l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0702l f7218g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y.e f7219d;
    public final C0694d e;

    static {
        List listC = cj.r.c(numX49.tnTj78("bueL"));
        C1112C c1112c = C1112C.f9377a;
        f = new C0702l(1, c1112c, listC, 120);
        f7218g = new C0702l(2, c1112c, listC, 120);
    }

    public C0704n(Context context, Y.e eVar, C0694d c0694d) {
        super(context);
        this.f7219d = eVar;
        this.e = c0694d;
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C0705o(this.f7197a, this.f7219d, this.e, 0);
    }
}
