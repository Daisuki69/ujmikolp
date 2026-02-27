package j2;

import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: j2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1666e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17677a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17678b = 64;
    public final int c;

    public C1666e(int i) {
        this.c = i;
    }

    public static String b(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f17677a));
    }

    public final synchronized boolean c(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        String strB = b(this.c, str);
        if (this.f17677a.size() >= this.f17678b && !this.f17677a.containsKey(strB)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f17678b, null);
            return false;
        }
        String strB2 = b(this.c, str2);
        String str3 = (String) this.f17677a.get(strB);
        if (str3 == null ? strB2 == null : str3.equals(strB2)) {
            return false;
        }
        HashMap map = this.f17677a;
        if (str2 == null) {
            strB2 = "";
        }
        map.put(strB, strB2);
        return true;
    }

    public final synchronized void d(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strB = b(this.c, str);
                if (this.f17677a.size() < this.f17678b || this.f17677a.containsKey(strB)) {
                    String str2 = (String) entry.getValue();
                    this.f17677a.put(strB, str2 == null ? "" : b(this.c, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f17678b, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
