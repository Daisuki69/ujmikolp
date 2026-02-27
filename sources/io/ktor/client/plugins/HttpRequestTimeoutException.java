package io.ktor.client.plugins;

import Bj.InterfaceC0164w;
import androidx.camera.core.impl.a;
import java.io.IOException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpRequestTimeoutException extends IOException implements InterfaceC0164w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f17507b;

    public HttpRequestTimeoutException(String url, Long l6, Throwable th2) {
        j.g(url, "url");
        StringBuilder sb2 = new StringBuilder("Request timeout has expired [url=");
        sb2.append(url);
        sb2.append(", request_timeout=");
        super(a.m(sb2, l6 == null ? "unknown" : l6, " ms]"), th2);
        this.f17506a = url;
        this.f17507b = l6;
    }

    @Override // Bj.InterfaceC0164w
    public final Throwable a() {
        return new HttpRequestTimeoutException(this.f17506a, this.f17507b, getCause());
    }
}
