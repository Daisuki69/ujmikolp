package androidx.media3.datasource.cache;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzds;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import x2.C2454a;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static void A(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static int a(int i, int i4) {
        return String.valueOf(i).length() + i4;
    }

    public static int b(int i, int i4, String str) {
        return str.length() + i + i4;
    }

    public static int c(int i, String str) {
        return String.valueOf(str).length() + i;
    }

    public static Bundle d(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static Bundle e(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        bundle.putString(str3, str4);
        return bundle;
    }

    public static IObjectWrapper f(Parcel parcel) {
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapperAsInterface;
    }

    public static String g(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String h(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static String i(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String j(long j, String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(j);
        return sb2.toString();
    }

    public static String k(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m(StringBuilder sb2, String str, int i, String str2) {
        sb2.append(str);
        sb2.append(i);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, int i, String str2, int i4) {
        sb2.append(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(i4);
        return sb2.toString();
    }

    public static HashMap o(Class cls, C2454a c2454a) {
        HashMap map = new HashMap();
        map.put(cls, c2454a);
        return map;
    }

    public static HashMap p(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    public static HashMap q(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put(str, str2);
        map.put(str3, str4);
        return map;
    }

    public static Map r(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static void s(int i, int i4, int i6, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i, i4, i6)));
    }

    public static void t(int i, HashMap map, String str, int i4, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i4));
    }

    public static void u(SharedPreferences sharedPreferences, String str, String str2) {
        sharedPreferences.edit().putString(str, str2).apply();
    }

    public static void v(Bundle bundle, String str) {
        bundle.putLong(str, zzt.zzk().currentTimeMillis());
    }

    public static void w(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    public static void x(StringBuilder sb2, String str, int i, String str2) {
        sb2.append(str);
        sb2.append(i);
        zzds.zzc(str2, sb2.toString());
    }

    public static void y(StringBuilder sb2, String str, int i, String str2, int i4) {
        sb2.append(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(i4);
    }

    public static void z(StringBuilder sb2, String str, long j, String str2) {
        sb2.append(str);
        sb2.append(j);
        sb2.append(str2);
    }
}
