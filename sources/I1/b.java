package I1;

import F1.p;
import J1.e;
import J1.f;
import J1.h;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzu;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2197b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, TaskCompletionSource taskCompletionSource, Object obj2, int i) {
        super(taskCompletionSource);
        this.f2197b = i;
        this.f2198d = obj;
        this.c = obj2;
    }

    @Override // J1.f
    public final void a() {
        J1.d bVar;
        Object obj = this.c;
        Object obj2 = this.f2198d;
        switch (this.f2197b) {
            case 0:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                c cVar = (c) obj2;
                try {
                    cVar.f2199a.m.a(cVar.f2200b, d.a(), new com.google.android.play.core.review.c(cVar, taskCompletionSource));
                } catch (RemoteException e) {
                    e eVar = c.c;
                    Object[] objArr = {cVar.f2200b};
                    eVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", e.c(eVar.f2381b, "error requesting in-app review for %s", objArr), e);
                    }
                    taskCompletionSource.trySetException(new RuntimeException(e));
                    return;
                }
                break;
            case 1:
                h hVar = (h) obj2;
                J1.d dVar = hVar.m;
                ArrayList<f> arrayList = hVar.f2387d;
                b bVar2 = (b) obj;
                e eVar2 = hVar.f2386b;
                if (dVar == null && !hVar.f2388g) {
                    eVar2.b("Initiate binding to the service.", new Object[0]);
                    arrayList.add(bVar2);
                    p pVar = new p(hVar, 1);
                    hVar.f2390l = pVar;
                    hVar.f2388g = true;
                    if (!hVar.f2385a.bindService(hVar.h, pVar, 1)) {
                        eVar2.b("Failed to bind to the service.", new Object[0]);
                        hVar.f2388g = false;
                        for (f fVar : arrayList) {
                            zzu zzuVar = new zzu();
                            TaskCompletionSource taskCompletionSource2 = fVar.f2382a;
                            if (taskCompletionSource2 != null) {
                                taskCompletionSource2.trySetException(zzuVar);
                            }
                        }
                        arrayList.clear();
                    }
                } else if (hVar.f2388g) {
                    eVar2.b("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(bVar2);
                } else {
                    bVar2.run();
                }
                break;
            default:
                p pVar2 = (p) obj2;
                int i = J1.c.f2379b;
                IBinder iBinder = (IBinder) obj;
                if (iBinder == null) {
                    bVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    bVar = iInterfaceQueryLocalInterface instanceof J1.d ? (J1.d) iInterfaceQueryLocalInterface : new J1.b(iBinder);
                }
                h hVar2 = (h) pVar2.f1533b;
                hVar2.m = bVar;
                hVar2.f2386b.b("linkToDeath", new Object[0]);
                try {
                    hVar2.m.asBinder().linkToDeath(hVar2.j, 0);
                } catch (RemoteException e7) {
                    Object[] objArr2 = new Object[0];
                    e eVar3 = hVar2.f2386b;
                    eVar3.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", e.c(eVar3.f2381b, "linkToDeath failed", objArr2), e7);
                    }
                }
                hVar2.f2388g = false;
                Iterator it = hVar2.f2387d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                hVar2.f2387d.clear();
                break;
        }
    }

    public b(p pVar, IBinder iBinder) {
        this.f2197b = 2;
        this.f2198d = pVar;
        this.c = iBinder;
    }
}
