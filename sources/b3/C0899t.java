package b3;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import d3.InterfaceC1330b;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: b3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0899t implements InterfaceC1330b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3.d f8495b;
    public final d3.d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3.d f8496d;

    public /* synthetic */ C0899t(d3.d dVar, d3.d dVar2, d3.d dVar3, int i) {
        this.f8494a = i;
        this.f8495b = dVar;
        this.c = dVar2;
        this.f8496d = dVar3;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f8494a) {
            case 0:
                Context appContext = (Context) this.f8495b.get();
                CoroutineContext blockingDispatcher = (CoroutineContext) this.c.get();
                C0869I sessionDataSerializer = (C0869I) this.f8496d.get();
                kotlin.jvm.internal.j.g(appContext, "appContext");
                kotlin.jvm.internal.j.g(blockingDispatcher, "blockingDispatcher");
                kotlin.jvm.internal.j.g(sessionDataSerializer, "sessionDataSerializer");
                DataStore dataStoreB = C0896q.b(sessionDataSerializer, new ReplaceFileCorruptionHandler(new N9.f(sessionDataSerializer, 23)), Bj.H.c(blockingDispatcher), new J7.a(appContext, 6));
                if (dataStoreB != null) {
                    return dataStoreB;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new e3.s((CoroutineContext) this.f8495b.get(), (i0) this.c.get(), (DataStore) this.f8496d.get());
        }
    }
}
