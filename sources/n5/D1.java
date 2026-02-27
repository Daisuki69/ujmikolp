package N5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class D1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3581a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f3582b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f3583d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f3584g;
    public final Object h;

    public D1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Toolbar toolbar, A1 a12, A1 a13, TabLayout tabLayout, ViewPager viewPager) {
        this.f3582b = constraintLayout;
        this.c = constraintLayout2;
        this.f3583d = toolbar;
        this.e = a12;
        this.f = a13;
        this.f3584g = tabLayout;
        this.h = viewPager;
    }

    public static D1 a(View view) {
        int i = R.id.code_label_text_view_pma_view_order_coupon_shop_receipt_shop_receipt;
        if (((TextView) ViewBindings.findChildViewById(view, R.id.code_label_text_view_pma_view_order_coupon_shop_receipt_shop_receipt)) != null) {
            CardView cardView = (CardView) view;
            i = R.id.copy_text_pma_fragment_shop_receipt;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.copy_text_pma_fragment_shop_receipt);
            if (appCompatTextView != null) {
                i = R.id.copy_view_group_pma_fragment_shop_receipt;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.copy_view_group_pma_fragment_shop_receipt);
                if (frameLayout != null) {
                    i = R.id.coupon_brand_icon_image_view_pma_view_order_coupon_shop_receipt;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.coupon_brand_icon_image_view_pma_view_order_coupon_shop_receipt);
                    if (imageView != null) {
                        i = R.id.coupon_code_text_view_pma_view_order_coupon_shop_receipt;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.coupon_code_text_view_pma_view_order_coupon_shop_receipt);
                        if (textView != null) {
                            i = R.id.coupon_description_text_view_pma_view_order_coupon_shop_receipt;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.coupon_description_text_view_pma_view_order_coupon_shop_receipt);
                            if (textView2 != null) {
                                i = R.id.coupon_name_text_view_pma_view_order_coupon_shop_receipt;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.coupon_name_text_view_pma_view_order_coupon_shop_receipt);
                                if (textView3 != null) {
                                    i = R.id.left_content_guideline_pma_view_order_coupon_shop_receipt;
                                    if (((Guideline) ViewBindings.findChildViewById(view, R.id.left_content_guideline_pma_view_order_coupon_shop_receipt)) != null) {
                                        i = R.id.product_barrier_pma_view_order_coupon_shop_receipt_shop_receipt;
                                        if (((Barrier) ViewBindings.findChildViewById(view, R.id.product_barrier_pma_view_order_coupon_shop_receipt_shop_receipt)) != null) {
                                            return new D1(cardView, appCompatTextView, frameLayout, imageView, textView, textView2, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3581a) {
            case 0:
                return (ConstraintLayout) this.f3582b;
            case 1:
                return (ConstraintLayout) this.f3582b;
            default:
                return (CardView) this.f3582b;
        }
    }

    public D1(CardView cardView, AppCompatTextView appCompatTextView, FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.f3582b = cardView;
        this.c = appCompatTextView;
        this.e = frameLayout;
        this.f3584g = imageView;
        this.f3583d = textView;
        this.f = textView2;
        this.h = textView3;
    }

    public D1(ConstraintLayout constraintLayout, View view, FrameLayout frameLayout, ImageView imageView, I i, ConstraintLayout constraintLayout2, FrameLayout frameLayout2) {
        this.f3582b = constraintLayout;
        this.f3583d = view;
        this.e = frameLayout;
        this.f3584g = imageView;
        this.h = i;
        this.c = constraintLayout2;
        this.f = frameLayout2;
    }
}
