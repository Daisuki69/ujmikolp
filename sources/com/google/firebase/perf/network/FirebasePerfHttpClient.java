package com.google.firebase.perf.network;

import N2.d;
import P2.h;
import S2.f;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import defpackage.AbstractC1414e;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(f.f5648s);
        try {
            dVar.j(httpUriRequest.getURI().toString());
            dVar.c(httpUriRequest.getMethod());
            Long lA = h.a(httpUriRequest);
            if (lA != null) {
                dVar.e(lA.longValue());
            }
            timer.c();
            dVar.f(timer.f9858a);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            dVar.i(timer.a());
            dVar.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = h.a(httpResponseExecute);
            if (lA2 != null) {
                dVar.h(lA2.longValue());
            }
            String strB = h.b(httpResponseExecute);
            if (strB != null) {
                dVar.g(strB);
            }
            dVar.b();
            return httpResponseExecute;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(f.f5648s);
        try {
            dVar.j(httpUriRequest.getURI().toString());
            dVar.c(httpUriRequest.getMethod());
            Long lA = h.a(httpUriRequest);
            if (lA != null) {
                dVar.e(lA.longValue());
            }
            timer.c();
            dVar.f(timer.f9858a);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            dVar.i(timer.a());
            dVar.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = h.a(httpResponseExecute);
            if (lA2 != null) {
                dVar.h(lA2.longValue());
            }
            String strB = h.b(httpResponseExecute);
            if (strB != null) {
                dVar.g(strB);
            }
            dVar.b();
            return httpResponseExecute;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(f.f5648s);
        try {
            dVar.j(httpUriRequest.getURI().toString());
            dVar.c(httpUriRequest.getMethod());
            Long lA = h.a(httpUriRequest);
            if (lA != null) {
                dVar.e(lA.longValue());
            }
            timer.c();
            dVar.f(timer.f9858a);
            return (T) httpClient.execute(httpUriRequest, new P2.f(responseHandler, timer, dVar));
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(f.f5648s);
        try {
            dVar.j(httpUriRequest.getURI().toString());
            dVar.c(httpUriRequest.getMethod());
            Long lA = h.a(httpUriRequest);
            if (lA != null) {
                dVar.e(lA.longValue());
            }
            timer.c();
            dVar.f(timer.f9858a);
            return (T) httpClient.execute(httpUriRequest, new P2.f(responseHandler, timer, dVar), httpContext);
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(f.f5648s);
        try {
            dVar.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            dVar.c(httpRequest.getRequestLine().getMethod());
            Long lA = h.a(httpRequest);
            if (lA != null) {
                dVar.e(lA.longValue());
            }
            timer.c();
            dVar.f(timer.f9858a);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            dVar.i(timer.a());
            dVar.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = h.a(httpResponseExecute);
            if (lA2 != null) {
                dVar.h(lA2.longValue());
            }
            String strB = h.b(httpResponseExecute);
            if (strB != null) {
                dVar.g(strB);
            }
            dVar.b();
            return httpResponseExecute;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(f.f5648s);
        try {
            dVar.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            dVar.c(httpRequest.getRequestLine().getMethod());
            Long lA = h.a(httpRequest);
            if (lA != null) {
                dVar.e(lA.longValue());
            }
            timer.c();
            dVar.f(timer.f9858a);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            dVar.i(timer.a());
            dVar.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = h.a(httpResponseExecute);
            if (lA2 != null) {
                dVar.h(lA2.longValue());
            }
            String strB = h.b(httpResponseExecute);
            if (strB != null) {
                dVar.g(strB);
            }
            dVar.b();
            return httpResponseExecute;
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(f.f5648s);
        try {
            dVar.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            dVar.c(httpRequest.getRequestLine().getMethod());
            Long lA = h.a(httpRequest);
            if (lA != null) {
                dVar.e(lA.longValue());
            }
            timer.c();
            dVar.f(timer.f9858a);
            return (T) httpClient.execute(httpHost, httpRequest, new P2.f(responseHandler, timer, dVar));
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(f.f5648s);
        try {
            dVar.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            dVar.c(httpRequest.getRequestLine().getMethod());
            Long lA = h.a(httpRequest);
            if (lA != null) {
                dVar.e(lA.longValue());
            }
            timer.c();
            dVar.f(timer.f9858a);
            return (T) httpClient.execute(httpHost, httpRequest, new P2.f(responseHandler, timer, dVar), httpContext);
        } catch (IOException e) {
            AbstractC1414e.l(timer, dVar, dVar);
            throw e;
        }
    }
}
