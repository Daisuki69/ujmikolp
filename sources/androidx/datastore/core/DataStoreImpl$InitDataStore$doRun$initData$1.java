package androidx.datastore.core;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
public final class DataStoreImpl$InitDataStore$doRun$initData$1<T> extends AbstractC1616j implements Function1<InterfaceC1526a<? super Data<T>>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl<T> dataStoreImpl, DataStoreImpl<T>.InitDataStore initDataStore, InterfaceC1526a<? super DataStoreImpl$InitDataStore$doRun$initData$1> interfaceC1526a) {
        super(1, interfaceC1526a);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1526a<? super Data<T>> interfaceC1526a) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create(interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws androidx.datastore.core.CorruptionException {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
