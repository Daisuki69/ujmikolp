package F1;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements M5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1526b;

    public static String e(String str, String str2, Object... objArr) {
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

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", e(this.f1526b, str, objArr));
        }
    }

    public void b(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f1526b, str, objArr), remoteException);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.f1526b, str, objArr));
        }
    }

    @Override // M5.f
    public String d() {
        switch (this.f1525a) {
            case 1:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\"", "country", "code", this.f1526b);
            case 2:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\"", "bank", "bank_ic", this.f1526b);
            default:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\" ORDER BY %4$s", "shop_purchase_history", "status", this.f1526b, MPDbAdapter.KEY_CREATED_AT);
        }
    }

    public k(String str) {
        this.f1525a = 0;
        this.f1526b = androidx.camera.core.impl.a.h("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }
}
