package com.tencent.could.huiyansdk.activitys;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.FragmentManager;
import androidx.media3.common.C;
import com.tencent.could.aicamare.CameraHolder;
import com.tencent.could.component.common.ai.utils.TwoTuple;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.fragments.BaseFragment;
import com.tencent.could.huiyansdk.helper.b;
import com.tencent.could.huiyansdk.manager.a;
import com.tencent.could.huiyansdk.manager.b;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.permission.c;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.utils.j;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import d7.ViewOnApplyWindowInsetsListenerC1334a;
import dOYHB6.iY9fr2.dLgao9;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class BaseActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f15608a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TwoTuple<Integer, Integer> f15609b;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseActivity.this.a();
        }
    }

    public final void a() {
        View childAt;
        com.tencent.could.huiyansdk.manager.a aVar = a.C0083a.f15662a;
        aVar.f15661b = getSupportFragmentManager();
        BaseFragment baseFragment = null;
        if (!TextUtils.isEmpty(aVar.f15660a)) {
            try {
                baseFragment = (BaseFragment) Class.forName(aVar.f15660a).newInstance();
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                e.a.f15688a.a(2, "AuthFragmentManager", "");
            }
        }
        if (baseFragment != null) {
            a.C0083a.f15662a.a(baseFragment);
        } else {
            a.C0083a.f15662a.a(new AuthingFragment());
        }
        new WeakReference(this);
        if (Build.VERSION.SDK_INT >= 35) {
            View viewFindViewById = getWindow().getDecorView().findViewById(R.id.content);
            if ((viewFindViewById instanceof ViewGroup) && (childAt = ((ViewGroup) viewFindViewById).getChildAt(0)) != null) {
                childAt.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1334a(this, 1));
            }
            WindowInsetsController insetsController = getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(8, 8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.could.huiyansdk.activitys.BaseActivity.attachBaseContext(android.content.Context):void");
    }

    public final TwoTuple<Integer, Integer> b() {
        Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return new TwoTuple<>(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }

    public final void c() {
        CameraHolder cameraHolder;
        Context context = CommonUtils.getContext();
        if (context == null) {
            e.a.f15688a.a(2, "BaseActivity", "context is null");
            return;
        }
        BaseFragment baseFragmentA = a.C0083a.f15662a.a();
        if ((baseFragmentA instanceof AuthingFragment) && (cameraHolder = ((AuthingFragment) baseFragmentA).f15638q) != null) {
            cameraHolder.release();
        }
        HuiYanBaseApi.a.f15622a.getClass();
        b bVar = b.a.f15659a;
        if (bVar.f15658b != null) {
            bVar.f15658b = null;
        }
        YtSDKKitFramework.getInstance().deInit();
        com.tencent.could.huiyansdk.manager.b bVar2 = b.C0084b.f15678a;
        String string = context.getString(com.tencent.could.huiyansdk.R.string.txy_do_not_change_fold_statue_error);
        bVar2.getClass();
        CompareResult compareResult = new CompareResult();
        compareResult.setErrorCode(232);
        compareResult.setErrorMsg(string);
        bVar2.a(AuthState.AUTH_ERROR_DIALOG, compareResult);
    }

    public void d() {
        Log.e("BaseActivity", "setChildContentView!");
    }

    public boolean e() {
        TypedArray typedArrayObtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{R.attr.windowIsTranslucent, R.attr.windowIsFloating});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, false) || typedArrayObtainStyledAttributes.getBoolean(1, false);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        j.a.f15618a.f15616d = true;
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.could.huiyansdk.manager.a aVar = a.C0083a.f15662a;
        if (aVar.f15661b == null) {
            finish();
            return;
        }
        BaseFragment baseFragmentA = aVar.a();
        if (baseFragmentA != null) {
            baseFragmentA.backPopEvent();
        }
        FragmentManager fragmentManager = aVar.f15661b;
        if (fragmentManager == null) {
            return;
        }
        if (fragmentManager.getBackStackEntryCount() <= 1) {
            finish();
        } else {
            aVar.f15661b.popBackStack();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f15609b == null) {
            e.a.f15688a.a(1, "BaseActivity", "createScreenSize is null do not check change screen size");
            return;
        }
        if (j.a.f15618a.b() == null) {
            e.a.f15688a.a(2, "BaseActivity", "sdkConfig is null");
        }
        TwoTuple<Integer, Integer> twoTupleB = b();
        e eVar = e.a.f15688a;
        eVar.a(1, "BaseActivity", "onConfigurationChanged onCreate screenSize: " + this.f15609b.getFirst() + "," + this.f15609b.getSecond());
        eVar.a(1, "BaseActivity", "onConfigurationChanged screenSize: " + twoTupleB.getFirst() + "," + twoTupleB.getSecond());
        if (this.f15609b.getFirst().intValue() - twoTupleB.getSecond().intValue() == 0 || this.f15609b.getSecond().intValue() - twoTupleB.getFirst().intValue() == 0) {
            eVar.a(1, "BaseActivity", "screen size is same, just rotation, do not check change screen size");
            this.f15609b = twoTupleB;
            return;
        }
        if (b.C0084b.f15678a.f15674s) {
            if (Math.abs(this.f15609b.getFirst().intValue() - twoTupleB.getFirst().intValue()) / this.f15609b.getFirst().intValue() > 0.2f) {
                eVar.a(1, "BaseActivity", "screen width size change!");
                c();
                return;
            } else if (Math.abs(this.f15609b.getSecond().intValue() - twoTupleB.getSecond().intValue()) / this.f15609b.getSecond().intValue() > 0.2f) {
                eVar.a(1, "BaseActivity", "screen height size change!");
                c();
                return;
            }
        }
        this.f15609b = twoTupleB;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Log.d("BaseActivity", "onCreate");
        requestWindowFeature(1);
        j jVar = j.a.f15618a;
        AuthUiConfig authUiConfig = jVar.c;
        if (authUiConfig != null && authUiConfig.getMainActivityThemeId() != -1) {
            setTheme(authUiConfig.getMainActivityThemeId());
        }
        if (authUiConfig == null || !authUiConfig.isUseDeepColorStatusBarIcon()) {
            getWindow().getDecorView().setSystemUiVisibility(0);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(8192);
        }
        if (authUiConfig != null) {
            if (!authUiConfig.isTransparentStatusBar() && authUiConfig.getStatusBarColor() != -1) {
                getWindow().setStatusBarColor(authUiConfig.getStatusBarColor());
            }
            if (authUiConfig.isTransparentStatusBar()) {
                getWindow().addFlags(C.BUFFER_FLAG_FIRST_SAMPLE);
                dLgao9.oVike1(getWindow(), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                getWindow().setStatusBarColor(0);
            }
        }
        if (jVar.b().isDisableSystemRecordScreen()) {
            dLgao9.setFlags(getWindow(), 8192, 8192);
        }
        dLgao9.setFlags(getWindow(), 16777216, 16777216);
        Log.e("BaseActivity", "open hardware accelerated!");
        super.onCreate(bundle);
        d();
        new Handler().postDelayed(new a(), jVar.b() != null ? r8.getDelayTimeMsOfLoadFragment() : 1L);
        this.f15609b = b();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.could.huiyansdk.utils.j jVar = j.b.f15748a;
        if (jVar.f15745b != null) {
            jVar.f15745b = null;
        }
        CountDownTimer countDownTimer = jVar.f15744a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            jVar.f15744a = null;
        }
        j.a.f15618a.f15616d = true;
        com.tencent.could.huiyansdk.manager.a aVar = a.C0083a.f15662a;
        if (aVar.c != null) {
            aVar.c = null;
        }
        if (aVar.f15661b != null) {
            aVar.f15661b = null;
        }
        new WeakReference(null);
        new WeakReference(null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        c cVar = c.a.f15713a;
        cVar.getClass();
        if (i != 119) {
            return;
        }
        boolean z4 = false;
        for (int i4 : iArr) {
            if (i4 == -1) {
                z4 = true;
            }
        }
        if (!z4) {
            com.tencent.could.huiyansdk.permission.a aVar = cVar.f15712b;
            if (aVar != null) {
                ((com.tencent.could.huiyansdk.fragments.a) aVar).b();
                cVar.a();
                cVar.b();
                return;
            }
            return;
        }
        getPackageName();
        if (cVar.f15711a == null) {
            AlertDialog.Builder cancelable = new AlertDialog.Builder(this).setMessage(getString(com.tencent.could.huiyansdk.R.string.txy_permission_info_log)).setPositiveButton(getString(com.tencent.could.huiyansdk.R.string.txy_ok), new com.tencent.could.huiyansdk.permission.b(cVar)).setCancelable(true);
            cVar.c = new WeakReference<>(this);
            AlertDialog alertDialogCreate = cancelable.create();
            cVar.f15711a = alertDialogCreate;
            alertDialogCreate.setCanceledOnTouchOutside(false);
        }
        cVar.f15711a.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        if (!this.f15608a) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + windowInsets.getInsets(WindowInsets.Type.statusBars()).top, view.getPaddingRight(), view.getPaddingBottom());
            this.f15608a = true;
        }
        return windowInsets;
    }
}
