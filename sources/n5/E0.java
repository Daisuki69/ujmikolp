package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class E0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3591a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3592b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f3593d;
    public final TextView e;

    public E0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f3592b = constraintLayout;
        this.f3593d = imageView;
        this.c = textView;
        this.e = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3591a) {
        }
        return this.f3592b;
    }

    public E0(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f3592b = constraintLayout;
        this.c = textView;
        this.f3593d = imageView;
        this.e = textView2;
    }
}
