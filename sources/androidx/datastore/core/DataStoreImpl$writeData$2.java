package androidx.datastore.core;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.w;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
public final class DataStoreImpl$writeData$2<T> extends AbstractC1616j implements Function2<WriteScope<T>, InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ T $newData;
    final /* synthetic */ w $newVersion;
    final /* synthetic */ boolean $updateCache;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$2(w wVar, DataStoreImpl<T> dataStoreImpl, T t5, boolean z4, InterfaceC1526a<? super DataStoreImpl$writeData$2> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$newVersion = wVar;
        this.this$0 = dataStoreImpl;
        this.$newData = t5;
        this.$updateCache = z4;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.$newVersion, this.this$0, this.$newData, this.$updateCache, interfaceC1526a);
        dataStoreImpl$writeData$2.L$0 = obj;
        return dataStoreImpl$writeData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriteScope<T> writeScope, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((DataStoreImpl$writeData$2) create(writeScope, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r3.writeData(r7, r6) == r0) goto L16;
     */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            bj.AbstractC1039j.b(r7)
            goto L5b
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.L$1
            kotlin.jvm.internal.w r1 = (kotlin.jvm.internal.w) r1
            java.lang.Object r3 = r6.L$0
            androidx.datastore.core.WriteScope r3 = (androidx.datastore.core.WriteScope) r3
            bj.AbstractC1039j.b(r7)
            goto L43
        L24:
            bj.AbstractC1039j.b(r7)
            java.lang.Object r7 = r6.L$0
            androidx.datastore.core.WriteScope r7 = (androidx.datastore.core.WriteScope) r7
            kotlin.jvm.internal.w r1 = r6.$newVersion
            androidx.datastore.core.DataStoreImpl<T> r4 = r6.this$0
            androidx.datastore.core.InterProcessCoordinator r4 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r4)
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r3 = r4.incrementAndGetVersion(r6)
            if (r3 != r0) goto L40
            goto L5a
        L40:
            r5 = r3
            r3 = r7
            r7 = r5
        L43:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r1.f18193a = r7
            T r7 = r6.$newData
            r1 = 0
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = r3.writeData(r7, r6)
            if (r7 != r0) goto L5b
        L5a:
            return r0
        L5b:
            boolean r7 = r6.$updateCache
            if (r7 == 0) goto L7b
            androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
            androidx.datastore.core.DataStoreInMemoryCache r7 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r7)
            androidx.datastore.core.Data r0 = new androidx.datastore.core.Data
            T r1 = r6.$newData
            if (r1 == 0) goto L70
            int r2 = r1.hashCode()
            goto L71
        L70:
            r2 = 0
        L71:
            kotlin.jvm.internal.w r3 = r6.$newVersion
            int r3 = r3.f18193a
            r0.<init>(r1, r2, r3)
            r7.tryUpdate(r0)
        L7b:
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$writeData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
