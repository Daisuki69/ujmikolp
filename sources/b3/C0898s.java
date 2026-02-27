package b3;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import d3.InterfaceC1330b;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: b3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0898s implements InterfaceC1330b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3.d f8493b;
    public final d3.d c;

    public /* synthetic */ C0898s(d3.d dVar, d3.d dVar2, int i) {
        this.f8492a = i;
        this.f8493b = dVar;
        this.c = dVar2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f8492a) {
            case 0:
                Context appContext = (Context) this.f8493b.get();
                CoroutineContext blockingDispatcher = (CoroutineContext) this.c.get();
                kotlin.jvm.internal.j.g(appContext, "appContext");
                kotlin.jvm.internal.j.g(blockingDispatcher, "blockingDispatcher");
                DataStore dataStoreB = C0896q.b(e3.k.f16576a, new ReplaceFileCorruptionHandler(new Rg.g(20)), Bj.H.c(blockingDispatcher), new J7.a(appContext, 5));
                if (dataStoreB != null) {
                    return dataStoreB;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 1:
                return new C0864D((Context) this.f8493b.get(), (k0) this.c.get());
            case 2:
                return new U((i0) this.f8493b.get(), (k0) this.c.get());
            default:
                return new e3.m((e3.t) this.f8493b.get(), (e3.t) this.c.get());
        }
    }
}
