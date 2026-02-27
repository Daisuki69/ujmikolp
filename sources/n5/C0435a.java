package N5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;

/* JADX INFO: renamed from: N5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0435a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f4047b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4048d;
    public final Object e;
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4049g;

    public /* synthetic */ C0435a(ViewGroup viewGroup, View view, View view2, TextView textView, TextView textView2, View view3, int i) {
        this.f4046a = i;
        this.f4047b = viewGroup;
        this.c = view;
        this.f4048d = view2;
        this.e = textView;
        this.f4049g = textView2;
        this.f = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4046a) {
            case 0:
                return (NestedScrollView) this.f4047b;
            case 1:
                return (ConstraintLayout) this.f4047b;
            case 2:
                return (ConstraintLayout) this.f4047b;
            case 3:
                return (ConstraintLayout) this.f4047b;
            case 4:
                return (SpringView) this.f4047b;
            case 5:
                return (ConstraintLayout) this.f4047b;
            case 6:
                return (ConstraintLayout) this.f4047b;
            case 7:
                return (ConstraintLayout) this.f4047b;
            case 8:
                return (ConstraintLayout) this.f4047b;
            case 9:
                return (NestedScrollView) this.f4047b;
            case 10:
                return (ScrollView) this.f4047b;
            case 11:
                return (NestedScrollView) this.f4047b;
            case 12:
                return (ConstraintLayout) this.f4047b;
            case 13:
                return (ConstraintLayout) this.f4047b;
            case 14:
                return (ConstraintLayout) this.f4047b;
            case 15:
                return (ConstraintLayout) this.f4047b;
            case 16:
                return (ScrollView) this.f4047b;
            case 17:
                return (LinearLayout) this.f4047b;
            case 18:
                return (ConstraintLayout) this.f4047b;
            case 19:
                return (ConstraintLayout) this.f4047b;
            case 20:
                return (CardView) this.f4047b;
            case 21:
                return (ConstraintLayout) this.f4047b;
            case 22:
                return (ConstraintLayout) this.f4047b;
            case 23:
                return (ConstraintLayout) this.f4047b;
            case 24:
                return (CoordinatorLayout) this.f4047b;
            case 25:
                return (ConstraintLayout) this.f4047b;
            case 26:
                return (ConstraintLayout) this.f4047b;
            default:
                return (FrameLayout) this.f4047b;
        }
    }

    public /* synthetic */ C0435a(ViewGroup viewGroup, Object obj, Object obj2, Object obj3, View view, Object obj4, int i) {
        this.f4046a = i;
        this.f4047b = viewGroup;
        this.c = obj;
        this.f4048d = obj2;
        this.e = obj3;
        this.f = view;
        this.f4049g = obj4;
    }

    public /* synthetic */ C0435a(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, TextView textView, int i) {
        this.f4046a = i;
        this.f4047b = constraintLayout;
        this.c = view;
        this.f = view2;
        this.f4048d = view3;
        this.e = view4;
        this.f4049g = textView;
    }

    public C0435a(FrameLayout frameLayout, C0452f1 c0452f1, FrameLayout frameLayout2, TextView textView, TextView textView2, CardView cardView, RecyclerView recyclerView) {
        this.f4046a = 27;
        this.f4047b = frameLayout;
        this.c = c0452f1;
        this.f4048d = frameLayout2;
        this.e = textView;
        this.f = textView2;
        this.f4049g = cardView;
    }

    public C0435a(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, View view) {
        this.f4046a = 21;
        this.f4047b = constraintLayout;
        this.c = imageView;
        this.f4048d = imageView2;
        this.e = textView;
        this.f4049g = textView2;
        this.f = view;
    }

    public C0435a(CardView cardView, Group group, ImageView imageView, AppCompatTextView appCompatTextView, TextView textView, A1 a12) {
        this.f4046a = 20;
        this.f4047b = cardView;
        this.f4048d = group;
        this.e = imageView;
        this.c = appCompatTextView;
        this.f = textView;
        this.f4049g = a12;
    }

    public C0435a(View view, Button button, Button button2, TextView textView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, MayaInputLayout mayaInputLayout) {
        this.f4046a = 2;
        this.f4047b = constraintLayout;
        this.c = button;
        this.f4048d = button2;
        this.e = mayaInputLayout;
        this.f4049g = textView;
        this.f = view;
    }

    public C0435a(ScrollView scrollView, AppCompatTextView appCompatTextView, Button button, View view, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, TextView textView) {
        this.f4046a = 10;
        this.f4047b = scrollView;
        this.e = button;
        this.f = view;
        this.c = appCompatTextView2;
        this.f4048d = appCompatTextView3;
        this.f4049g = textView;
    }

    public C0435a(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, View view5) {
        this.f4046a = 22;
        this.f4047b = constraintLayout;
        this.f = view;
        this.f4049g = view2;
        this.c = view3;
        this.f4048d = view4;
        this.e = view5;
    }

    public C0435a(ConstraintLayout constraintLayout, View view, TextView textView, View view2, TextView textView2, TextView textView3) {
        this.f4046a = 14;
        this.f4047b = constraintLayout;
        this.f = view;
        this.c = textView;
        this.f4049g = view2;
        this.f4048d = textView2;
        this.e = textView3;
    }
}
