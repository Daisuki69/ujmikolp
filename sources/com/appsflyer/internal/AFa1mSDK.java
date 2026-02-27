package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1mSDK {
    final AFc1xSDK AFInAppEventType;

    public AFa1mSDK() {
    }

    public static AFe1kSDK AFInAppEventType(Context context) {
        return context instanceof Activity ? AFe1kSDK.activity : context instanceof Application ? AFe1kSDK.application : AFe1kSDK.other;
    }

    private static Object AFKeystoreWrapper(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(AFKeystoreWrapper(it.next()));
                }
                return jSONArray;
            }
            if (!obj.getClass().isArray()) {
                return obj instanceof Map ? valueOf((Map<String, ?>) obj) : ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
            int length = Array.getLength(obj);
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < length; i++) {
                jSONArray2.put(AFKeystoreWrapper(Array.get(obj, i)));
            }
            return jSONArray2;
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static JSONObject valueOf(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), AFKeystoreWrapper(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    @NonNull
    @WorkerThread
    public final List<AFc1qSDK> AFInAppEventParameterName() {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.AFInAppEventType.AFKeystoreWrapper.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    StringBuilder sb2 = new StringBuilder("CACHE: Found cached request");
                    sb2.append(file2.getName());
                    AFLogger.afInfoLog(sb2.toString());
                    arrayList.add(AFInAppEventType(file2));
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e);
        }
        return arrayList;
    }

    public AFa1mSDK(AFc1xSDK aFc1xSDK) {
        this.AFInAppEventType = aFc1xSDK;
    }

    @Nullable
    public static JSONObject valueOf(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0027: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:11:0x0027 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.appsflyer.internal.AFc1qSDK AFInAppEventType(java.io.File r5) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "could not close load reader"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            long r3 = r5.length()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r2.read(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            com.appsflyer.internal.AFc1qSDK r4 = new com.appsflyer.internal.AFc1qSDK     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r4.AFKeystoreWrapper = r5     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L29
            r2.close()     // Catch: java.io.IOException -> L21
            return r4
        L21:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
            return r4
        L26:
            r5 = move-exception
            r1 = r2
            goto L3f
        L29:
            r5 = move-exception
            goto L2f
        L2b:
            r5 = move-exception
            goto L3f
        L2d:
            r5 = move-exception
            r2 = r1
        L2f:
            java.lang.String r3 = "error while loading request from cache"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r3, r5)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L3e
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r5 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r5)
        L3e:
            return r1
        L3f:
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.io.IOException -> L45
            goto L49
        L45:
            r1 = move-exception
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r1)
        L49:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1mSDK.AFInAppEventType(java.io.File):com.appsflyer.internal.AFc1qSDK");
    }

    public static Map<String, Object> valueOf(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objValueOf = jSONObject.get(next);
            if (objValueOf instanceof JSONArray) {
                objValueOf = AFKeystoreWrapper((JSONArray) objValueOf);
            } else if (objValueOf instanceof JSONObject) {
                objValueOf = valueOf((JSONObject) objValueOf);
            }
            map.put(next, objValueOf);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String valueOf(com.appsflyer.internal.AFc1qSDK r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1mSDK.valueOf(com.appsflyer.internal.AFc1qSDK):java.lang.String");
    }

    private static List<Object> AFKeystoreWrapper(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objValueOf = jSONArray.get(i);
            if (objValueOf instanceof JSONArray) {
                objValueOf = AFKeystoreWrapper((JSONArray) objValueOf);
            } else if (objValueOf instanceof JSONObject) {
                objValueOf = valueOf((JSONObject) objValueOf);
            }
            arrayList.add(objValueOf);
        }
        return arrayList;
    }

    @WorkerThread
    public final boolean AFInAppEventType(String str) {
        File file = new File(new File(this.AFInAppEventType.AFKeystoreWrapper.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb2 = new StringBuilder("CACHE: Deleting ");
        sb2.append(str);
        sb2.append(" from cache");
        AFLogger.afInfoLog(sb2.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder("CACHE: Could not delete ");
            sb3.append(str);
            sb3.append(" from cache");
            AFLogger.afErrorLog(sb3.toString(), e);
            return false;
        }
    }
}
