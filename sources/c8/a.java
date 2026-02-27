package C8;

import D.C0190x;
import L8.d;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.HttpException;
import retrofit2.Response;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f759d;

    public a(com.paymaya.data.preference.a mPreference, int i) {
        switch (i) {
            case 1:
                this.f759d = mPreference;
                break;
            default:
                j.g(mPreference, "mPreference");
                this.f759d = mPreference;
                break;
        }
    }

    public static int k(Throwable th2) {
        Response<?> response;
        ResponseBody responseBodyErrorBody;
        if ((th2 instanceof HttpException) && (response = ((HttpException) th2).response()) != null && (responseBodyErrorBody = response.errorBody()) != null) {
            try {
                return new JSONObject(responseBodyErrorBody.string()).optInt("code", 0);
            } catch (JSONException unused) {
                yk.a.b();
            }
        }
        return 0;
    }

    public static /* synthetic */ void m(a aVar, Throwable th2, Function0 function0, Function1 function1, int i) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        aVar.l(th2, function0, null, function1);
    }

    public void l(Throwable throwable, Function0 function0, C0190x c0190x, Function1 function1) {
        j.g(throwable, "throwable");
        if (function0 == null && c0190x == null) {
            int iK = k(throwable);
            if (iK != 30100) {
                function1.invoke(Integer.valueOf(iK));
                return;
            } else {
                this.f759d.r0(true);
                ((d) this.c.get()).q();
                return;
            }
        }
        int iK2 = k(throwable);
        if (iK2 == 30100) {
            this.f759d.r0(true);
            ((d) this.c.get()).q();
            return;
        }
        if (iK2 == 40200) {
            if (function0 != null) {
                ((d) this.c.get()).j1();
                function0.invoke();
                return;
            }
            return;
        }
        if (iK2 != 20303) {
            function1.invoke(Integer.valueOf(iK2));
            return;
        }
        if (c0190x != null) {
            String strK = this.f759d.k();
            if (j.b(strK, "0")) {
                c.u(this.f759d.f11330b, "key_kyc_status", "submitted");
            } else if (!j.b(strK, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                return;
            } else {
                this.f759d.n0("submitted");
            }
            c0190x.invoke();
        }
    }

    public void n(Throwable throwable, Function1 function1) {
        Response<?> response;
        ResponseBody responseBodyErrorBody;
        j.g(throwable, "throwable");
        int iOptInt = 0;
        if ((throwable instanceof HttpException) && (response = ((HttpException) throwable).response()) != null && (responseBodyErrorBody = response.errorBody()) != null) {
            try {
                iOptInt = new JSONObject(responseBodyErrorBody.string()).optInt("code", 0);
            } catch (JSONException unused) {
                yk.a.b();
            }
        }
        if (iOptInt != 1200) {
            function1.invoke(Integer.valueOf(iOptInt));
        } else {
            this.f759d.r0(true);
            ((Ea.a) this.c.get()).q();
        }
    }
}
