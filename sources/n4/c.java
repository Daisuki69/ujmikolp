package N4;

import Bj.H;
import Bj.L;
import Bj.U;
import G6.u;
import K4.C0274e;
import K4.D;
import M8.A0;
import com.maya.raven.data.RavenNetworkException;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gj.c f3526a = H.c(U.f603a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f3527b = new u(g.f);

    public static final Throwable a(C0274e c0274e, String str) {
        String strC;
        String strC2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        if (c0274e == null || (strC = c0274e.c()) == null) {
            strC = "";
        }
        sb2.append(strC);
        String string = sb2.toString();
        if (c0274e == null || (strC2 = c0274e.c()) == null || strC2.length() <= 0) {
            string = null;
        }
        if (string != null) {
            str = string;
        }
        return c0274e == null ? new Throwable(str) : new RavenNetworkException(C0274e.a(c0274e, str, null, null, 30));
    }

    public static L b(G4.a aVar) {
        aVar.a(new D(true));
        String strC = z.a(c.class).c();
        if (strC == null) {
            strC = "DataUploader";
        }
        A0.v("challenge request", strC);
        return H.g(f3526a, null, new a(aVar, null), 3);
    }
}
