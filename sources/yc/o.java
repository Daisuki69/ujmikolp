package yc;

import N5.S0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f21125a = new o(3, S0.class, numX49.tnTj78("bt9c"), numX49.tnTj78("bt9m"), 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(layoutInflater, numX49.tnTj78("bt9D"));
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_user_contact_reference, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.card_view_info;
        if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_info)) != null) {
            i = R.id.contact_reference_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.contact_reference_container);
            if (constraintLayout != null) {
                i = R.id.guideline_end;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_end)) != null) {
                    i = R.id.guideline_start;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_start)) != null) {
                        i = R.id.image_view_info;
                        if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_info)) != null) {
                            i = R.id.input_first_name;
                            MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_first_name);
                            if (mayaProfileInputLayout != null) {
                                i = R.id.input_last_name;
                                MayaProfileInputLayout mayaProfileInputLayout2 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_last_name);
                                if (mayaProfileInputLayout2 != null) {
                                    i = R.id.input_middle_name;
                                    MayaProfileInputLayout mayaProfileInputLayout3 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_middle_name);
                                    if (mayaProfileInputLayout3 != null) {
                                        i = R.id.input_mobile_number;
                                        MayaProfileInputLayout mayaProfileInputLayout4 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_mobile_number);
                                        if (mayaProfileInputLayout4 != null) {
                                            i = R.id.ll_bullet_container;
                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(viewInflate, R.id.ll_bullet_container);
                                            if (linearLayoutCompat != null) {
                                                i = R.id.maya_dropdown_relation;
                                                MayaDropDown mayaDropDown = (MayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_dropdown_relation);
                                                if (mayaDropDown != null) {
                                                    i = R.id.middle_name_checkbox;
                                                    AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.middle_name_checkbox);
                                                    if (appCompatCheckBox != null) {
                                                        i = R.id.next_button;
                                                        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.next_button);
                                                        if (button != null) {
                                                            i = R.id.scrollable_nested_scroll_view;
                                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_nested_scroll_view);
                                                            if (scrollView != null) {
                                                                i = R.id.text_view_description;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description);
                                                                if (textView != null) {
                                                                    i = R.id.text_view_form_header;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_form_header)) != null) {
                                                                        i = R.id.text_view_form_sub_header;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_form_sub_header);
                                                                        if (textView2 != null) {
                                                                            i = R.id.text_view_title;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title);
                                                                            if (textView3 != null) {
                                                                                return new S0((ConstraintLayout) viewInflate, constraintLayout, mayaProfileInputLayout, mayaProfileInputLayout2, mayaProfileInputLayout3, mayaProfileInputLayout4, linearLayoutCompat, mayaDropDown, appCompatCheckBox, button, scrollView, textView, textView2, textView3);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bt9h").concat(viewInflate.getResources().getResourceName(i)));
    }
}
