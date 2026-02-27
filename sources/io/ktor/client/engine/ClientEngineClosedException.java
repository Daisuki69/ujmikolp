package io.ktor.client.engine;

/* JADX INFO: loaded from: classes4.dex */
public final class ClientEngineClosedException extends IllegalStateException {
    public ClientEngineClosedException() {
        this(0);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    public ClientEngineClosedException(int i) {
        super("Client already closed");
    }
}
