package N5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.widget.HtmlTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4236a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4237b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f4238d;
    public final View e;
    public final Button f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f4239g;
    public final ViewGroup h;
    public final TextView i;
    public final TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f4240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f4241l;
    public final View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AppCompatTextView f4242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f4243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f4244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f4245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f4246r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f4247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f4248t;

    public v1(NestedScrollView nestedScrollView, TextView textView, View view, TextView textView2, View view2, TextView textView3, TextView textView4, ImageView imageView, View view3, HtmlTextView htmlTextView, TextView textView5, View view4, TextView textView6, HtmlTextView htmlTextView2, TextView textView7, TextView textView8, RecyclerView recyclerView, TextView textView9, Button button, View view5) {
        this.h = nestedScrollView;
        this.i = textView;
        this.f4237b = view;
        this.j = textView2;
        this.c = view2;
        this.f4240k = textView3;
        this.f4241l = textView4;
        this.m = imageView;
        this.f4238d = view3;
        this.f4242n = htmlTextView;
        this.e = view4;
        this.f4243o = textView6;
        this.f4244p = htmlTextView2;
        this.f4245q = textView7;
        this.f4246r = textView8;
        this.f4247s = recyclerView;
        this.f4248t = textView9;
        this.f = button;
        this.f4239g = view5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4236a) {
            case 0:
                return (ConstraintLayout) this.h;
            default:
                return (NestedScrollView) this.h;
        }
    }

    public v1(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, BannerAdCarousel bannerAdCarousel, Group group, Group group2, Group group3, Group group4, AppCompatTextView appCompatTextView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, C0466m c0466m, View view, View view2, C c, View view3, View view4, View view5, View view6, C c10, Z z4, C0449e1 c0449e1) {
        this.h = constraintLayout;
        this.f = button;
        this.i = button2;
        this.j = button3;
        this.f4240k = bannerAdCarousel;
        this.f4241l = group2;
        this.m = group3;
        this.f4242n = appCompatTextView;
        this.f4243o = c0466m;
        this.f4237b = view;
        this.c = view2;
        this.f4245q = c;
        this.f4238d = view3;
        this.e = view4;
        this.f4239g = view5;
        this.f4244p = view6;
        this.f4246r = c10;
        this.f4247s = z4;
        this.f4248t = c0449e1;
    }
}
