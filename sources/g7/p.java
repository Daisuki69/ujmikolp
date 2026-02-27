package G7;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.video.internal.audio.BufferedAudioStream;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaServicesV2Fragment;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1918b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Object obj, int i, int i4) {
        this.f1917a = i4;
        this.c = obj;
        this.f1918b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1917a) {
            case 0:
                MayaServicesV2Fragment mayaServicesV2Fragment = (MayaServicesV2Fragment) this.c;
                RecyclerView recyclerView = mayaServicesV2Fragment.f12182W;
                if (recyclerView == null) {
                    kotlin.jvm.internal.j.n("mRecyclerView");
                    throw null;
                }
                View childAt = recyclerView.getChildAt(this.f1918b);
                if (childAt == null) {
                    return;
                }
                RecyclerView recyclerView2 = mayaServicesV2Fragment.f12182W;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.j.n("mRecyclerView");
                    throw null;
                }
                float y7 = childAt.getY() + recyclerView2.getY();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i = (int) (y7 - (((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.bottomMargin : 0) / 2));
                NestedScrollView nestedScrollView = mayaServicesV2Fragment.f12183X;
                if (nestedScrollView != null) {
                    nestedScrollView.smoothScrollTo(0, i);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mScrollViewContainer");
                    throw null;
                }
            case 1:
                NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) this.c;
                ProgressBar progressBar = newMayaCreditFragment.f13232D0;
                if (progressBar == null) {
                    kotlin.jvm.internal.j.n("mProgressBar");
                    throw null;
                }
                progressBar.setMax(100);
                ProgressBar progressBar2 = newMayaCreditFragment.f13232D0;
                if (progressBar2 == null) {
                    kotlin.jvm.internal.j.n("mProgressBar");
                    throw null;
                }
                int i4 = this.f1918b;
                progressBar2.setProgress(i4);
                ImageView imageView = newMayaCreditFragment.f13230C0;
                if (imageView == null) {
                    kotlin.jvm.internal.j.n("mImageViewProgressIndicator");
                    throw null;
                }
                float f = i4;
                float f3 = 100;
                float fQ1 = newMayaCreditFragment.Q1(f, f3, imageView);
                TextView textView = newMayaCreditFragment.y0;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mTextViewCreditUsed");
                    throw null;
                }
                float fQ12 = newMayaCreditFragment.Q1(f, f3, textView);
                TextView textView2 = newMayaCreditFragment.f13285z0;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mTextViewCreditUsedMasked");
                    throw null;
                }
                float fQ13 = newMayaCreditFragment.Q1(f, f3, textView2);
                ImageView imageView2 = newMayaCreditFragment.f13230C0;
                if (imageView2 == null) {
                    kotlin.jvm.internal.j.n("mImageViewProgressIndicator");
                    throw null;
                }
                imageView2.setTranslationX(fQ1);
                TextView textView3 = newMayaCreditFragment.y0;
                if (textView3 == null) {
                    kotlin.jvm.internal.j.n("mTextViewCreditUsed");
                    throw null;
                }
                textView3.setTranslationX(fQ12);
                TextView textView4 = newMayaCreditFragment.f13285z0;
                if (textView4 != null) {
                    textView4.setTranslationX(fQ13);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mTextViewCreditUsedMasked");
                    throw null;
                }
            case 2:
                ((BufferedAudioStream) this.c).lambda$updateCollectionBufferSizeAsync$4(this.f1918b);
                return;
            case 3:
                ((ResourcesCompat.FontCallback) this.c).lambda$callbackFailAsync$1(this.f1918b);
                return;
            case 4:
                TabLayout tabLayout = ((MayaFavoriteFragment) this.c).f12348r0;
                if (tabLayout != null) {
                    tabLayout.selectTab(tabLayout.getTabAt(this.f1918b));
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mTabLayout");
                    throw null;
                }
            case 5:
                int i6 = this.f1918b & 4;
                io.flutter.plugin.platform.j jVar = ((io.flutter.plugin.platform.g) this.c).f17226b;
                if (i6 == 0) {
                    jVar.f17230b.systemChromeChanged(true);
                    return;
                } else {
                    jVar.f17230b.systemChromeChanged(false);
                    return;
                }
            case 6:
                ((AuthingFragment) this.c).a(this.f1918b);
                return;
            case 7:
                ((com.tencent.could.huiyansdk.fragments.c) this.c).b(this.f1918b);
                return;
            default:
                ((com.tencent.could.huiyansdk.fragments.f) this.c).a(this.f1918b);
                return;
        }
    }
}
