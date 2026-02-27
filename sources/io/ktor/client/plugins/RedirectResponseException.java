package io.ktor.client.plugins;

import Kg.c;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RedirectResponseException extends ResponseException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectResponseException(c response, String cachedResponseText) {
        super(response, cachedResponseText);
        j.g(response, "response");
        j.g(cachedResponseText, "cachedResponseText");
        this.f17508b = "Unhandled redirect: " + response.b().c().r().f4439a + ' ' + response.b().c().getUrl() + ". Status: " + response.f() + ". Text: \"" + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f17508b;
    }
}
