package com.tencent.could.huiyansdk.fragments;

import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import androidx.fragment.app.FragmentActivity;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.view.LoadingFrontAnimatorView;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;

/* JADX INFO: loaded from: classes4.dex */
public class g implements YtSDKKitFramework.IYTReflectListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthingFragment f15654a;

    public g(AuthingFragment authingFragment) {
        this.f15654a = authingFragment;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public float onGetAppBrightness() {
        return this.f15654a.f15633k;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public void onReflectEvent(ColorMatrixColorFilter colorMatrixColorFilter, float f) {
        this.f15654a.b(colorMatrixColorFilter);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public void onReflectStart(long j) {
        this.f15654a.runOnUiThread(new androidx.window.layout.adapter.extensions.a(this, 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        FragmentActivity activity;
        Paint paint;
        LoadingFrontAnimatorView loadingFrontAnimatorView;
        if (this.f15654a.f15633k == -1) {
            return;
        }
        j jVar = j.a.f15618a;
        if (jVar.b().isAutoScreenBrightness()) {
            this.f15654a.b(255);
        }
        if (jVar.b().isOpenLightReflectAnim() && (loadingFrontAnimatorView = this.f15654a.i) != null) {
            loadingFrontAnimatorView.b();
            return;
        }
        AuthingFragment authingFragment = this.f15654a;
        if (authingFragment.i == null || (activity = authingFragment.getActivity()) == null) {
            return;
        }
        this.f15654a.f15645x = true;
        AuthUiConfig authUiConfig = jVar.c;
        if (authUiConfig != null && authUiConfig.isHideFrontCircleViewOnReflect()) {
            this.f15654a.i.setVisibility(8);
            return;
        }
        this.f15654a.i.setVisibility(0);
        LoadingFrontAnimatorView loadingFrontAnimatorView2 = this.f15654a.i;
        int color = activity.getResources().getColor(R.color.txy_animation_mid_color);
        if (color == loadingFrontAnimatorView2.f15782g || (paint = loadingFrontAnimatorView2.j) == null) {
            return;
        }
        loadingFrontAnimatorView2.f15782g = color;
        paint.setColor(color);
        loadingFrontAnimatorView2.invalidate();
    }
}
