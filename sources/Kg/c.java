package Kg;

import Bj.E;
import Ng.r;
import Ng.u;
import Ng.v;
import io.ktor.utils.io.n;
import qk.i;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements r, E {
    public abstract xg.b b();

    public abstract n c();

    public abstract Tg.d d();

    public abstract Tg.d e();

    public abstract v f();

    public abstract u g();

    public final String toString() {
        return "HttpResponse[" + i.z(this).getUrl() + ", " + f() + ']';
    }
}
