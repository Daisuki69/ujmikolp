package N5;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.paymaya.common.widget.TextViewWithImagesKt;
import com.paymaya.ui.shopv3.view.widget.SliderActionView;

/* JADX INFO: loaded from: classes4.dex */
public final class K implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3695a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3696b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3697d;
    public final ConstraintLayout e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f3698g;
    public final TextView h;
    public final TextView i;
    public final TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f3699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f3700l;
    public final TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f3701n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f3702o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f3703p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f3704q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f3705r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f3706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f3707t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final View f3708u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f3709v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f3710w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f3711x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f3712y;

    public K(ConstraintLayout constraintLayout, View view, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, Guideline guideline, TextView textView4, D1 d12, TextView textView5, TextView textView6, RelativeLayout relativeLayout, View view2, ImageView imageView, TextView textView7, Group group, TextView textView8, TextView textView9, Barrier barrier, Group group2, TextView textView10, TextView textView11, TextView textView12, k1 k1Var) {
        this.f3696b = constraintLayout;
        this.c = view;
        this.f3697d = textView;
        this.e = constraintLayout2;
        this.f = textView2;
        this.f3698g = textView3;
        this.f3703p = guideline;
        this.h = textView4;
        this.f3704q = d12;
        this.i = textView5;
        this.j = textView6;
        this.f3705r = relativeLayout;
        this.f3706s = view2;
        this.f3699k = imageView;
        this.f3700l = textView7;
        this.f3707t = group;
        this.m = textView8;
        this.f3701n = textView9;
        this.f3708u = barrier;
        this.f3709v = group2;
        this.f3702o = textView10;
        this.f3710w = textView11;
        this.f3711x = textView12;
        this.f3712y = k1Var;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3695a) {
        }
        return this.f3696b;
    }

    public K(NestedScrollView nestedScrollView, TextViewWithImagesKt textViewWithImagesKt, ImageView imageView, ImageView imageView2, ImageView imageView3, AppCompatImageView appCompatImageView, ImageView imageView4, ImageView imageView5, RecyclerView recyclerView, NestedScrollView nestedScrollView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, AppCompatTextView appCompatTextView, TextView textView9, TextView textView10, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, View view) {
        this.f3703p = nestedScrollView;
        this.f3705r = textViewWithImagesKt;
        this.f3699k = imageView;
        this.f3706s = imageView2;
        this.f3707t = imageView3;
        this.f3710w = appCompatImageView;
        this.f3708u = imageView4;
        this.f3709v = imageView5;
        this.f3711x = recyclerView;
        this.f3704q = nestedScrollView2;
        this.f3697d = textView;
        this.f = textView2;
        this.f3698g = textView3;
        this.h = textView4;
        this.i = textView5;
        this.j = textView6;
        this.f3700l = textView7;
        this.m = textView8;
        this.f3701n = textView9;
        this.f3702o = textView10;
        this.f3696b = constraintLayout;
        this.e = constraintLayout2;
        this.f3712y = frameLayout;
        this.c = view;
    }

    public K(ConstraintLayout constraintLayout, Group group, TextView textView, Barrier barrier, TextView textView2, ImageView imageView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, Button button, Group group2, TextView textView3, TextView textView4, Group group3, TextView textView5, Space space, Guideline guideline, View view, ImageView imageView2, TextView textView6, Group group4, TextView textView7, TextView textView8, Guideline guideline2, SliderActionView sliderActionView) {
        this.f3696b = constraintLayout;
        this.f3703p = group;
        this.f3697d = textView;
        this.f3704q = barrier;
        this.f = textView2;
        this.f3699k = imageView;
        this.e = constraintLayout2;
        this.f3705r = constraintLayout3;
        this.f3707t = button;
        this.f3708u = group2;
        this.f3698g = textView3;
        this.h = textView4;
        this.f3709v = group3;
        this.i = textView5;
        this.f3710w = space;
        this.f3711x = guideline;
        this.c = view;
        this.f3706s = imageView2;
        this.j = textView6;
        this.f3701n = group4;
        this.f3700l = textView7;
        this.m = textView8;
        this.f3702o = guideline2;
        this.f3712y = sliderActionView;
    }
}
