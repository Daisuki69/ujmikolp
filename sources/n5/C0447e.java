package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.kyczoloz.view.widget.ExpandableBenefitsRecyclerView;

/* JADX INFO: renamed from: N5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0447e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f4079b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4080d;
    public final Object e;
    public final Object f;

    public /* synthetic */ C0447e(int i, View view, View view2, View view3, ViewGroup viewGroup, TextView textView) {
        this.f4078a = i;
        this.f4079b = viewGroup;
        this.c = view;
        this.f4080d = view2;
        this.f = textView;
        this.e = view3;
    }

    public static C0447e a(View view) {
        int i = R.id.content_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.content_layout);
        if (constraintLayout != null) {
            i = R.id.middle_vertical_guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, R.id.middle_vertical_guideline);
            if (guideline != null) {
                i = R.id.title_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_text_view);
                if (textView != null) {
                    i = R.id.value_text_view;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.value_text_view);
                    if (textView2 != null) {
                        return new C0447e(28, constraintLayout, guideline, textView2, (ConstraintLayout) view, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static C0447e b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_shop_page, viewGroup, false);
        SpringView springView = (SpringView) viewInflate;
        int i = R.id.group_shop_page_empty;
        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_shop_page_empty);
        if (group != null) {
            i = R.id.image_view_shop_page_empty;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_shop_page_empty)) != null) {
                i = R.id.maya_carousel_shop_banner;
                MayaCarousel mayaCarousel = (MayaCarousel) ViewBindings.findChildViewById(viewInflate, R.id.maya_carousel_shop_banner);
                if (mayaCarousel != null) {
                    i = R.id.recycler_view_shop_page;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_shop_page);
                    if (recyclerView != null) {
                        i = R.id.text_view_shop_page_empty;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_shop_page_empty)) != null) {
                            i = R.id.text_view_shop_page_empty_subtitle;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_shop_page_empty_subtitle)) != null) {
                                return new C0447e(springView, springView, group, mayaCarousel, recyclerView, 20);
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
        switch (this.f4078a) {
            case 0:
                return (LinearLayout) this.f4079b;
            case 1:
                return (ConstraintLayout) this.f4079b;
            case 2:
                return (ConstraintLayout) this.f4079b;
            case 3:
                return (ConstraintLayout) this.f4079b;
            case 4:
                return (ConstraintLayout) this.f4079b;
            case 5:
                return (CardView) this.f4079b;
            case 6:
                return (ConstraintLayout) this.f4079b;
            case 7:
                return (ConstraintLayout) this.f4079b;
            case 8:
                return (ConstraintLayout) this.f4079b;
            case 9:
                return (ConstraintLayout) this.f4079b;
            case 10:
                return (ExpandableBenefitsRecyclerView) this.c;
            case 11:
                return (NestedScrollView) this.f4079b;
            case 12:
                return (ConstraintLayout) this.f4079b;
            case 13:
                return (ConstraintLayout) this.f4079b;
            case 14:
                return (CoordinatorLayout) this.f4079b;
            case 15:
                return (ConstraintLayout) this.f4079b;
            case 16:
                return (ConstraintLayout) this.f4079b;
            case 17:
                return (ConstraintLayout) this.f4079b;
            case 18:
                return (NestedScrollView) this.f4079b;
            case 19:
                return (FrameLayout) this.f4079b;
            case 20:
                return (SpringView) this.f4079b;
            case 21:
                return (ConstraintLayout) this.f4079b;
            case 22:
                return (CoordinatorLayout) this.f4079b;
            case 23:
                return (ConstraintLayout) this.f4079b;
            case 24:
                return (ConstraintLayout) this.f4080d;
            case 25:
                return (ConstraintLayout) this.f4080d;
            case 26:
                return (ConstraintLayout) this.f4079b;
            case 27:
                return (ConstraintLayout) this.f4079b;
            case 28:
                return (ConstraintLayout) this.f4079b;
            default:
                return (SpringView) this.c;
        }
    }

    public /* synthetic */ C0447e(ViewGroup viewGroup, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f4078a = i;
        this.f4079b = viewGroup;
        this.c = obj;
        this.f4080d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ C0447e(ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2, View view, int i) {
        this.f4078a = i;
        this.f4079b = constraintLayout;
        this.c = button;
        this.f = textView;
        this.f4080d = textView2;
        this.e = view;
    }

    public /* synthetic */ C0447e(ConstraintLayout constraintLayout, TextView textView, View view, TextView textView2, View view2, int i) {
        this.f4078a = i;
        this.f4079b = constraintLayout;
        this.f = textView;
        this.c = view;
        this.f4080d = textView2;
        this.e = view2;
    }

    public C0447e(ExpandableBenefitsRecyclerView expandableBenefitsRecyclerView, RecyclerView recyclerView, ImageView imageView, TextView textView, LinearLayout linearLayout) {
        this.f4078a = 10;
        this.c = expandableBenefitsRecyclerView;
        this.f4080d = recyclerView;
        this.e = imageView;
        this.f = textView;
        this.f4079b = linearLayout;
    }

    public C0447e(LinearLayout linearLayout, Button button, Spinner spinner, TextView textView, Button button2) {
        this.f4078a = 0;
        this.f4079b = linearLayout;
        this.c = button;
        this.e = spinner;
        this.f = textView;
        this.f4080d = button2;
    }

    public C0447e(ConstraintLayout constraintLayout, Button button, LinearLayout linearLayout, View view, ViewPager2 viewPager2) {
        this.f4078a = 25;
        this.f4080d = constraintLayout;
        this.c = button;
        this.f4079b = linearLayout;
        this.e = view;
        this.f = viewPager2;
    }

    public C0447e(CoordinatorLayout coordinatorLayout, SpringView springView, RecyclerView recyclerView, LinearLayoutCompat linearLayoutCompat, Button button) {
        this.f4078a = 22;
        this.f4079b = coordinatorLayout;
        this.f4080d = springView;
        this.e = recyclerView;
        this.f = linearLayoutCompat;
        this.c = button;
    }

    public C0447e(ConstraintLayout constraintLayout, Button button, ImageView imageView, LinearLayout linearLayout, TextView textView) {
        this.f4078a = 24;
        this.f4080d = constraintLayout;
        this.c = button;
        this.e = imageView;
        this.f4079b = linearLayout;
        this.f = textView;
    }

    public C0447e(ConstraintLayout constraintLayout, TextView textView, View view, TextView textView2, Button button, View view2, View view3) {
        this.f4078a = 16;
        this.f4079b = constraintLayout;
        this.f4080d = view;
        this.c = button;
        this.e = view2;
        this.f = view3;
    }

    public C0447e(ConstraintLayout constraintLayout, MayaProfileInputLayout mayaProfileInputLayout, MayaProfileInputLayout mayaProfileInputLayout2, Button button, TextView textView, TextView textView2) {
        this.f4078a = 15;
        this.f4079b = constraintLayout;
        this.f4080d = mayaProfileInputLayout;
        this.e = mayaProfileInputLayout2;
        this.c = button;
        this.f = textView2;
    }

    public C0447e(SpringView springView, FrameLayout frameLayout, LinearLayout linearLayout, RecyclerView recyclerView, SpringView springView2) {
        this.f4078a = 29;
        this.c = springView;
        this.f4080d = frameLayout;
        this.f4079b = linearLayout;
        this.e = recyclerView;
        this.f = springView2;
    }
}
