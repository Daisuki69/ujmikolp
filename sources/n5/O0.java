package N5;

import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class O0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3820a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3821b;
    public final Group c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3822d;
    public final View e;
    public final ConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f3823g;
    public final View h;
    public final Group i;
    public final View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f3824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f3825l;
    public final View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f3826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f3827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f3828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f3829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f3830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f3831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f3832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final View f3833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f3834v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ViewBinding f3835w;

    public O0(ConstraintLayout constraintLayout, Group group, TextView textView, TextView textView2, View view, TextView textView3, ConstraintLayout constraintLayout2, TextView textView4, Guideline guideline, View view2, AppCompatTextView appCompatTextView, TextView textView5, D1 d12, View view3, Group group2, TextView textView6, TextView textView7, Barrier barrier, Group group3, TextView textView8, TextView textView9, k1 k1Var) {
        this.f3821b = constraintLayout;
        this.c = group;
        this.f3822d = textView;
        this.j = textView2;
        this.e = view;
        this.f3824k = textView3;
        this.f = constraintLayout2;
        this.f3825l = textView4;
        this.m = guideline;
        this.f3823g = view2;
        this.f3826n = appCompatTextView;
        this.f3827o = textView5;
        this.f3828p = d12;
        this.h = view3;
        this.i = group2;
        this.f3829q = textView6;
        this.f3830r = textView7;
        this.f3831s = barrier;
        this.f3832t = group3;
        this.f3833u = textView8;
        this.f3834v = textView9;
        this.f3835w = k1Var;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3820a) {
        }
        return this.f3821b;
    }

    public O0(ConstraintLayout constraintLayout, Group group, ConstraintLayout constraintLayout2, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10, View view11, View view12, Group group2, C0441c c0441c, RecyclerView recyclerView, NestedScrollView nestedScrollView, Space space, TextView textView, C0491z c0491z) {
        this.f3821b = constraintLayout;
        this.c = group;
        this.f = constraintLayout2;
        this.e = view;
        this.f3823g = view2;
        this.h = view3;
        this.j = view4;
        this.f3824k = view5;
        this.f3825l = view6;
        this.m = view7;
        this.f3826n = view8;
        this.f3827o = view9;
        this.f3828p = view10;
        this.f3829q = view11;
        this.f3830r = view12;
        this.i = group2;
        this.f3831s = c0441c;
        this.f3832t = recyclerView;
        this.f3833u = nestedScrollView;
        this.f3834v = space;
        this.f3822d = textView;
        this.f3835w = c0491z;
    }
}
