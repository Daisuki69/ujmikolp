package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public class AFKeystoreWrapper {
    private Context AFInAppEventParameterName;
    public KeyStore AFInAppEventType;
    public final Object valueOf = new Object();
    public String AFKeystoreWrapper = "";
    public int values = 0;

    public AFKeystoreWrapper(Context context) {
        this.AFInAppEventParameterName = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.AFInAppEventType = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    private static boolean AFKeystoreWrapper(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final String AFInAppEventParameterName() {
        StringBuilder sb2 = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.valueOf) {
            sb2.append(this.AFKeystoreWrapper);
            sb2.append(",KSAppsFlyerRICounter=");
            sb2.append(this.values);
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        r1 = r3.split(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r1.length != 3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(r3));
        r2 = true;
        r3 = r1[1].trim().split("=");
        r1 = r1[2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r3.length != 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r1.length != 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r6.AFKeystoreWrapper = r3[1].trim();
        r6.values = java.lang.Integer.parseInt(r1[1].trim());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFInAppEventType() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.valueOf
            monitor-enter(r0)
            java.security.KeyStore r1 = r6.AFInAppEventType     // Catch: java.lang.Throwable -> L83
            r2 = 0
            if (r1 == 0) goto L85
            java.util.Enumeration r1 = r1.aliases()     // Catch: java.lang.Throwable -> L68
        Lc:
            boolean r3 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L85
            java.lang.Object r3 = r1.nextElement()     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto Lc
            boolean r4 = AFKeystoreWrapper(r3)     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto Lc
            java.lang.String r1 = ","
            java.lang.String[] r1 = r3.split(r1)     // Catch: java.lang.Throwable -> L68
            int r4 = r1.length     // Catch: java.lang.Throwable -> L68
            r5 = 3
            if (r4 != r5) goto L85
            java.lang.String r4 = "Found a matching AF key with alias:\n"
            java.lang.String r3 = r4.concat(r3)     // Catch: java.lang.Throwable -> L68
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch: java.lang.Throwable -> L68
            r2 = 1
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = "="
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Throwable -> L68
            r4 = 2
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = "="
            java.lang.String[] r1 = r1.split(r5)     // Catch: java.lang.Throwable -> L68
            int r5 = r3.length     // Catch: java.lang.Throwable -> L68
            if (r5 != r4) goto L85
            int r5 = r1.length     // Catch: java.lang.Throwable -> L68
            if (r5 != r4) goto L85
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L68
            r6.AFKeystoreWrapper = r3     // Catch: java.lang.Throwable -> L68
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L68
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L68
            r6.values = r1     // Catch: java.lang.Throwable -> L68
            goto L85
        L68:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = "Couldn't list KeyStore Aliases: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L83
            java.lang.Class r4 = r1.getClass()     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L83
            r3.append(r4)     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L83
            com.appsflyer.AFLogger.afErrorLog(r3, r1)     // Catch: java.lang.Throwable -> L83
            goto L85
        L83:
            r1 = move-exception
            goto L87
        L85:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            return r2
        L87:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.AFInAppEventType():boolean");
    }

    public final void valueOf(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.valueOf) {
                try {
                    if (this.AFInAppEventType.containsAlias(str)) {
                        AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                    } else {
                        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(keyGenParameterSpecBuild);
                        keyPairGenerator.generateKeyPair();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            StringBuilder sb2 = new StringBuilder("Exception ");
            sb2.append(th3.getMessage());
            sb2.append(" occurred");
            AFLogger.afErrorLog(sb2.toString(), th3);
        }
    }

    public final String AFKeystoreWrapper() {
        String str;
        synchronized (this.valueOf) {
            str = this.AFKeystoreWrapper;
        }
        return str;
    }

    public final int valueOf() {
        int i;
        synchronized (this.valueOf) {
            i = this.values;
        }
        return i;
    }
}
