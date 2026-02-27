package com.tencent.could.huiyansdk.fragments;

import android.hardware.Camera;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.tencent.could.aicamare.callback.CameraEventListener;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.helper.b;
import com.tencent.could.huiyansdk.manager.b;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.turing.EmptyTuringHelper;
import com.tencent.could.huiyansdk.turing.f;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.utils.b;
import com.tencent.could.huiyansdk.view.CameraDateBotGatherView;
import com.tencent.could.huiyansdk.view.HudView;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class e implements CameraEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthingFragment f15651a;

    public class a implements com.tencent.could.huiyansdk.api.d {
        public a(e eVar) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AuthingFragment authingFragment = e.this.f15651a;
            if (authingFragment.f15630b != null) {
                authingFragment.c();
            }
            e.this.f15651a.k();
            e.this.f15651a.b(false);
            if (e.this.f15651a.i == null) {
                return;
            }
            AuthUiConfig authUiConfig = j.a.f15618a.c;
            if (authUiConfig == null || !authUiConfig.isHideFrontCircleViewOnCheck()) {
                e.this.f15651a.i.setVisibility(0);
            } else {
                e.this.f15651a.i.setVisibility(8);
            }
        }
    }

    public e(AuthingFragment authingFragment) {
        this.f15651a = authingFragment;
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onAutoFocusSucceed() {
        Log.e("AuthingFragment", "auto focus success!");
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onCameraClosed() {
        Log.e("AuthingFragment", "close camera success!");
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onCameraSucceed() {
        this.f15651a.runOnUiThread(new qf.f(this, 1));
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onDataFrameCallBack(byte[] bArr) {
        byte[] bArrAcquire;
        byte[] bArrPoll;
        if (bArr == null) {
            return;
        }
        HuiYanSdkConfig huiYanSdkConfigB = j.a.f15618a.b();
        if (huiYanSdkConfigB != null && huiYanSdkConfigB.isShowDebugView()) {
            AuthingFragment authingFragment = this.f15651a;
            if (authingFragment.f15632g != null) {
                authingFragment.runOnUiThread(new qf.f(this, 0));
            }
        }
        if (huiYanSdkConfigB == null || huiYanSdkConfigB.isJustCheckRawCamera()) {
            return;
        }
        com.tencent.could.huiyansdk.turing.f fVar = f.a.f15724a;
        if (!fVar.j || fVar.f15720g == null) {
            Log.d("TuringSdkHelper", "processFrame is not create!");
        } else {
            if (fVar.m == null) {
                e.a.f15688a.a(2, "TuringSdkHelper", "cancelWaitFirstFrameTimeOut handler == null!");
            } else if (!fVar.f15719d) {
                fVar.f15719d = true;
                e.a.f15688a.a(1, "TuringSdkHelper", "remove first frame time out event!");
                fVar.m.removeMessages(3);
                com.tencent.could.huiyansdk.manager.f fVar2 = fVar.h;
                if (fVar2 != null) {
                    fVar2.h();
                }
            }
            com.tencent.could.huiyansdk.utils.b bVar = b.a.f15729a;
            synchronized (com.tencent.could.huiyansdk.utils.b.class) {
                try {
                    com.tencent.could.huiyansdk.utils.h<byte[]> hVar = bVar.f15728a;
                    bArrAcquire = hVar == null ? null : hVar.acquire();
                } finally {
                }
            }
            if (bArrAcquire == null) {
                bArrAcquire = (byte[]) bArr.clone();
            } else {
                for (int i = 0; i < bArr.length; i++) {
                    bArrAcquire[i] = bArr[i];
                }
            }
            if (fVar.f15718b) {
                if (fVar.f15720g != null) {
                    ((EmptyTuringHelper) fVar.f15720g).getClass();
                }
                com.tencent.could.huiyansdk.manager.f fVar3 = fVar.h;
                if (fVar3 != null) {
                    if (fVar3.d() || fVar3.j) {
                        b.a.f15729a.a(bArrAcquire);
                    } else {
                        int i4 = fVar3.f15694l;
                        if (i4 < 5) {
                            fVar3.f15694l = i4 + 1;
                            b.a.f15729a.a(bArrAcquire);
                        } else {
                            if (fVar3.f15689a.size() >= 10 && (bArrPoll = fVar3.f15689a.poll()) != null) {
                                b.a.f15729a.a(bArrPoll);
                            }
                            fVar3.f15689a.add(bArrAcquire);
                        }
                    }
                }
            }
        }
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.a.f15622a;
        Camera.Size cameraSize = this.f15651a.f15638q.getCameraSize();
        huiYanBaseApi.getClass();
        b.a.f15659a.getClass();
        if (cameraSize == null) {
            Log.e("YouTuSdkHelper", "input camera error! size is null");
        } else {
            YtSDKKitFramework.getInstance().updateWithFrameData(bArr, cameraSize.width, cameraSize.height, 1);
        }
        if (j.a.f15618a.c()) {
            com.tencent.could.huiyansdk.turing.a aVar = this.f15651a.f15629a;
            if (aVar instanceof CameraDateBotGatherView) {
                ((CameraDateBotGatherView) aVar).b(bArr);
            }
        }
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onEventError(int i, String str) {
        int i4;
        com.tencent.could.huiyansdk.manager.e eVar = e.a.f15688a;
        eVar.a(1, "AuthingFragment", "onEventError: " + i + " msg: " + str);
        if (i == 4 || i == 5) {
            eVar.a(2, "AuthingFragment", str);
            return;
        }
        int i6 = i == 3 ? 214 : 215;
        int i10 = R.string.txy_inner_error;
        if (i == 7) {
            i4 = R.string.txy_set_display_orientation_error;
            i6 = 230;
        } else {
            i4 = i10;
        }
        if (i6 == 214) {
            i4 = R.string.txy_do_not_change_app_in_auth;
        }
        if (i6 == 215) {
            i4 = R.string.txy_get_or_init_camera_error;
        }
        if (this.f15651a.getContext() == null) {
            eVar.a(2, "AuthingFragment", "camera on error context is null! code " + i6);
            CommonUtils.sendErrorAndExitAuth(MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE, this.f15651a.getResString(i10) + " camera error code: " + i6);
            return;
        }
        String resString = this.f15651a.getResString(i4);
        CompareResult compareResult = new CompareResult();
        compareResult.setErrorMsg(resString);
        compareResult.setErrorCode(i6);
        this.f15651a.b((Object) compareResult);
        j jVar = j.a.f15618a;
        com.tencent.could.huiyansdk.api.b bVar = jVar.f15617g;
        if (bVar != null) {
            bVar.onBuriedPointCallBack("AuthCheckStage", "OpenCameraError", resString);
        }
        com.tencent.could.huiyansdk.api.b bVar2 = jVar.f15617g;
        if (bVar2 != null) {
            bVar2.updateOperateInfo("StartCamera", 1, 0L, resString);
        }
    }

    @Override // com.tencent.could.aicamare.callback.CameraEventListener
    public void onPreviewSucceed() {
        new WeakReference(this.f15651a.f15638q.getCurrentCamera());
        com.tencent.could.huiyansdk.manager.e eVar = e.a.f15688a;
        eVar.a(1, "AuthingFragment", "on preview succeed!");
        j jVar = j.a.f15618a;
        com.tencent.could.huiyansdk.api.b bVar = jVar.f15617g;
        if (bVar != null) {
            bVar.onBuriedPointCallBack("AuthCheckStage", "OpenCameraSuccess", "");
        }
        com.tencent.could.huiyansdk.api.b bVar2 = jVar.f15617g;
        if (bVar2 != null) {
            bVar2.updateOperateInfo("StartCamera", 1, 1L, "");
        }
        com.tencent.could.huiyansdk.turing.f fVar = f.a.f15724a;
        if (fVar.m == null) {
            eVar.a(2, "TuringSdkHelper", "startTimeOutForWaitFirstFrame handler == null!");
        } else {
            eVar.a(1, "TuringSdkHelper", "start set event first frame time out!");
            Message messageObtainMessage = fVar.m.obtainMessage();
            messageObtainMessage.what = 3;
            fVar.m.sendMessageDelayed(messageObtainMessage, 5000L);
        }
        b.C0084b.f15678a.f15668l = fVar.h;
        eVar.a(1, "AuthingFragment", "start PrepareFaceTimeOutMs");
        this.f15651a.b(jVar.b().getPrepareFaceTimeOutMs(), jVar.b().isShowPrepareTimeout());
        this.f15651a.runOnUiThread(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.could.huiyansdk.fragments.e.a():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        HudView hudView = this.f15651a.f15632g;
        hudView.c++;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - hudView.f15776b;
        if (j >= 1000) {
            int i = (hudView.c * 1000) / ((int) j);
            hudView.c = 0;
            hudView.f15776b = jCurrentTimeMillis;
            TextView textView = hudView.f15775a;
            if (textView != null) {
                textView.setText("current fps: " + i);
                hudView.invalidate();
            }
        }
    }
}
