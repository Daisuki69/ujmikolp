package com.tencent.could.huiyansdk.turing;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.common.a;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.manager.b;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: loaded from: classes4.dex */
public class e extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f15716a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Looper looper) {
        super(looper);
        this.f15716a = fVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.f15716a.c) {
            e.a.f15688a.a(2, "TuringSdkHelper", "isEndPreView is true do not need set camera data");
            return;
        }
        int i = message.what;
        if (i == 3) {
            this.f15716a.getClass();
            CompareResult compareResult = new CompareResult();
            compareResult.setErrorCode(MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE);
            Context context = CommonUtils.getContext();
            compareResult.setErrorMsg(context == null ? context.getResources().getString(R.string.txy_check_get_frame_error) : "Failed to get data from camera, pleas back to the previous step and try again");
            e.a.f15688a.a(2, "TuringSdkHelper", "event call for first frame time out!!!");
            b.C0084b.f15678a.a(AuthState.AUTH_ERROR_DIALOG, compareResult);
            return;
        }
        if (i == 4) {
            com.tencent.could.huiyansdk.manager.e eVar = e.a.f15688a;
            eVar.a(1, "TuringSdkHelper", "wait frame image check is time out");
            f fVar = this.f15716a;
            fVar.getClass();
            eVar.a(1, "TuringSdkHelper", "remove compare check all listener");
            com.tencent.could.huiyansdk.callback.d dVar = fVar.i;
            if (dVar == null) {
                eVar.a(1, "TuringSdkHelper", "do not need waiting turing!");
                return;
            }
            ((b.a) dVar).a();
            fVar.i = null;
            if (fVar.m != null) {
                fVar.m.removeMessages(4);
                return;
            }
            return;
        }
        if (i != 5) {
            e.a.f15688a.a(2, "TuringSdkHelper", "error event");
            return;
        }
        e.a.f15688a.a(1, "TuringSdkHelper", "turing face timeout " + this.f15716a.f15717a);
        TuringResultCacheEntity turingResultCacheEntity = this.f15716a.f;
        if (turingResultCacheEntity != null) {
            turingResultCacheEntity.setTuringEnvErrorStr("EnvRiskData timeout with: " + this.f15716a.f15717a + " ms");
        }
        this.f15716a.f15721k = true;
        if (a.C0082a.f15626a.f15625d) {
            com.tencent.could.huiyansdk.api.b bVar = j.a.f15618a.f15617g;
            if (bVar != null) {
                bVar.onTuringFaceDataSuccess("");
            }
            b.C0084b.f15678a.a(AuthState.START_GET_LIVE_TYPE, (Object) null);
        }
        f.a(this.f15716a);
        f.a(this.f15716a, true);
    }
}
