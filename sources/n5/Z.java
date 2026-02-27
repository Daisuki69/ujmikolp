package N5;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class Z implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4041b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4042d;

    public /* synthetic */ Z(ConstraintLayout constraintLayout, TextView textView, TextView textView2, int i) {
        this.f4040a = i;
        this.f4041b = constraintLayout;
        this.c = textView;
        this.f4042d = textView2;
    }

    public static Z a(View view) {
        int i = R.id.lottie_animation_view_ziggy_loader;
        if (((LottieAnimationView) ViewBindings.findChildViewById(view, R.id.lottie_animation_view_ziggy_loader)) != null) {
            i = R.id.text_view_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.text_view_description);
            if (textView != null) {
                i = R.id.text_view_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_view_title);
                if (textView2 != null) {
                    return new Z((ConstraintLayout) view, textView, textView2, 0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4040a) {
        }
        return this.f4041b;
    }
}
