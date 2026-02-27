package F1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f1531b;
    public final /* synthetic */ p c;

    public o(p pVar, IBinder iBinder) {
        this.c = pVar;
        this.f1531b = iBinder;
    }

    @Override // F1.l
    public final void a() {
        h fVar;
        p pVar = this.c;
        int i = g.f1523b;
        IBinder iBinder = this.f1531b;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            fVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new f(iBinder);
        }
        q qVar = (q) pVar.f1533b;
        qVar.m = fVar;
        qVar.f1536b.c("linkToDeath", new Object[0]);
        try {
            qVar.m.asBinder().linkToDeath(qVar.j, 0);
        } catch (RemoteException e) {
            qVar.f1536b.b(e, "linkToDeath failed", new Object[0]);
        }
        qVar.f1538g = false;
        Iterator it = qVar.f1537d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        qVar.f1537d.clear();
    }
}
