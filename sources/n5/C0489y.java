package N5;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: renamed from: N5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0489y implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4296b;
    public final Button c;

    public /* synthetic */ C0489y(ConstraintLayout constraintLayout, Button button, int i) {
        this.f4295a = i;
        this.f4296b = constraintLayout;
        this.c = button;
    }

    public static C0489y a(View view) {
        int i = R.id.button_favorites_retry;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.button_favorites_retry);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i4 = R.id.text_view_favorites_error_title;
            if (((TextView) ViewBindings.findChildViewById(view, R.id.text_view_favorites_error_title)) != null) {
                i4 = R.id.text_view_favorites_subtitle;
                if (((TextView) ViewBindings.findChildViewById(view, R.id.text_view_favorites_subtitle)) != null) {
                    return new C0489y(constraintLayout, button, 7);
                }
            }
            i = i4;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4295a) {
        }
        return this.f4296b;
    }
}
