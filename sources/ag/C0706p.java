package ag;

import android.content.Context;
import cj.C1112C;
import dOYHB6.tiZVw8.numX49;
import java.util.List;

/* JADX INFO: renamed from: ag.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0706p extends AbstractC0698h {
    public static final C0702l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0702l f7222g;
    public static final C0702l h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y.e f7223d;
    public final C0694d e;

    static {
        List listC = cj.r.c(numX49.tnTj78("bueR"));
        C1112C c1112c = C1112C.f9377a;
        f = new C0702l(1, c1112c, listC, 120);
        f7222g = new C0702l(2, c1112c, listC, 120);
        h = new C0702l(3, c1112c, listC, 120);
    }

    public C0706p(Context context, Y.e eVar, C0694d c0694d) {
        super(context);
        this.f7223d = eVar;
        this.e = c0694d;
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C0705o(this.f7197a, this.f7223d, this.e, 1);
    }
}
