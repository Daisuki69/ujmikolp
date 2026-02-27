package com.tencent.could.huiyansdk.overseas.fragment;

import Gb.h;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import com.dynatrace.android.callback.Callback;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.fragments.BaseFragment;
import com.tencent.could.huiyansdk.manager.a;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.operate.HuiYanOperateBody;
import com.tencent.could.huiyansdk.operate.a;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import qf.d;

/* JADX INFO: loaded from: classes4.dex */
public class GuideFragment extends BaseFragment {
    public static final String TAG = "GuideFragment";

    public static void a(View view) {
        e eVar = e.a.f15688a;
        eVar.a(2, TAG, "want go to authing fragment");
        a aVar = a.C0083a.f15662a;
        AuthingFragment authingFragment = new AuthingFragment();
        FragmentManager fragmentManager = aVar.f15661b;
        if (fragmentManager != null) {
            if (j.a.f15618a.f15616d) {
                eVar.a(2, "AuthFragmentManager", "Activity is exit, do can not change fragment");
                return;
            }
            aVar.c = fragmentManager.beginTransaction();
            FragmentManager fragmentManager2 = aVar.f15661b;
            int i = R.id.txy_main_fragment;
            fragmentManager2.findFragmentById(i);
            aVar.c.replace(i, authingFragment).commitAllowingStateLoss();
        }
    }

    private /* synthetic */ void b(View view) {
        doUserCancelEvent();
    }

    private void doUserCancelEvent() {
        String resString = getResString(R.string.txt_user_cancel_check);
        HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.a.f15622a.f15620b;
        if (huiYanBaseCallBack != null) {
            huiYanBaseCallBack.updateOperateInfo("UserCancel", 1, 0L, "GuidePage");
        }
        CommonUtils.sendErrorAndExitAuth(MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS, resString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$onCreateView$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup-Landroid-os-Bundle--Landroid-view-View-, reason: not valid java name */
    public static /* synthetic */ void m192xd0e31f79(View view) {
        Callback.onClick_enter(view);
        try {
            a(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$onCreateView$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup-Landroid-os-Bundle--Landroid-view-View-, reason: not valid java name */
    public static /* synthetic */ void m193x961510d8(GuideFragment guideFragment, View view) {
        Callback.onClick_enter(view);
        try {
            guideFragment.b(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment
    public void backPopEvent() {
        super.backPopEvent();
        doUserCancelEvent();
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (this.fragmentView == null) {
            View viewInflate = layoutInflater.inflate(com.paymaya.R.layout.hy_overseas_fragment_guide, viewGroup, false);
            this.fragmentView = viewInflate;
            viewInflate.findViewById(com.paymaya.R.id.hy_oversea_start_check_btn).setOnClickListener(new h(3));
            this.fragmentView.findViewById(com.paymaya.R.id.txy_hy_overseas_btn_back).setOnClickListener(new d(this, 4));
        }
        HuiYanOperateBody huiYanOperateBody = a.b.f15709a.f15705a;
        if (huiYanOperateBody != null) {
            huiYanOperateBody.updateInfo("ShowProtocolPage", 1, 1L, System.currentTimeMillis());
        }
        return this.fragmentView;
    }
}
