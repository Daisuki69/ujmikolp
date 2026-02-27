package M5;

import Ch.g;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1233w;
import e2.C1422d;
import h2.w;
import hh.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.j;
import org.json.JSONObject;
import zj.z;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements f, o, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3082b;

    public static void a(U8.c cVar, Oa.d dVar) {
        String str = (String) dVar.f4780b;
        if (str != null) {
            cVar.r("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        cVar.r("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        cVar.r("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.2");
        cVar.r(RtspHeaders.ACCEPT, "application/json");
        String str2 = (String) dVar.c;
        if (str2 != null) {
            cVar.r("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = (String) dVar.e;
        if (str3 != null) {
            cVar.r("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = (String) dVar.f;
        if (str4 != null) {
            cVar.r("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = ((w) dVar.i).c().f16855a;
        if (str5 != null) {
            cVar.r("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(Oa.d dVar) {
        HashMap map = new HashMap();
        map.put("build_version", (String) dVar.h);
        map.put("display_version", (String) dVar.j);
        map.put("source", Integer.toString(dVar.f4781d));
        String str = (String) dVar.f4782g;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject c(Ri.a aVar) {
        StringBuilder sb2 = new StringBuilder("Settings response code was: ");
        int i = aVar.f5558b;
        sb2.append(i);
        String string = sb2.toString();
        C1422d c1422d = C1422d.f16556a;
        c1422d.f(string);
        String str = this.f3082b;
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str2 = (String) aVar.c;
            try {
                return new JSONObject(str2);
            } catch (Exception e) {
                c1422d.g("Failed to parse settings JSON from " + str, e);
                c1422d.g("Settings response " + str2, null);
            }
        } else {
            String str3 = "Settings request failed; (status: " + i + ") from " + str;
            if (c1422d.b(6)) {
                Log.e("FirebaseCrashlytics", str3, null);
                return null;
            }
        }
        return null;
    }

    @Override // M5.f
    public String d() {
        switch (this.f3081a) {
            case 0:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\" ORDER BY %4$s", "biller_v2", "categorySlug", this.f3082b, AppMeasurementSdk.ConditionalUserProperty.NAME);
            case 1:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\"", "nationality", "code", this.f3082b);
            default:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\" ORDER BY %4$s ASC, %5$s COLLATE NOCASE ASC, %6$s COLLATE NOCASE ASC, CASE WHEN %7$s = 0 THEN %8$s ELSE %9$s END", Arrays.copyOf(new Object[]{"product_v3", "provider", this.f3082b, "priority", "provider_display_name", AppMeasurementSdk.ConditionalUserProperty.NAME, "promo", "original_value", "discounted_value"}, 9));
        }
    }

    @Override // hh.o
    public boolean test(Object obj) {
        switch (this.f3081a) {
            case 3:
                return ((Set) obj).contains(this.f3082b);
            default:
                CTInboxMessage ctInboxMessage = (CTInboxMessage) obj;
                j.g(ctInboxMessage, "ctInboxMessage");
                ArrayList arrayList = ctInboxMessage.f9562n;
                if (arrayList.isEmpty() || !AbstractC1233w.h.contains(arrayList.get(0))) {
                    return false;
                }
                String str = this.f3082b;
                return str.length() == 0 || z.o((String) arrayList.get(0), str, true);
        }
    }

    public String toString() {
        switch (this.f3081a) {
            case 3:
                return this.f3082b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(String str, int i) {
        this.f3081a = i;
        this.f3082b = str;
    }

    public b(String mProviderName) {
        this.f3081a = 2;
        j.g(mProviderName, "mProviderName");
        this.f3082b = mProviderName;
    }

    public b(String str, mg.c cVar) {
        this.f3081a = 6;
        if (str != null) {
            this.f3082b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
