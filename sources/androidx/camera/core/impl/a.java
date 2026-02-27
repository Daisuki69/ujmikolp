package androidx.camera.core.impl;

import android.content.ContentProviderClient;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.fragment.app.Fragment;
import androidx.media3.common.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static void A(SharedPreferences sharedPreferences, String str, boolean z4) {
        sharedPreferences.edit().putBoolean(str, z4).apply();
    }

    public static /* synthetic */ void B(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            androidx.core.location.a.y((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }

    public static void C(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static void D(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    public static int a(int i, int i4, int i6, int i10) {
        return ((i * i4) / i6) + i10;
    }

    public static Object b(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String c(int i, int i4, String str, String str2) {
        return str + i + str2 + i4;
    }

    public static String d(int i, String str, String str2, String str3, String str4) {
        return str + str2 + str3 + i + str4;
    }

    public static String e(int i, StringBuilder sb2) {
        sb2.append(Integer.toHexString(i));
        return sb2.toString();
    }

    public static String f(long j, String str) {
        return str + j;
    }

    public static String g(Class cls, String str) {
        return str + cls;
    }

    public static String h(String str, int i, String str2, int i4, String str3) {
        return str + i + str2 + i4 + str3;
    }

    public static String i(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(StringBuilder sb2, char c, String str) {
        sb2.append(c);
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, str);
        return string;
    }

    public static String l(StringBuilder sb2, int i, int i4) {
        sb2.append(i - i4);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, Object obj, String str) {
        sb2.append(obj);
        sb2.append(str);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, char c) {
        sb2.append(str);
        sb2.append(c);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, int i) {
        sb2.append(str);
        sb2.append(i);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static String q(StringBuilder sb2, boolean z4, char c) {
        sb2.append(z4);
        sb2.append(c);
        return sb2.toString();
    }

    public static StringBuilder r(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(i);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder s(long j, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder t(CharSequence charSequence, String str, CharSequence charSequence2, String str2, CharSequence charSequence3) {
        kotlin.jvm.internal.j.g(charSequence, str);
        kotlin.jvm.internal.j.g(charSequence2, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence3);
        return sb2;
    }

    public static StringBuilder u(CharSequence charSequence, String str, Function1 function1, String str2, CharSequence charSequence2) {
        kotlin.jvm.internal.j.g(charSequence, str);
        kotlin.jvm.internal.j.g(function1, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        return sb2;
    }

    public static StringBuilder v(CharSequence charSequence, String str, Function2 function2, String str2, CharSequence charSequence2) {
        kotlin.jvm.internal.j.g(charSequence, str);
        kotlin.jvm.internal.j.g(function2, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        return sb2;
    }

    public static StringBuilder w(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static void x(int i, int i4, Function1 function1) {
        function1.invoke(Integer.valueOf(i + i4));
    }

    public static void y(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    public static void z(int i, HashMap map, String str, int i4, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i4));
    }
}
