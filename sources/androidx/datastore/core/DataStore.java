package androidx.datastore.core;

import Ej.InterfaceC0230h;
import gj.InterfaceC1526a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface DataStore<T> {
    InterfaceC0230h getData();

    Object updateData(Function2<? super T, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super T> interfaceC1526a);
}
