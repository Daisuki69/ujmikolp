package com.tencent.could.huiyansdk.fragments;

import androidx.fragment.app.FragmentActivity;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.view.c;

/* JADX INFO: loaded from: classes4.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthingFragment f15648a;

    public class a implements c.d {
        public a() {
        }
    }

    public b(AuthingFragment authingFragment) {
        this.f15648a = authingFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        FragmentActivity activity = this.f15648a.getActivity();
        if (activity == null) {
            e.a.f15688a.a(1, "AuthingFragment", "activity is null!");
            this.f15648a.l();
            return;
        }
        com.tencent.could.huiyansdk.view.c cVar = new com.tencent.could.huiyansdk.view.c(activity, new a());
        if (!cVar.a(activity)) {
            HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.a.f15622a.f15620b;
            if (huiYanBaseCallBack != null) {
                huiYanBaseCallBack.updateOperateInfo("ShowPrivacyDialog", 1, 1L, "");
            }
            cVar.show();
            return;
        }
        com.tencent.could.huiyansdk.manager.e eVar = e.a.f15688a;
        eVar.a(1, "OcrConfirmDialog", "checkIsConfirmed success!");
        if (cVar.isShowing()) {
            cVar.dismiss();
        }
        c.d dVar = cVar.f15787a;
        if (dVar != null) {
            eVar.a(1, "AuthingFragment", "Have Confirm info!");
            b.this.f15648a.l();
        }
    }
}
