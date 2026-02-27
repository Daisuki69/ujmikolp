package com.tencent.could.huiyansdk.api;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.enums.VideoSize;
import com.tencent.could.huiyansdk.manager.b;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.utils.j;
import com.tencent.could.huiyansdk.utils.k;
import com.tencent.could.huiyansdk.utils.l;
import com.tencent.could.huiyansdk.utils.m;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f15614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HuiYanSdkConfig f15615b;
    public AuthUiConfig c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15616d = false;
    public volatile boolean e = false;
    public f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f15617g;
    public c h;
    public WeakReference<Context> i;
    public HuiYanAuthTipsEvent j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f15618a = new j();
    }

    public synchronized void a(int i, String str) {
        try {
            this.e = true;
            com.tencent.could.huiyansdk.manager.e eVar = e.a.f15688a;
            eVar.a(2, "HuiYanSdkImp", "huiyan failed, code: " + i + " msg:" + str);
            if (this.f != null) {
                eVar.a();
                Context context = CommonUtils.getContext();
                if (context == null || TextUtils.isEmpty(str) || !str.contains(String.valueOf(ErrorCode.YT_SDK_REFLECTION_ANGLE_DETECT_FAIL))) {
                    this.f.onFail(i, str);
                } else {
                    this.f.onFail(229, context.getString(R.string.txy_yt_face_ref_angle_detect_error));
                }
            }
            f();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public HuiYanSdkConfig b() {
        if (this.f15615b == null) {
            this.f15615b = new HuiYanSdkConfig();
        }
        return this.f15615b;
    }

    public boolean c() {
        HuiYanSdkConfig huiYanSdkConfig = this.f15615b;
        return huiYanSdkConfig != null && huiYanSdkConfig.isOpenLongCheck() && this.f15615b.isLongCheckUseBlurMode();
    }

    public boolean d() {
        AuthUiConfig authUiConfig = this.c;
        return authUiConfig != null && authUiConfig.getVideoSize() == VideoSize.SIZE_720P;
    }

    public void e() {
        a.f15618a.a(HuiYanAuthEvent.START_AUTH, true);
        com.tencent.could.huiyansdk.manager.b bVar = b.C0084b.f15678a;
        bVar.getClass();
        bVar.a(AuthState.START_CAMERA_PREVIEW, (Object) null);
    }

    public void f() {
        if (this.f != null) {
            this.f = null;
        }
        if (this.f15617g != null) {
            this.f15617g = null;
        }
        this.e = true;
    }

    public void a(String str, String str2) {
        this.e = true;
        com.tencent.could.huiyansdk.manager.e eVar = e.a.f15688a;
        eVar.a();
        f fVar = this.f;
        if (fVar != null) {
            fVar.onCompareSuccess(str, str2);
        } else {
            eVar.a(2, "HuiYanSdkImp", "HuiYan onCompareSuccess code! ");
        }
    }

    public void a(HuiYanAuthTipsEvent huiYanAuthTipsEvent, boolean z4) {
        if (huiYanAuthTipsEvent == null || huiYanAuthTipsEvent == HuiYanAuthTipsEvent.NONE) {
            return;
        }
        if (z4) {
            if (this.j == huiYanAuthTipsEvent) {
                return;
            } else {
                this.j = huiYanAuthTipsEvent;
            }
        }
        g gVar = this.f15614a;
        if (gVar != null) {
            gVar.onAuthTipsEvent(huiYanAuthTipsEvent);
        }
    }

    public void a(HuiYanAuthEvent huiYanAuthEvent, boolean z4) {
        if (huiYanAuthEvent == HuiYanAuthEvent.NONE) {
            e.a.f15688a.a(2, "HuiYanSdkImp", "Auth event is none");
            return;
        }
        com.tencent.could.huiyansdk.manager.e eVar = e.a.f15688a;
        eVar.a(2, "HuiYanSdkImp", "<auth event>: " + huiYanAuthEvent);
        g gVar = this.f15614a;
        if (gVar != null) {
            gVar.onAuthEvent(huiYanAuthEvent);
        }
        HuiYanSdkConfig huiYanSdkConfig = this.f15615b;
        if (huiYanSdkConfig == null || !huiYanSdkConfig.isUseTransition()) {
            return;
        }
        m mVarA = m.a();
        mVarA.getClass();
        if (z4) {
            return;
        }
        j jVar = a.f15618a;
        g gVar2 = jVar.f15614a;
        if (new l(mVarA).contains(huiYanAuthEvent)) {
            if (mVarA.f15750a == null) {
                HandlerThread handlerThread = new HandlerThread("transition");
                mVarA.f15750a = handlerThread;
                handlerThread.start();
                mVarA.f15751b = new k(mVarA, mVarA.f15750a.getLooper(), gVar2);
            }
            long transitionTime = jVar.b().getTransitionTime();
            if (mVarA.f15751b == null) {
                return;
            }
            com.tencent.could.huiyansdk.api.a.a().getClass();
            eVar.a(2, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "do pause");
            YtSDKKitFramework.getInstance().doPause();
            j.b.f15748a.c = true;
            eVar.a(1, "TimeOutHelper", "timeout pause");
            g gVar3 = jVar.f15614a;
            if (gVar3 != null) {
                gVar3.onBeginTransition();
            }
            try {
                Message messageObtainMessage = mVarA.f15751b.obtainMessage();
                messageObtainMessage.what = 1;
                mVarA.f15751b.sendMessageDelayed(messageObtainMessage, transitionTime);
            } catch (Exception e) {
                e.a.f15688a.a(2, "m", "failed to send transition event" + e.getLocalizedMessage());
            }
        }
    }

    public Context a() {
        WeakReference<Context> weakReference = this.i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
