package yc;

import N5.K0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: yc.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2523d extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2523d f21110a = new C2523d(3, K0.class, numX49.tnTj78("bt9p"), numX49.tnTj78("bt90"), 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(layoutInflater, numX49.tnTj78("bt9g"));
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_personal_details, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.alternate_contact_separator_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.alternate_contact_separator_view);
        if (viewFindChildViewById != null) {
            i = R.id.form_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.form_container);
            if (constraintLayout != null) {
                i = R.id.guideline_end;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_end)) != null) {
                    i = R.id.guideline_start;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_start)) != null) {
                        i = R.id.input_alternate_contact;
                        MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_alternate_contact);
                        if (mayaProfileInputLayout != null) {
                            i = R.id.input_email_address;
                            MayaProfileInputLayout mayaProfileInputLayout2 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_email_address);
                            if (mayaProfileInputLayout2 != null) {
                                i = R.id.input_mothers_maiden_first_name;
                                MayaProfileInputLayout mayaProfileInputLayout3 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_mothers_maiden_first_name);
                                if (mayaProfileInputLayout3 != null) {
                                    i = R.id.input_mothers_maiden_last_name;
                                    MayaProfileInputLayout mayaProfileInputLayout4 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_mothers_maiden_last_name);
                                    if (mayaProfileInputLayout4 != null) {
                                        i = R.id.input_mothers_maiden_middle_name;
                                        MayaProfileInputLayout mayaProfileInputLayout5 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_mothers_maiden_middle_name);
                                        if (mayaProfileInputLayout5 != null) {
                                            i = R.id.maya_dropdown_civil_status;
                                            MayaDropDown mayaDropDown = (MayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_dropdown_civil_status);
                                            if (mayaDropDown != null) {
                                                i = R.id.maya_dropdown_educational_attainment;
                                                MayaDropDown mayaDropDown2 = (MayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_dropdown_educational_attainment);
                                                if (mayaDropDown2 != null) {
                                                    i = R.id.maya_dropdown_gender;
                                                    MayaDropDown mayaDropDown3 = (MayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_dropdown_gender);
                                                    if (mayaDropDown3 != null) {
                                                        i = R.id.mother_details_separator_view;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.mother_details_separator_view);
                                                        if (viewFindChildViewById2 != null) {
                                                            i = R.id.mothers_maiden_middle_name_checkbox;
                                                            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.mothers_maiden_middle_name_checkbox);
                                                            if (appCompatCheckBox != null) {
                                                                i = R.id.next_button;
                                                                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.next_button);
                                                                if (button != null) {
                                                                    i = R.id.personal_details_separator_view;
                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.personal_details_separator_view);
                                                                    if (viewFindChildViewById3 != null) {
                                                                        i = R.id.scrollable_nested_scroll_view;
                                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_nested_scroll_view);
                                                                        if (scrollView != null) {
                                                                            i = R.id.text_view_form_header;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_form_header)) != null) {
                                                                                i = R.id.text_view_form_sub_header;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_form_sub_header)) != null) {
                                                                                    return new K0((ConstraintLayout) viewInflate, viewFindChildViewById, constraintLayout, mayaProfileInputLayout, mayaProfileInputLayout2, mayaProfileInputLayout3, mayaProfileInputLayout4, mayaProfileInputLayout5, mayaDropDown, mayaDropDown2, mayaDropDown3, viewFindChildViewById2, appCompatCheckBox, button, viewFindChildViewById3, scrollView);
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
        throw new NullPointerException(numX49.tnTj78("bt9f").concat(viewInflate.getResources().getResourceName(i)));
    }
}
