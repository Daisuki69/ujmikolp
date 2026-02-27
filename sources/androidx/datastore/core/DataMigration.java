package androidx.datastore.core;

import gj.InterfaceC1526a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface DataMigration<T> {
    Object cleanUp(InterfaceC1526a<? super Unit> interfaceC1526a);

    Object migrate(T t5, InterfaceC1526a<? super T> interfaceC1526a);

    Object shouldMigrate(T t5, InterfaceC1526a<? super Boolean> interfaceC1526a);
}
