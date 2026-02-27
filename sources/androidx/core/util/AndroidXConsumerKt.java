package androidx.core.util;

import gj.InterfaceC1526a;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidXConsumerKt {
    public static final <T> Consumer<T> asAndroidXConsumer(InterfaceC1526a<? super T> interfaceC1526a) {
        return new AndroidXContinuationConsumer(interfaceC1526a);
    }
}
