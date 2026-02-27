package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1lSDK {
    private final int AFInAppEventParameterName;

    public AFc1lSDK(int i) {
        this.AFInAppEventParameterName = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String values(java.net.HttpURLConnection r3, boolean r4) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r4 == 0) goto Lb
            java.io.InputStream r3 = com.dynatrace.android.callback.Callback.getInputStream(r3)     // Catch: java.lang.Throwable -> L8
            goto Lf
        L8:
            r3 = move-exception
            r4 = r0
            goto L4b
        Lb:
            java.io.InputStream r3 = com.dynatrace.android.callback.Callback.getErrorStream(r3)     // Catch: java.lang.Throwable -> L8
        Lf:
            if (r3 != 0) goto L14
            java.lang.String r3 = ""
            return r3
        L14:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8
            r4.<init>()     // Catch: java.lang.Throwable -> L8
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L8
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L8
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L48
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L48
            r0 = 1
        L24:
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L3d
            if (r0 != 0) goto L38
            r0 = 10
            r4.append(r0)     // Catch: java.lang.Throwable -> L32
            goto L38
        L32:
            r4 = move-exception
            r0 = r4
            r4 = r3
            r3 = r0
        L36:
            r0 = r1
            goto L4b
        L38:
            r4.append(r2)     // Catch: java.lang.Throwable -> L32
            r0 = 0
            goto L24
        L3d:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L32
            r1.close()
            r3.close()
            return r4
        L48:
            r3 = move-exception
            r4 = r0
            goto L36
        L4b:
            if (r0 == 0) goto L50
            r0.close()
        L50:
            if (r4 == 0) goto L55
            r4.close()
        L55:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1lSDK.values(java.net.HttpURLConnection, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFc1eSDK<java.lang.String> AFInAppEventParameterName(com.appsflyer.internal.AFc1vSDK r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1lSDK.AFInAppEventParameterName(com.appsflyer.internal.AFc1vSDK):com.appsflyer.internal.AFc1eSDK");
    }
}
