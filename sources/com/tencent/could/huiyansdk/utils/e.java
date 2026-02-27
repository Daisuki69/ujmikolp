package com.tencent.could.huiyansdk.utils;

import android.content.Context;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f15734a = {"android.permission.CAMERA"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f15735b = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    public static boolean a(Context context, String[] strArr) {
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }
}
