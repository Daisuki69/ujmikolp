package N5;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class N0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3795a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3796b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3797d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f3798g;
    public final View h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f3799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f3800l;
    public final View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f3801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f3802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f3803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f3804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f3805r;

    public N0(ConstraintLayout constraintLayout, Button button, AppCompatCheckBox appCompatCheckBox, I i, C0489y c0489y, G0 g02, G0 g03, MayaInputLayout mayaInputLayout, MayaInputLayout mayaInputLayout2, MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout, NestedScrollView nestedScrollView, RecyclerView recyclerView, AppCompatTextView appCompatTextView, TextView textView, TextView textView2, TextView textView3, TextView textView4, C0446d1 c0446d1) {
        this.f3796b = constraintLayout;
        this.f3798g = button;
        this.h = appCompatCheckBox;
        this.i = i;
        this.j = c0489y;
        this.f3799k = g02;
        this.f3800l = g03;
        this.m = mayaInputLayout;
        this.f3801n = mayaInputLayout2;
        this.f3802o = mayaAutoCompleteInputLayout;
        this.f3803p = recyclerView;
        this.f3804q = appCompatTextView;
        this.c = textView;
        this.f3797d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.f3805r = c0446d1;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3795a) {
        }
        return this.f3796b;
    }

    public N0(ConstraintLayout constraintLayout, CardView cardView, Group group, Group group2, Group group3, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, AppCompatTextView appCompatTextView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, View view, View view2, View view3, View view4) {
        this.f3796b = constraintLayout;
        this.f3798g = cardView;
        this.h = group;
        this.i = group2;
        this.j = imageView;
        this.f3799k = imageView3;
        this.c = textView;
        this.f3797d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.f3800l = textView5;
        this.m = textView6;
        this.f3801n = textView8;
        this.f3802o = view;
        this.f3803p = view2;
        this.f3804q = view3;
        this.f3805r = view4;
    }

    public N0(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, View view5, View view6, Group group, Group group2, ImageView imageView, ImageView imageView2, View view7, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f3796b = constraintLayout;
        this.f3798g = view;
        this.h = view2;
        this.i = view3;
        this.j = view4;
        this.f3799k = view5;
        this.f3800l = view6;
        this.m = group;
        this.f3801n = imageView2;
        this.f3802o = view7;
        this.c = textView;
        this.f3797d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.f3803p = textView5;
        this.f3804q = textView6;
        this.f3805r = textView8;
    }
}
