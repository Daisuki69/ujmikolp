package N5;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f4112b;
    public final AppCompatCheckBox c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4113d;
    public final AppCompatImageView e;

    public h1(ConstraintLayout constraintLayout, TextView textView, AppCompatCheckBox appCompatCheckBox, TextView textView2, AppCompatImageView appCompatImageView) {
        this.f4111a = constraintLayout;
        this.f4112b = textView;
        this.c = appCompatCheckBox;
        this.f4113d = textView2;
        this.e = appCompatImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4111a;
    }
}
