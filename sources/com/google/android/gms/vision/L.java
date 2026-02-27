package com.google.android.gms.vision;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class L {

    @RecentlyNonNull
    @KeepForSdk
    public static final String TAG = "Vision";

    @KeepForSdk
    public static int d(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 3)) {
            return Log.d(TAG, String.format(str, objArr));
        }
        return 0;
    }

    @KeepForSdk
    public static int e(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 6)) {
            return Log.e(TAG, String.format(str, objArr));
        }
        return 0;
    }

    @KeepForSdk
    public static int i(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 4)) {
            return Log.i(TAG, String.format(str, objArr));
        }
        return 0;
    }

    @KeepForSdk
    public static int v(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 2)) {
            return Log.v(TAG, String.format(str, objArr));
        }
        return 0;
    }

    @KeepForSdk
    public static int w(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 5)) {
            return Log.w(TAG, String.format(str, objArr));
        }
        return 0;
    }

    @KeepForSdk
    public static int d(@RecentlyNonNull Throwable th2, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 3)) {
            return Log.d(TAG, String.format(str, objArr), th2);
        }
        return 0;
    }

    @KeepForSdk
    @SuppressLint({"LogTagMismatch"})
    public static int e(@RecentlyNonNull Throwable th2, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!Log.isLoggable(TAG, 6)) {
            return 0;
        }
        if (Log.isLoggable(TAG, 3)) {
            return Log.e(TAG, String.format(str, objArr), th2);
        }
        String str2 = String.format(str, objArr);
        String strValueOf = String.valueOf(th2);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + str2.length() + 2);
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(strValueOf);
        return Log.e(TAG, sb2.toString());
    }

    @KeepForSdk
    @SuppressLint({"LogTagMismatch"})
    public static int w(@RecentlyNonNull Throwable th2, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!Log.isLoggable(TAG, 5)) {
            return 0;
        }
        if (Log.isLoggable(TAG, 3)) {
            return Log.w(TAG, String.format(str, objArr), th2);
        }
        String str2 = String.format(str, objArr);
        String strValueOf = String.valueOf(th2);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + str2.length() + 2);
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(strValueOf);
        return Log.w(TAG, sb2.toString());
    }
}
