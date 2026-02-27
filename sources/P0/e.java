package P0;

import android.os.AsyncTask;
import com.google.firebase.messaging.p;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.M;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U0.a f4912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4913b = true;
    public p c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A0 f4914d;
    public L e;
    public M f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Q0.b f4915g;
    public int h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f4916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4917l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public V0.a f4918n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f4922r;

    public e(f fVar, U0.a aVar) {
        this.f4922r = fVar;
        Q0.a aVar2 = new Q0.a();
        aVar2.f5197a = fVar;
        this.f4915g = aVar2;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.f4916k = null;
        this.f4917l = true;
        this.m = false;
        this.f4918n = V0.a.f6024a;
        this.f4919o = false;
        this.f4920p = false;
        this.f4921q = false;
        this.f4912a = aVar;
    }

    public final void a() {
        f fVar = this.f4922r;
        if (!fVar.f4932W) {
            fVar.f4934a0 = this;
            return;
        }
        fVar.p();
        fVar.f4944q.getClass();
        Ci.b bVar = fVar.f4944q;
        bVar.f785b = this.c;
        bVar.getClass();
        Ci.b bVar2 = fVar.f4944q;
        bVar2.e = this.f4914d;
        bVar2.f786d = this.e;
        bVar2.getClass();
        Ci.b bVar3 = fVar.f4944q;
        bVar3.c = this.f;
        bVar3.f = this.f4915g;
        fVar.setSwipeEnabled(this.f4913b);
        fVar.setNightMode(this.f4921q);
        fVar.f4951x = true;
        fVar.setDefaultPage(this.h);
        fVar.setSwipeVertical(true ^ this.i);
        fVar.f4925P = this.j;
        fVar.setScrollHandle(null);
        fVar.f4926Q = this.f4917l;
        fVar.setSpacing(0);
        fVar.setAutoSpacing(this.m);
        fVar.setPageFitPolicy(this.f4918n);
        fVar.setFitEachPage(false);
        fVar.setPageSnap(this.f4920p);
        fVar.setPageFling(this.f4919o);
        String str = this.f4916k;
        if (!fVar.f4940l) {
            throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
        }
        fVar.f4940l = false;
        c cVar = new c();
        cVar.e = this.f4912a;
        cVar.f4905a = false;
        cVar.f4906b = new WeakReference(fVar);
        cVar.f4907d = str;
        cVar.c = fVar.f4924K;
        fVar.m = cVar;
        cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
