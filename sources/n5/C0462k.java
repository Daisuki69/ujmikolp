package N5;

import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;

/* JADX INFO: renamed from: N5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0462k implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f4131b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f4132d;
    public final View e;
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f4133g;
    public final View h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f4134k;

    public /* synthetic */ C0462k(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, View view5, View view6, Object obj, Object obj2, Object obj3, int i) {
        this.f4130a = i;
        this.f4131b = constraintLayout;
        this.f = view;
        this.f4133g = view2;
        this.h = view3;
        this.c = view4;
        this.f4132d = view5;
        this.e = view6;
        this.i = obj;
        this.j = obj2;
        this.f4134k = obj3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4130a) {
            case 0:
                return (ConstraintLayout) this.f4131b;
            case 1:
                return (ConstraintLayout) this.f4131b;
            case 2:
                return (ConstraintLayout) this.f4131b;
            case 3:
                return (NestedScrollView) this.f4131b;
            case 4:
                return (NestedScrollView) this.f;
            case 5:
                return (ConstraintLayout) this.f4131b;
            case 6:
                return (ConstraintLayout) this.f4131b;
            case 7:
                return (ConstraintLayout) this.f4131b;
            case 8:
                return (ConstraintLayout) this.f4131b;
            case 9:
                return (ConstraintLayout) this.f4131b;
            case 10:
                return (CoordinatorLayout) this.f4131b;
            case 11:
                return (ConstraintLayout) this.f4131b;
            case 12:
                return (ConstraintLayout) this.f4131b;
            case 13:
                return (ConstraintLayout) this.f4131b;
            case 14:
                return (ConstraintLayout) this.f4131b;
            default:
                return (NestedScrollView) this.f4131b;
        }
    }

    public C0462k(ConstraintLayout constraintLayout, Button button, Button button2, ImageView imageView, AppCompatTextView appCompatTextView, TextView textView, TextView textView2, TextView textView3, AppCompatTextView appCompatTextView2, View view) {
        this.f4130a = 2;
        this.f4131b = constraintLayout;
        this.f = button;
        this.h = button2;
        this.f4133g = imageView;
        this.i = appCompatTextView;
        this.c = textView;
        this.f4132d = textView2;
        this.e = textView3;
        this.j = appCompatTextView2;
        this.f4134k = view;
    }

    public C0462k(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, HtmlTextView htmlTextView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f4130a = 0;
        this.f4131b = constraintLayout;
        this.f4133g = imageView;
        this.f = constraintLayout2;
        this.h = htmlTextView;
        this.c = textView;
        this.f4132d = textView2;
        this.e = textView3;
        this.i = textView4;
        this.j = textView5;
        this.f4134k = textView6;
    }

    public C0462k(ConstraintLayout constraintLayout, View view, View view2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f4130a = 12;
        this.f4131b = constraintLayout;
        this.f = view;
        this.f4133g = view2;
        this.c = textView;
        this.f4132d = textView2;
        this.e = textView3;
        this.i = textView4;
        this.j = textView5;
        this.f4134k = textView6;
        this.h = textView7;
    }

    public C0462k(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, View view, Group group, ImageView imageView, ImageView imageView2, TextView textView4) {
        this.f4130a = 13;
        this.f4131b = constraintLayout;
        this.c = textView;
        this.f = constraintLayout2;
        this.f4132d = textView2;
        this.e = textView3;
        this.h = view;
        this.j = group;
        this.f4133g = imageView;
        this.f4134k = imageView2;
        this.i = textView4;
    }

    public C0462k(NestedScrollView nestedScrollView, NestedScrollView nestedScrollView2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, ConstraintLayout constraintLayout) {
        this.f4130a = 4;
        this.f = nestedScrollView;
        this.f4133g = nestedScrollView2;
        this.h = recyclerView;
        this.c = textView;
        this.f4132d = textView2;
        this.e = textView4;
        this.i = textView5;
        this.j = textView6;
        this.f4134k = textView7;
        this.f4131b = constraintLayout;
    }

    public C0462k(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Toolbar toolbar, View view, TextView textView, SurfaceView surfaceView, TextView textView2, TextView textView3, TextView textView4, View view2) {
        this.f4130a = 7;
        this.f4131b = constraintLayout;
        this.f = constraintLayout2;
        this.f4133g = toolbar;
        this.h = view;
        this.c = textView;
        this.j = surfaceView;
        this.f4132d = textView2;
        this.e = textView3;
        this.i = textView4;
        this.f4134k = view2;
    }

    public C0462k(ConstraintLayout constraintLayout, Button button, Group group, ImageView imageView, LinearLayout linearLayout, MayaInputLayout mayaInputLayout, MayaInputLayout mayaInputLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f4130a = 9;
        this.f4131b = constraintLayout;
        this.f = button;
        this.h = group;
        this.f4133g = imageView;
        this.i = linearLayout;
        this.j = mayaInputLayout;
        this.f4134k = mayaInputLayout2;
        this.c = textView;
        this.f4132d = textView3;
        this.e = textView4;
    }

    public C0462k(ConstraintLayout constraintLayout, Group group, View view, View view2, TextView textView, Button button, Button button2, TextView textView2, TextView textView3, ConstraintLayout constraintLayout2) {
        this.f4130a = 1;
        this.f4131b = constraintLayout;
        this.f4133g = group;
        this.h = view;
        this.i = view2;
        this.c = textView;
        this.j = button;
        this.f4134k = button2;
        this.f4132d = textView2;
        this.e = textView3;
        this.f = constraintLayout2;
    }

    public C0462k(ConstraintLayout constraintLayout, ImageView imageView, HtmlTextView htmlTextView, Button button, TextView textView, View view, TextView textView2, TextView textView3, Toolbar toolbar, TextView textView4) {
        this.f4130a = 5;
        this.f4131b = constraintLayout;
        this.f4133g = imageView;
        this.h = htmlTextView;
        this.f = button;
        this.c = textView;
        this.j = view;
        this.f4132d = textView2;
        this.e = textView3;
        this.f4134k = toolbar;
        this.i = textView4;
    }

    public C0462k(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f4130a = 6;
        this.f4131b = constraintLayout;
        this.f = constraintLayout2;
        this.c = textView;
        this.f4133g = linearLayout;
        this.h = linearLayout2;
        this.f4132d = textView2;
        this.e = textView3;
        this.i = textView4;
        this.j = textView5;
        this.f4134k = textView6;
    }

    public C0462k(ConstraintLayout constraintLayout, View view, Button button, View view2, View view3, TextView textView, TextView textView2, View view4, View view5, TextView textView3) {
        this.f4130a = 8;
        this.f4131b = constraintLayout;
        this.f = view;
        this.f4133g = button;
        this.h = view2;
        this.i = view3;
        this.c = textView;
        this.f4132d = textView2;
        this.j = view4;
        this.f4134k = view5;
        this.e = textView3;
    }

    public C0462k(CoordinatorLayout coordinatorLayout, Group group, MayaInputLayout mayaInputLayout, ConstraintLayout constraintLayout, Button button, SwitchCompat switchCompat, Group group2, MayaInputLayout mayaInputLayout2, HtmlTextView htmlTextView, Toolbar toolbar, SwitchCompat switchCompat2) {
        this.f4130a = 10;
        this.f4131b = coordinatorLayout;
        this.f = group;
        this.f4133g = mayaInputLayout;
        this.c = button;
        this.f4132d = switchCompat;
        this.e = group2;
        this.i = mayaInputLayout2;
        this.h = htmlTextView;
        this.j = toolbar;
        this.f4134k = switchCompat2;
    }

    public C0462k(NestedScrollView nestedScrollView, TextView textView, View view, TextView textView2, TextView textView3, ImageView imageView, TextView textView4, View view2, TextView textView5, TextView textView6, HtmlTextView htmlTextView, View view3, TextView textView7, TextView textView8, TextView textView9) {
        this.f4130a = 15;
        this.f4131b = nestedScrollView;
        this.f = view;
        this.c = textView3;
        this.f4133g = imageView;
        this.j = view2;
        this.f4132d = textView6;
        this.h = htmlTextView;
        this.f4134k = view3;
        this.e = textView8;
        this.i = textView9;
    }

    public C0462k(NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view, View view2) {
        this.f4130a = 3;
        this.f4131b = nestedScrollView;
        this.c = textView;
        this.f4132d = textView2;
        this.e = textView3;
        this.i = textView4;
        this.j = textView5;
        this.f4134k = textView6;
        this.f = textView7;
        this.f4133g = view;
        this.h = view2;
    }
}
