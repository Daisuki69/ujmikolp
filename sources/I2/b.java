package I2;

import U1.g;
import android.content.Context;
import b2.n;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements b2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f2203b;

    public /* synthetic */ b(n nVar, int i) {
        this.f2202a = i;
        this.f2203b = nVar;
    }

    @Override // b2.c
    public final Object v(Xh.b bVar) {
        switch (this.f2202a) {
            case 0:
                return FirebasePerfRegistrar.lambda$getComponents$0(this.f2203b, bVar);
            case 1:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.f2203b, bVar);
            case 2:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f2203b, bVar);
            default:
                return new z2.c((Context) bVar.get(Context.class), ((g) bVar.get(g.class)).g(), bVar.k(z2.d.class), bVar.d(V2.b.class), (Executor) bVar.f(this.f2203b));
        }
    }
}
