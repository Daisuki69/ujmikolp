package io.ktor.client.plugins;

import Kg.c;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ServerResponseException extends ResponseException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17510b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerResponseException(c response, String cachedResponseText) {
        super(response, cachedResponseText);
        j.g(response, "response");
        j.g(cachedResponseText, "cachedResponseText");
        this.f17510b = "Server error(" + response.b().c().r().f4439a + ' ' + response.b().c().getUrl() + ": " + response.f() + ". Text: \"" + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f17510b;
    }
}
