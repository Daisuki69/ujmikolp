package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaHorizontalLabelWithArrow;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaBasicReviewInfoHorizontalItem;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaBasicReviewInfoItem;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelTwoValuesReviewInfoItem;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelValueLinkReviewInfoItem;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelValueReviewInfoItem;
import com.paymaya.mayaui.dashboard.view.widget.MayaServicesCoreItemsView;

/* JADX INFO: renamed from: N5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0441c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4066b;
    public final Object c;

    public /* synthetic */ C0441c(View view, Object obj, int i) {
        this.f4065a = i;
        this.f4066b = view;
        this.c = obj;
    }

    public static C0441c a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.horizontal_label_with_arrow_icon;
        if (((ImageView) ViewBindings.findChildViewById(view, R.id.horizontal_label_with_arrow_icon)) != null) {
            i = R.id.horizontal_label_with_arrow_label_text_view;
            if (((TextView) ViewBindings.findChildViewById(view, R.id.horizontal_label_with_arrow_label_text_view)) != null) {
                i = R.id.horizontal_label_with_arrow_star;
                if (((TextView) ViewBindings.findChildViewById(view, R.id.horizontal_label_with_arrow_star)) != null) {
                    return new C0441c(linearLayout, linearLayout, 9);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static C0441c b(View view) {
        int i = R.id.text_view_scan_error;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.text_view_scan_error);
        if (appCompatTextView != null) {
            i = R.id.text_view_scan_header;
            if (((AppCompatTextView) ViewBindings.findChildViewById(view, R.id.text_view_scan_header)) != null) {
                return new C0441c((ConstraintLayout) view, appCompatTextView, 19);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static C0441c c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_basic_review_info_item, viewGroup, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        MayaBasicReviewInfoItem mayaBasicReviewInfoItem = (MayaBasicReviewInfoItem) viewInflate;
        return new C0441c(mayaBasicReviewInfoItem, mayaBasicReviewInfoItem, 5);
    }

    public static C0441c d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_label_value_review_info_item, viewGroup, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        MayaLabelValueReviewInfoItem mayaLabelValueReviewInfoItem = (MayaLabelValueReviewInfoItem) viewInflate;
        return new C0441c(mayaLabelValueReviewInfoItem, mayaLabelValueReviewInfoItem, 8);
    }

    public static C0441c e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading, viewGroup, false);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.lottie_view);
        if (lottieAnimationView != null) {
            return new C0441c((ConstraintLayout) viewInflate, lottieAnimationView, 14);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.lottie_view)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4065a) {
            case 0:
                return (NestedScrollView) this.f4066b;
            case 1:
                return (ConstraintLayout) this.f4066b;
            case 2:
                return (ScrollView) this.f4066b;
            case 3:
                return (ConstraintLayout) this.f4066b;
            case 4:
                return (MayaBasicReviewInfoHorizontalItem) this.f4066b;
            case 5:
                return (MayaBasicReviewInfoItem) this.f4066b;
            case 6:
                return (MayaLabelTwoValuesReviewInfoItem) this.f4066b;
            case 7:
                return (MayaLabelValueLinkReviewInfoItem) this.f4066b;
            case 8:
                return (MayaLabelValueReviewInfoItem) this.f4066b;
            case 9:
                return (LinearLayout) this.f4066b;
            case 10:
                return (MayaHorizontalLabelWithArrow) this.f4066b;
            case 11:
                return (AppCompatRadioButton) this.f4066b;
            case 12:
                return (FrameLayout) this.f4066b;
            case 13:
                return (MayaServicesCoreItemsView) this.f4066b;
            case 14:
                return (ConstraintLayout) this.f4066b;
            case 15:
                return (RecyclerView) this.f4066b;
            case 16:
                return (ViewGroup) this.f4066b;
            case 17:
                return (ScrollView) this.f4066b;
            case 18:
                return (ScrollView) this.f4066b;
            default:
                return (ConstraintLayout) this.f4066b;
        }
    }
}
