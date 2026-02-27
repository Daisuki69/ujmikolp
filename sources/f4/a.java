package F4;

import Bj.H;
import Bj.U;
import Bj.o0;
import G4.b;
import Gj.c;
import Ij.d;
import Ij.e;
import M8.A0;
import android.content.Context;
import androidx.core.content.ContextCompat;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f1548b;

    public a(Context context) {
        j.g(context, "context");
        this.f1547a = context;
    }

    public static c c() {
        o0 o0VarD = H.d(1);
        e eVar = U.f603a;
        return H.c(kotlin.coroutines.e.d(o0VarD, d.f2362a));
    }

    public abstract void a();

    public abstract String b();

    public final boolean d(List permission, boolean z4) {
        j.g(permission, "permission");
        Iterator it = permission.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Context context = this.f1547a;
            if (z4) {
                if (ContextCompat.checkSelfPermission(context, str) == 0) {
                    return true;
                }
            } else if (ContextCompat.checkSelfPermission(context, str) != 0) {
                String strC = z.a(getClass()).c();
                if (strC == null) {
                    strC = "CoroutineScopedExtractor";
                }
                A0.w(2, "PERMISSION DENIED", strC);
                return false;
            }
        }
        return !z4;
    }
}
