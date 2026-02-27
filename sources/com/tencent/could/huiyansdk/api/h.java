package com.tencent.could.huiyansdk.api;

import com.tencent.could.component.common.ai.callback.CrashListener;

/* JADX INFO: loaded from: classes4.dex */
public class h implements CrashListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f15612a;

    public h(j jVar) {
        this.f15612a = jVar;
    }

    @Override // com.tencent.could.component.common.ai.callback.CrashListener
    public void onCrash(String str) {
        b bVar = this.f15612a.f15617g;
        if (bVar != null) {
            bVar.onBuriedPointCallBack("CrashStage", "UncatchCrash", str);
        }
        b bVar2 = this.f15612a.f15617g;
        if (bVar2 != null) {
            bVar2.updateOperateInfo("Crash", 1, 1L, str);
        }
    }
}
