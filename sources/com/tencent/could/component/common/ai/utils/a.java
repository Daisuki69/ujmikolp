package com.tencent.could.component.common.ai.utils;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f15607a = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    public static boolean a(Context context) {
        String[] strArr = f15607a;
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            for (String str : strArr) {
                if (packageManager.checkPermission(str, packageName) == 0) {
                }
            }
            return true;
        }
        return false;
    }
}
