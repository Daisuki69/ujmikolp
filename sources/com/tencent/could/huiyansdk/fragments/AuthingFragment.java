package com.tencent.could.huiyansdk.fragments;

import G7.p;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.HandlerThread;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.dynatrace.android.callback.Callback;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.tencent.could.aicamare.CameraHolder;
import com.tencent.could.aicamare.entity.CameraConfig;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.enums.HuiYanLiveMode;
import com.tencent.could.huiyansdk.enums.PackageTest;
import com.tencent.could.huiyansdk.enums.PageColorStyle;
import com.tencent.could.huiyansdk.helper.b;
import com.tencent.could.huiyansdk.manager.b;
import com.tencent.could.huiyansdk.manager.d;
import com.tencent.could.huiyansdk.manager.d.a;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.permission.c;
import com.tencent.could.huiyansdk.turing.f;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.utils.a;
import com.tencent.could.huiyansdk.utils.b;
import com.tencent.could.huiyansdk.utils.j;
import com.tencent.could.huiyansdk.view.CameraDateGatherView;
import com.tencent.could.huiyansdk.view.HudView;
import com.tencent.could.huiyansdk.view.HuiYanReflectLayout;
import com.tencent.could.huiyansdk.view.LoadingFrontAnimatorView;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import dOYHB6.lBzGT9.pYp6Y3;
import java.util.ArrayList;
import qf.C2172b;
import qf.RunnableC2171a;

/* JADX INFO: loaded from: classes4.dex */
public class AuthingFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.tencent.could.huiyansdk.turing.a f15629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f15630b;
    public TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f15631d;
    public TextView e;
    public TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HudView f15632g;
    public HuiYanReflectLayout h;
    public LoadingFrontAnimatorView i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.tencent.could.huiyansdk.utils.g f15637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CameraHolder f15638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.tencent.could.huiyansdk.view.b f15639r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AnimationDrawable f15643v;
    public volatile boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15633k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15634l = false;
    public volatile boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f15635n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f15636o = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15640s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f15641t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f15642u = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15644w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile boolean f15645x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f15646y = false;

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, boolean z4) {
        j.b.f15748a.a(j);
        TextView textView = this.e;
        if (textView != null) {
            textView.setVisibility(z4 ? 0 : 4);
        }
        AuthUiConfig authUiConfig = j.a.f15618a.c;
        if (authUiConfig == null || authUiConfig.isShowCountdown()) {
            return;
        }
        this.e.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object obj = this.f15629a;
        if (obj != null && (obj instanceof View)) {
            ((View) obj).setVisibility(0);
            this.f15629a.a();
        }
        this.f15634l = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f15638q == null) {
            this.f15638q = new CameraHolder();
        }
        this.f15638q.setLoggerCallBack(new d(this));
        this.f15638q.setEventListener(new e(this));
        CameraConfig cameraConfig = new CameraConfig();
        cameraConfig.setMainThread(false);
        com.tencent.could.huiyansdk.api.j jVar = j.a.f15618a;
        if (jVar.d()) {
            cameraConfig.setPreWidth(1280);
            cameraConfig.setPreHeight(720);
            HuiYanBaseApi.a.f15622a.a(720, 1280);
        } else {
            cameraConfig.setPreWidth(640);
            cameraConfig.setPreHeight(480);
            HuiYanBaseApi.a.f15622a.a(480, 640);
        }
        HuiYanSdkConfig huiYanSdkConfigB = jVar.b();
        if (huiYanSdkConfigB != null) {
            PackageTest packageTest = huiYanSdkConfigB.getPackageTest();
            if (packageTest == PackageTest.BIG || packageTest == PackageTest.MEDIUM) {
                cameraConfig.setMinFps(30);
                cameraConfig.setMaxFps(30);
            } else {
                cameraConfig.setMinFps(15);
                cameraConfig.setMaxFps(15);
            }
            cameraConfig.setBackCamera(huiYanSdkConfigB.isUseBackCamera());
            if (huiYanSdkConfigB.isUseBackCamera()) {
                cameraConfig.setZoom(huiYanSdkConfigB.getZoomLevel());
            }
            cameraConfig.setMustDiffMinAndMaxFps(huiYanSdkConfigB.isMustDiffMinAndMaxFps());
        } else {
            cameraConfig.setMinFps(30);
            cameraConfig.setMaxFps(30);
            cameraConfig.setBackCamera(false);
        }
        cameraConfig.setByteDataBuffer(true);
        cameraConfig.setSupportZoom(false);
        if (huiYanSdkConfigB != null) {
            cameraConfig.setLand(huiYanSdkConfigB.isLandMode());
        }
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.a.f15622a;
        this.f15638q.initCameraHolder(huiYanBaseApi.a(), cameraConfig);
        this.f15629a.setCameraHolder(this.f15638q);
        Context contextA = huiYanBaseApi.a();
        CameraHolder cameraHolder = this.f15638q;
        if (cameraHolder == null || contextA == null) {
            return;
        }
        cameraHolder.openCamera(contextA);
        com.tencent.could.huiyansdk.turing.f fVar = f.a.f15724a;
        HandlerThread handlerThread = new HandlerThread("turing");
        fVar.f15722l = handlerThread;
        handlerThread.start();
        fVar.m = new com.tencent.could.huiyansdk.turing.e(fVar, fVar.f15722l.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int i;
        CameraHolder cameraHolder = this.f15638q;
        if (cameraHolder != null) {
            cameraHolder.release();
            f.a.f15724a.b();
        }
        b(true);
        com.tencent.could.huiyansdk.api.j jVar = j.a.f15618a;
        if (jVar.b().isAutoScreenBrightness() && (i = this.f15633k) != -1) {
            b(i);
            this.f15633k = -1;
        }
        d.b.f15684a.a();
        HuiYanSdkConfig huiYanSdkConfig = jVar.f15615b;
        if (!(huiYanSdkConfig == null ? false : huiYanSdkConfig.isWaitingUserCompare())) {
            CommonUtils.closeCurrentFragment();
            return;
        }
        if (this.f15630b == null) {
            return;
        }
        AuthUiConfig authUiConfig = jVar.c;
        if (authUiConfig != null) {
            if (this.h != null && authUiConfig.getLoadingStageBgColor() != -1) {
                this.h.setBackgroundColor(authUiConfig.getLoadingStageBgColor());
            }
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(getContextResources().getString(R.string.txy_wait_for_result));
                if (authUiConfig.getLoadingStageTipsColor() != -1) {
                    this.c.setTextColor(authUiConfig.getLoadingStageTipsColor());
                } else {
                    this.c.setTextColor(getContextResources().getColor(R.color.txy_black));
                }
            }
        }
        TextView textView2 = this.f15631d;
        if (textView2 != null) {
            textView2.setVisibility(4);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.findViewById(R.id.txy_auth_common_background_views).setVisibility(4);
            this.fragmentView.findViewById(R.id.txy_cancel_txt_btn).setVisibility(4);
        }
        this.f15630b.setVisibility(0);
        com.tencent.could.huiyansdk.api.c cVar = jVar.h;
        if (cVar != null) {
            this.f15643v = cVar.getWaitingAnimation();
        }
        if (this.f15643v == null) {
            e.a.f15688a.a(2, "AuthingFragment", "animationDrawable is null!");
            return;
        }
        Object obj = this.f15629a;
        if (obj != null && (obj instanceof View)) {
            ((View) obj).setVisibility(4);
        }
        this.f15630b.setImageDrawable(this.f15643v);
        this.f15643v.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        com.tencent.could.huiyansdk.utils.j jVar = j.b.f15748a;
        if (jVar.f15745b != null) {
            jVar.f15745b = null;
        }
        CountDownTimer countDownTimer = jVar.f15744a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            jVar.f15744a = null;
        }
        TextView textView = this.e;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$b$--V, reason: not valid java name */
    public static /* synthetic */ void m191instrumented$0$b$V(AuthingFragment authingFragment, View view) {
        Callback.onClick_enter(view);
        try {
            authingFragment.a(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment
    public void backPopEvent() {
        super.backPopEvent();
        a(false);
    }

    public final void c() {
        if (this.f15630b == null) {
            return;
        }
        AuthUiConfig authUiConfig = j.a.f15618a.c;
        if (authUiConfig != null && authUiConfig.isHideAvatarGuideFrame()) {
            this.f15630b.setVisibility(8);
            return;
        }
        this.f15630b.setScaleX(0.935f);
        this.f15630b.setScaleY(0.935f);
        this.f15630b.setVisibility(0);
        this.f15630b.setImageResource(R.drawable.txy_huiyan_head_guide_frame);
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment
    public void exit() {
        super.exit();
        j.a.f15618a.f15616d = true;
    }

    public final void h() {
        e.a.f15688a.a(1, "AuthingFragment", ">>>start camera preview(get light data ok)");
        runOnUiThread(new RunnableC2171a(this, 2));
    }

    public final void i() {
        e.a.f15688a.a(1, "AuthingFragment", ">>>start auth action");
        runOnUiThread(new RunnableC2171a(this, 3));
    }

    public final void j() {
        e.a.f15688a.a(1, "AuthingFragment", ">>>start auth end.");
        m();
        runOnUiThread(new RunnableC2171a(this, 1));
    }

    public final void k() {
        Sensor defaultSensor;
        com.tencent.could.huiyansdk.manager.d dVar = d.b.f15684a;
        Context contextA = HuiYanBaseApi.a.f15622a.a();
        if (contextA == null) {
            Log.e("LightSensor", "context is null");
        } else if (!dVar.c) {
            dVar.c = true;
            SensorManager sensorManager = (SensorManager) contextA.getApplicationContext().getSystemService("sensor");
            dVar.f15680a = sensorManager;
            if (sensorManager == null || (defaultSensor = sensorManager.getDefaultSensor(5)) == null) {
                e.a.f15688a.a(2, "LightSensor", " 光线传感器不可用~");
            } else {
                d.a aVar = dVar.new a();
                dVar.f15681b = aVar;
                dVar.f15680a.registerListener(aVar, defaultSensor, 3);
            }
        }
        C2172b c2172b = new C2172b(this);
        if (dVar.f15681b != null) {
            dVar.f15682d = c2172b;
        } else {
            e.a.f15688a.a(2, "LightSensor", "设备无光线传感器或者未调用start()方法");
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            e.a.f15688a.a(2, "AuthingFragment", "can not get activity!");
            return;
        }
        try {
            this.f15633k = Settings.System.getInt(activity.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException unused) {
            e.a.f15688a.a(2, "AuthingFragment", "can not get screen brightness");
        }
    }

    public final void l() {
        e.a.f15688a.a(1, "AuthingFragment", "start prepare auth");
        this.f15646y = true;
        com.tencent.could.huiyansdk.manager.b bVar = b.C0084b.f15678a;
        C2172b c2172b = new C2172b(this);
        bVar.f15674s = false;
        Context contextA = HuiYanBaseApi.a.f15622a.a();
        if (contextA == null) {
            Log.e("AuthStateManager", "context is null!");
        } else {
            Resources resources = contextA.getResources();
            bVar.f15670o = resources.getColor(R.color.txy_feedback_txt_red);
            bVar.f15671p = resources.getColor(R.color.txy_black);
            bVar.f15672q = resources.getColor(R.color.txy_auth_bg_red_error);
            bVar.f15673r = resources.getColor(R.color.txy_auth_bg_green_tip);
            AuthUiConfig authUiConfig = j.a.f15618a.c;
            if (authUiConfig != null) {
                if (authUiConfig.getFeedBackErrorColor() != -1) {
                    bVar.f15670o = authUiConfig.getFeedBackErrorColor();
                }
                if (authUiConfig.getFeedBackTxtColor() != -1) {
                    bVar.f15671p = authUiConfig.getFeedBackTxtColor();
                }
                if (authUiConfig.getAuthCircleErrorColor() != -1) {
                    bVar.f15672q = authUiConfig.getAuthCircleErrorColor();
                }
                if (authUiConfig.getAuthCircleCorrectColor() != -1) {
                    bVar.f15673r = authUiConfig.getAuthCircleCorrectColor();
                }
            }
        }
        bVar.f15664b = c2172b;
        bVar.a(AuthState.PREPARE, (Object) null);
        bVar.i = -1;
        bVar.j = -1;
        bVar.f15667k = 3;
        bVar.a(AuthState.AUTH_ACTION, (Object) null);
    }

    public final void m() {
        runOnUiThread(new RunnableC2171a(this, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.f15642u = false;
        e.a.f15688a.a(1, "AuthingFragment", "on attach.");
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        boolean z4;
        if (this.fragmentView == null) {
            int landAuthLayoutResId = R.layout.txy_huiyan_fragment_authing;
            com.tencent.could.huiyansdk.api.j jVar = j.a.f15618a;
            HuiYanSdkConfig huiYanSdkConfigB = jVar.b();
            if (huiYanSdkConfigB == null || !huiYanSdkConfigB.isLandMode()) {
                z4 = false;
            } else {
                landAuthLayoutResId = R.layout.txy_huiyan_fragment_authing_land;
                z4 = true;
            }
            AuthUiConfig authUiConfig = jVar.c;
            if (authUiConfig != null && !z4 && authUiConfig.getAuthLayoutResId() != -1) {
                landAuthLayoutResId = authUiConfig.getAuthLayoutResId();
            }
            if (jVar.c()) {
                landAuthLayoutResId = R.layout.txy_private_huiyan_fragment_authing_720_bot;
                if (authUiConfig != null && authUiConfig.getAuthWithLongCheck720LayoutResId() != -1) {
                    landAuthLayoutResId = authUiConfig.getAuthWithLongCheck720LayoutResId();
                }
            }
            if (authUiConfig != null && z4 && authUiConfig.getLandAuthLayoutResId() != -1) {
                landAuthLayoutResId = authUiConfig.getLandAuthLayoutResId();
            }
            this.fragmentView = layoutInflater.inflate(landAuthLayoutResId, viewGroup, false);
            b();
            a();
            b.C0084b.f15678a.c = new f(this);
            this.h = (HuiYanReflectLayout) this.fragmentView.findViewById(R.id.txy_auth_layout_bg);
            HuiYanSdkConfig huiYanSdkConfig = jVar.f15615b;
            if ((huiYanSdkConfig == null ? PageColorStyle.Light : huiYanSdkConfig.getPageColorStyle()) == PageColorStyle.Light) {
                this.h.setBackgroundColor(getContextResources().getColor(R.color.txy_white));
            } else {
                TextView textView = (TextView) this.fragmentView.findViewById(R.id.txy_cancel_txt_btn);
                Resources contextResources = getContextResources();
                int i = R.color.txy_white;
                textView.setTextColor(contextResources.getColor(i));
                this.c.setTextColor(getContextResources().getColor(i));
                this.e.setTextColor(getContextResources().getColor(i));
                this.f15630b.setImageResource(R.drawable.txy_prepare_face_head_black);
                this.h.setBackgroundColor(getContextResources().getColor(R.color.txy_black));
            }
            com.tencent.could.huiyansdk.turing.f fVar = f.a.f15724a;
            TuringResultCacheEntity turingResultCacheEntity = fVar.f;
            if (turingResultCacheEntity != null) {
                turingResultCacheEntity.reset();
            }
            if (!fVar.j || fVar.f15720g == null) {
                e.a.f15688a.a(2, "TuringSdkHelper", "init turing sdk logic, turing is not create!");
            } else {
                fVar.f15718b = false;
                com.tencent.could.huiyansdk.turing.d dVar = new com.tencent.could.huiyansdk.turing.d(fVar);
                if (!fVar.j || fVar.f15720g == null) {
                    e.a.f15688a.a(2, "TuringSdkHelper", "set event listener, turing is not create!");
                } else {
                    fVar.f15720g.f15714a = dVar;
                }
                fVar.h = new com.tencent.could.huiyansdk.manager.f();
            }
            b.a.f15729a.f15728a = new com.tencent.could.huiyansdk.utils.h<>(20, "FrameCreatePool");
            a.C0086a.f15727a.f15726a = new com.tencent.could.huiyansdk.utils.h<>(10, "ChangeBytePool");
            if (jVar.d()) {
                com.tencent.could.huiyansdk.turing.a aVar = this.f15629a;
                if (aVar instanceof CameraDateGatherView) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) ((CameraDateGatherView) aVar).getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) (((double) ((ViewGroup.MarginLayoutParams) layoutParams).height) * 1.3d);
                    ((CameraDateGatherView) this.f15629a).setLayoutParams(layoutParams);
                }
            }
            AuthUiConfig authUiConfig2 = jVar.c;
            if (authUiConfig2 != null) {
                if (this.h != null && authUiConfig2.getAuthLayoutBgColor() != -1) {
                    this.h.setBackgroundColor(authUiConfig2.getAuthLayoutBgColor());
                }
                if (this.c != null && authUiConfig2.getFeedBackTxtColor() != -1) {
                    this.c.setTextColor(authUiConfig2.getFeedBackTxtColor());
                }
                if (this.f15631d != null && authUiConfig2.getFeedBackExtraTipColor() != -1) {
                    this.f15631d.setTextColor(authUiConfig2.getFeedBackExtraTipColor());
                }
                if (authUiConfig2.isTransparentStatusBar()) {
                    TextView textView2 = this.f;
                    if (textView2 != null) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) textView2.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = CommonUtils.dpToPx(this.f, authUiConfig2.getTransparentStatusBarMoveHeight()) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        this.f.setLayoutParams(layoutParams2);
                    }
                    TextView textView3 = this.e;
                    if (textView3 != null) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) textView3.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = CommonUtils.dpToPx(this.e, authUiConfig2.getTransparentStatusBarMoveHeight()) + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
                        this.e.setLayoutParams(layoutParams3);
                    }
                }
                if (this.f != null && authUiConfig2.getCancelTxtColor() != -10) {
                    this.f.setTextColor(authUiConfig2.getCancelTxtColor());
                }
                if (this.e != null && authUiConfig2.getCountDownTxtColor() != -10) {
                    this.e.setTextColor(authUiConfig2.getCountDownTxtColor());
                }
            }
            FragmentActivity activity = getActivity();
            if (activity == null) {
                e.a.f15688a.a(2, "AuthingFragment", "activity is null!");
            } else {
                com.tencent.could.huiyansdk.permission.c cVar = c.a.f15713a;
                String[] strArr = com.tencent.could.huiyansdk.utils.e.f15734a;
                a aVar2 = new a(this);
                cVar.f15712b = aVar2;
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    if (ContextCompat.checkSelfPermission(activity, strArr[i4]) != 0) {
                        arrayList.add(strArr[i4]);
                    }
                }
                String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                if (strArr2.length > 0) {
                    pYp6Y3.requestPermissions(activity, strArr2, 119);
                } else {
                    aVar2.b();
                }
            }
        }
        com.tencent.could.huiyansdk.api.j jVar2 = j.a.f15618a;
        if (jVar2.d()) {
            if (jVar2.c()) {
                YtSDKKitFramework.getInstance().setDetectRect(new Rect(20, 180, TypedValues.TransitionType.TYPE_DURATION, 1100));
            } else {
                YtSDKKitFramework.getInstance().setDetectRect(new Rect(20, 280, TypedValues.TransitionType.TYPE_DURATION, 1000));
            }
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        int i;
        super.onDestroy();
        e.a.f15688a.a(1, "AuthingFragment", "on destroy.");
        this.f15642u = false;
        this.f15640s = false;
        com.tencent.could.huiyansdk.view.b bVar = this.f15639r;
        if (bVar != null) {
            bVar.dismiss();
            this.f15639r = null;
        }
        if (this.f15629a != null) {
            this.f15629a = null;
        }
        HuiYanBaseApi.a.f15622a.getClass();
        com.tencent.could.huiyansdk.helper.b bVar2 = b.a.f15659a;
        if (bVar2.f15658b != null) {
            bVar2.f15658b = null;
        }
        YtSDKKitFramework.getInstance().deInit();
        d.b.f15684a.a();
        if (j.a.f15618a.b().isAutoScreenBrightness() && (i = this.f15633k) != -1) {
            b(i);
        }
        CameraHolder cameraHolder = this.f15638q;
        if (cameraHolder != null) {
            cameraHolder.release();
            f.a.f15724a.b();
        }
        com.tencent.could.huiyansdk.manager.b bVar3 = b.C0084b.f15678a;
        if (bVar3.c != null) {
            bVar3.c = null;
        }
        if (bVar3.f15664b != null) {
            bVar3.f15664b = null;
        }
        if (bVar3.f15668l != null) {
            bVar3.f15668l = null;
        }
        bVar3.f15665d = false;
        b(true);
        com.tencent.could.huiyansdk.utils.g gVar = this.f15637p;
        if (gVar != null && gVar.f15738b != null) {
            gVar.f15738b.removeMessages(1);
            gVar.f15738b = null;
            HandlerThread handlerThread = gVar.f15737a;
            if (handlerThread != null && handlerThread.isAlive()) {
                gVar.f15737a.quitSafely();
            }
        }
        com.tencent.could.huiyansdk.turing.f fVar = f.a.f15724a;
        com.tencent.could.huiyansdk.manager.f fVar2 = fVar.h;
        if (fVar2 != null) {
            while (fVar2.f15689a.size() > 0) {
                b.a.f15729a.a(fVar2.f15689a.poll());
            }
            fVar2.j = true;
            fVar2.f15693k = true;
            fVar2.f15697p = false;
            fVar2.f15698q = true;
        }
        fVar.e = false;
        fVar.f15719d = false;
        fVar.f15718b = false;
        fVar.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        Context contextA = HuiYanBaseApi.a.f15622a.a();
        if (!(contextA == null ? false : com.tencent.could.huiyansdk.utils.e.a(contextA, com.tencent.could.huiyansdk.utils.e.f15734a))) {
            super.onStop();
            return;
        }
        com.tencent.could.huiyansdk.api.j jVar = j.a.f15618a;
        HuiYanSdkConfig huiYanSdkConfigB = jVar.b();
        if (huiYanSdkConfigB == null || !huiYanSdkConfigB.isBackgroundStopAuth()) {
            super.onStop();
            return;
        }
        if (jVar.e) {
            super.onStop();
            return;
        }
        if (!this.f15646y) {
            super.onStop();
            return;
        }
        CameraHolder cameraHolder = this.f15638q;
        if (cameraHolder != null) {
            cameraHolder.release();
        }
        if (getContext() != null) {
            String resString = getResString(R.string.txy_do_not_change_app_in_auth);
            com.tencent.could.huiyansdk.api.b bVar = jVar.f15617g;
            if (bVar != null) {
                bVar.onBuriedPointCallBack("AuthCheckStage", "AuthLocalFail", resString);
            }
            CompareResult compareResult = new CompareResult();
            compareResult.setErrorMsg(resString);
            compareResult.setErrorCode(MfaTencentErrorResult.TENCENT_ERROR_APP_SWITCH);
            b((Object) compareResult);
        }
        super.onStop();
    }

    public final void b() {
        HudView hudView;
        this.f15629a = (com.tencent.could.huiyansdk.turing.a) this.fragmentView.findViewById(R.id.txy_camera_gather_view);
        View view = this.fragmentView;
        int i = R.id.txy_cancel_txt_btn;
        view.findViewById(i).setOnClickListener(new qf.d(this, 0));
        this.f15630b = (ImageView) this.fragmentView.findViewById(R.id.txy_camera_prepare_img);
        this.c = (TextView) this.fragmentView.findViewById(R.id.txy_auth_feed_back_txt);
        this.f15631d = (TextView) this.fragmentView.findViewById(R.id.txy_auth_feed_back_extra_tip_txt);
        this.i = (LoadingFrontAnimatorView) this.fragmentView.findViewById(R.id.txy_auth_loading_front_animator_view);
        this.e = (TextView) this.fragmentView.findViewById(R.id.txy_count_down_txt_view);
        this.f = (TextView) this.fragmentView.findViewById(i);
        this.f15632g = (HudView) this.fragmentView.findViewById(R.id.txy_hud_view);
        HuiYanSdkConfig huiYanSdkConfigB = j.a.f15618a.b();
        if (huiYanSdkConfigB != null && huiYanSdkConfigB.isShowDebugView() && (hudView = this.f15632g) != null) {
            hudView.setVisibility(0);
        }
        com.tencent.could.huiyansdk.utils.g gVar = new com.tencent.could.huiyansdk.utils.g();
        this.f15637p = gVar;
        TextView textView = this.f15631d;
        gVar.e.clear();
        gVar.c = textView;
        if (gVar.f15737a == null) {
            HandlerThread handlerThread = new HandlerThread("showTips");
            gVar.f15737a = handlerThread;
            handlerThread.start();
            gVar.f15738b = new com.tencent.could.huiyansdk.utils.f(gVar, gVar.f15737a.getLooper());
            gVar.b();
        }
        this.c.setText(R.string.txy_face_preparing3);
        if (this.e != null) {
            j.b.f15748a.f15745b = new c(this);
        }
        this.f15640s = false;
        this.f15644w = 0;
    }

    public final void a(boolean z4) {
        String str;
        com.tencent.could.huiyansdk.manager.e eVar = e.a.f15688a;
        eVar.a(1, "AuthingFragment", "user cancel the auth check.");
        if (z4) {
            str = "PrivacyDialog";
        } else {
            AuthState authState = b.C0084b.f15678a.f15663a;
            eVar.a(1, "AuthingFragment", "cancelAuthCheckByUser current state is " + authState);
            if (authState.compareTo(AuthState.AUTH_FAIL) >= 0) {
                eVar.a(2, "AuthingFragment", "user cancel the auth check, but current state is error!");
            } else if (authState.compareTo(AuthState.AUTH_END) >= 0) {
                str = "WaitingPage";
            } else if (authState.compareTo(AuthState.START_CAMERA_PREVIEW) >= 0) {
                str = "AuthCheckPage";
            }
            str = "PreparePage";
        }
        String str2 = str;
        com.tencent.could.huiyansdk.api.b bVar = j.a.f15618a.f15617g;
        if (bVar != null) {
            bVar.onBuriedPointCallBack("AuthCheckStage", "UserCancelAuth", "");
        }
        HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.a.f15622a.f15620b;
        if (huiYanBaseCallBack != null) {
            huiYanBaseCallBack.updateOperateInfo("UserCancel", 1, 0L, str2);
        }
        CommonUtils.sendErrorAndExitAuth(MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS, getResString(R.string.txt_user_cancel_check));
    }

    public void a(Object obj) {
        e.a.f15688a.a(1, "AuthingFragment", ">>>local auth fail");
        m();
        if (obj instanceof CompareResult) {
            runOnUiThread(new qf.c(this, (CompareResult) obj, 0));
        }
    }

    public final void b(final long j, final boolean z4) {
        runOnUiThread(new Runnable() { // from class: qf.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f19780a.a(j, z4);
            }
        });
    }

    public final void b(Object obj) {
        m();
        if (obj instanceof CompareResult) {
            CompareResult compareResult = (CompareResult) obj;
            AuthUiConfig authUiConfig = j.a.f15618a.c;
            if (!(authUiConfig == null ? true : authUiConfig.isShowErrorDialog())) {
                CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
            } else {
                runOnUiThread(new qf.c(this, compareResult, 1));
            }
        }
    }

    private /* synthetic */ void a(View view) {
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f) {
        String resString;
        boolean z4;
        boolean z5;
        if (f < 4.0f) {
            resString = getResString(R.string.txy_light_low);
            z4 = true;
        } else {
            resString = "";
            z4 = false;
        }
        if (f > 235.0f) {
            resString = getResString(R.string.txy_light_strong);
            z5 = true;
            z4 = true;
        } else {
            z5 = false;
        }
        if (this.f15631d == null) {
            return;
        }
        if (z4) {
            if (this.f15641t) {
                return;
            }
            this.f15637p.a(resString);
            if (z5) {
                j.a.f15618a.a(HuiYanAuthTipsEvent.LIGHT_TOO_STRONG, true);
            } else {
                j.a.f15618a.a(HuiYanAuthTipsEvent.LIGHT_TOO_LOW, true);
            }
            this.f15641t = true;
            return;
        }
        if (this.f15641t) {
            this.f15641t = false;
            this.f15637p.a("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CompareResult compareResult) {
        if (this.f15640s) {
            e.a.f15688a.a(2, "AuthingFragment", "error dialog had showing!");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            if (this.f15639r == null) {
                this.f15639r = new com.tencent.could.huiyansdk.view.b(activity, 0);
            }
            this.f15640s = true;
            com.tencent.could.huiyansdk.api.j jVar = j.a.f15618a;
            jVar.e = true;
            WindowManager windowManager = activity.getWindowManager();
            if (windowManager == null) {
                CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
                return;
            }
            com.tencent.could.huiyansdk.view.b bVar = this.f15639r;
            bVar.getClass();
            windowManager.getDefaultDisplay().getSize(new Point());
            Window window = bVar.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            HuiYanSdkConfig huiYanSdkConfig = jVar.f15615b;
            if (huiYanSdkConfig != null ? huiYanSdkConfig.isLandMode() : false) {
                attributes.height = (int) (r7.x * 0.32f);
                attributes.width = (int) (r7.y * 0.7f);
            } else {
                attributes.width = (int) (r7.x * 0.8f);
                attributes.height = (int) (r7.y * 0.4f);
            }
            window.setAttributes(attributes);
            com.tencent.could.huiyansdk.view.b bVar2 = this.f15639r;
            int errorCode = compareResult.getErrorCode();
            String errorMsg = compareResult.getErrorMsg();
            bVar2.f15786b = errorCode;
            bVar2.c = errorMsg;
            TextView textView = bVar2.f15785a;
            if (textView != null) {
                textView.setText(errorMsg);
            }
            if (jVar.f15616d) {
                e.a.f15688a.a(2, "ErrorInfoDialog", "activity has exit, do not need show!");
            } else {
                bVar2.show();
            }
            b(true);
            e.a.f15688a.a(2, "AuthingFragment", "showErrorDialog error code:" + compareResult.getErrorCode() + " msg: " + compareResult.getErrorMsg());
            return;
        }
        e.a.f15688a.a(2, "AuthingFragment", "activity is null or is finishing by create ErrorInfoDialog");
        CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
    }

    public final void a() {
        if (this.f15629a instanceof View) {
            if (this.f15634l) {
                c();
                ((View) this.f15629a).setVisibility(0);
            } else {
                this.f15630b.setVisibility(0);
                ((View) this.f15629a).setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AuthState authState, Object obj) {
        switch (authState.ordinal()) {
            case 0:
                com.tencent.could.huiyansdk.manager.e eVar = e.a.f15688a;
                eVar.a(1, "AuthingFragment", ">>>start prepare event");
                if (this.i == null) {
                    eVar.a(2, "AuthingFragment", "loadingFrontAnimatorView is null!");
                } else {
                    AuthUiConfig authUiConfig = j.a.f15618a.c;
                    if (authUiConfig != null && authUiConfig.isHideFrontCircleViewOnStart()) {
                        this.i.setVisibility(8);
                    } else {
                        this.i.b();
                    }
                }
                break;
            case 1:
                if (!this.f15642u) {
                    e.a.f15688a.a(1, "AuthingFragment", ">>>start auth and get live info");
                    YtSDKKitFramework.YtSDKPlatformContext platformContext = YtSDKKitFramework.getInstance().getPlatformContext();
                    CameraHolder cameraHolder = this.f15638q;
                    if (cameraHolder != null) {
                        platformContext.currentCamera = cameraHolder.getCurrentCamera();
                        platformContext.currentCameraId = this.f15638q.getCameraId();
                        platformContext.currentRotateState = this.f15638q.getCurrentRotate();
                        platformContext.currentAppContext = HuiYanBaseApi.a.f15622a.a();
                    }
                    platformContext.reflectListener = new g(this);
                    platformContext.baseFunctionListener = new h(this);
                    com.tencent.could.huiyansdk.manager.b bVar = b.C0084b.f15678a;
                    bVar.getClass();
                    bVar.f15669n = HuiYanAuthTipsEvent.NONE;
                    HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.a.f15622a;
                    huiYanBaseApi.getClass();
                    com.tencent.could.huiyansdk.helper.b bVar2 = b.a.f15659a;
                    bVar2.getClass();
                    HuiYanBaseCallBack huiYanBaseCallBack = huiYanBaseApi.f15620b;
                    if (huiYanBaseCallBack != null) {
                        huiYanBaseCallBack.onOperateTimeEvent("GetConfigUseTime", 1, false, "");
                    }
                    int iA = bVar2.a(platformContext, bVar2.b(), new com.tencent.could.huiyansdk.helper.a(bVar2));
                    if (iA != 0) {
                        CommonUtils.sendErrorAndExitAuth(MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED, "YtSDKKitFramework init error ! code: " + iA);
                    } else if (huiYanBaseApi.b() != HuiYanLiveMode.ACTION_REFLECT_MODE) {
                        j.a.f15618a.a(HuiYanAuthEvent.START_AUTH, true);
                        bVar.getClass();
                        bVar.a(AuthState.START_CAMERA_PREVIEW, (Object) null);
                    }
                    this.f15642u = true;
                } else {
                    e.a.f15688a.a(1, "AuthingFragment", "has started auth and got live info");
                }
                break;
            case 2:
                h();
                break;
            case 3:
                i();
                break;
            case 4:
                e.a.f15688a.a(1, "AuthingFragment", ">>>first found the face. start AuthTimeOutMs");
                break;
            case 5:
                this.m = true;
                e.a.f15688a.a(1, "AuthingFragment", ">>>enter other action. start AuthTimeOutMs");
                com.tencent.could.huiyansdk.api.j jVar = j.a.f15618a;
                b(jVar.b().getAuthTimeOutMs(), jVar.b().isShowActionTimeout());
                break;
            case 6:
                this.f15635n = false;
                this.f15636o = true;
                e.a.f15688a.a(1, "AuthingFragment", ">>>entry long check, start LongCheckTimeOutMs");
                com.tencent.could.huiyansdk.api.j jVar2 = j.a.f15618a;
                b(jVar2.b().getLongCheckTimeOutMs(), jVar2.b().isShowLongCheckTimeout());
                break;
            case 7:
                this.f15635n = true;
                this.f15636o = false;
                e.a.f15688a.a(1, "AuthingFragment", ">>>first found the face. start AuthTimeOutMs");
                break;
            case 8:
                j();
                break;
            case 9:
                a(obj);
                break;
            case 10:
                b(obj);
                break;
            default:
                e.a.f15688a.a(1, "AuthingFragment", "error state");
                break;
        }
    }

    public final void b(ColorMatrixColorFilter colorMatrixColorFilter) {
        runOnUiThread(new io.flutter.plugins.firebase.core.a(10, this, colorMatrixColorFilter));
    }

    public final void b(int i) {
        runOnUiThread(new p(this, i, 6));
    }

    public final void b(boolean z4) {
        LoadingFrontAnimatorView loadingFrontAnimatorView = this.i;
        if (loadingFrontAnimatorView != null) {
            loadingFrontAnimatorView.f15784l = false;
            if (z4) {
                loadingFrontAnimatorView.setVisibility(8);
            }
            ValueAnimator valueAnimator = loadingFrontAnimatorView.f15780b;
            if (valueAnimator == null) {
                return;
            }
            if (valueAnimator.isRunning() || loadingFrontAnimatorView.f15780b.isStarted()) {
                loadingFrontAnimatorView.f15780b.cancel();
                loadingFrontAnimatorView.invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CompareResult compareResult) {
        b(true);
        CommonUtils.sendErrorAndExitAuth(compareResult.getErrorCode(), compareResult.getErrorMsg());
        e.a.f15688a.a(2, "AuthingFragment", "local auth fail! code: " + compareResult.getErrorCode() + " msg: " + compareResult.getErrorMsg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ColorMatrixColorFilter colorMatrixColorFilter) {
        HuiYanReflectLayout huiYanReflectLayout = this.h;
        if (huiYanReflectLayout != null && huiYanReflectLayout.f15777a != null) {
            huiYanReflectLayout.f15778b = colorMatrixColorFilter;
            huiYanReflectLayout.invalidate();
        }
        if (this.j) {
            return;
        }
        this.j = true;
        this.f15637p.a("");
        m();
        j.a.f15618a.a(HuiYanAuthEvent.REFLECT_CHECK, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        try {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (i == -1) {
                attributes.screenBrightness = -1.0f;
            } else {
                if (i <= 0) {
                    i = 1;
                }
                attributes.screenBrightness = i / 255.0f;
            }
            window.setAttributes(attributes);
        } catch (Exception e) {
            e.a.f15688a.a(2, "AuthingFragment", "set current screen brightness error: " + e.getLocalizedMessage());
        }
    }
}
