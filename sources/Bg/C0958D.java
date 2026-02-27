package bg;

import ag.AbstractC0693c;
import android.content.Context;
import cj.C1112C;

/* JADX INFO: renamed from: bg.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0958D extends AbstractC0693c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0960E f8721d;
    public static final C0960E e;
    public static final C0960E f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0960E f8722g;
    public static final C0960E h;
    public static final C0960E i;
    public final C0965G0 c;

    static {
        C1112C c1112c = C1112C.f9377a;
        f8721d = new C0960E(1, c1112c, c1112c, 0, 0, 120);
        e = new C0960E(2, c1112c, null, 0, 0, 124);
        f = new C0960E(3, c1112c, null, 0, 0, 124);
        f8722g = new C0960E(4, c1112c, null, 0, 0, 124);
        h = new C0960E(5, c1112c, null, 0, 0, 124);
        i = new C0960E(6, c1112c, null, 0, 0, 124);
    }

    public C0958D(Context context, C0965G0 c0965g0) {
        super(context, 1);
        this.c = c0965g0;
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C0964G(this.f7198b, this.f7197a, this.c);
    }
}
