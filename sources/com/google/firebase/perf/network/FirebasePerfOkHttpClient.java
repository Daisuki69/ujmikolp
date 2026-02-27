package com.google.firebase.perf.network;

import N2.d;
import P2.g;
import P2.h;
import S2.f;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfOkHttpClient {
    public static void a(Response response, d dVar, long j, long j6) {
        Request request = response.request();
        if (request == null) {
            return;
        }
        dVar.j(request.url().url().toString());
        dVar.c(request.method());
        if (request.body() != null) {
            long jContentLength = request.body().contentLength();
            if (jContentLength != -1) {
                dVar.e(jContentLength);
            }
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null) {
            long jContentLength2 = responseBodyBody.contentLength();
            if (jContentLength2 != -1) {
                dVar.h(jContentLength2);
            }
            MediaType mediaTypeContentType = responseBodyBody.contentType();
            if (mediaTypeContentType != null) {
                dVar.g(mediaTypeContentType.toString());
            }
        }
        dVar.d(response.code());
        dVar.f(j);
        dVar.i(j6);
        dVar.b();
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        Timer timer = new Timer();
        call.enqueue(new g(callback, f.f5648s, timer, timer.f9858a));
    }

    @Keep
    public static Response execute(Call call) throws IOException {
        d dVar = new d(f.f5648s);
        Timer timer = new Timer();
        long j = timer.f9858a;
        try {
            Response responseExecute = call.execute();
            a(responseExecute, dVar, j, timer.a());
            return responseExecute;
        } catch (IOException e) {
            Request request = call.request();
            if (request != null) {
                HttpUrl httpUrlUrl = request.url();
                if (httpUrlUrl != null) {
                    dVar.j(httpUrlUrl.url().toString());
                }
                if (request.method() != null) {
                    dVar.c(request.method());
                }
            }
            dVar.f(j);
            dVar.i(timer.a());
            h.c(dVar);
            throw e;
        }
    }
}
