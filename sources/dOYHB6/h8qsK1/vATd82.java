package dOYHB6.h8qsK1;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import dOYHB6.nm8AQ4;
import dOYHB6.tiZVw8.numX49;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class vATd82 {
    private static final int flags = 20527;

    private static void fsQMz2(JSONObject jSONObject, PackageInfo packageInfo) throws JSONException {
        if (packageInfo.activities == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (ActivityInfo activityInfo : packageInfo.activities) {
            jSONArray.put(activityInfo.name);
        }
        jSONObject.put(numX49.tnTj78("bHRP"), jSONArray);
    }

    public static String g0SRC2() {
        try {
            return g0SRC2(nm8AQ4.get());
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        } catch (JSONException e7) {
            return null;
        }
    }

    private static String g0SRC2(Context context) throws JSONException, PackageManager.NameNotFoundException {
        JSONObject jSONObject = new JSONObject();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), flags);
        fsQMz2(jSONObject, packageInfo);
        n6hT95(jSONObject, packageInfo);
        gTe6Q6(jSONObject, packageInfo);
        pcTCr0(jSONObject, packageInfo);
        yNsoK9(jSONObject, packageInfo);
        gbRtj8(jSONObject, packageInfo);
        return jSONObject.toString();
    }

    private static void gTe6Q6(JSONObject jSONObject, PackageInfo packageInfo) throws JSONException {
        if (packageInfo.receivers == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (ActivityInfo activityInfo : packageInfo.receivers) {
            if (!activityInfo.name.startsWith(numX49.tnTj78("bHRZ"))) {
                jSONArray.put(activityInfo.name);
            }
        }
        jSONObject.put(numX49.tnTj78("bHRk"), jSONArray);
    }

    private static void gbRtj8(JSONObject jSONObject, PackageInfo packageInfo) throws JSONException {
        if (packageInfo.reqFeatures == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (FeatureInfo featureInfo : packageInfo.reqFeatures) {
            if (featureInfo.name == null) {
                jSONArray.put(String.format(numX49.tnTj78("bHRb"), Integer.valueOf(featureInfo.reqGlEsVersion)));
            } else {
                jSONArray.put(featureInfo.name);
            }
        }
        jSONObject.put(numX49.tnTj78("bHR2"), jSONArray);
    }

    private static void n6hT95(JSONObject jSONObject, PackageInfo packageInfo) throws JSONException {
        if (packageInfo.permissions == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (PermissionInfo permissionInfo : packageInfo.permissions) {
            jSONArray.put(permissionInfo.name);
        }
        jSONObject.put(numX49.tnTj78("bHRL"), jSONArray);
    }

    private static void pcTCr0(JSONObject jSONObject, PackageInfo packageInfo) throws JSONException {
        if (packageInfo.services == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (ServiceInfo serviceInfo : packageInfo.services) {
            if (!serviceInfo.name.startsWith(numX49.tnTj78("bHRB"))) {
                jSONArray.put(serviceInfo.name);
            }
        }
        jSONObject.put(numX49.tnTj78("bHRu"), jSONArray);
    }

    private static void yNsoK9(JSONObject jSONObject, PackageInfo packageInfo) throws JSONException {
        if (packageInfo.providers == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (ProviderInfo providerInfo : packageInfo.providers) {
            jSONArray.put(providerInfo.name);
        }
        jSONObject.put(numX49.tnTj78("bHRr"), jSONArray);
    }
}
