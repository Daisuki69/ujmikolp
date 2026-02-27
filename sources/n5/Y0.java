package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class Y0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4038b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4039d;

    public /* synthetic */ Y0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, int i) {
        this.f4037a = i;
        this.f4038b = constraintLayout;
        this.c = imageView;
        this.f4039d = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4037a) {
        }
        return this.f4038b;
    }
}
