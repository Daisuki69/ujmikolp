package p3;

import android.content.Context;
import b2.C0859a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f19028b = new Object();
    public static g c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b2.e f19029a;

    public static g c() {
        g gVar;
        synchronized (f19028b) {
            Preconditions.checkState(c != null, "MlKitContext has not been initialized");
            gVar = (g) Preconditions.checkNotNull(c);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        g gVar;
        synchronized (f19028b) {
            Preconditions.checkState(c == null, "MlKitContext is already initialized");
            g gVar2 = new g();
            c = gVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListE = new Y.e(11, context, new Qd.a(MlKitComponentDiscoveryService.class, 21)).e();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            androidx.media3.extractor.flv.a aVar = b2.d.f8353L;
            arrayList.addAll(arrayListE);
            arrayList2.add(C0859a.c(context, Context.class, new Class[0]));
            arrayList2.add(C0859a.c(gVar2, g.class, new Class[0]));
            b2.e eVar = new b2.e(executor, arrayList, arrayList2, aVar);
            gVar2.f19029a = eVar;
            eVar.c(true);
            gVar = c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        Preconditions.checkState(c == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f19029a);
        return this.f19029a.get(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
