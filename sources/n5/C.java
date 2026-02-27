package N5;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3558a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f3559b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f3560d;
    public final View e;
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3561g;
    public final Object h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f3562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f3563l;
    public final Object m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f3564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f3565o;

    public C(ConstraintLayout constraintLayout, Button button, View view, View view2, ConstraintLayout constraintLayout2, MayaProfileInputLayout mayaProfileInputLayout, MayaProfileInputLayout mayaProfileInputLayout2, MayaProfileInputLayout mayaProfileInputLayout3, MayaProfileInputLayout mayaProfileInputLayout4, MayaProfileInputLayout mayaProfileInputLayout5, MayaProfileInputLayout mayaProfileInputLayout6, AppCompatCheckBox appCompatCheckBox, TextView textView, ScrollView scrollView) {
        this.f = constraintLayout;
        this.f3560d = button;
        this.c = view;
        this.e = view2;
        this.f3561g = constraintLayout2;
        this.h = mayaProfileInputLayout;
        this.i = mayaProfileInputLayout2;
        this.j = mayaProfileInputLayout3;
        this.f3562k = mayaProfileInputLayout4;
        this.f3563l = mayaProfileInputLayout5;
        this.m = mayaProfileInputLayout6;
        this.f3564n = appCompatCheckBox;
        this.f3559b = textView;
        this.f3565o = scrollView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3558a) {
        }
        return (ConstraintLayout) this.f;
    }

    public C(ConstraintLayout constraintLayout, Button button, ImageView imageView, ImageView imageView2, ImageView imageView3, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, C0449e1 c0449e1) {
        this.f = constraintLayout;
        this.f3560d = button;
        this.f3561g = imageView;
        this.c = imageView2;
        this.e = imageView3;
        this.h = progressBar;
        this.f3559b = textView;
        this.i = textView2;
        this.j = textView3;
        this.f3562k = textView4;
        this.f3563l = textView5;
        this.m = textView6;
        this.f3564n = textView7;
        this.f3565o = c0449e1;
    }

    public C(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, ConstraintLayout constraintLayout2, Group group, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view) {
        this.f = constraintLayout;
        this.f3560d = button;
        this.e = button2;
        this.h = button3;
        this.f3561g = constraintLayout2;
        this.i = group;
        this.j = appCompatImageView;
        this.f3559b = textView;
        this.f3562k = textView2;
        this.f3563l = textView3;
        this.m = textView4;
        this.f3564n = textView5;
        this.f3565o = textView6;
        this.c = view;
    }

    public C(ConstraintLayout constraintLayout, Button button, View view, C0435a c0435a, C0466m c0466m, C0465l0 c0465l0, M m, I i, C0465l0 c0465l02, C0462k c0462k, HtmlTextView htmlTextView, View view2, View view3, View view4) {
        this.f = constraintLayout;
        this.f3560d = button;
        this.c = view;
        this.f3561g = c0435a;
        this.h = c0466m;
        this.i = c0465l0;
        this.j = m;
        this.f3562k = i;
        this.f3563l = c0465l02;
        this.m = c0462k;
        this.f3564n = htmlTextView;
        this.e = view2;
        this.f3559b = view3;
        this.f3565o = view4;
    }

    public C(ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view, Group group, HtmlTextView htmlTextView, TextView textView7, HtmlTextView htmlTextView2, HtmlTextView htmlTextView3, Button button) {
        this.f3565o = scrollView;
        this.f3559b = textView;
        this.f = textView2;
        this.f3561g = textView3;
        this.e = textView4;
        this.h = textView5;
        this.i = textView6;
        this.c = view;
        this.j = group;
        this.f3562k = htmlTextView;
        this.f3563l = textView7;
        this.m = htmlTextView2;
        this.f3564n = htmlTextView3;
        this.f3560d = button;
    }

    public C(NestedScrollView nestedScrollView, TextView textView, View view, TextView textView2, Button button, Group group, View view2, View view3, ImageView imageView, TextView textView3, TextView textView4, View view4, TextView textView5, TextView textView6) {
        this.f = nestedScrollView;
        this.f3559b = textView;
        this.c = view;
        this.f3561g = textView2;
        this.f3560d = button;
        this.h = group;
        this.e = view2;
        this.i = view3;
        this.j = imageView;
        this.f3562k = textView3;
        this.f3563l = textView4;
        this.m = view4;
        this.f3564n = textView5;
        this.f3565o = textView6;
    }
}
