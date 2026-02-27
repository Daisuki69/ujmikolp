package N5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.MayaReviewInfoRecyclerView;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelTwoValuesReviewInfoItem;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelValueLinkReviewInfoItem;

/* JADX INFO: loaded from: classes4.dex */
public final class M implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3757a = 6;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f3758b;
    public final ViewGroup c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3759d;
    public final View e;
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f3760g;
    public final View h;
    public final View i;
    public final View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f3761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f3762l;
    public final View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f3763n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f3764o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f3765p;

    public M(ConstraintLayout constraintLayout, TextView textView, Group group, ConstraintLayout constraintLayout2, Button button, TextView textView2, TextView textView3, ImageView imageView, ConstraintLayout constraintLayout3, Button button2, TextView textView4, TextView textView5, TextView textView6, ConstraintLayout constraintLayout4, ImageView imageView2) {
        this.c = constraintLayout;
        this.f3758b = textView;
        this.f3759d = group;
        this.e = constraintLayout2;
        this.f = button;
        this.f3760g = textView2;
        this.h = textView3;
        this.i = imageView;
        this.j = constraintLayout3;
        this.f3761k = button2;
        this.f3762l = textView4;
        this.m = textView5;
        this.f3763n = textView6;
        this.f3764o = constraintLayout4;
        this.f3765p = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3757a) {
        }
        return (ConstraintLayout) this.c;
    }

    public M(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, Toolbar toolbar, PreviewView previewView, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2, View view3, View view4) {
        this.c = constraintLayout;
        this.f3759d = constraintLayout2;
        this.e = imageView;
        this.f = imageView2;
        this.f3760g = linearLayout;
        this.h = toolbar;
        this.m = previewView;
        this.i = view;
        this.f3758b = textView;
        this.f3763n = textView2;
        this.f3764o = textView3;
        this.f3765p = textView4;
        this.j = view2;
        this.f3761k = view3;
        this.f3762l = view4;
    }

    public M(ConstraintLayout constraintLayout, LinearLayout linearLayout, View view, TextView textView, Group group, TextView textView2, Group group2, TextView textView3, TextView textView4, ImageView imageView, TextView textView5, TextView textView6, View view2, TextView textView7, Group group3) {
        this.c = constraintLayout;
        this.f3759d = linearLayout;
        this.i = view;
        this.f3758b = textView;
        this.e = group;
        this.f = textView2;
        this.f3760g = group2;
        this.h = textView3;
        this.f3761k = textView4;
        this.f3762l = imageView;
        this.m = textView5;
        this.f3763n = textView6;
        this.j = view2;
        this.f3764o = textView7;
        this.f3765p = group3;
    }

    public M(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, Z0 z02, View view, MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView, Group group, Group group2, Group group3, ImageView imageView, MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem, View view2, C0447e c0447e, View view3, View view4, MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem2) {
        this.c = constraintLayout;
        this.f3758b = textView;
        this.f3759d = z02;
        this.i = view;
        this.e = mayaReviewInfoRecyclerView;
        this.f = group;
        this.f3760g = group2;
        this.h = group3;
        this.m = imageView;
        this.f3763n = mayaLabelTwoValuesReviewInfoItem;
        this.j = view2;
        this.f3764o = c0447e;
        this.f3761k = view3;
        this.f3762l = view4;
        this.f3765p = mayaLabelTwoValuesReviewInfoItem2;
    }

    public M(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Z0 z02, View view, MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView, Group group, Group group2, Group group3, ImageView imageView, MayaLabelValueLinkReviewInfoItem mayaLabelValueLinkReviewInfoItem, MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem, View view2, C0447e c0447e, View view3, View view4, MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem2) {
        this.c = constraintLayout;
        this.f3759d = z02;
        this.i = view;
        this.e = mayaReviewInfoRecyclerView;
        this.f = group;
        this.f3760g = group2;
        this.h = group3;
        this.f3758b = imageView;
        this.m = mayaLabelValueLinkReviewInfoItem;
        this.f3763n = mayaLabelTwoValuesReviewInfoItem;
        this.j = view2;
        this.f3764o = c0447e;
        this.f3761k = view3;
        this.f3762l = view4;
        this.f3765p = mayaLabelTwoValuesReviewInfoItem2;
    }

    public M(NestedScrollView nestedScrollView, MayaCarousel mayaCarousel, NestedScrollView nestedScrollView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, TextView textView, View view, View view2, C0446d1 c0446d1, View view3, C0453g c0453g, View view4, View view5, View view6) {
        this.c = nestedScrollView;
        this.f3759d = mayaCarousel;
        this.e = appCompatTextView;
        this.f = appCompatTextView2;
        this.f3760g = appCompatTextView3;
        this.h = appCompatTextView4;
        this.f3758b = textView;
        this.i = view;
        this.j = view2;
        this.f3764o = c0446d1;
        this.f3761k = view3;
        this.f3765p = c0453g;
        this.f3762l = view4;
        this.m = view5;
        this.f3763n = view6;
    }

    public M(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.c = constraintLayout;
        this.f3759d = linearLayout;
        this.e = linearLayout2;
        this.f = linearLayout3;
        this.f3760g = linearLayout4;
        this.h = linearLayout5;
        this.i = linearLayout6;
        this.j = linearLayout7;
        this.f3758b = textView;
        this.f3761k = textView2;
        this.f3762l = textView3;
        this.m = textView4;
        this.f3763n = textView5;
        this.f3764o = textView6;
        this.f3765p = textView7;
    }
}
