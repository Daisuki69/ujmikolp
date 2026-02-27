package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class r1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4198b;
    public final ViewGroup c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f4199d;
    public final Object e;

    public /* synthetic */ r1(ViewGroup viewGroup, View view, View view2, View view3, int i) {
        this.f4197a = i;
        this.c = viewGroup;
        this.f4199d = view;
        this.f4198b = view2;
        this.e = view3;
    }

    public static r1 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_secondary_feature_dynamic_status_badge, (ViewGroup) null, false);
        CardView cardView = (CardView) viewInflate;
        int i = R.id.image_view_badge_dot;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_badge_dot);
        if (appCompatImageView != null) {
            i = R.id.text_view_badge_label;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_badge_label);
            if (textView != null) {
                return new r1((ViewGroup) cardView, (View) cardView, (Object) appCompatImageView, (Object) textView, 2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static r1 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.pma_fragment_shop_v3_search, viewGroup, false);
        int i = R.id.background_view_pma_fragment_shop_search;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.background_view_pma_fragment_shop_search);
        if (viewFindChildViewById != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.empty_body_text_view_pma_fragment_shop_search;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.empty_body_text_view_pma_fragment_shop_search)) != null) {
                i = R.id.empty_group_pma_fragment_shop_search;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.empty_group_pma_fragment_shop_search);
                if (group != null) {
                    i = R.id.empty_title_text_view_pma_fragment_shop_search;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.empty_title_text_view_pma_fragment_shop_search)) != null) {
                        i = R.id.image_view_pma_fragment_shop_search;
                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_pma_fragment_shop_search)) != null) {
                            i = R.id.recycler_view_pma_fragment_shop_search;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_pma_fragment_shop_search);
                            if (recyclerView != null) {
                                return new r1((ViewGroup) constraintLayout, viewFindChildViewById, (View) group, (View) recyclerView, 8);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4197a) {
            case 0:
                return (CardView) this.c;
            case 1:
                return (ConstraintLayout) this.c;
            case 2:
                return (CardView) this.c;
            case 3:
                return (ConstraintLayout) this.c;
            case 4:
                return (ConstraintLayout) this.c;
            case 5:
                return (LinearLayout) this.c;
            case 6:
                return (LinearLayout) this.c;
            case 7:
                return (ConstraintLayout) this.c;
            case 8:
                return (ConstraintLayout) this.c;
            case 9:
                return (ConstraintLayout) this.c;
            case 10:
                return (ConstraintLayout) this.c;
            case 11:
                return (FrameLayout) this.c;
            default:
                return (NativeAdView) this.c;
        }
    }

    public /* synthetic */ r1(ViewGroup viewGroup, View view, Object obj, Object obj2, int i) {
        this.f4197a = i;
        this.c = viewGroup;
        this.f4199d = view;
        this.e = obj;
        this.f4198b = obj2;
    }

    public /* synthetic */ r1(ViewGroup viewGroup, TextView textView, TextView textView2, FrameLayout frameLayout, int i) {
        this.f4197a = i;
        this.c = viewGroup;
        this.f4198b = textView;
        this.f4199d = textView2;
        this.e = frameLayout;
    }

    public r1(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f4197a = 10;
        this.c = constraintLayout;
        this.e = recyclerView;
        this.f4198b = textView;
        this.f4199d = textView2;
    }
}
