package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;

/* JADX INFO: renamed from: N5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0453g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f4094b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4095d;
    public final Object e;

    public /* synthetic */ C0453g(int i, ViewGroup viewGroup, Object obj, Object obj2, Object obj3) {
        this.f4093a = i;
        this.f4094b = viewGroup;
        this.c = obj;
        this.f4095d = obj2;
        this.e = obj3;
    }

    public static C0453g a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_merchant_payment, viewGroup, false);
        int i = R.id.amount_maya_input_layout;
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.amount_maya_input_layout);
        if (mayaInputLayout != null) {
            i = R.id.merchant_info_label_text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.merchant_info_label_text_view);
            if (textView != null) {
                i = R.id.merchant_payment_image_view;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.merchant_payment_image_view);
                if (imageView != null) {
                    i = R.id.merchant_payment_label_text_view;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.merchant_payment_label_text_view)) != null) {
                        i = R.id.payment_continue_button;
                        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.payment_continue_button);
                        if (button != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i = R.id.scroll_view;
                            if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view)) != null) {
                                return new C0453g(constraintLayout, mayaInputLayout, textView, imageView, button);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static C0453g b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_holder_date_header_alt_activity, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.text_view_date;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_date);
        if (textView != null) {
            i = R.id.view_left_center_line;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_left_center_line);
            if (viewFindChildViewById != null) {
                i = R.id.view_right_center_line;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_right_center_line);
                if (viewFindChildViewById2 != null) {
                    return new C0453g(29, constraintLayout, textView, viewFindChildViewById, viewFindChildViewById2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4093a) {
            case 0:
                return (ConstraintLayout) this.f4094b;
            case 1:
                return (ConstraintLayout) this.f4094b;
            case 2:
                return (ConstraintLayout) this.f4094b;
            case 3:
                return (ConstraintLayout) this.f4094b;
            case 4:
                return (ConstraintLayout) this.f4094b;
            case 5:
                return (ConstraintLayout) this.f4094b;
            case 6:
                return (NestedScrollView) this.f4094b;
            case 7:
                return (ConstraintLayout) this.f4094b;
            case 8:
                return (ScrollView) this.f4094b;
            case 9:
                return (NestedScrollView) this.f4094b;
            case 10:
                return (ConstraintLayout) this.f4094b;
            case 11:
                return (ConstraintLayout) this.f4094b;
            case 12:
                return (ConstraintLayout) this.f4094b;
            case 13:
                return (ConstraintLayout) this.f4094b;
            case 14:
                return (LinearLayout) this.f4094b;
            case 15:
                return (ConstraintLayout) this.f4094b;
            case 16:
                return (ConstraintLayout) this.f4094b;
            case 17:
                return (ConstraintLayout) this.f4094b;
            case 18:
                return (NestedScrollView) this.f4094b;
            case 19:
                return (NestedScrollView) this.f4094b;
            case 20:
                return (ScrollView) this.f4094b;
            case 21:
                return (ScrollView) this.f4094b;
            case 22:
                return (ConstraintLayout) this.f4094b;
            case 23:
                return (ConstraintLayout) this.f4094b;
            case 24:
                return (ConstraintLayout) this.f4094b;
            case 25:
                return (ConstraintLayout) this.f4094b;
            case 26:
                return (ConstraintLayout) this.f4094b;
            case 27:
                return (ConstraintLayout) this.f4094b;
            case 28:
                return (CardView) this.f4094b;
            default:
                return (ConstraintLayout) this.f4094b;
        }
    }

    public C0453g(ScrollView scrollView, ScrollView scrollView2, TextView textView, Button button, Button button2) {
        this.f4093a = 20;
        this.f4094b = scrollView;
        this.c = scrollView2;
        this.f4095d = button;
        this.e = button2;
    }

    public C0453g(NestedScrollView nestedScrollView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3) {
        this.f4093a = 6;
        this.f4094b = nestedScrollView;
        this.c = recyclerView;
        this.f4095d = recyclerView2;
        this.e = textView2;
    }

    public C0453g(ConstraintLayout constraintLayout, EditText editText, ConstraintLayout constraintLayout2, HtmlTextView htmlTextView, TextView textView, TextView textView2) {
        this.f4093a = 5;
        this.f4094b = constraintLayout;
        this.c = editText;
        this.f4095d = textView;
        this.e = textView2;
    }

    public C0453g(ConstraintLayout constraintLayout, MayaInputLayout mayaInputLayout, TextView textView, ImageView imageView, Button button) {
        this.f4093a = 12;
        this.f4094b = constraintLayout;
        this.c = mayaInputLayout;
        this.f4095d = textView;
        this.e = button;
    }
}
