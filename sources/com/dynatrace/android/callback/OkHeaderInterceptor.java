package com.dynatrace.android.callback;

import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class OkHeaderInterceptor implements Interceptor {
    static final OkHeaderInterceptor theInterceptor = new OkHeaderInterceptor();
    public Map<String, List<String>> responseHeaders = null;
    public Map<String, List<String>> requestHeaders = null;

    private OkHeaderInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        this.requestHeaders = request.headers().toMultimap();
        Response responseProceed = chain.proceed(request);
        this.responseHeaders = responseProceed.headers().toMultimap();
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "okhttp headers tracked");
        return responseProceed;
    }
}
