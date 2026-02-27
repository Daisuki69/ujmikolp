package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: renamed from: N5.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0437a1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4052a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4053b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f4054d;
    public final TextView e;
    public final TextView f;

    public C0437a1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, TextView textView2) {
        this.f4053b = constraintLayout;
        this.c = constraintLayout2;
        this.f4054d = imageView;
        this.e = textView;
        this.f = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4052a) {
        }
        return this.f4053b;
    }

    public C0437a1(ConstraintLayout constraintLayout, Group group, ConstraintLayout constraintLayout2, ImageView imageView, LinearLayout linearLayout, LottieAnimationView lottieAnimationView, TextView textView, TextView textView2) {
        this.f4053b = constraintLayout;
        this.c = constraintLayout2;
        this.f4054d = imageView;
        this.e = textView;
        this.f = textView2;
    }
}
