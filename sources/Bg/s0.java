package bg;

import ag.AbstractC0693c;
import android.content.Context;
import cj.C1112C;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends AbstractC0693c {
    public static final C0960E f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0960E f9115g;
    public final n0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f9116d;
    public final C0965G0 e;

    static {
        C1112C c1112c = C1112C.f9377a;
        f = new C0960E(1, c1112c, c1112c, 0, 0, 120);
        f9115g = new C0960E(2, c1112c, c1112c, 0, 0, 120);
    }

    public s0(Context context, n0 n0Var, String[] strArr, C0965G0 c0965g0) {
        super(context, 1);
        this.c = n0Var;
        this.f9116d = strArr;
        this.e = c0965g0;
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C1022z(this.f7197a, this.f9116d, this.e);
    }
}
