package X2;

import android.content.SharedPreferences;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import dOYHB6.yFtIp6.svM7M6;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class o {
    public static final Date e = new Date(-1);
    public static final Date f = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6519b = new Object();
    public final Object c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6520d = new Object();

    public o(SharedPreferences sharedPreferences) {
        this.f6518a = sharedPreferences;
    }

    public final n a() {
        n nVar;
        synchronized (this.c) {
            int i = this.f6518a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f6518a.getLong("backoff_end_time_in_millis", -1L));
            nVar = new n();
            nVar.f6516a = i;
            nVar.f6517b = date;
        }
        return nVar;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(svM7M6.getString(this.f6518a, "customSignals", WeJson.EMPTY_MAP));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public final n c() {
        n nVar;
        synchronized (this.f6520d) {
            int i = this.f6518a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f6518a.getLong("realtime_backoff_end_time_in_millis", -1L));
            nVar = new n();
            nVar.f6516a = i;
            nVar.f6517b = date;
        }
        return nVar;
    }

    public final void d(int i, Date date) {
        synchronized (this.c) {
            this.f6518a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(String str) {
        synchronized (this.f6519b) {
            this.f6518a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void f(Date date) {
        synchronized (this.f6520d) {
            this.f6518a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void g(int i, Date date) {
        synchronized (this.f6520d) {
            this.f6518a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void h() {
        synchronized (this.f6519b) {
            this.f6518a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void i() {
        synchronized (this.f6519b) {
            this.f6518a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
