package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class k1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4138b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4139d;
    public final ViewGroup e;
    public final Object f;

    public /* synthetic */ k1(int i, View view, View view2, View view3, ViewGroup viewGroup, TextView textView) {
        this.f4137a = i;
        this.e = viewGroup;
        this.f4138b = view;
        this.f4139d = textView;
        this.c = view2;
        this.f = view3;
    }

    public static k1 a(View view) {
        int i = R.id.barrier_pma_view_treats_coupon_shop_receipt;
        if (((Barrier) ViewBindings.findChildViewById(view, R.id.barrier_pma_view_treats_coupon_shop_receipt)) != null) {
            i = R.id.code_label_text_view_pma_view_treats_coupon_shop_receipt;
            if (((TextView) ViewBindings.findChildViewById(view, R.id.code_label_text_view_pma_view_treats_coupon_shop_receipt)) != null) {
                CardView cardView = (CardView) view;
                i = R.id.coupon_brand_icon_image_view_pma_view_treats_coupon_shop_receipt;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.coupon_brand_icon_image_view_pma_view_treats_coupon_shop_receipt);
                if (imageView != null) {
                    i = R.id.coupon_code_text_view_pma_view_treats_coupon_shop_receipt;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.coupon_code_text_view_pma_view_treats_coupon_shop_receipt);
                    if (textView != null) {
                        i = R.id.coupon_description_text_view_pma_view_treats_coupon_shop_receipt;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.coupon_description_text_view_pma_view_treats_coupon_shop_receipt);
                        if (textView2 != null) {
                            i = R.id.coupon_name_text_view_pma_view_treats_coupon_shop_receipt;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.coupon_name_text_view_pma_view_treats_coupon_shop_receipt);
                            if (textView3 != null) {
                                i = R.id.left_content_guideline_pma_view_treats_coupon_shop_receipt;
                                if (((Guideline) ViewBindings.findChildViewById(view, R.id.left_content_guideline_pma_view_treats_coupon_shop_receipt)) != null) {
                                    i = R.id.powered_by_text_view_pma_view_treats_coupon_shop_receipt;
                                    if (((TextView) ViewBindings.findChildViewById(view, R.id.powered_by_text_view_pma_view_treats_coupon_shop_receipt)) != null) {
                                        i = R.id.share_treats_text_view_pma_view_treats_coupon_shop_receipt;
                                        if (((TextView) ViewBindings.findChildViewById(view, R.id.share_treats_text_view_pma_view_treats_coupon_shop_receipt)) != null) {
                                            i = R.id.treats_logo_image_view_pma_view_treats_coupon_shop_receipt;
                                            if (((ImageView) ViewBindings.findChildViewById(view, R.id.treats_logo_image_view_pma_view_treats_coupon_shop_receipt)) != null) {
                                                return new k1(17, imageView, textView2, textView3, cardView, textView);
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

    public static k1 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.pma_dialog_fragment_share_save, viewGroup, false);
        int i = R.id.close_image_view_pma_dialog_fragment_share_save;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.close_image_view_pma_dialog_fragment_share_save);
        if (imageView != null) {
            i = R.id.nested_scroll_view_pma_dialog_fragment_share_save;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nested_scroll_view_pma_dialog_fragment_share_save);
            if (nestedScrollView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.recycler_view_pma_dialog_fragment_share_save;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_pma_dialog_fragment_share_save);
                if (recyclerView != null) {
                    i = R.id.title_textview_pma_dialog_fragment_share_save;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_textview_pma_dialog_fragment_share_save);
                    if (textView != null) {
                        return new k1(constraintLayout, imageView, nestedScrollView, recyclerView, textView, 10);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static k1 c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.pma_fragment_shop_v3_page, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate;
        int i = R.id.empty_constraint_group_pma_fragment_shop_v3_page;
        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.empty_constraint_group_pma_fragment_shop_v3_page);
        if (group != null) {
            i = R.id.empty_image_view_pma_fragment_shop_v3_page;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.empty_image_view_pma_fragment_shop_v3_page)) != null) {
                i = R.id.empty_text_view_pma_fragment_shop_v3_page;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.empty_text_view_pma_fragment_shop_v3_page);
                if (textView != null) {
                    i = R.id.recycler_view_pma_fragment_shop_v3_page;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_pma_fragment_shop_v3_page);
                    if (recyclerView != null) {
                        return new k1((ViewGroup) swipeRefreshLayout, (View) swipeRefreshLayout, (Object) group, textView, (View) recyclerView, 13);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4137a) {
            case 0:
                return (CardView) this.e;
            case 1:
                return (ConstraintLayout) this.e;
            case 2:
                return (ConstraintLayout) this.e;
            case 3:
                return (ConstraintLayout) this.e;
            case 4:
                return (LinearLayout) this.e;
            case 5:
                return (ConstraintLayout) this.e;
            case 6:
                return (ConstraintLayout) this.e;
            case 7:
                return (ConstraintLayout) this.e;
            case 8:
                return (ConstraintLayout) this.e;
            case 9:
                return (ConstraintLayout) this.e;
            case 10:
                return (ConstraintLayout) this.e;
            case 11:
                return (ConstraintLayout) this.e;
            case 12:
                return (NestedScrollView) this.e;
            case 13:
                return (SwipeRefreshLayout) this.e;
            case 14:
                return (ConstraintLayout) this.e;
            case 15:
                return (ConstraintLayout) this.e;
            case 16:
                return (CardView) this.e;
            case 17:
                return (CardView) this.e;
            case 18:
                return (CardView) this.e;
            default:
                return (NativeAdView) this.e;
        }
    }

    public /* synthetic */ k1(ViewGroup viewGroup, View view, Object obj, TextView textView, View view2, int i) {
        this.f4137a = i;
        this.e = viewGroup;
        this.f4138b = view;
        this.c = obj;
        this.f4139d = textView;
        this.f = view2;
    }

    public /* synthetic */ k1(ViewGroup viewGroup, Object obj, ImageView imageView, TextView textView, View view, int i) {
        this.f4137a = i;
        this.e = viewGroup;
        this.c = obj;
        this.f4138b = imageView;
        this.f4139d = textView;
        this.f = view;
    }

    public /* synthetic */ k1(ViewGroup viewGroup, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f4137a = i;
        this.e = viewGroup;
        this.f4138b = obj;
        this.c = obj2;
        this.f = obj3;
        this.f4139d = obj4;
    }

    public k1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f4137a = 7;
        this.e = constraintLayout;
        this.f = constraintLayout2;
        this.f4138b = imageView;
        this.c = imageView2;
        this.f4139d = textView;
    }

    public k1(CardView cardView, C0452f1 c0452f1, ImageView imageView, CardView cardView2, LottieAnimationView lottieAnimationView) {
        this.f4137a = 18;
        this.e = cardView;
        this.c = c0452f1;
        this.f4138b = imageView;
        this.f = cardView2;
        this.f4139d = lottieAnimationView;
    }

    public k1(CardView cardView, CardView cardView2, View view, ImageView imageView, TextView textView) {
        this.f4137a = 16;
        this.e = cardView;
        this.c = cardView2;
        this.f = view;
        this.f4138b = imageView;
        this.f4139d = textView;
    }

    public k1(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, ImageView imageView) {
        this.f4137a = 14;
        this.e = constraintLayout;
        this.c = lottieAnimationView;
        this.f = swipeRefreshLayout;
        this.f4139d = recyclerView;
        this.f4138b = imageView;
    }

    public k1(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, ProgressBar progressBar) {
        this.f4137a = 3;
        this.e = constraintLayout;
        this.f4139d = textView;
        this.f4138b = constraintLayout2;
        this.c = textView2;
        this.f = progressBar;
    }

    public k1(CardView cardView, ConstraintLayout constraintLayout, CardView cardView2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3) {
        this.f4137a = 0;
        this.e = cardView;
        this.f4138b = imageView;
        this.c = imageView2;
        this.f = imageView3;
        this.f4139d = textView3;
    }
}
