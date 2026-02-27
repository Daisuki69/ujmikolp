package J1;

import Ej.Z;
import S1.r;
import We.s;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.dynatrace.android.agent.Global;
import com.voyager.glimpse.network.SendAnalyticsException;
import com.voyager.glimpse.network.http.HttpException;
import com.voyager.glimpse.network.http.UnknownException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Locale;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements M5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2381b;

    public /* synthetic */ e(int i) {
        this.f2380a = i;
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = androidx.media3.datasource.cache.c.l(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return androidx.camera.core.impl.a.j(str, " : ", str2);
    }

    public void a(String str) throws SendAnalyticsException {
        try {
            Z z4 = new Z(2);
            z4.f1430b = 2;
            HashMap map = (HashMap) z4.f1431d;
            if (map != null) {
                map.put(RtspHeaders.CONTENT_TYPE, "application/json");
            }
            HashMap map2 = (HashMap) z4.f1431d;
            if (map2 != null) {
                map2.put(RtspHeaders.ACCEPT, "application/json");
            }
            String str2 = "Basic " + this.f2381b;
            HashMap map3 = (HashMap) z4.f1431d;
            if (map3 != null) {
                map3.put(RtspHeaders.AUTHORIZATION, str2);
            }
            z4.e = str.getBytes();
            r.f("Sending Analytics:\n" + z4.toString());
            F.i iVarR = M2.b.R(z4);
            r.f("HTTP received response: " + iVarR.c + Global.BLANK + ((String) iVarR.f1504d));
        } catch (HttpException e) {
            throw new SendAnalyticsException("Http error: " + e.f16231a, e);
        } catch (UnknownException e7) {
            throw new SendAnalyticsException("Unknown error.", e7);
        } catch (IOException e10) {
            throw new SendAnalyticsException("Network error.", e10);
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", c(this.f2381b, str, objArr));
        }
    }

    @Override // M5.f
    public String d() {
        switch (this.f2380a) {
            case 1:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\"", "bank", "bank_code", this.f2381b);
            default:
                return String.format("SELECT * FROM %1$s WHERE %2$s LIKE '%3$s' ORDER BY %4$s IS NULL, %4$s ASC, %5$s COLLATE NOCASE ASC", Arrays.copyOf(new Object[]{"shop_provider", "categories", s.p(new StringBuilder("%\"code\":\""), this.f2381b, "\"%"), "priority", "display_name"}, 5));
        }
    }

    public e(String categoryCode, int i) {
        this.f2380a = i;
        switch (i) {
            case 2:
                j.g(categoryCode, "categoryCode");
                this.f2381b = categoryCode;
                break;
            default:
                this.f2381b = androidx.camera.core.impl.a.h("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(categoryCode);
                break;
        }
    }
}
