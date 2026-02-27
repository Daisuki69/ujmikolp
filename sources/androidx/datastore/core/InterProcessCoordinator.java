package androidx.datastore.core;

import Ej.InterfaceC0230h;
import gj.InterfaceC1526a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface InterProcessCoordinator {
    InterfaceC0230h getUpdateNotifications();

    Object getVersion(InterfaceC1526a<? super Integer> interfaceC1526a);

    Object incrementAndGetVersion(InterfaceC1526a<? super Integer> interfaceC1526a);

    <T> Object lock(Function1<? super InterfaceC1526a<? super T>, ? extends Object> function1, InterfaceC1526a<? super T> interfaceC1526a);

    <T> Object tryLock(Function2<? super Boolean, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super T> interfaceC1526a);
}
