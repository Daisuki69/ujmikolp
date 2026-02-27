package io.ktor.client.engine.cio;

/* JADX INFO: loaded from: classes4.dex */
public final class FailToConnectException extends Exception {
    public FailToConnectException() {
        super("Connect timed out or retry attempts exceeded");
    }
}
