package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class s1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4206b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Guideline f4207d;
    public final Guideline e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4208g;
    public final TextView h;
    public final TextView i;
    public final TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f4209k;

    public /* synthetic */ s1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Guideline guideline, Guideline guideline2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, int i) {
        this.f4205a = i;
        this.f4206b = constraintLayout;
        this.c = constraintLayout2;
        this.f4207d = guideline;
        this.e = guideline2;
        this.f = textView;
        this.f4208g = textView2;
        this.h = textView3;
        this.i = textView4;
        this.j = textView5;
        this.f4209k = textView6;
    }

    public static s1 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_holder_transaction_activity, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.guideline;
        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline)) != null) {
            i = R.id.guideline_end;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_end);
            if (guideline != null) {
                i = R.id.guideline_start;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_start);
                if (guideline2 != null) {
                    i = R.id.text_view_action;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_action);
                    if (textView != null) {
                        i = R.id.text_view_amount;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_amount);
                        if (textView2 != null) {
                            i = R.id.text_view_date;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_date);
                            if (textView3 != null) {
                                i = R.id.text_view_fee;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_fee);
                                if (textView4 != null) {
                                    i = R.id.text_view_fee_label;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_fee_label);
                                    if (textView5 != null) {
                                        i = R.id.text_view_target;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_target);
                                        if (textView6 != null) {
                                            return new s1(constraintLayout, constraintLayout, guideline, guideline2, textView, textView2, textView3, textView4, textView5, textView6, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4205a) {
        }
        return this.f4206b;
    }
}
