package com.paymaya.mayaui.tencent.view.fragment.impl;

import androidx.viewbinding.ViewBinding;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import qj.n;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MayaTencentBaseFragment<T extends ViewBinding> extends MayaKycBaseFragment<T> {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final HuiYanOsConfig f14176W;

    public MayaTencentBaseFragment(n nVar) {
        super(nVar);
        this.f14176W = new HuiYanOsConfig();
    }

    public final void K1() {
        HuiYanOsConfig huiYanOsConfig = this.f14176W;
        String str = huiYanOsConfig.authLicense;
        if (str == null || C2576A.H(str)) {
            huiYanOsConfig.setAuthLicense("tencent.license");
            huiYanOsConfig.setShowGuidePage(false);
            huiYanOsConfig.setAuthTimeOutMs(20000L);
            huiYanOsConfig.setShowPrivacyPolicyDialog(false);
        }
    }
}
