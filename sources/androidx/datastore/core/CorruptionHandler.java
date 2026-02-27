package androidx.datastore.core;

import gj.InterfaceC1526a;

/* JADX INFO: loaded from: classes.dex */
public interface CorruptionHandler<T> {
    Object handleCorruption(CorruptionException corruptionException, InterfaceC1526a<? super T> interfaceC1526a);
}
