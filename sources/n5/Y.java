package N5;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.paymaya.mayaui.kyczoloz.view.widget.ExpandableBenefitsRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NestedScrollView f4032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f4033b;
    public final LinearLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4034d;
    public final Button e;
    public final ExpandableBenefitsRecyclerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4035g;
    public final TextView h;
    public final View i;
    public final View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f4036k;

    public Y(NestedScrollView nestedScrollView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, Button button, ExpandableBenefitsRecyclerView expandableBenefitsRecyclerView, TextView textView2, TextView textView3, View view, View view2, View view3) {
        this.f4032a = nestedScrollView;
        this.f4033b = linearLayout;
        this.c = linearLayout2;
        this.f4034d = textView;
        this.e = button;
        this.f = expandableBenefitsRecyclerView;
        this.f4035g = textView2;
        this.h = textView3;
        this.i = view;
        this.j = view2;
        this.f4036k = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4032a;
    }
}
