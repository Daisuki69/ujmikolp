package D;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f906a = Pattern.compile(numX49.tnTj78("PerF"));

    public static boolean a(String str, HashSet hashSet) {
        if (hashSet == null || str == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (JSONException e) {
                S.l(numX49.tnTj78("PerH") + e.getMessage());
            }
        }
        return arrayList;
    }

    public static HashMap c(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    map.putAll(c((JSONObject) obj));
                } else {
                    map.put(next, jSONObject.get(next));
                }
            } catch (Throwable unused) {
            }
        }
        return map;
    }

    public static Bitmap d(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static String e(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(numX49.tnTj78("PerO"));
        if (telephonyManager == null) {
            return numX49.tnTj78("PerQ");
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (ContextCompat.checkSelfPermission(context, numX49.tnTj78("Pert")) == 0) {
                try {
                    networkType = telephonyManager.getDataNetworkType();
                } catch (SecurityException e) {
                    S.b(numX49.tnTj78("PerU") + e.getMessage());
                    networkType = 0;
                }
            } else {
                S.b(numX49.tnTj78("Pere"));
            }
            networkType = 0;
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        if (networkType == 20) {
            return numX49.tnTj78("PerK");
        }
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return numX49.tnTj78("Pero");
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return numX49.tnTj78("Per4");
            case 13:
                return numX49.tnTj78("PerC");
            default:
                return numX49.tnTj78("Per8");
        }
    }

    public static c0.f f(boolean z4, Context context, c0.f fVar) {
        if (fVar.f9191a != null || !z4) {
            return fVar;
        }
        String strTnTj78 = numX49.tnTj78("Perw");
        try {
            Drawable applicationLogo = context.getPackageManager().getApplicationLogo(context.getApplicationInfo());
            if (applicationLogo == null) {
                throw new Exception("Logo is null");
            }
            Bitmap bitmapD = d(applicationLogo);
            kotlin.jvm.internal.j.g(bitmapD, strTnTj78);
            return new c0.f(bitmapD, c0.e.c, 0L, null);
        } catch (Exception e) {
            e.printStackTrace();
            Bitmap bitmapD2 = d(context.getPackageManager().getApplicationIcon(context.getApplicationInfo()));
            kotlin.jvm.internal.j.g(bitmapD2, strTnTj78);
            return new c0.f(bitmapD2, c0.e.c, 0L, null);
        }
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        return f906a.matcher(str).replaceAll(numX49.tnTj78("Perc")).toLowerCase(Locale.ENGLISH);
    }

    public static int h(Context context, String str) {
        if (context != null) {
            return context.getResources().getIdentifier(str, numX49.tnTj78("Perm"), context.getPackageName());
        }
        return -1;
    }

    public static void i(Runnable runnable) {
        if (runnable != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnable);
            }
        }
    }

    public static void j(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities != null) {
            String packageName = context.getPackageName();
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (packageName.equals(it.next().activityInfo.packageName)) {
                    intent.setPackage(packageName);
                    return;
                }
            }
        }
    }

    public static boolean k() {
        S.i(numX49.tnTj78("PerD"));
        return false;
    }
}
