package androidx.datastore.core;

import gj.InterfaceC1526a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface WriteScope<T> extends ReadScope<T> {
    Object writeData(T t5, InterfaceC1526a<? super Unit> interfaceC1526a);
}
