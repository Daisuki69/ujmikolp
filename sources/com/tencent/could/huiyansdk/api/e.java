package com.tencent.could.huiyansdk.api;

import We.s;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.could.component.common.ai.net.TxNetWorkHelper;
import com.tencent.could.component.common.ai.utils.TwoTuple;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HostEntity;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.entity.LiveDataCheckResult;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.fragments.BaseFragment;
import com.tencent.could.huiyansdk.helper.b;
import com.tencent.could.huiyansdk.manager.a;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import defpackage.AbstractC1414e;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class e {
    public static String a(String[] strArr) {
        String strI = "";
        for (int i = 0; i < strArr.length; i++) {
            int i4 = Integer.parseInt(strArr[i]);
            if (i4 == 0 || i4 == 1) {
                strI = s.i(strI, "blink");
            } else if (i4 == 2) {
                strI = s.i(strI, "mouth");
            } else if (i4 == 3) {
                strI = s.i(strI, "node");
            } else if (i4 == 4) {
                strI = s.i(strI, "shake");
            } else if (i4 == 5) {
                strI = s.i(strI, "silence");
            }
            if (i != strArr.length - 1) {
                strI = s.i(strI, ",");
            }
        }
        return strI;
    }

    public static TwoTuple<String, String> a(boolean z4) {
        if (!z4) {
            z4 = true;
        }
        HostEntity hostEntityA = a();
        if (hostEntityA == null) {
            return null;
        }
        String mainHost = hostEntityA.getMainHost();
        String secondHost = hostEntityA.getSecondHost();
        String backupIp = hostEntityA.getBackupIp();
        if (z4) {
            return new TwoTuple<>(AbstractC1414e.h("https://", mainHost), AbstractC1414e.h("https://", secondHost));
        }
        TxNetWorkHelper txNetWorkHelper = TxNetWorkHelper.getInstance();
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.a.f15622a;
        String hostNameCurrentIp = txNetWorkHelper.getHostNameCurrentIp(huiYanBaseApi.a(), mainHost);
        if (!TextUtils.isEmpty(hostNameCurrentIp)) {
            return new TwoTuple<>(AbstractC1414e.h("https://", hostNameCurrentIp), AbstractC1414e.h("https://", mainHost));
        }
        String backUpHost = HuiYanOsApiImp.getInstance().getOsConfig().getBackUpHost();
        if (!TextUtils.isEmpty(backUpHost)) {
            secondHost = backUpHost;
        }
        String hostNameCurrentIp2 = TxNetWorkHelper.getInstance().getHostNameCurrentIp(huiYanBaseApi.a(), secondHost);
        if (!TextUtils.isEmpty(hostNameCurrentIp2)) {
            return new TwoTuple<>(AbstractC1414e.h("https://", hostNameCurrentIp2), AbstractC1414e.h("https://", secondHost));
        }
        return new TwoTuple<>(AbstractC1414e.h("https://", backupIp), AbstractC1414e.h("https://", mainHost));
    }

    public static void a(CompareResult compareResult) {
        BaseFragment baseFragmentA = a.C0083a.f15662a.a();
        if (baseFragmentA instanceof AuthingFragment) {
            ((AuthingFragment) baseFragmentA).a((Object) compareResult);
        } else {
            e.a.f15688a.a(2, "HuiYanSdkImp", "current fragment is null!");
            CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
        }
    }

    public static HostEntity a() {
        String currentToken = HuiYanOsApiImp.getInstance().getCurrentToken();
        if (TextUtils.isEmpty(currentToken)) {
            return null;
        }
        try {
            return com.tencent.could.huiyansdk.utils.c.f15730a.get(currentToken.substring(15, 17));
        } catch (IndexOutOfBoundsException e) {
            e.a.f15688a.a(2, "HYOCommonUtils", "substring error : " + e.getLocalizedMessage());
            return null;
        }
    }

    public static void a(String str) {
        j jVar = j.a.f15618a;
        jVar.f15616d = false;
        HuiYanSdkConfig huiYanSdkConfigB = jVar.b();
        LiveDataCheckResult liveDataCheckResultCheckHaveColorData = CommonUtils.checkHaveColorData(str);
        if (huiYanSdkConfigB.isUseBackCamera() && liveDataCheckResultCheckHaveColorData.isHaveColorData()) {
            e.a.f15688a.a(2, "HuiYanSdkImp", "have color data!");
            b bVar = jVar.f15617g;
            if (bVar != null) {
                bVar.onBuriedPointCallBack("AuthCheckStage", "AuthLocalFail", "back camera have color data!");
            }
            CompareResult compareResult = new CompareResult();
            compareResult.setErrorCode(227);
            compareResult.setErrorMsg(jVar.a().getResources().getString(R.string.txy_use_back_camera_with_reflective));
            a(compareResult);
            return;
        }
        try {
            b.a.f15659a.b("check_eye_open", liveDataCheckResultCheckHaveColorData.isNoAction());
        } catch (JSONException e) {
            e.a.f15688a.a(2, "HuiYanSdkImp", "update sdk config error: " + e.getLocalizedMessage());
        }
        com.tencent.could.huiyansdk.helper.b bVar2 = b.a.f15659a;
        if (bVar2.f15657a == null) {
            e.a.f15688a.a(2, "YouTuSdkHelper", "sdk config json is null!");
        } else {
            YtSDKKitFramework.getInstance().updateSDKSetting(YtSDKKitConfigHelper.getSDKConfig(bVar2.b(), bVar2.f15657a));
        }
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.a.f15622a;
        huiYanBaseApi.getClass();
        bVar2.getClass();
        if (TextUtils.isEmpty(str)) {
            HuiYanBaseCallBack huiYanBaseCallBack = huiYanBaseApi.f15620b;
            if (huiYanBaseCallBack == null) {
                Log.e("HuiYanBaseApi", "send error callback, but callback is null!");
            } else {
                huiYanBaseCallBack.onFail(226, "");
            }
        } else if (bVar2.f15658b == null) {
            HuiYanBaseCallBack huiYanBaseCallBack2 = huiYanBaseApi.f15620b;
            if (huiYanBaseCallBack2 == null) {
                Log.e("HuiYanBaseApi", "send error callback, but callback is null!");
            } else {
                huiYanBaseCallBack2.onFail(221, "");
            }
        } else {
            bVar2.f15658b.onNetworkResponseEvent(androidx.media3.datasource.cache.c.p("response", str), null);
        }
        jVar.e();
    }
}
