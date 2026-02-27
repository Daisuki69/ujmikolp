package Xe;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import z.AbstractC2540b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements AutoCloseable, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6604b;

    public /* synthetic */ a(Object obj, int i) {
        this.f6603a = i;
        this.f6604b = obj;
    }

    public static String c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Callback.getErrorStream(httpURLConnection)));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb2.append(line);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return sb2.toString();
    }

    public String b() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f6604b;
        boolean z4 = false;
        try {
            if (Callback.getResponseCode(httpURLConnection) / 100 == 2) {
                z4 = true;
            }
        } catch (IOException unused) {
        }
        if (z4) {
            return null;
        }
        try {
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + Callback.getResponseCode(httpURLConnection) + Global.NEWLINE + c(httpURLConnection);
        } catch (IOException e) {
            AbstractC2540b.c("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        switch (this.f6603a) {
            case 0:
                d dVar = (d) this.f6604b;
                c cVar = (c) dVar.c.get();
                if (cVar == null) {
                    throw new IllegalStateException("Not in transaction.");
                }
                dVar.c.set(cVar.f6607a);
                dVar.getClass();
                dVar.f6609a.getWritableDatabase().endTransaction();
                if (cVar.f6608b) {
                    dVar.f(cVar);
                    return;
                }
                return;
            default:
                ((HttpURLConnection) this.f6604b).disconnect();
                return;
        }
    }

    public void f() {
        d dVar = (d) this.f6604b;
        dVar.getClass();
        dVar.f6609a.getWritableDatabase().setTransactionSuccessful();
    }
}
