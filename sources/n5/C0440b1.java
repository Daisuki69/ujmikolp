package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0440b1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4061a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4062b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4063d;
    public final TextView e;
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4064g;

    public C0440b1(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.f4062b = constraintLayout;
        this.f = imageView;
        this.c = constraintLayout2;
        this.f4063d = textView;
        this.e = textView2;
        this.f4064g = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4061a) {
        }
        return this.f4062b;
    }

    public C0440b1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, ImageView imageView, TextView textView3) {
        this.f4062b = constraintLayout;
        this.c = constraintLayout2;
        this.f4063d = textView;
        this.e = textView2;
        this.f = imageView;
        this.f4064g = textView3;
    }
}
