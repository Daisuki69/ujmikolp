package com.tencent.youtu.liveness;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class YTCommonInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f15792a = "YTCommon";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f15793b = 1;
    public static final /* synthetic */ boolean c = true;

    public static int getDeviceInfo(Context context, YTDeviceInfo yTDeviceInfo) {
        return nativeGetDeviceInfo(yTDeviceInfo);
    }

    public static native long getEndTime();

    public static native int[] getSDKList();

    public static native String getSDKNameByID(int i);

    public static native String getVersion();

    public static int initAuthByAssets(String str, String str2) {
        if (!c && str == null) {
            throw new AssertionError();
        }
        if (str2 == null) {
            str2 = "";
        }
        return nativeInitAuthByAssets(str, str2);
    }

    public static int initAuthByFilePath(String str, String str2) {
        if (!c && str == null) {
            throw new AssertionError();
        }
        if (str2 == null) {
            str2 = "";
        }
        File file = new File(str);
        if (!file.exists()) {
            if (f15793b != 0) {
                Log.e(f15792a, "file not exists: " + str);
            }
            return -10;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[2048];
            int i = fileInputStream.read(bArr);
            fileInputStream.close();
            if (i < 2048) {
                return nativeInitAuthByString(Base64.encodeToString(bArr, 0, i, 2).toString(), str2);
            }
            if (f15793b == 0) {
                return -2;
            }
            Log.e(f15792a, "license length oversize.");
            return -2;
        } catch (FileNotFoundException e) {
            if (f15793b != 0) {
                Log.e(f15792a, "file not found: " + str);
                e.printStackTrace();
                Log.e("YTCommon", "YouTo Auth：read auth file error,Failed to read the file, please check whether the APP has READ_EXTERNAL_STORAGE permission。");
            }
            return -10;
        } catch (IOException e7) {
            if (f15793b == 0) {
                return -4;
            }
            Log.e(f15792a, "io error: " + str);
            e7.printStackTrace();
            return -4;
        }
    }

    public static int initAuthByString(String str, String str2) {
        if (!c && str == null) {
            throw new AssertionError();
        }
        if (str2 == null) {
            str2 = "";
        }
        return nativeInitAuthByString(str, str2);
    }

    public static int initAuthForQQ() {
        return nativeInitAuthForQQ();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int initAuthOnlineWithCache(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.liveness.YTCommonInterface.initAuthOnlineWithCache(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):int");
    }

    public static native int nativeGetDeviceInfo(YTDeviceInfo yTDeviceInfo);

    public static native int nativeInitAuthByAssets(String str, String str2);

    public static native int nativeInitAuthByString(String str, String str2);

    public static native int nativeInitAuthForQQ();

    public static native void nativePrintAuthResult(int i);

    public static native void nativeSetEnableLog(int i);

    public static void setEnableLog(int i) {
        nativeSetEnableLog(i);
        f15793b = i;
    }
}
