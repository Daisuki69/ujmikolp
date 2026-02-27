package N5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.MayaReviewInfoRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f3646b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f3647d;
    public final ViewGroup e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f3648g;
    public final View h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f3649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f3650l;

    public /* synthetic */ I(ViewGroup viewGroup, Object obj, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view, Object obj2, Object obj3, int i) {
        this.f3645a = i;
        this.e = viewGroup;
        this.f = obj;
        this.f3648g = imageView;
        this.f3646b = textView;
        this.c = textView2;
        this.f3647d = textView3;
        this.h = textView4;
        this.i = textView5;
        this.j = view;
        this.f3649k = obj2;
        this.f3650l = obj3;
    }

    public static I a(View view) {
        int i = R.id.amount_text_view_pma_view_card_layout;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.amount_text_view_pma_view_card_layout);
        if (textView != null) {
            i = R.id.background_image_view_pma_view_card_layout;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.background_image_view_pma_view_card_layout);
            if (imageView != null) {
                i = R.id.bottom_image_guide_pma_view_card_layout;
                if (((Guideline) ViewBindings.findChildViewById(view, R.id.bottom_image_guide_pma_view_card_layout)) != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i = R.id.gif_retry_button_preview;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.gif_retry_button_preview);
                    if (textView2 != null) {
                        i = R.id.gif_retry_preview_group;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.gif_retry_preview_group);
                        if (linearLayout != null) {
                            i = R.id.gif_shimmer_preview;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.gif_shimmer_preview);
                            if (lottieAnimationView != null) {
                                i = R.id.gif_view_group_pma_view_card_layout;
                                Group group = (Group) ViewBindings.findChildViewById(view, R.id.gif_view_group_pma_view_card_layout);
                                if (group != null) {
                                    i = R.id.message_text_view_pma_view_card_layout;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.message_text_view_pma_view_card_layout);
                                    if (textView3 != null) {
                                        i = R.id.paymaya_logo_for_gif_image_view_pma_view_card_layout;
                                        if (((ImageView) ViewBindings.findChildViewById(view, R.id.paymaya_logo_for_gif_image_view_pma_view_card_layout)) != null) {
                                            i = R.id.paymaya_logo_image_view_pma_view_card_layout;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.paymaya_logo_image_view_pma_view_card_layout);
                                            if (imageView2 != null) {
                                                i = R.id.powered_by_giphy_label;
                                                if (((AppCompatTextView) ViewBindings.findChildViewById(view, R.id.powered_by_giphy_label)) != null) {
                                                    i = R.id.you_have_received_text_view_pma_view_card_layout;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.you_have_received_text_view_pma_view_card_layout);
                                                    if (textView4 != null) {
                                                        return new I(frameLayout, textView, imageView, frameLayout, textView2, linearLayout, lottieAnimationView, group, textView3, imageView2, textView4);
                                                    }
                                                }
                                            }
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
        switch (this.f3645a) {
            case 0:
                return (NestedScrollView) this.e;
            case 1:
                return (ConstraintLayout) this.e;
            case 2:
                return (ConstraintLayout) this.e;
            case 3:
                return (SwipeRefreshLayout) this.e;
            case 4:
                return (ConstraintLayout) this.f;
            case 5:
                return (CardView) this.e;
            case 6:
                return (ConstraintLayout) this.e;
            case 7:
                return (ConstraintLayout) this.e;
            default:
                return (FrameLayout) this.e;
        }
    }

    public /* synthetic */ I(ConstraintLayout constraintLayout, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, int i) {
        this.f3645a = i;
        this.e = constraintLayout;
        this.f = view;
        this.f3646b = textView;
        this.c = textView2;
        this.f3647d = textView3;
        this.f3648g = textView4;
        this.h = textView5;
        this.i = textView6;
        this.j = textView7;
        this.f3649k = textView8;
        this.f3650l = textView9;
    }

    public I(NestedScrollView nestedScrollView, NestedScrollView nestedScrollView2, RecyclerView recyclerView, AppCompatTextView appCompatTextView, TextView textView, TextView textView2, TextView textView3, C0450f c0450f, C0489y c0489y, G0 g02, G0 g03) {
        this.f3645a = 0;
        this.e = nestedScrollView;
        this.f = nestedScrollView2;
        this.f3648g = recyclerView;
        this.h = appCompatTextView;
        this.f3646b = textView;
        this.c = textView2;
        this.f3647d = textView3;
        this.i = c0450f;
        this.j = c0489y;
        this.f3649k = g02;
        this.f3650l = g03;
    }

    public I(ConstraintLayout constraintLayout, Button button, MayaInputLayout mayaInputLayout, MayaInputLayout mayaInputLayout2, MayaInputLayout mayaInputLayout3, AppCompatCheckBox appCompatCheckBox, TextView textView, Group group, MayaInputLayout mayaInputLayout4, NestedScrollView nestedScrollView, MultiColorTextView multiColorTextView) {
        this.f3645a = 4;
        this.f = constraintLayout;
        this.f3648g = button;
        this.h = mayaInputLayout;
        this.c = mayaInputLayout2;
        this.f3647d = mayaInputLayout3;
        this.i = appCompatCheckBox;
        this.f3646b = textView;
        this.j = group;
        this.f3649k = mayaInputLayout4;
        this.e = nestedScrollView;
        this.f3650l = multiColorTextView;
    }

    public I(FrameLayout frameLayout, TextView textView, ImageView imageView, FrameLayout frameLayout2, TextView textView2, LinearLayout linearLayout, LottieAnimationView lottieAnimationView, Group group, TextView textView3, ImageView imageView2, TextView textView4) {
        this.f3645a = 8;
        this.e = frameLayout;
        this.f3646b = textView;
        this.f = imageView;
        this.f3648g = frameLayout2;
        this.c = textView2;
        this.h = linearLayout;
        this.i = lottieAnimationView;
        this.j = group;
        this.f3647d = textView3;
        this.f3649k = imageView2;
        this.f3650l = textView4;
    }

    public I(SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2, Group group, ConstraintLayout constraintLayout, MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView, MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView2, MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f3645a = 3;
        this.e = swipeRefreshLayout;
        this.f3648g = recyclerView;
        this.f = swipeRefreshLayout2;
        this.h = group;
        this.i = mayaReviewInfoRecyclerView;
        this.j = mayaReviewInfoRecyclerView2;
        this.f3649k = mayaReviewInfoRecyclerView3;
        this.f3646b = textView;
        this.c = textView2;
        this.f3647d = textView3;
        this.f3650l = textView4;
    }

    public I(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, Button button4, Group group, Group group2, Group group3, Group group4, Group group5, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AppCompatImageButton appCompatImageButton, ImageView imageView, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, RecyclerView recyclerView, TabLayout tabLayout, TextView textView, TextView textView2, View view, View view2, View view3) {
        this.f3645a = 6;
        this.e = constraintLayout;
        this.f = button4;
        this.h = group4;
        this.f3647d = group5;
        this.i = lottieAnimationView2;
        this.f3648g = recyclerView;
        this.f3646b = textView;
        this.c = textView2;
        this.j = view;
        this.f3649k = view2;
        this.f3650l = view3;
    }
}
