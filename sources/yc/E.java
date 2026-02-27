package yc;

import N5.U0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class E extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f21101a = new E(3, U0.class, numX49.tnTj78("bt9M"), numX49.tnTj78("bt9N"), 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(layoutInflater, numX49.tnTj78("bt96"));
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_user_update_work_details, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.form_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.form_container);
        if (constraintLayout != null) {
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
                            i = R.id.maya_dropdown_job_title;
                            MayaDropDown mayaDropDown = (MayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_dropdown_job_title);
                            if (mayaDropDown != null) {
                                i = R.id.maya_dropdown_nature_of_work;
                                MayaDropDown mayaDropDown2 = (MayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_dropdown_nature_of_work);
                                if (mayaDropDown2 != null) {
                                    i = R.id.maya_dropdown_source_of_income;
                                    MayaDropDown mayaDropDown3 = (MayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_dropdown_source_of_income);
                                    if (mayaDropDown3 != null) {
                                        i = R.id.next_button;
                                        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.next_button);
                                        if (button != null) {
                                            i = R.id.scrollable_nested_scroll_view;
                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_nested_scroll_view);
                                            if (scrollView != null) {
                                                i = R.id.text_view_form_header;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_form_header)) != null) {
                                                    i = R.id.text_view_form_sub_header;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_form_sub_header)) != null) {
                                                        return new U0((ConstraintLayout) viewInflate, constraintLayout, mayaProfileInputLayout, mayaProfileInputLayout2, mayaDropDown, mayaDropDown2, mayaDropDown3, button, scrollView);
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
        throw new NullPointerException(numX49.tnTj78("bt9a").concat(viewInflate.getResources().getResourceName(i)));
    }
}
