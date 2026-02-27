package com.shield.android.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class NativeUtils {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15408d = {871607734, 1330912066, 306490607, 1639016852, 1728970039, 1564619147};

    public NativeUtils() {
        f.bJ();
    }

    public native int getArpCache(int i);

    public native String getBaseApkPath();

    public native String getClonerFileData(String str);

    public native String getHostsModifiedTime();

    public native String getKeyFormat();

    public native String getKeyValue(String str);

    public native String getNativeAppVersion(Context context);

    public native String getNativePackage(Context context);

    public native String getNativeSignature(Context context);

    public native String getPayloadFormat();

    public native String getPayloadTransformation();

    public native String getPb();

    public native boolean isAccessedSuperuserApk();

    public native boolean isChaosDetected();

    public native boolean isDetectedDevKeys();

    public native boolean isDetectedTestKeys();

    public native boolean isFoundBusyboxBinary();

    public native boolean isFoundDangerousProps();

    public native boolean isFoundMagisk();

    public native boolean isFoundResetprop();

    public native boolean isFoundSuBinary();

    public native boolean isFoundSubstrate();

    public native boolean isFoundWrongPathPermission();

    public native boolean isFoundXposed();

    public native boolean isFridaDetected();

    public native boolean isGboxDetected();

    public native boolean isJiaguDetected();

    public native boolean isLsplantDetected();

    public native boolean isNotFoundReleaseKeys();

    public native int isPathExists(String str);

    public native boolean isPermissiveSelinux();

    public native boolean isSandHookDetected();

    public native boolean isSuExists();

    public native boolean isTaichiDetected();

    public native boolean isVirtualAndroidDetected();

    public native boolean isVirtualCameraAppDetected();

    public native boolean isVirtualXposedDetected();

    public native boolean isZygiskDetected();

    public native int jitCacheCount();

    public native boolean listenForFrida();

    public native void setClonerFileData(String str, String str2);
}
