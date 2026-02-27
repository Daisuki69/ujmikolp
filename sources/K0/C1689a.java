package k0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.media3.datasource.cache.c;
import dOYHB6.yFtIp6.svM7M6;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: k0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1689a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f17826b;

    public C1689a(Context context, String str) {
        j.g(context, "context");
        this.f17825a = str;
        this.f17826b = new WeakReference(context);
    }

    public final long a(String key) {
        j.g(key, "key");
        SharedPreferences sharedPreferencesD = d();
        if (sharedPreferencesD == null) {
            return 0L;
        }
        return sharedPreferencesD.getLong(key, 0L);
    }

    public final String b(String key, String str) {
        j.g(key, "key");
        SharedPreferences sharedPreferencesD = d();
        return sharedPreferencesD == null ? str : svM7M6.getString(sharedPreferencesD, key, str);
    }

    public final void c(String key) {
        j.g(key, "key");
        SharedPreferences sharedPreferencesD = d();
        if (sharedPreferencesD == null) {
            return;
        }
        sharedPreferencesD.edit().remove(key).apply();
    }

    public final SharedPreferences d() {
        Context context = (Context) this.f17826b.get();
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(this.f17825a, 0);
    }

    public final void e(long j, String key) {
        j.g(key, "key");
        SharedPreferences sharedPreferencesD = d();
        if (sharedPreferencesD == null) {
            return;
        }
        sharedPreferencesD.edit().putLong(key, j).apply();
    }

    public final void f(String key, String value) {
        j.g(key, "key");
        j.g(value, "value");
        SharedPreferences sharedPreferencesD = d();
        if (sharedPreferencesD == null) {
            return;
        }
        c.u(sharedPreferencesD, key, value);
    }
}
