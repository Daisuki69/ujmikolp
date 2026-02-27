package N5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class O implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3806a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f3807b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f3808d;
    public final View e;
    public final Group f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Group f3809g;
    public final ImageView h;
    public final TextView i;
    public final View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f3810k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f3811l;
    public final ViewGroup m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ViewGroup f3812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ViewGroup f3813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f3814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f3815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f3816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f3817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f3818t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f3819u;

    public O(ConstraintLayout constraintLayout, Group group, TextView textView, MayaInputLayout mayaInputLayout, NestedScrollView nestedScrollView, Button button, MayaInputLayout mayaInputLayout2, RecyclerView recyclerView, ImageView imageView, ImageView imageView2, MayaInputLayout mayaInputLayout3, Group group2, TextView textView2, HtmlTextView htmlTextView, TextView textView3, View view, Group group3, F f, ImageView imageView3, MayaInputLayout mayaInputLayout4) {
        this.f3812n = constraintLayout;
        this.f = group;
        this.c = textView;
        this.f3813o = mayaInputLayout;
        this.f3817s = nestedScrollView;
        this.f3807b = button;
        this.f3814p = mayaInputLayout2;
        this.m = recyclerView;
        this.h = imageView;
        this.f3811l = imageView2;
        this.f3815q = mayaInputLayout3;
        this.f3809g = group2;
        this.i = textView2;
        this.e = htmlTextView;
        this.f3810k = textView3;
        this.f3808d = view;
        this.j = group3;
        this.f3819u = f;
        this.f3818t = imageView3;
        this.f3816r = mayaInputLayout4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3806a) {
            case 0:
                return (ConstraintLayout) this.f3812n;
            case 1:
                return (SpringView) this.f3812n;
            default:
                return (ConstraintLayout) this.f3812n;
        }
    }

    public O(SpringView springView, Button button, TextView textView, SpringView springView2, View view, HtmlTextView htmlTextView, Group group, View view2, View view3, Group group2, ImageView imageView, ProgressBar progressBar, TextView textView2, Group group3, TextView textView3, ImageView imageView2, TextView textView4, RecyclerView recyclerView, View view4, TextView textView5) {
        this.f3812n = springView;
        this.f3807b = button;
        this.c = textView;
        this.f3813o = springView2;
        this.f3808d = view;
        this.e = htmlTextView;
        this.f = group;
        this.f3814p = view2;
        this.f3815q = view3;
        this.f3809g = group2;
        this.h = imageView;
        this.f3816r = progressBar;
        this.i = textView2;
        this.j = group3;
        this.f3810k = textView3;
        this.f3811l = imageView2;
        this.f3817s = textView4;
        this.m = recyclerView;
        this.f3818t = view4;
        this.f3819u = textView5;
    }

    public O(ConstraintLayout constraintLayout, TextView textView, FrameLayout frameLayout, Group group, FrameLayout frameLayout2, CardView cardView, Group group2, FrameLayout frameLayout3, View view, View view2, View view3, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, ConstraintLayout constraintLayout2, FrameLayout frameLayout4, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout3) {
        this.f3812n = constraintLayout;
        this.c = textView;
        this.j = frameLayout;
        this.f = group;
        this.f3813o = frameLayout2;
        this.f3814p = cardView;
        this.f3809g = group2;
        this.f3815q = frameLayout3;
        this.f3808d = view;
        this.f3816r = view2;
        this.f3817s = view3;
        this.i = textView2;
        this.f3810k = textView3;
        this.f3807b = textView4;
        this.h = imageView;
        this.m = constraintLayout2;
        this.e = frameLayout4;
        this.f3811l = imageView2;
        this.f3818t = imageView3;
        this.f3819u = constraintLayout3;
    }
}
