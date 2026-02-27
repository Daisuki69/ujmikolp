package E1;

import F1.q;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends F1.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1230b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1231d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Object obj2, int i) {
        super(taskCompletionSource);
        this.f1230b = i;
        this.e = obj;
        this.c = taskCompletionSource2;
        this.f1231d = obj2;
    }

    @Override // F1.l
    public final void a() {
        switch (this.f1230b) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.c;
                j jVar = (j) this.e;
                String str = (String) this.f1231d;
                try {
                    jVar.f1234a.m.c(jVar.f1235b, j.a(jVar, str), new i(jVar, taskCompletionSource, str));
                    return;
                } catch (RemoteException e) {
                    j.e.b(e, "requestUpdateInfo(%s)", str);
                    taskCompletionSource.trySetException(new RuntimeException(e));
                    return;
                }
            case 1:
                TaskCompletionSource taskCompletionSource2 = this.c;
                j jVar2 = (j) this.e;
                try {
                    jVar2.f1234a.m.b(jVar2.f1235b, j.b(), new h(jVar2, new F1.k("OnCompleteUpdateCallback"), taskCompletionSource2));
                    return;
                } catch (RemoteException e7) {
                    j.e.b(e7, "completeUpdate(%s)", (String) this.f1231d);
                    taskCompletionSource2.trySetException(new RuntimeException(e7));
                    return;
                }
            default:
                synchronized (((q) this.e).f) {
                    try {
                        q qVar = (q) this.e;
                        TaskCompletionSource taskCompletionSource3 = this.c;
                        qVar.e.add(taskCompletionSource3);
                        taskCompletionSource3.getTask().addOnCompleteListener(new A7.f(12, qVar, taskCompletionSource3));
                        if (((q) this.e).f1539k.getAndIncrement() > 0) {
                            ((q) this.e).f1536b.c("Already connected to the service.", new Object[0]);
                        }
                        q.b((q) this.e, (F1.l) this.f1231d);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f1230b = 0;
        this.e = jVar;
        this.f1231d = str;
        this.c = taskCompletionSource2;
    }
}
