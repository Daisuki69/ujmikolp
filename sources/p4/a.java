package P4;

import M8.A0;
import N4.g;
import kotlin.jvm.internal.j;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        j.g(chain, "chain");
        String str = g.f3536d;
        Request request = chain.request();
        Headers headersBuild = request.headers().newBuilder().add("x-api-key", str).build();
        A0.w(2, str, "x-api-key");
        return chain.proceed(request.newBuilder().headers(headersBuild).method(request.method(), request.body()).build());
    }
}
