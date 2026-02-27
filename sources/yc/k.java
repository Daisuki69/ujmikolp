package yc;

import N5.R0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f21121a = new k(3, R0.class, numX49.tnTj78("bt9y"), numX49.tnTj78("bt9v"), 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(layoutInflater, numX49.tnTj78("bt97"));
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_underwriting_requirements, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.barrier_tin;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_tin)) != null) {
            i = R.id.button_container;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.button_container)) != null) {
                i = R.id.dropdown_job_title;
                MayaDropDown mayaDropDown = (MayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.dropdown_job_title);
                if (mayaDropDown != null) {
                    i = R.id.dropdown_nature_of_work;
                    MayaDropDown mayaDropDown2 = (MayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.dropdown_nature_of_work);
                    if (mayaDropDown2 != null) {
                        i = R.id.dropdown_source_of_income;
                        MayaDropDown mayaDropDown3 = (MayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.dropdown_source_of_income);
                        if (mayaDropDown3 != null) {
                            i = R.id.form_container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.form_container);
                            if (constraintLayout != null) {
                                i = R.id.guideline_bottom;
                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_bottom)) != null) {
                                    i = R.id.guideline_end;
                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_end)) != null) {
                                        i = R.id.guideline_start;
                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_start)) != null) {
                                            i = R.id.input_company_name;
                                            MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_company_name);
                                            if (mayaProfileInputLayout != null) {
                                                i = R.id.input_monthly_pay;
                                                MayaProfileInputLayout mayaProfileInputLayout2 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_monthly_pay);
                                                if (mayaProfileInputLayout2 != null) {
                                                    i = R.id.input_sss;
                                                    MayaProfileInputLayout mayaProfileInputLayout3 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_sss);
                                                    if (mayaProfileInputLayout3 != null) {
                                                        i = R.id.input_tin;
                                                        MayaProfileInputLayout mayaProfileInputLayout4 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_tin);
                                                        if (mayaProfileInputLayout4 != null) {
                                                            i = R.id.scrollable_nested_scroll_view;
                                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_nested_scroll_view);
                                                            if (scrollView != null) {
                                                                i = R.id.submit_button;
                                                                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.submit_button);
                                                                if (button != null) {
                                                                    i = R.id.text_view_add_sss;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_add_sss);
                                                                    if (textView != null) {
                                                                        i = R.id.text_view_add_tin;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_add_tin);
                                                                        if (textView2 != null) {
                                                                            i = R.id.text_view_form_header;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_form_header)) != null) {
                                                                                i = R.id.text_view_form_sub_header;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_form_sub_header)) != null) {
                                                                                    i = R.id.text_view_id_number;
                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_id_number)) != null) {
                                                                                        i = R.id.text_view_id_number_badge;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_id_number_badge)) != null) {
                                                                                            i = R.id.underwriting_requirements_separator_view;
                                                                                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.underwriting_requirements_separator_view);
                                                                                            if (viewFindChildViewById != null) {
                                                                                                i = R.id.user_identification_separator_view;
                                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.user_identification_separator_view);
                                                                                                if (viewFindChildViewById2 != null) {
                                                                                                    i = R.id.validate_identification_button;
                                                                                                    Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.validate_identification_button);
                                                                                                    if (button2 != null) {
                                                                                                        return new R0((ConstraintLayout) viewInflate, mayaDropDown, mayaDropDown2, mayaDropDown3, constraintLayout, mayaProfileInputLayout, mayaProfileInputLayout2, mayaProfileInputLayout3, mayaProfileInputLayout4, scrollView, button, textView, textView2, viewFindChildViewById, viewFindChildViewById2, button2);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bt9A").concat(viewInflate.getResources().getResourceName(i)));
    }
}
