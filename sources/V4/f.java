package V4;

import C.h;
import S1.v;
import android.os.Handler;
import android.os.Looper;
import pg.C2038a;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6068b;
    public final Object c;

    public f(t tVar) {
        this.f6067a = 0;
        this.f6068b = tVar;
        this.c = new Handler(Looper.getMainLooper());
    }

    @Override // pg.t
    public final void error(String str, String str2, Object obj) {
        switch (this.f6067a) {
            case 0:
                ((Handler) this.c).post(new e(this, str, str2, obj));
                break;
            default:
                ((pg.g) this.f6068b).reply(((u) ((C2038a) this.c).c).c.f(str, str2, obj));
                break;
        }
    }

    @Override // pg.t
    public final void notImplemented() {
        switch (this.f6067a) {
            case 0:
                ((Handler) this.c).post(new h(this, 8));
                break;
            default:
                ((pg.g) this.f6068b).reply(null);
                break;
        }
    }

    @Override // pg.t
    public final void success(Object obj) {
        switch (this.f6067a) {
            case 0:
                ((Handler) this.c).post(new v(18, this, obj, false));
                break;
            default:
                ((pg.g) this.f6068b).reply(((u) ((C2038a) this.c).c).c.b(obj));
                break;
        }
    }

    public f(C2038a c2038a, pg.g gVar) {
        this.f6067a = 1;
        this.c = c2038a;
        this.f6068b = gVar;
    }
}
