package com.tencent.could.huiyansdk.utils;

import android.os.CountDownTimer;
import android.text.TextUtils;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.common.a;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.manager.e;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CountDownTimer f15744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.tencent.could.huiyansdk.callback.c f15745b;
    public boolean c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15746d;

    public class a extends CountDownTimer {
        public a(long j, long j6) {
            super(j, j6);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            j jVar = j.this;
            com.tencent.could.huiyansdk.callback.c cVar = jVar.f15745b;
            if (cVar == null || jVar.c) {
                return;
            }
            com.tencent.could.huiyansdk.fragments.c cVar2 = (com.tencent.could.huiyansdk.fragments.c) cVar;
            CompareResult compareResult = new CompareResult();
            com.tencent.could.huiyansdk.api.j jVar2 = j.a.f15618a;
            if (!jVar2.b().isOpenLongCheck() || !cVar2.f15650a.f15636o || cVar2.f15650a.f15635n) {
                if (cVar2.f15650a.m) {
                    compareResult.setErrorCode(MfaTencentErrorResult.TENCENT_ERROR_LOCAL_TIME_OUT);
                    compareResult.setErrorMsg(cVar2.f15650a.getResString(R.string.txy_local_check_out_time));
                    e.a.f15688a.a(2, "AuthingFragment", "action time out!");
                } else {
                    compareResult.setErrorCode(MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT);
                    compareResult.setErrorMsg(cVar2.f15650a.getResString(R.string.txy_prepare_out_time));
                    e.a.f15688a.a(2, "AuthingFragment", "prepare time out!");
                }
                String str = "timeOut code: " + compareResult.getErrorCode();
                com.tencent.could.huiyansdk.api.b bVar = jVar2.f15617g;
                if (bVar != null) {
                    bVar.onBuriedPointCallBack("AuthCheckStage", "AuthLocalFail", str);
                }
                cVar2.f15650a.a((Object) compareResult);
                return;
            }
            compareResult.setErrorCode(287);
            String str2 = a.C0082a.f15626a.f15624b;
            if (TextUtils.isEmpty(str2)) {
                compareResult.setErrorMsg(cVar2.f15650a.getResString(R.string.txy_bot_out_time));
            } else {
                compareResult.setErrorMsg(cVar2.f15650a.getResString(R.string.txy_bot_out_time) + cVar2.f15650a.getResString(R.string.txy_comma) + str2);
            }
            e.a.f15688a.a(2, "AuthingFragment", "long check time out!");
            String str3 = "timeout code: " + compareResult.getErrorCode();
            com.tencent.could.huiyansdk.api.b bVar2 = jVar2.f15617g;
            if (bVar2 != null) {
                bVar2.onBuriedPointCallBack("BOTCheckStage", "AuthLocalFail", str3);
            }
            cVar2.f15650a.a((Object) compareResult);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            e.a.f15688a.a(1, "TimeOutHelper", androidx.camera.core.impl.a.f(j, "on tick: "));
            int i = (int) ((j + 1000) / 1000);
            j jVar = j.this;
            com.tencent.could.huiyansdk.callback.c cVar = jVar.f15745b;
            if (cVar == null || jVar.c) {
                return;
            }
            ((com.tencent.could.huiyansdk.fragments.c) cVar).a(i);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f15748a = new j();
    }

    public void a(long j) {
        e.a.f15688a.a(1, "TimeOutHelper", androidx.camera.core.impl.a.f(j, "start count down: "));
        CountDownTimer countDownTimer = this.f15744a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f15746d = j;
        this.c = false;
        if (j > 0) {
            j--;
        }
        a aVar = new a(j, 1000L);
        this.f15744a = aVar;
        aVar.start();
    }
}
