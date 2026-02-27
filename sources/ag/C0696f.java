package ag;

import android.content.Context;
import android.content.pm.PackageManager;
import cj.C1112C;
import dOYHB6.tiZVw8.numX49;
import java.util.List;

/* JADX INFO: renamed from: ag.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0696f extends AbstractC0698h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0702l f7201g;
    public static final C0702l h;
    public static final C0702l i;
    public static final C0702l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0702l f7202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0702l f7203l;
    public static final C0702l m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0702l f7204n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PackageManager f7205d;
    public final Y.e e;
    public final C0694d f;

    static {
        List listC = cj.r.c(numX49.tnTj78("bueT"));
        C1112C c1112c = C1112C.f9377a;
        f7201g = new C0702l(1, c1112c, listC, 120);
        h = new C0702l(2, c1112c, listC, 120);
        i = new C0702l(3, c1112c, listC, 120);
        j = new C0702l(4, c1112c, listC, 120);
        f7202k = new C0702l(5, c1112c, listC, 120);
        f7203l = new C0702l(6, c1112c, listC, 120);
        m = new C0702l(13, c1112c, listC, 120);
        f7204n = new C0702l(14, c1112c, listC, 120);
    }

    public C0696f(Context context, Y.e eVar, C0694d c0694d) {
        super(context);
        this.e = eVar;
        this.f = c0694d;
        this.f7205d = context.getPackageManager();
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C0697g(this.f7197a, this.e, this.f);
    }
}
