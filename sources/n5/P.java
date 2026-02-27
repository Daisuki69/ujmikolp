package N5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.MayaEnhancedReviewInfoRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final View f3836A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final View f3837B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final View f3838C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3839a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Group f3840b;
    public final Group c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Group f3841d;
    public final Group e;
    public final HtmlTextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f3842g;
    public final View h;
    public final ViewGroup i;
    public final ViewGroup j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f3843k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f3844l;
    public final View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f3845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f3846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f3847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f3848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f3849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f3850s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f3851t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final View f3852u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f3853v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f3854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f3855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f3856y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final View f3857z;

    public P(ConstraintLayout constraintLayout, View view, Button button, Button button2, AppCompatCheckBox appCompatCheckBox, Group group, Group group2, Group group3, Group group4, HtmlTextView htmlTextView, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, MayaInputLayout mayaInputLayout, MayaInputLayout mayaInputLayout2, MayaInputLayout mayaInputLayout3, MayaInputLayout mayaInputLayout4, MayaEnhancedReviewInfoRecyclerView mayaEnhancedReviewInfoRecyclerView, MayaEnhancedReviewInfoRecyclerView mayaEnhancedReviewInfoRecyclerView2, NestedScrollView nestedScrollView, MayaInputLayout mayaInputLayout5, HtmlTextView htmlTextView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, MayaInputLayout mayaInputLayout6) {
        this.i = constraintLayout;
        this.h = view;
        this.m = button;
        this.f3845n = button2;
        this.f3846o = appCompatCheckBox;
        this.f3840b = group;
        this.c = group2;
        this.f3841d = group3;
        this.e = group4;
        this.f = htmlTextView;
        this.f3848q = imageView;
        this.f3849r = imageView2;
        this.j = constraintLayout2;
        this.f3843k = constraintLayout3;
        this.f3844l = constraintLayout4;
        this.f3850s = mayaInputLayout;
        this.f3851t = mayaInputLayout2;
        this.f3852u = mayaInputLayout3;
        this.f3853v = mayaInputLayout4;
        this.f3856y = mayaEnhancedReviewInfoRecyclerView;
        this.f3857z = mayaEnhancedReviewInfoRecyclerView2;
        this.f3854w = mayaInputLayout5;
        this.f3847p = htmlTextView2;
        this.f3842g = textView;
        this.f3836A = textView2;
        this.f3837B = textView3;
        this.f3838C = textView4;
        this.f3855x = mayaInputLayout6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3839a) {
            case 0:
                return (ConstraintLayout) this.i;
            default:
                return (NestedScrollView) this.i;
        }
    }

    public P(NestedScrollView nestedScrollView, Group group, Group group2, Group group3, Group group4, Group group5, Group group6, Group group7, Group group8, Group group9, Group group10, Group group11, HtmlTextView htmlTextView, NestedScrollView nestedScrollView2, SwitchCompat switchCompat, TextView textView, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10, View view11, View view12, View view13, View view14, View view15, View view16, View view17, View view18, View view19) {
        this.i = nestedScrollView;
        this.f3840b = group2;
        this.c = group5;
        this.f3841d = group9;
        this.e = group11;
        this.f = htmlTextView;
        this.j = nestedScrollView2;
        this.f3843k = switchCompat;
        this.f3842g = textView;
        this.h = view;
        this.f3844l = view2;
        this.m = view3;
        this.f3845n = view4;
        this.f3846o = view5;
        this.f3847p = view6;
        this.f3848q = view7;
        this.f3849r = view8;
        this.f3850s = view9;
        this.f3851t = view10;
        this.f3852u = view11;
        this.f3853v = view12;
        this.f3854w = view13;
        this.f3855x = view14;
        this.f3856y = view15;
        this.f3857z = view16;
        this.f3836A = view17;
        this.f3837B = view18;
        this.f3838C = view19;
    }
}
