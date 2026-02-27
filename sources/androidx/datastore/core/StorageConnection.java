package androidx.datastore.core;

import gj.InterfaceC1526a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qj.n;

/* JADX INFO: loaded from: classes.dex */
public interface StorageConnection<T> extends Closeable {
    InterProcessCoordinator getCoordinator();

    <R> Object readScope(n nVar, InterfaceC1526a<? super R> interfaceC1526a);

    Object writeScope(Function2<? super WriteScope<T>, ? super InterfaceC1526a<? super Unit>, ? extends Object> function2, InterfaceC1526a<? super Unit> interfaceC1526a);
}
