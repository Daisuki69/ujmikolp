package N5;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class y1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatCheckBox f4300b;
    public final ShapeableImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f4301d;
    public final TextView e;
    public final TextView f;

    public y1(ConstraintLayout constraintLayout, AppCompatCheckBox appCompatCheckBox, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.f4299a = constraintLayout;
        this.f4300b = appCompatCheckBox;
        this.c = shapeableImageView;
        this.f4301d = constraintLayout2;
        this.e = textView;
        this.f = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4299a;
    }
}
