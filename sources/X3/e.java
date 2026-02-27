package x3;

import com.google.android.gms.tasks.OnFailureListener;
import d4.AbstractC1331a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements OnFailureListener, b2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f20900a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e f20901b = new e();

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        c.e.e("MobileVisionBase", "Error preloading model resource", exc);
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        Set setK = bVar.k(d.class);
        e eVar = new e();
        new HashMap();
        new HashMap();
        Iterator it = setK.iterator();
        if (it.hasNext()) {
            throw AbstractC1331a.n(it);
        }
        return eVar;
    }
}
