package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class Z0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4044b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HtmlTextView f4045d;
    public final TextView e;

    public /* synthetic */ Z0(ConstraintLayout constraintLayout, ImageView imageView, HtmlTextView htmlTextView, TextView textView, int i) {
        this.f4043a = i;
        this.f4044b = constraintLayout;
        this.c = imageView;
        this.f4045d = htmlTextView;
        this.e = textView;
    }

    public static Z0 a(View view) {
        int i = R.id.copy_image_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.copy_image_view);
        if (imageView != null) {
            i = R.id.middle_vertical_guideline;
            if (((Guideline) ViewBindings.findChildViewById(view, R.id.middle_vertical_guideline)) != null) {
                i = R.id.powered_by_text_view;
                HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(view, R.id.powered_by_text_view);
                if (htmlTextView != null) {
                    i = R.id.title_text_view;
                    if (((TextView) ViewBindings.findChildViewById(view, R.id.title_text_view)) != null) {
                        i = R.id.value_text_view;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.value_text_view);
                        if (textView != null) {
                            return new Z0((ConstraintLayout) view, imageView, htmlTextView, textView, 1);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4043a) {
        }
        return this.f4044b;
    }
}
