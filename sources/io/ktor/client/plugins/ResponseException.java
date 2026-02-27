package io.ktor.client.plugins;

import Kg.c;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class ResponseException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient c f17509a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseException(c response, String cachedResponseText) {
        super("Bad response: " + response + ". Text: \"" + cachedResponseText + '\"');
        j.g(response, "response");
        j.g(cachedResponseText, "cachedResponseText");
        this.f17509a = response;
    }
}
