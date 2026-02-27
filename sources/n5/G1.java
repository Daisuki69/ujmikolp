package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class G1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3629b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3630d;
    public final ImageView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f3631g;
    public final TextView h;
    public final TextView i;

    public /* synthetic */ G1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, int i) {
        this.f3628a = i;
        this.f3629b = constraintLayout;
        this.c = constraintLayout2;
        this.f3630d = textView;
        this.e = imageView;
        this.f = textView2;
        this.f3631g = textView3;
        this.h = textView4;
        this.i = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3628a) {
        }
        return this.f3629b;
    }
}
