package yc;

import N5.T0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f21135a = new v(3, T0.class, numX49.tnTj78("bt9P1"), numX49.tnTj78("bt9Pn"), 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(layoutInflater, numX49.tnTj78("bt9Px"));
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_user_profile_update, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.barrier_tin;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_tin)) != null) {
            i = R.id.button_container;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.button_container)) != null) {
                i = R.id.form_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.form_container);
                if (constraintLayout != null) {
                    i = R.id.guideline_bottom;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_bottom)) != null) {
                        i = R.id.guideline_end;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_end)) != null) {
                            i = R.id.guideline_start;
                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_start)) != null) {
                                i = R.id.identification_group;
                                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.identification_group);
                                if (group != null) {
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
                                                        i = R.id.input_sss;
                                                        MayaProfileInputLayout mayaProfileInputLayout6 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_sss);
                                                        if (mayaProfileInputLayout6 != null) {
                                                            i = R.id.input_tin;
                                                            MayaProfileInputLayout mayaProfileInputLayout7 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_tin);
                                                            if (mayaProfileInputLayout7 != null) {
                                                                i = R.id.input_tin1;
                                                                MayaProfileInputLayout mayaProfileInputLayout8 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_tin1);
                                                                if (mayaProfileInputLayout8 != null) {
                                                                    i = R.id.maya_dropdown_civil_status;
                                                                    MayaDropDown mayaDropDown = (MayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_dropdown_civil_status);
                                                                    if (mayaDropDown != null) {
                                                                        i = R.id.maya_dropdown_educational_attainment;
                                                                        MayaDropDown mayaDropDown2 = (MayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_dropdown_educational_attainment);
                                                                        if (mayaDropDown2 != null) {
                                                                            i = R.id.maya_dropdown_gender;
                                                                            MayaDropDown mayaDropDown3 = (MayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_dropdown_gender);
                                                                            if (mayaDropDown3 != null) {
                                                                                i = R.id.mother_name_end_separator_view;
                                                                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.mother_name_end_separator_view);
                                                                                if (viewFindChildViewById != null) {
                                                                                    i = R.id.mother_name_start_separator_view;
                                                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.mother_name_start_separator_view);
                                                                                    if (viewFindChildViewById2 != null) {
                                                                                        i = R.id.mothers_maiden_middle_name_checkbox;
                                                                                        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.mothers_maiden_middle_name_checkbox);
                                                                                        if (appCompatCheckBox != null) {
                                                                                            i = R.id.next_button;
                                                                                            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.next_button);
                                                                                            if (button != null) {
                                                                                                i = R.id.scrollable_nested_scroll_view;
                                                                                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_nested_scroll_view);
                                                                                                if (scrollView != null) {
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
                                                                                                                    i = R.id.text_view_identification_description;
                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_identification_description)) != null) {
                                                                                                                        i = R.id.text_view_identification_title;
                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_identification_title)) != null) {
                                                                                                                            i = R.id.user_identification_separator_view;
                                                                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.user_identification_separator_view);
                                                                                                                            if (viewFindChildViewById3 != null) {
                                                                                                                                i = R.id.validate_identification_button;
                                                                                                                                Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.validate_identification_button);
                                                                                                                                if (button2 != null) {
                                                                                                                                    return new T0((ConstraintLayout) viewInflate, constraintLayout, group, mayaProfileInputLayout, mayaProfileInputLayout2, mayaProfileInputLayout3, mayaProfileInputLayout4, mayaProfileInputLayout5, mayaProfileInputLayout6, mayaProfileInputLayout7, mayaProfileInputLayout8, mayaDropDown, mayaDropDown2, mayaDropDown3, viewFindChildViewById, viewFindChildViewById2, appCompatCheckBox, button, scrollView, textView, textView2, viewFindChildViewById3, button2);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bt9Ps").concat(viewInflate.getResources().getResourceName(i)));
    }
}
