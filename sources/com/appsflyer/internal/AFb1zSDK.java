package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.dynatrace.android.agent.Global;
import dOYHB6.yFtIp6.svM7M6;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1zSDK {
    private static String values;

    public static synchronized String AFInAppEventParameterName(WeakReference<Context> weakReference) {
        if (weakReference.get() == null) {
            return values;
        }
        if (values == null) {
            String string = null;
            if (weakReference.get() != null) {
                string = svM7M6.getString(AFb1wSDK.valueOf(weakReference.get()), "AF_INSTALLATION", null);
            }
            if (string != null) {
                values = string;
            } else {
                try {
                    File file = new File(weakReference.get().getFilesDir(), "AF_INSTALLATION");
                    if (file.exists()) {
                        values = valueOf(file);
                        file.delete();
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(jCurrentTimeMillis);
                        sb2.append(Global.HYPHEN);
                        sb2.append(Math.abs(new SecureRandom().nextLong()));
                        values = sb2.toString();
                    }
                    String str = values;
                    SharedPreferences.Editor editorEdit = AFb1wSDK.valueOf(weakReference.get()).edit();
                    editorEdit.putString("AF_INSTALLATION", str);
                    editorEdit.apply();
                } catch (Exception e) {
                    AFLogger.afErrorLog("Error getting AF unique ID", e);
                }
            }
            if (values != null) {
                AppsFlyerProperties.getInstance().set("uid", values);
            }
        }
        return values;
    }

    private static String valueOf(File file) throws Throwable {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        byte[] bArr2 = null;
        randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException e) {
                e = e;
                bArr = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bArr2 = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr2);
            randomAccessFile.close();
            try {
                randomAccessFile.close();
            } catch (IOException e7) {
                AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e7);
            }
        } catch (IOException e10) {
            e = e10;
            bArr = bArr2;
            randomAccessFile2 = randomAccessFile;
            AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e11) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e11);
                }
            }
            bArr2 = bArr;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e12) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e12);
                }
            }
            throw th;
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return new String(bArr2);
    }
}
