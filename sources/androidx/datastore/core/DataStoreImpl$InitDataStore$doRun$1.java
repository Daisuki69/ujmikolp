package androidx.datastore.core;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
public final class DataStoreImpl$InitDataStore$doRun$1 extends AbstractC1609c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$1(DataStoreImpl<T>.InitDataStore initDataStore, InterfaceC1526a<? super DataStoreImpl$InitDataStore$doRun$1> interfaceC1526a) {
        super(interfaceC1526a);
        this.this$0 = initDataStore;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doRun(this);
    }
}
