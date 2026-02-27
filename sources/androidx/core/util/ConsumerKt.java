package androidx.core.util;

import androidx.annotation.RequiresApi;
import gj.InterfaceC1526a;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class ConsumerKt {
    @RequiresApi(24)
    public static final <T> java.util.function.Consumer<T> asConsumer(InterfaceC1526a<? super T> interfaceC1526a) {
        return androidx.core.location.a.q(new ContinuationConsumer(interfaceC1526a));
    }
}
