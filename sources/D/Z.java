package D;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import dOYHB6.tiZVw8.numX49;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import p0.C2003b;

/* JADX INFO: loaded from: classes2.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f890b;
    public Serializable c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f891d;
    public Object e;
    public Object f;

    public Z(CleverTapInstanceConfig cleverTapInstanceConfig, ArrayList arrayList, InAppNotificationActivity inAppNotificationActivity, int i) {
        inAppNotificationActivity = (i & 4) != 0 ? null : inAppNotificationActivity;
        W w6 = new W(cleverTapInstanceConfig, 0);
        C0180m c0180m = new C0180m();
        kotlin.jvm.internal.j.g(cleverTapInstanceConfig, numX49.tnTj78("PeZd"));
        this.f890b = cleverTapInstanceConfig;
        this.c = arrayList;
        this.f891d = w6;
        this.e = c0180m;
        this.f = new WeakReference(inAppNotificationActivity);
    }

    public void a(JSONObject jSONObject) {
        String[] strArrSplit;
        S.c("variables", numX49.tnTj78("PeZi") + jSONObject + numX49.tnTj78("PeZE"));
        if (jSONObject == null) {
            b();
            return;
        }
        this.f889a = true;
        HashMap mapX = x3.d.x(jSONObject);
        HashMap map = new HashMap();
        for (Map.Entry entry : mapX.entrySet()) {
            String str = (String) entry.getKey();
            if (str.contains(numX49.tnTj78("PeZF"))) {
                try {
                    strArrSplit = str.split("\\.");
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    strArrSplit = new String[0];
                }
                int length = strArrSplit.length - 1;
                Map map2 = map;
                for (int i = 0; i < strArrSplit.length; i++) {
                    String str2 = strArrSplit[i];
                    if (i == length) {
                        map2.put(str2, entry.getValue());
                    } else if (map2.get(str2) instanceof Map) {
                        map2 = (Map) map2.get(str2);
                    } else {
                        HashMap map3 = new HashMap();
                        map2.put(str2, map3);
                        map2 = map3;
                    }
                }
            } else {
                map.put((String) entry.getKey(), entry.getValue());
            }
        }
        P5.N n7 = (P5.N) this.f;
        C2003b c2003b = new C2003b(this, 0);
        synchronized (n7) {
            HashMap map4 = new HashMap((ConcurrentHashMap) n7.f5026b);
            n7.a(map, map4);
            n7.e(map4, c2003b);
            l0.b.a((CleverTapInstanceConfig) n7.e).b().k("VarCache#saveDiffsAsync", new CallableC0168a(n7, 17));
            n7.f();
        }
    }

    public void b() {
        if (this.f889a) {
            return;
        }
        this.f889a = true;
        P5.N n7 = (P5.N) this.f;
        C2003b c2003b = new C2003b(this, 1);
        synchronized (n7) {
            n7.c(c2003b);
            n7.f();
        }
    }

    public boolean c(Context context) {
        kotlin.jvm.internal.j.g(context, numX49.tnTj78("PeZH"));
        ((C0180m) this.e).getClass();
        return ContextCompat.checkSelfPermission(context, numX49.tnTj78("PeZO")) == 0;
    }

    public void d() {
        Bundle bundle;
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
            }
        }
        Y y7 = (Y) ((WeakReference) this.f).get();
        if (y7 != null) {
            InAppNotificationActivity inAppNotificationActivity = (InAppNotificationActivity) y7;
            CTInAppNotification cTInAppNotification = inAppNotificationActivity.f9456d;
            if (cTInAppNotification == null || !cTInAppNotification.f9500q) {
                bundle = null;
            } else {
                bundle = new Bundle();
                bundle.putString("wzrk_c2a", ((CTInAppNotificationButton) inAppNotificationActivity.f9456d.i.get(0)).f9509a);
                bundle.putString("wzrk_id", numX49.tnTj78("PeZQ"));
            }
            inAppNotificationActivity.h1(bundle, true);
        }
    }

    public void e(FragmentActivity fragmentActivity, int i, int[] iArr) {
        kotlin.jvm.internal.j.g(iArr, numX49.tnTj78("PeZt"));
        ((C0181n) ((Function1) this.f891d).invoke(fragmentActivity)).getClass();
        C0181n.c = false;
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f890b;
        kotlin.jvm.internal.j.g(cleverTapInstanceConfig, numX49.tnTj78("PeZU"));
        l0.b.a(cleverTapInstanceConfig).a().k("updateCacheToDisk", new CallableC0168a(fragmentActivity, 1));
        if (i == 102) {
            Integer numValueOf = iArr.length == 0 ? null : Integer.valueOf(iArr[0]);
            if (numValueOf != null) {
                numValueOf.intValue();
            }
            d();
        }
    }

    public boolean f(Activity activity, boolean z4, X x6) {
        if (c(activity)) {
            d();
            return false;
        }
        ((C0181n) ((Function1) this.f891d).invoke(activity)).getClass();
        boolean z5 = C0181n.c;
        boolean zShouldShowRequestPermissionRationale = ActivityCompat.shouldShowRequestPermissionRationale(activity, numX49.tnTj78("PeZe"));
        if (z5 || zShouldShowRequestPermissionRationale) {
            x6.b();
            return true;
        }
        if (!z4) {
            d();
            return false;
        }
        this.f889a = true;
        Pattern pattern = d0.f906a;
        Intent intent = new Intent();
        int i = Build.VERSION.SDK_INT;
        String strTnTj78 = numX49.tnTj78("PeZ8");
        if (i >= 26) {
            intent.setAction(strTnTj78);
            intent.putExtra(numX49.tnTj78("PeZC"), activity.getPackageName());
            intent.addFlags(268435456);
        } else {
            intent.setAction(strTnTj78);
            intent.putExtra(numX49.tnTj78("PeZ4"), activity.getPackageName());
            intent.putExtra(numX49.tnTj78("PeZo"), activity.getApplicationInfo().uid);
        }
        activity.startActivity(intent);
        return true;
    }

    public void g() {
        synchronized (((ArrayList) this.f891d)) {
            try {
                Iterator it = ((ArrayList) this.f891d).iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    Pattern pattern = d0.f906a;
                }
            } finally {
            }
        }
        synchronized (((ArrayList) this.e)) {
            try {
                Iterator it2 = ((ArrayList) this.e).iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                    Pattern pattern2 = d0.f906a;
                }
                ((ArrayList) this.e).clear();
            } finally {
            }
        }
    }
}
