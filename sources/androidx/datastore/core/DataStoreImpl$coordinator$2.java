package androidx.datastore.core;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl$coordinator$2 extends k implements Function0<InterProcessCoordinator> {
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$coordinator$2(DataStoreImpl<T> dataStoreImpl) {
        super(0);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterProcessCoordinator invoke() {
        return this.this$0.getStorageConnection$datastore_core_release().getCoordinator();
    }
}
