package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0455g1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4099b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f4100d;
    public final TextView e;

    public /* synthetic */ C0455g1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, int i) {
        this.f4098a = i;
        this.f4099b = constraintLayout;
        this.c = constraintLayout2;
        this.f4100d = imageView;
        this.e = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4098a) {
        }
        return this.f4099b;
    }
}
