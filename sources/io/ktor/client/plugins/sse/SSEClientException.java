package io.ktor.client.plugins.sse;

/* JADX INFO: loaded from: classes4.dex */
public final class SSEClientException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f17511a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17512b = null;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f17511a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f17512b;
    }
}
