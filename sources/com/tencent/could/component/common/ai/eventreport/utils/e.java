package com.tencent.could.component.common.ai.eventreport.utils;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class e {
    public static String a(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : androidx.camera.core.impl.a.j(str, "?FaceIdToken=", str2);
    }
}
