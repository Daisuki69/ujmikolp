package Na;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaRequestMoneyFragment;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyV3Fragment;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyV3NewFragment;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f4376b;

    public /* synthetic */ r(BaseFragment baseFragment, int i) {
        this.f4375a = i;
        this.f4376b = baseFragment;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int lineCount;
        int lineCount2;
        int lineCount3;
        switch (this.f4375a) {
            case 0:
                MayaRequestMoneyFragment mayaRequestMoneyFragment = (MayaRequestMoneyFragment) this.f4376b;
                ImageView imageView = mayaRequestMoneyFragment.f13632U;
                String strTnTj78 = numX49.tnTj78("bdVj");
                if (imageView == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ConstraintLayout constraintLayout = mayaRequestMoneyFragment.f13639b0;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bdVE"));
                    throw null;
                }
                int height = constraintLayout.getHeight();
                TextView textView = mayaRequestMoneyFragment.f13633V;
                String strTnTj782 = numX49.tnTj78("bdVd");
                if (textView == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                if (textView.getLineCount() > 1) {
                    TextView textView2 = mayaRequestMoneyFragment.f13633V;
                    if (textView2 == null) {
                        kotlin.jvm.internal.j.n(strTnTj782);
                        throw null;
                    }
                    int height2 = textView2.getHeight();
                    TextView textView3 = mayaRequestMoneyFragment.f13633V;
                    if (textView3 == null) {
                        kotlin.jvm.internal.j.n(strTnTj782);
                        throw null;
                    }
                    int lineCount4 = height2 / textView3.getLineCount();
                    TextView textView4 = mayaRequestMoneyFragment.f13633V;
                    if (textView4 == null) {
                        kotlin.jvm.internal.j.n(strTnTj782);
                        throw null;
                    }
                    lineCount = (textView4.getLineCount() - 1) * lineCount4;
                } else {
                    lineCount = 0;
                }
                int dimensionPixelSize = mayaRequestMoneyFragment.f10246K.e().isRequestMoneyTileUpdateEnabled() ? mayaRequestMoneyFragment.getResources().getDimensionPixelSize(R.dimen.maya_qr_request_money_size_min) : mayaRequestMoneyFragment.getResources().getDimensionPixelSize(R.dimen.pma_my_qr_min_length);
                int dimensionPixelSize2 = mayaRequestMoneyFragment.getResources().getDimensionPixelSize(R.dimen.pma_my_qr_qr_length) - (height + lineCount);
                ImageView imageView2 = mayaRequestMoneyFragment.f13632U;
                if (imageView2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                kotlin.jvm.internal.j.e(layoutParams, numX49.tnTj78("bdVi"));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.height = dimensionPixelSize2 < dimensionPixelSize ? dimensionPixelSize : dimensionPixelSize2;
                if (dimensionPixelSize2 >= dimensionPixelSize) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                marginLayoutParams.width = dimensionPixelSize;
                ImageView imageView3 = mayaRequestMoneyFragment.f13632U;
                if (imageView3 != null) {
                    imageView3.requestLayout();
                    return;
                } else {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
            case 1:
                RequestMoneyV3Fragment requestMoneyV3Fragment = (RequestMoneyV3Fragment) this.f4376b;
                ImageView imageView4 = requestMoneyV3Fragment.f14725V;
                String strTnTj783 = numX49.tnTj78("bdVB");
                if (imageView4 == null) {
                    kotlin.jvm.internal.j.n(strTnTj783);
                    throw null;
                }
                imageView4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                CardView cardView = requestMoneyV3Fragment.f14729Z;
                if (cardView == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bdVS"));
                    throw null;
                }
                int height3 = cardView.getHeight();
                TextView textView5 = requestMoneyV3Fragment.f14726W;
                String strTnTj784 = numX49.tnTj78("bdVu");
                if (textView5 == null) {
                    kotlin.jvm.internal.j.n(strTnTj784);
                    throw null;
                }
                if (textView5.getLineCount() > 1) {
                    TextView textView6 = requestMoneyV3Fragment.f14726W;
                    if (textView6 == null) {
                        kotlin.jvm.internal.j.n(strTnTj784);
                        throw null;
                    }
                    int height4 = textView6.getHeight();
                    TextView textView7 = requestMoneyV3Fragment.f14726W;
                    if (textView7 == null) {
                        kotlin.jvm.internal.j.n(strTnTj784);
                        throw null;
                    }
                    int lineCount5 = height4 / textView7.getLineCount();
                    TextView textView8 = requestMoneyV3Fragment.f14726W;
                    if (textView8 == null) {
                        kotlin.jvm.internal.j.n(strTnTj784);
                        throw null;
                    }
                    lineCount2 = (textView8.getLineCount() - 1) * lineCount5;
                } else {
                    lineCount2 = 0;
                }
                int dimensionPixelSize3 = requestMoneyV3Fragment.getResources().getDimensionPixelSize(R.dimen.pma_my_qr_qr_length) - (height3 + lineCount2);
                ImageView imageView5 = requestMoneyV3Fragment.f14725V;
                if (imageView5 == null) {
                    kotlin.jvm.internal.j.n(strTnTj783);
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams2 = imageView5.getLayoutParams();
                kotlin.jvm.internal.j.e(layoutParams2, numX49.tnTj78("bdVV"));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = 0;
                marginLayoutParams2.height = dimensionPixelSize3;
                marginLayoutParams2.width = dimensionPixelSize3;
                ImageView imageView6 = requestMoneyV3Fragment.f14725V;
                if (imageView6 != null) {
                    imageView6.requestLayout();
                    return;
                } else {
                    kotlin.jvm.internal.j.n(strTnTj783);
                    throw null;
                }
            default:
                RequestMoneyV3NewFragment requestMoneyV3NewFragment = (RequestMoneyV3NewFragment) this.f4376b;
                ImageView imageView7 = requestMoneyV3NewFragment.f14742U;
                String strTnTj785 = numX49.tnTj78("bdVL");
                if (imageView7 == null) {
                    kotlin.jvm.internal.j.n(strTnTj785);
                    throw null;
                }
                imageView7.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                CardView cardView2 = requestMoneyV3NewFragment.f14748a0;
                if (cardView2 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bdVk"));
                    throw null;
                }
                int height5 = cardView2.getHeight();
                TextView textView9 = requestMoneyV3NewFragment.f14743V;
                String strTnTj786 = numX49.tnTj78("bdVr");
                if (textView9 == null) {
                    kotlin.jvm.internal.j.n(strTnTj786);
                    throw null;
                }
                if (textView9.getLineCount() > 1) {
                    TextView textView10 = requestMoneyV3NewFragment.f14743V;
                    if (textView10 == null) {
                        kotlin.jvm.internal.j.n(strTnTj786);
                        throw null;
                    }
                    int height6 = textView10.getHeight();
                    TextView textView11 = requestMoneyV3NewFragment.f14743V;
                    if (textView11 == null) {
                        kotlin.jvm.internal.j.n(strTnTj786);
                        throw null;
                    }
                    int lineCount6 = height6 / textView11.getLineCount();
                    TextView textView12 = requestMoneyV3NewFragment.f14743V;
                    if (textView12 == null) {
                        kotlin.jvm.internal.j.n(strTnTj786);
                        throw null;
                    }
                    lineCount3 = (textView12.getLineCount() - 1) * lineCount6;
                } else {
                    lineCount3 = 0;
                }
                int dimensionPixelSize4 = requestMoneyV3NewFragment.getResources().getDimensionPixelSize(R.dimen.pma_my_qr_min_length);
                int dimensionPixelSize5 = requestMoneyV3NewFragment.getResources().getDimensionPixelSize(R.dimen.pma_my_qr_qr_length) - (height5 + lineCount3);
                ImageView imageView8 = requestMoneyV3NewFragment.f14742U;
                if (imageView8 == null) {
                    kotlin.jvm.internal.j.n(strTnTj785);
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams3 = imageView8.getLayoutParams();
                kotlin.jvm.internal.j.e(layoutParams3, numX49.tnTj78("bdVZ"));
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.topMargin = 0;
                marginLayoutParams3.height = dimensionPixelSize5 < dimensionPixelSize4 ? dimensionPixelSize4 : dimensionPixelSize5;
                if (dimensionPixelSize5 >= dimensionPixelSize4) {
                    dimensionPixelSize4 = dimensionPixelSize5;
                }
                marginLayoutParams3.width = dimensionPixelSize4;
                ImageView imageView9 = requestMoneyV3NewFragment.f14742U;
                if (imageView9 != null) {
                    imageView9.requestLayout();
                    return;
                } else {
                    kotlin.jvm.internal.j.n(strTnTj785);
                    throw null;
                }
        }
    }
}
