package com.tencent.could.huiyansdk.fragments;

import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.permission.c;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: loaded from: classes4.dex */
public class a implements com.tencent.could.huiyansdk.permission.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthingFragment f15647a;

    public a(AuthingFragment authingFragment) {
        this.f15647a = authingFragment;
    }

    public void a() {
        com.tencent.could.huiyansdk.api.b bVar = j.a.f15618a.f15617g;
        if (bVar != null) {
            bVar.onBuriedPointCallBack("AuthCheckStage", "OpenCheckPageError", "");
        }
        e.a.f15688a.a(2, "AuthingFragment", "permission forbid!");
        c.a.f15713a.b();
        CommonUtils.sendErrorAndExitAuth(224, this.f15647a.getResString(R.string.txy_permission_loss_check_error));
    }

    public void b() {
        j jVar = j.a.f15618a;
        com.tencent.could.huiyansdk.api.b bVar = jVar.f15617g;
        if (bVar != null) {
            bVar.onBuriedPointCallBack("AuthCheckStage", "EnterAuthCheckPage", "");
        }
        c.a.f15713a.b();
        HuiYanSdkConfig huiYanSdkConfigB = jVar.b();
        if (huiYanSdkConfigB == null || !huiYanSdkConfigB.isShowPrivacyPolicyDialog()) {
            this.f15647a.l();
            return;
        }
        this.f15647a.f15646y = false;
        AuthingFragment authingFragment = this.f15647a;
        authingFragment.runOnUiThread(new b(authingFragment));
    }
}
