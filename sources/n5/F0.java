package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class F0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3618b;
    public final Button c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3619d;
    public final TextView e;

    public /* synthetic */ F0(ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2, int i) {
        this.f3617a = i;
        this.f3618b = constraintLayout;
        this.c = button;
        this.f3619d = textView;
        this.e = textView2;
    }

    public static F0 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_merchant_confirmation, viewGroup, false);
        int i = R.id.amount_maya_input_layout;
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.amount_maya_input_layout)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            int i4 = R.id.merchant_info_text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.merchant_info_text_view);
            if (textView != null) {
                i4 = R.id.merchant_label_text_view;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.merchant_label_text_view)) != null) {
                    i4 = R.id.merchant_payment_label_text_view;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.merchant_payment_label_text_view)) != null) {
                        i4 = R.id.pay_button;
                        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.pay_button);
                        if (button != null) {
                            i4 = R.id.price_label_text_view;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.price_label_text_view);
                            if (textView2 != null) {
                                i4 = R.id.vertical_guideline;
                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.vertical_guideline)) != null) {
                                    return new F0(button, textView, textView2, constraintLayout);
                                }
                            }
                        }
                    }
                }
            }
            i = i4;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3617a) {
        }
        return this.f3618b;
    }

    public F0(Button button, TextView textView, TextView textView2, ConstraintLayout constraintLayout) {
        this.f3617a = 0;
        this.f3618b = constraintLayout;
        this.f3619d = textView;
        this.c = button;
        this.e = textView2;
    }
}
