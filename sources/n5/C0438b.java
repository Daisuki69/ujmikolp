package N5;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.paymaya.common.widget.HtmlTextView;

/* JADX INFO: renamed from: N5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0438b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4056b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4057d;
    public final HtmlTextView e;
    public final TextView f;

    public C0438b(ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView, HtmlTextView htmlTextView, TextView textView2) {
        this.f4055a = constraintLayout;
        this.f4056b = button;
        this.c = imageView;
        this.f4057d = textView;
        this.e = htmlTextView;
        this.f = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4055a;
    }
}
