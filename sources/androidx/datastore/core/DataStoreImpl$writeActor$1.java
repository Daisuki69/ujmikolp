package androidx.datastore.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl$writeActor$1 extends k implements Function1<Throwable, Unit> {
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeActor$1(DataStoreImpl<T> dataStoreImpl) {
        super(1);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f18162a;
    }

    public final void invoke(Throwable th2) {
        if (th2 != null) {
            ((DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(new Final(th2));
        }
        if (((DataStoreImpl) this.this$0).storageConnectionDelegate.isInitialized()) {
            this.this$0.getStorageConnection$datastore_core_release().close();
        }
    }
}
