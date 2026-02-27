package N5;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class C1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3570a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3571b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3572d;
    public final ImageView e;
    public final FrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Group f3573g;
    public final View h;
    public final Group i;
    public final TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f3574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f3575l;

    public C1(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, FrameLayout frameLayout, Group group, View view, Group group2, TextView textView4, ConstraintLayout constraintLayout2) {
        this.f3571b = constraintLayout;
        this.c = textView;
        this.f3572d = textView2;
        this.j = textView3;
        this.e = imageView;
        this.f = frameLayout;
        this.f3573g = group;
        this.h = view;
        this.i = group2;
        this.f3575l = textView4;
        this.f3574k = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3570a) {
        }
        return this.f3571b;
    }

    public C1(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, FrameLayout frameLayout, Group group, View view, Group group2, TextView textView3, ConstraintLayout constraintLayout2, TextView textView4) {
        this.f3571b = constraintLayout;
        this.c = textView;
        this.f3572d = textView2;
        this.e = imageView;
        this.f = frameLayout;
        this.f3573g = group;
        this.h = view;
        this.i = group2;
        this.j = textView3;
        this.f3574k = constraintLayout2;
        this.f3575l = textView4;
    }
}
