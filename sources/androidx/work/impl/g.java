package androidx.work.impl;

import android.os.Looper;
import androidx.work.impl.model.WorkSpec;
import com.shield.android.ShieldCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8240a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8241b;
    public final /* synthetic */ String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8242d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8243g;
    public final /* synthetic */ Object h;

    public /* synthetic */ g(WorkDatabase workDatabase, WorkSpec workSpec, WorkSpec workSpec2, List list, String str, Set set, boolean z4) {
        this.f8242d = workDatabase;
        this.e = workSpec;
        this.f = workSpec2;
        this.f8243g = list;
        this.c = str;
        this.h = set;
        this.f8241b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8240a) {
            case 0:
                WorkerUpdater.updateWorkImpl$lambda$2((WorkDatabase) this.f8242d, (WorkSpec) this.e, (WorkSpec) this.f, (List) this.f8243g, this.c, (Set) this.h, this.f8241b);
                break;
            default:
                ((com.shield.android.f.f) this.f8242d).a(this.f8241b, (HashMap) this.e, this.c, (Looper) this.f, (ShieldCallback) this.f8243g, (Thread) this.h);
                break;
        }
    }

    public /* synthetic */ g(com.shield.android.f.f fVar, boolean z4, HashMap map, String str, Looper looper, ShieldCallback shieldCallback, Thread thread) {
        this.f8242d = fVar;
        this.f8241b = z4;
        this.e = map;
        this.c = str;
        this.f = looper;
        this.f8243g = shieldCallback;
        this.h = thread;
    }
}
