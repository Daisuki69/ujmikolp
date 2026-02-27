package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;

/* JADX INFO: loaded from: classes2.dex */
public class InstallException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InstallException(int r8) {
        /*
            r7 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r3 = G1.a.f1697a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            boolean r5 = r3.containsKey(r4)
            if (r5 == 0) goto L34
            java.util.HashMap r5 = G1.a.f1698b
            boolean r6 = r5.containsKey(r4)
            if (r6 != 0) goto L1f
            goto L34
        L1f:
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#"
            java.lang.String r6 = ")"
            java.lang.String r3 = androidx.media3.datasource.cache.c.l(r3, r5, r4, r6)
            goto L36
        L34:
            java.lang.String r3 = ""
        L36:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r3
            java.lang.String r2 = "Install Error(%d): %s"
            java.lang.String r1 = java.lang.String.format(r1, r2, r4)
            r0.<init>(r8, r1)
            r7.<init>(r0)
            if (r8 == 0) goto L4e
            return
        L4e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.install.InstallException.<init>(int):void");
    }
}
