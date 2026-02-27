package E1;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends F1.d implements F1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F1.k f1232b;
    public final TaskCompletionSource c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f1233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, F1.k kVar, TaskCompletionSource taskCompletionSource) {
        super(0);
        this.f1233d = jVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f1232b = kVar;
        this.c = taskCompletionSource;
    }

    @Override // F1.i
    public void e(Bundle bundle) {
        this.f1233d.f1234a.c(this.c);
        this.f1232b.c("onRequestInfo", new Object[0]);
    }

    @Override // F1.i
    public void zzb(Bundle bundle) {
        this.f1233d.f1234a.c(this.c);
        this.f1232b.c("onCompleteUpdate", new Object[0]);
    }
}
