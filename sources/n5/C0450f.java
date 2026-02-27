package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;

/* JADX INFO: renamed from: N5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0450f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4087b;
    public final ViewGroup c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4088d;

    public /* synthetic */ C0450f(ViewGroup viewGroup, View view, View view2, int i) {
        this.f4086a = i;
        this.c = viewGroup;
        this.f4088d = view;
        this.f4087b = view2;
    }

    public static C0450f a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.maya_kyc_primary_button;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.maya_kyc_primary_button);
        if (button != null) {
            i = R.id.textview_secondary_button;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textview_secondary_button);
            if (textView != null) {
                return new C0450f((ViewGroup) linearLayout, (Object) button, (Object) textView, 3);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static C0450f b(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.html_text_view_help_description;
        HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(view, R.id.html_text_view_help_description);
        if (htmlTextView != null) {
            i = R.id.image_view_help_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.image_view_help_icon);
            if (imageView != null) {
                i = R.id.text_view_help_title;
                if (((TextView) ViewBindings.findChildViewById(view, R.id.text_view_help_title)) != null) {
                    return new C0450f((ViewGroup) constraintLayout, (Object) htmlTextView, (Object) imageView, 17);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static C0450f c(View view) {
        int i = R.id.lottie_animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.lottie_animation_view);
        if (lottieAnimationView != null) {
            i = R.id.maya_input_layout;
            MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(view, R.id.maya_input_layout);
            if (mayaInputLayout != null) {
                return new C0450f((ViewGroup) view, (Object) lottieAnimationView, (Object) mayaInputLayout, 20);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static C0450f d(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_item_label_value, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.text_view_label;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_label);
        if (textView != null) {
            i = R.id.text_view_value;
            HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_value);
            if (htmlTextView != null) {
                return new C0450f((ViewGroup) constraintLayout, (Object) textView, (Object) htmlTextView, 13);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static C0450f e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_shop_v3_error_refresh_card, viewGroup, false);
        CardView cardView = (CardView) viewInflate;
        int i = R.id.error_message_text_view_pma_view_shop_v3_error_refresh_card;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.error_message_text_view_pma_view_shop_v3_error_refresh_card);
        if (textView != null) {
            i = R.id.refresh_button_pma_view_shop_v3_error_refresh_card;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.refresh_button_pma_view_shop_v3_error_refresh_card);
            if (button != null) {
                return new C0450f((ViewGroup) cardView, (View) textView, (View) button, 27);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4086a) {
            case 0:
                return (ScrollView) this.c;
            case 1:
                return (ConstraintLayout) this.c;
            case 2:
                return (ConstraintLayout) this.c;
            case 3:
                return (LinearLayout) this.c;
            case 4:
                return (ConstraintLayout) this.c;
            case 5:
                return (NestedScrollView) this.c;
            case 6:
                return (ConstraintLayout) this.c;
            case 7:
                return (NestedScrollView) this.c;
            case 8:
                return (ConstraintLayout) this.c;
            case 9:
                return (ConstraintLayout) this.c;
            case 10:
                return (LinearLayout) this.c;
            case 11:
                return (FrameLayout) this.c;
            case 12:
                return (ConstraintLayout) this.c;
            case 13:
                return (ConstraintLayout) this.c;
            case 14:
                return (ConstraintLayout) this.c;
            case 15:
                return (ConstraintLayout) this.c;
            case 16:
                return (ConstraintLayout) this.c;
            case 17:
                return (ConstraintLayout) this.c;
            case 18:
                return (ConstraintLayout) this.c;
            case 19:
                return (ConstraintLayout) this.c;
            case 20:
                return (FrameLayout) this.c;
            case 21:
                return (FrameLayout) this.c;
            case 22:
                return (ConstraintLayout) this.c;
            case 23:
                return (NestedScrollView) this.c;
            case 24:
                return (ConstraintLayout) this.c;
            case 25:
                return (ViewPager) this.c;
            case 26:
                return (ConstraintLayout) this.c;
            case 27:
                return (CardView) this.c;
            default:
                return (ConstraintLayout) this.c;
        }
    }

    public /* synthetic */ C0450f(ViewGroup viewGroup, Object obj, Object obj2, int i) {
        this.f4086a = i;
        this.c = viewGroup;
        this.f4087b = obj;
        this.f4088d = obj2;
    }
}
