package N5;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class t1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4216b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f4217d;
    public final ImageView e;

    public /* synthetic */ t1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, int i) {
        this.f4215a = i;
        this.f4216b = constraintLayout;
        this.c = constraintLayout2;
        this.f4217d = imageView;
        this.e = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4215a) {
        }
        return this.f4216b;
    }
}
