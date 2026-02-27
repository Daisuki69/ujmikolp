package N5;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0482u0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4221b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f4222d;
    public final Group e;
    public final RecyclerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecyclerView f4223g;
    public final RecyclerView h;
    public final TextView i;
    public final TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f4224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f4225l;
    public final TextView m;

    public C0482u0(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, Group group, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f4220a = constraintLayout;
        this.f4221b = button;
        this.c = constraintLayout2;
        this.f4222d = constraintLayout3;
        this.e = group;
        this.f = recyclerView;
        this.f4223g = recyclerView2;
        this.h = recyclerView3;
        this.i = textView;
        this.j = textView2;
        this.f4224k = textView3;
        this.f4225l = textView4;
        this.m = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4220a;
    }
}
