package N5;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4227b;
    public final Guideline c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Guideline f4228d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4229g;
    public final ConstraintLayout h;

    public /* synthetic */ u1(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, TextView textView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout2, int i) {
        this.f4226a = i;
        this.f4227b = constraintLayout;
        this.c = guideline;
        this.f4228d = guideline2;
        this.e = textView;
        this.f = textView2;
        this.f4229g = textView3;
        this.h = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4226a) {
        }
        return this.f4227b;
    }
}
