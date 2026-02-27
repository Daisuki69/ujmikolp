package z2;

import android.util.Base64OutputStream;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f21357b;

    public /* synthetic */ b(c cVar, int i) {
        this.f21356a = i;
        this.f21357b = cVar;
    }

    private final Object a() {
        String string;
        c cVar = this.f21357b;
        synchronized (cVar) {
            try {
                h hVar = (h) cVar.f21358a.get();
                ArrayList arrayListC = hVar.c();
                hVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayListC.size(); i++) {
                    C2551a c2551a = (C2551a) arrayListC.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c2551a.f21354a);
                    jSONObject.put("dates", new JSONArray((Collection) c2551a.f21355b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", ExifInterface.GPS_MEASUREMENT_2D);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f21356a) {
            case 0:
                return a();
            default:
                c cVar = this.f21357b;
                synchronized (cVar) {
                    ((h) cVar.f21358a.get()).k(System.currentTimeMillis(), ((V2.b) cVar.c.get()).a());
                    break;
                }
                return null;
        }
    }
}
