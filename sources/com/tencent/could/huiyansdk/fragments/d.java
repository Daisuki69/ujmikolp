package com.tencent.could.huiyansdk.fragments;

import com.tencent.could.aicamare.callback.CameraLoggerCallBack;
import com.tencent.could.huiyansdk.manager.e;

/* JADX INFO: loaded from: classes4.dex */
public class d implements CameraLoggerCallBack {
    public d(AuthingFragment authingFragment) {
    }

    @Override // com.tencent.could.aicamare.callback.CameraLoggerCallBack
    public void logger(String str, String str2) {
        e.a.f15688a.a(1, str, str2);
    }
}
