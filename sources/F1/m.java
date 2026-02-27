package F1;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1529b;

    public /* synthetic */ m(Object obj, int i) {
        this.f1528a = i;
        this.f1529b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f1528a) {
            case 0:
                q qVar = (q) this.f1529b;
                qVar.f1536b.c("reportBinderDeath", new Object[0]);
                if (qVar.i.get() != null) {
                    throw new ClassCastException();
                }
                qVar.f1536b.c("%s : Binder has died.", qVar.c);
                for (l lVar : qVar.f1537d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(qVar.c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = lVar.f1527a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                qVar.f1537d.clear();
                synchronized (qVar.f) {
                    qVar.d();
                    break;
                }
                return;
            default:
                J1.h hVar = (J1.h) this.f1529b;
                hVar.f2386b.b("reportBinderDeath", new Object[0]);
                if (hVar.i.get() != null) {
                    throw new ClassCastException();
                }
                String str = hVar.c;
                hVar.f2386b.b("%s : Binder has died.", str);
                ArrayList<J1.f> arrayList = hVar.f2387d;
                for (J1.f fVar : arrayList) {
                    RemoteException remoteException2 = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource2 = fVar.f2382a;
                    if (taskCompletionSource2 != null) {
                        taskCompletionSource2.trySetException(remoteException2);
                    }
                }
                arrayList.clear();
                hVar.b();
                return;
        }
    }
}
