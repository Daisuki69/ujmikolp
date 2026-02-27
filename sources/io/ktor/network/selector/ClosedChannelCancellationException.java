package io.ktor.network.selector;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class ClosedChannelCancellationException extends CancellationException {
    public ClosedChannelCancellationException() {
        super("Closed channel.");
    }
}
