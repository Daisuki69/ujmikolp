package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
public final class AFa1cSDK implements AFc1oSDK {
    private final AFc1sSDK AFInAppEventType;

    public AFa1cSDK() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> AFInAppEventParameterName(android.content.Context r9, java.util.Map<java.lang.String, java.lang.String> r10, android.net.Uri r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1cSDK.AFInAppEventParameterName(android.content.Context, java.util.Map, android.net.Uri):java.util.Map");
    }

    public static boolean AFInAppEventType() {
        return Build.BRAND.equals("OPPO");
    }

    public static long AFKeystoreWrapper(Context context, String str) {
        try {
            return Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo(str, 0).getLongVersionCode() : r1.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return 0L;
        }
    }

    public static boolean values(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    public AFa1cSDK(AFc1sSDK aFc1sSDK) {
        j.g(aFc1sSDK, "");
        this.AFInAppEventType = aFc1sSDK;
    }

    public static String AFInAppEventType(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return "";
        }
    }

    public static boolean values(Context context, String str) {
        int iCheckPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb2 = new StringBuilder("is Permission Available: ");
        sb2.append(str);
        sb2.append("; res: ");
        sb2.append(iCheckPermission);
        AFLogger.afRDLog(sb2.toString());
        return iCheckPermission == 0;
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void AFKeystoreWrapper(byte[] bArr, Map<String, String> map, int i) {
        j.g(bArr, "");
        if (new AFc1rSDK(bArr, map, 2000).AFInAppEventType()) {
            this.AFInAppEventType.values();
        }
    }

    public static String AFInAppEventParameterName(PackageManager packageManager, String str) throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }
}
