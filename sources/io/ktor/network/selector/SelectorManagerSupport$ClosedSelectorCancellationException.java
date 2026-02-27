package io.ktor.network.selector;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class SelectorManagerSupport$ClosedSelectorCancellationException extends CancellationException {
    public SelectorManagerSupport$ClosedSelectorCancellationException() {
        super("Closed selector");
    }
}
