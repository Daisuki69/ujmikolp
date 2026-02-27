package androidx.core.util;

import gj.InterfaceC1526a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class RunnableKt {
    public static final Runnable asRunnable(InterfaceC1526a<? super Unit> interfaceC1526a) {
        return new ContinuationRunnable(interfaceC1526a);
    }
}
