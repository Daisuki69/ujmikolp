package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import java.util.HashMap;
import java.util.Map;
import mx_android.support.v7.media.MediaRouteProviderProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1sSDK {
    public volatile String AFInAppEventParameterName;
    Map<String, Object> AFInAppEventType;

    @Nullable
    public volatile String AFKeystoreWrapper;

    @NonNull
    private final AFe1tSDK afRDLog;

    @NonNull
    public final AFc1xSDK valueOf;
    private boolean AFLogger = false;
    public volatile boolean values = false;

    public AFe1sSDK(@NonNull AFc1xSDK aFc1xSDK, @NonNull AFe1tSDK aFe1tSDK) {
        this.valueOf = aFc1xSDK;
        this.afRDLog = aFe1tSDK;
    }

    private boolean AFInAppEventType() {
        Map<String, Object> map = this.AFInAppEventType;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public final boolean AFInAppEventParameterName() {
        return this.values;
    }

    @NonNull
    public final Map<String, Object> AFKeystoreWrapper() {
        HashMap map = new HashMap();
        if (AFInAppEventType()) {
            map.put("lvl", this.AFInAppEventType);
            return map;
        }
        if (this.AFLogger) {
            HashMap map2 = new HashMap();
            this.AFInAppEventType = map2;
            map2.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "operation timed out.");
            map.put("lvl", this.AFInAppEventType);
        }
        return map;
    }

    public final boolean valueOf() {
        return this.AFLogger && !AFInAppEventType();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String values(com.appsflyer.internal.AFb1gSDK r8) {
        /*
            r7 = this;
            java.lang.String r0 = "use cached IMEI: "
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "collectIMEI"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            java.lang.String r2 = "imeiCached"
            r3 = 0
            java.lang.String r4 = r8.AFInAppEventParameterName(r2, r3)
            if (r1 == 0) goto L99
            java.lang.String r1 = r7.AFKeystoreWrapper
            boolean r1 = com.appsflyer.internal.AFb1nSDK.values(r1)
            if (r1 == 0) goto L99
            com.appsflyer.internal.AFc1xSDK r1 = r7.valueOf
            android.content.Context r1 = r1.AFKeystoreWrapper
            if (r1 == 0) goto La0
            boolean r5 = AFInAppEventType(r1)
            if (r5 == 0) goto La0
            java.lang.String r5 = "phone"
            java.lang.Object r1 = r1.getSystemService(r5)     // Catch: java.lang.Exception -> L50 java.lang.reflect.InvocationTargetException -> L52
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Exception -> L50 java.lang.reflect.InvocationTargetException -> L52
            java.lang.Class r5 = r1.getClass()     // Catch: java.lang.Exception -> L50 java.lang.reflect.InvocationTargetException -> L52
            java.lang.String r6 = "getDeviceId"
            java.lang.reflect.Method r5 = r5.getMethod(r6, r3)     // Catch: java.lang.Exception -> L50 java.lang.reflect.InvocationTargetException -> L52
            java.lang.Object r1 = r5.invoke(r1, r3)     // Catch: java.lang.Exception -> L50 java.lang.reflect.InvocationTargetException -> L52
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L50 java.lang.reflect.InvocationTargetException -> L52
            if (r1 == 0) goto L46
            goto La1
        L46:
            if (r4 == 0) goto L54
            java.lang.String r1 = r0.concat(r4)     // Catch: java.lang.Exception -> L50 java.lang.reflect.InvocationTargetException -> L52
            com.appsflyer.AFLogger.afDebugLog(r1)     // Catch: java.lang.Exception -> L50 java.lang.reflect.InvocationTargetException -> L52
            goto L55
        L50:
            r1 = move-exception
            goto L57
        L52:
            r1 = move-exception
            goto L78
        L54:
            r4 = r3
        L55:
            r1 = r4
            goto La1
        L57:
            if (r4 == 0) goto L61
            java.lang.String r0 = r0.concat(r4)
            com.appsflyer.AFLogger.afDebugLog(r0)
            goto L62
        L61:
            r4 = r3
        L62:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "WARNING: Can't collect IMEI: other reason: "
            r0.<init>(r5)
            java.lang.String r5 = r1.getMessage()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
            goto L55
        L78:
            if (r4 == 0) goto L82
            java.lang.String r0 = r0.concat(r4)
            com.appsflyer.AFLogger.afDebugLog(r0)
            goto L83
        L82:
            r4 = r3
        L83:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "WARNING: Can't collect IMEI because of missing permissions: "
            r0.<init>(r5)
            java.lang.String r5 = r1.getMessage()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
            goto L55
        L99:
            java.lang.String r0 = r7.AFKeystoreWrapper
            if (r0 == 0) goto La0
            java.lang.String r1 = r7.AFKeystoreWrapper
            goto La1
        La0:
            r1 = r3
        La1:
            boolean r0 = com.appsflyer.internal.AFb1nSDK.values(r1)
            if (r0 != 0) goto Lab
            r8.AFInAppEventType(r2, r1)
            return r1
        Lab:
            java.lang.String r8 = "IMEI was not collected."
            com.appsflyer.AFLogger.afInfoLog(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1sSDK.values(com.appsflyer.internal.AFb1gSDK):java.lang.String");
    }

    private static boolean AFInAppEventType(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFb1wSDK.AFKeystoreWrapper();
        return !AFb1wSDK.AFKeystoreWrapper(context);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.appsflyer.internal.AFe1tSDK.1.<init>(com.appsflyer.internal.AFe1tSDK, com.appsflyer.internal.AFe1tSDK$AFa1vSDK):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:298)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:197)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final boolean values() {
        /*
            r14 = this;
            r0 = 2
            r1 = 3
            r2 = 1
            r3 = 0
            java.lang.String r4 = "com.appsflyer.lvl.AppsFlyerLVL"
            java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L90
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.ClassNotFoundException -> L90
            com.appsflyer.internal.AFe1tSDK r7 = r14.afRDLog     // Catch: java.lang.ClassNotFoundException -> L90
            com.appsflyer.internal.AFc1xSDK r8 = r14.valueOf     // Catch: java.lang.ClassNotFoundException -> L90
            android.content.Context r8 = r8.AFKeystoreWrapper     // Catch: java.lang.ClassNotFoundException -> L90
            com.appsflyer.internal.AFe1sSDK$5 r9 = new com.appsflyer.internal.AFe1sSDK$5     // Catch: java.lang.ClassNotFoundException -> L90
            r9.<init>()     // Catch: java.lang.ClassNotFoundException -> L90
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.String r10 = "com.appsflyer.lvl.AppsFlyerLVL$resultListener"
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.String r11 = "checkLicense"
            java.lang.Class[] r12 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r12[r3] = r13     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Class<android.content.Context> r13 = android.content.Context.class
            r12[r2] = r13     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r12[r0] = r10     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.reflect.Method r4 = r4.getMethod(r11, r12)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            com.appsflyer.internal.AFe1tSDK$1 r11 = new com.appsflyer.internal.AFe1tSDK$1     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r11.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.ClassLoader r7 = r10.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r12[r3] = r10     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Object r7 = java.lang.reflect.Proxy.newProxyInstance(r7, r12, r11)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r1[r3] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r1[r2] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r1[r0] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            r0 = 0
            r4.invoke(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            goto L8d
        L56:
            r0 = move-exception
            goto L5e
        L58:
            r0 = move-exception
            goto L6a
        L5a:
            r0 = move-exception
            goto L76
        L5c:
            r0 = move-exception
            goto L82
        L5e:
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L90
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L90
            r9.values(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L90
            goto L8d
        L6a:
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L90
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L90
            r9.values(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L90
            goto L8d
        L76:
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L90
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L90
            r9.values(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L90
            goto L8d
        L82:
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L90
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.ClassNotFoundException -> L90
            r9.values(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L90
        L8d:
            r14.AFLogger = r2     // Catch: java.lang.ClassNotFoundException -> L90
            goto L92
        L90:
            r14.AFLogger = r3
        L92:
            boolean r0 = r14.AFLogger
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1sSDK.values():boolean");
    }
}
