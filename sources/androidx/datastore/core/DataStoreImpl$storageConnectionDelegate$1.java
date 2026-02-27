package androidx.datastore.core;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl$storageConnectionDelegate$1<T> extends k implements Function0<StorageConnection<T>> {
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$storageConnectionDelegate$1(DataStoreImpl<T> dataStoreImpl) {
        super(0);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final StorageConnection<T> invoke() {
        return ((DataStoreImpl) this.this$0).storage.createConnection();
    }
}
