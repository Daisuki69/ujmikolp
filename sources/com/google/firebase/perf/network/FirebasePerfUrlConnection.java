package com.google.firebase.perf.network;

import N2.d;
import P2.c;
import P2.h;
import S2.f;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        f fVar = f.f5648s;
        Timer timer = new Timer();
        timer.c();
        long j = timer.f9858a;
        d dVar = new d(fVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            return uRLConnectionOpenConnection instanceof HttpsURLConnection ? new P2.d((HttpsURLConnection) uRLConnectionOpenConnection, timer, dVar).f4987a.b() : uRLConnectionOpenConnection instanceof HttpURLConnection ? new c((HttpURLConnection) uRLConnectionOpenConnection, timer, dVar).f4986a.b() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e) {
            dVar.f(j);
            dVar.i(timer.a());
            dVar.j(url.toString());
            h.c(dVar);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        return obj instanceof HttpsURLConnection ? new P2.d((HttpsURLConnection) obj, new Timer(), new d(f.f5648s)) : obj instanceof HttpURLConnection ? new c((HttpURLConnection) obj, new Timer(), new d(f.f5648s)) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        f fVar = f.f5648s;
        Timer timer = new Timer();
        if (!fVar.c.get()) {
            return url.openConnection().getInputStream();
        }
        timer.c();
        long j = timer.f9858a;
        d dVar = new d(fVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            return uRLConnectionOpenConnection instanceof HttpsURLConnection ? new P2.d((HttpsURLConnection) uRLConnectionOpenConnection, timer, dVar).f4987a.e() : uRLConnectionOpenConnection instanceof HttpURLConnection ? new c((HttpURLConnection) uRLConnectionOpenConnection, timer, dVar).f4986a.e() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e) {
            dVar.f(j);
            dVar.i(timer.a());
            dVar.j(url.toString());
            h.c(dVar);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        f fVar = f.f5648s;
        Timer timer = new Timer();
        timer.c();
        long j = timer.f9858a;
        d dVar = new d(fVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new P2.d((HttpsURLConnection) uRLConnectionOpenConnection, timer, dVar).f4987a.c(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) uRLConnectionOpenConnection, timer, dVar).f4986a.c(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e) {
            dVar.f(j);
            dVar.i(timer.a());
            dVar.j(url.toString());
            h.c(dVar);
            throw e;
        }
    }
}
