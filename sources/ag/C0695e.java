package ag;

import android.content.Context;
import cj.C1112C;

/* JADX INFO: renamed from: ag.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0695e extends AbstractC0693c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0702l f7200d;
    public static final C0702l e;
    public final C0694d c;

    static {
        C1112C c1112c = C1112C.f9377a;
        f7200d = new C0702l(1, c1112c, null, 124);
        e = new C0702l(2, c1112c, null, 124);
    }

    public C0695e(Context context, C0694d c0694d) {
        super(context, 0);
        this.c = c0694d;
    }

    @Override // ag.AbstractC0693c
    public final Xf.a g() {
        return new C0697g(this.f7197a, this.f7198b, this.c);
    }
}
