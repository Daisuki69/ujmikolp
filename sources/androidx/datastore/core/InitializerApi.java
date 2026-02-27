package androidx.datastore.core;

import gj.InterfaceC1526a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface InitializerApi<T> {
    Object updateData(Function2<? super T, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super T> interfaceC1526a);
}
