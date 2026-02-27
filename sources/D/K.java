package D;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.svM7M6;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import k0.C1689a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f850a = new SimpleDateFormat(numX49.tnTj78("PeBQ"), Locale.US);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CleverTapInstanceConfig f851b;
    public final Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f852d;
    public final N.e e;
    public final Y.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0.c f853g;
    public final n0.c h;

    public K(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, Y.f fVar, N.e eVar, l0.c cVar, n0.c cVar2) {
        this.f851b = cleverTapInstanceConfig;
        this.c = context;
        this.f852d = str;
        this.f = fVar;
        this.e = eVar;
        this.f853g = cVar;
        this.h = cVar2;
        cVar.b().k(numX49.tnTj78("PeBt"), new CallableC0170c(5, this, str));
    }

    public static String b(CTInAppNotification cTInAppNotification) {
        String str = cTInAppNotification.f9487a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return cTInAppNotification.f9487a;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String d(String str, String str2) {
        return androidx.camera.core.impl.a.j(str, numX49.tnTj78("PeBU"), str2);
    }

    public final int[] a(String str) {
        String string = svM7M6.getString(b0.f(this.c, i(d(numX49.tnTj78("PeBe"), this.f852d))), str, null);
        if (string == null) {
            return new int[]{0, 0};
        }
        try {
            String[] strArrSplit = string.split(",");
            return strArrSplit.length != 2 ? new int[]{0, 0} : new int[]{Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1])};
        } catch (Throwable unused) {
            return new int[]{0, 0};
        }
    }

    public final int c(int i, String str) {
        boolean z4 = this.f851b.f9447p;
        Context context = this.c;
        if (!z4) {
            return b0.b(context, i, i(str));
        }
        int iB = b0.b(context, -1000, i(str));
        return iB != -1000 ? iB : b0.e(context).getInt(str, i);
    }

    public final String e(String str, String str2) {
        boolean z4 = this.f851b.f9447p;
        Context context = this.c;
        if (!z4) {
            return b0.g(context, i(str), str2);
        }
        String strG = b0.g(context, i(str), str2);
        return strG != null ? strG : svM7M6.getString(b0.e(context), str, str2);
    }

    public final void f(String str) {
        String strTnTj78 = numX49.tnTj78("PeB8");
        Context context = this.c;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f851b;
        S sC = cleverTapInstanceConfig.c();
        String str2 = cleverTapInstanceConfig.f9439a + numX49.tnTj78("PeBC");
        sC.getClass();
        S.s(str2, numX49.tnTj78("PeB4"));
        try {
            g(str);
            SimpleDateFormat simpleDateFormat = this.f850a;
            this.h.getClass();
            String str3 = simpleDateFormat.format(new Date());
            if (str3.equals(e(d(strTnTj78, str), "20140428"))) {
                return;
            }
            b0.l(context, i(d(strTnTj78, str)), str3);
            b0.k(context, 0, i(d("istc_inapp", str)));
            SharedPreferences sharedPreferencesF = b0.f(context, i(d("counts_per_inapp", str)));
            SharedPreferences.Editor editorEdit = sharedPreferencesF.edit();
            Map<String, ?> all = sharedPreferencesF.getAll();
            for (String str4 : all.keySet()) {
                Object obj = all.get(str4);
                if (obj instanceof String) {
                    String[] strArrSplit = ((String) obj).split(",");
                    if (strArrSplit.length != 2) {
                        editorEdit.remove(str4);
                    } else {
                        try {
                            editorEdit.putString(str4, "0," + strArrSplit[1]);
                        } catch (Throwable th2) {
                            S sC2 = cleverTapInstanceConfig.c();
                            sC2.getClass();
                            S.t(cleverTapInstanceConfig.f9439a, "Failed to reset todayCount for inapp " + str4, th2);
                        }
                    }
                } else {
                    editorEdit.remove(str4);
                }
            }
            b0.i(editorEdit);
        } catch (Exception e) {
            S sC3 = cleverTapInstanceConfig.c();
            String str5 = cleverTapInstanceConfig.f9439a;
            String str6 = numX49.tnTj78("PeBo") + e.getLocalizedMessage();
            sC3.getClass();
            S.s(str5, str6);
        }
    }

    public final void g(String str) {
        JSONArray jSONArray;
        Context context = this.c;
        String strTnTj78 = numX49.tnTj78("PeBK");
        SharedPreferences sharedPreferencesF = b0.f(context, strTnTj78);
        SharedPreferences sharedPreferencesF2 = b0.f(context, d(strTnTj78, str));
        SharedPreferences sharedPreferencesF3 = b0.f(context, i(d(strTnTj78, str)));
        Ag.a aVar = new Ag.a(11);
        String strTnTj782 = numX49.tnTj78("PeBw");
        kotlin.jvm.internal.j.g(sharedPreferencesF2, strTnTj782);
        Map<String, ?> all = sharedPreferencesF2.getAll();
        String strTnTj783 = numX49.tnTj78("PeBc");
        kotlin.jvm.internal.j.f(all, strTnTj783);
        if (all.isEmpty()) {
            kotlin.jvm.internal.j.g(sharedPreferencesF, strTnTj782);
            Map<String, ?> all2 = sharedPreferencesF.getAll();
            kotlin.jvm.internal.j.f(all2, strTnTj783);
            if (!all2.isEmpty()) {
                S.b(numX49.tnTj78("PeBh"));
                new Cg.c(sharedPreferencesF, sharedPreferencesF3, aVar).o();
                S.b(numX49.tnTj78("PeBM"));
            }
        } else {
            S.b(numX49.tnTj78("PeBm"));
            new Cg.c(sharedPreferencesF2, sharedPreferencesF3, aVar).o();
            S.b(numX49.tnTj78("PeBD"));
        }
        Y.f fVar = this.f;
        Y.d dVar = fVar.f6709a;
        Y.e eVar = fVar.c;
        if (dVar != null) {
            String str2 = (String) eVar.c;
            kotlin.jvm.internal.j.d(str2);
            C1689a c1689a = (C1689a) eVar.f6708b;
            try {
                jSONArray = new JSONArray(c1689a.b(str2, numX49.tnTj78("PeBN")));
            } catch (JSONException unused) {
                jSONArray = new JSONArray();
            }
            if (jSONArray.length() > 0) {
                S.b(numX49.tnTj78("PeB6"));
                dVar.b(jSONArray);
                c1689a.c(str2);
                S.b(numX49.tnTj78("PeBa"));
            }
        }
        String strTnTj784 = numX49.tnTj78("PeBX");
        if (e(d(strTnTj784, str), null) != null || e(strTnTj784, null) == null) {
            return;
        }
        S.l(numX49.tnTj78("PeBG"));
        b0.l(context, i(d(strTnTj784, str)), e(strTnTj784, numX49.tnTj78("PeB3")));
        String strTnTj785 = numX49.tnTj78("PeBy");
        b0.k(context, c(0, i(strTnTj785)), i(d(strTnTj785, str)));
    }

    public final void h(Context context, JSONObject jSONObject) {
        String strTnTj78 = numX49.tnTj78("PeBv");
        try {
            if (jSONObject.has(strTnTj78)) {
                JSONArray jSONArray = jSONObject.getJSONArray(strTnTj78);
                SharedPreferences.Editor editorEdit = b0.f(context, i(d("counts_per_inapp", this.f852d))).edit();
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj = jSONArray.get(i);
                    boolean z4 = obj instanceof Integer;
                    String strTnTj782 = numX49.tnTj78("PeB7");
                    if (z4) {
                        editorEdit.remove("" + obj);
                        S.b(strTnTj782 + obj);
                    } else if (obj instanceof String) {
                        editorEdit.remove((String) obj);
                        S.b(strTnTj782 + obj);
                    }
                }
                b0.i(editorEdit);
            }
        } catch (Throwable th2) {
            S.o(numX49.tnTj78("PeBA"), th2);
        }
    }

    public final String i(String str) {
        StringBuilder sbV = We.s.v(str, numX49.tnTj78("PeBY"));
        sbV.append(this.f851b.f9439a);
        return sbV.toString();
    }
}
