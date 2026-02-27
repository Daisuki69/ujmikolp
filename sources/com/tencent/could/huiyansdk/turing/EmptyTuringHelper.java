package com.tencent.could.huiyansdk.turing;

import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.tencent.could.aicamare.CameraHolder;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.common.a;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.manager.b;
import com.tencent.could.huiyansdk.manager.e;

/* JADX INFO: loaded from: classes4.dex */
public class EmptyTuringHelper extends b {
    @Override // com.tencent.could.huiyansdk.turing.b
    public int a(View view, CameraHolder cameraHolder, String str) {
        c cVar = this.f15714a;
        if (cVar != null) {
            d dVar = (d) cVar;
            com.tencent.could.huiyansdk.manager.e eVar = e.a.f15688a;
            eVar.a(1, "TuringSdkHelper", "return code: 0, bytes is null");
            dVar.f15715a.d();
            f.a(dVar.f15715a, false);
            f fVar = dVar.f15715a;
            if (fVar.f != null) {
                f.a(fVar);
            } else {
                HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.a.f15622a.f15620b;
                if (huiYanBaseCallBack != null) {
                    huiYanBaseCallBack.onOperateTimeEvent("GetTuringTokenUseTime", 2, false, "");
                }
                String strEncodeToString = Base64.encodeToString(null, 2);
                TuringResultCacheEntity turingResultCacheEntity = dVar.f15715a.f;
                if (turingResultCacheEntity != null) {
                    turingResultCacheEntity.setTuringResultDate(strEncodeToString);
                    eVar.a(1, "TuringSdkHelper", "turing result cache is not null");
                    eVar.a(1, "TuringSdkHelper", "turing result data: " + TextUtils.isEmpty(strEncodeToString));
                } else {
                    eVar.a(2, "TuringSdkHelper", "turing result cache is null");
                }
                if (dVar.f15715a.f15721k) {
                    eVar.a(2, "TuringSdkHelper", "on get device token has timeout!");
                } else {
                    if (a.C0082a.f15626a.f15625d && !TextUtils.isEmpty(strEncodeToString)) {
                        com.tencent.could.huiyansdk.api.b bVar = j.a.f15618a.f15617g;
                        if (bVar != null) {
                            bVar.onTuringFaceDataSuccess(strEncodeToString);
                        }
                        b.C0084b.f15678a.a(AuthState.START_GET_LIVE_TYPE, (Object) null);
                    }
                    f.a(dVar.f15715a);
                }
            }
        }
        return 0;
    }
}
