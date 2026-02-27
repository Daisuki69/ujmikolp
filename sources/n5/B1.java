package N5;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class B1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3554a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3555b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f3556d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f3557g;
    public final TextView h;
    public final ConstraintLayout i;

    public B1(ConstraintLayout constraintLayout, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ConstraintLayout constraintLayout2) {
        this.f3555b = constraintLayout;
        this.c = textView;
        this.f3556d = appCompatImageView;
        this.e = textView2;
        this.f = textView3;
        this.f3557g = textView4;
        this.h = textView5;
        this.i = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3554a) {
        }
        return this.f3555b;
    }

    public B1(ConstraintLayout constraintLayout, TextView textView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f3555b = constraintLayout;
        this.c = textView;
        this.f3556d = appCompatImageView;
        this.i = constraintLayout2;
        this.e = textView2;
        this.f = textView3;
        this.f3557g = textView4;
        this.h = textView5;
    }
}
