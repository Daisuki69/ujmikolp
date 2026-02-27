package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4156b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f4157d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4158g;
    public final TextView h;

    public /* synthetic */ m1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, int i) {
        this.f4155a = i;
        this.f4156b = constraintLayout;
        this.c = constraintLayout2;
        this.f4157d = imageView;
        this.e = textView;
        this.f = textView2;
        this.f4158g = textView3;
        this.h = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4155a) {
        }
        return this.f4156b;
    }
}
