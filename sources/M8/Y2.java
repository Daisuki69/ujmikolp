package M8;

import N5.C0450f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.widget.MayaRadioOptionView;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Y2 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y2 f3255a = new Y2(3, N5.A0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycVerifyWithPhilsysBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_verify_with_philsys, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.card_view_birthday;
        if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_birthday)) != null) {
            i = R.id.card_view_national_id_number;
            if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_national_id_number)) != null) {
                i = R.id.checkbox_middle_name;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.checkbox_middle_name);
                if (appCompatCheckBox != null) {
                    i = R.id.layout_buttons;
                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_buttons);
                    if (viewFindChildViewById != null) {
                        C0450f c0450fA = C0450f.a(viewFindChildViewById);
                        i = R.id.linear_container_birthday_input;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_container_birthday_input);
                        if (linearLayout != null) {
                            i = R.id.linear_container_id_number_input;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_container_id_number_input);
                            if (linearLayout2 != null) {
                                i = R.id.linear_container_option_birthday;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_container_option_birthday);
                                if (constraintLayout != null) {
                                    i = R.id.linear_container_option_national_id;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_container_option_national_id);
                                    if (constraintLayout2 != null) {
                                        i = R.id.maya_input_birth_date;
                                        KycMayaInputLayout kycMayaInputLayout = (KycMayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_birth_date);
                                        if (kycMayaInputLayout != null) {
                                            i = R.id.maya_input_first_name;
                                            KycMayaInputLayout kycMayaInputLayout2 = (KycMayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_first_name);
                                            if (kycMayaInputLayout2 != null) {
                                                i = R.id.maya_input_last_name;
                                                KycMayaInputLayout kycMayaInputLayout3 = (KycMayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_last_name);
                                                if (kycMayaInputLayout3 != null) {
                                                    i = R.id.maya_input_middle_name;
                                                    KycMayaInputLayout kycMayaInputLayout4 = (KycMayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_middle_name);
                                                    if (kycMayaInputLayout4 != null) {
                                                        i = R.id.maya_input_national_id_number;
                                                        KycMayaInputLayout kycMayaInputLayout5 = (KycMayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_national_id_number);
                                                        if (kycMayaInputLayout5 != null) {
                                                            i = R.id.maya_input_suffix;
                                                            KycMayaDropDown kycMayaDropDown = (KycMayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_suffix);
                                                            if (kycMayaDropDown != null) {
                                                                i = R.id.nested_scroll_view_form_container;
                                                                if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nested_scroll_view_form_container)) != null) {
                                                                    i = R.id.radio_option_birthday;
                                                                    MayaRadioOptionView mayaRadioOptionView = (MayaRadioOptionView) ViewBindings.findChildViewById(viewInflate, R.id.radio_option_birthday);
                                                                    if (mayaRadioOptionView != null) {
                                                                        i = R.id.radio_option_philsys_number;
                                                                        MayaRadioOptionView mayaRadioOptionView2 = (MayaRadioOptionView) ViewBindings.findChildViewById(viewInflate, R.id.radio_option_philsys_number);
                                                                        if (mayaRadioOptionView2 != null) {
                                                                            i = R.id.text_view_birthday_section_description;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_birthday_section_description)) != null) {
                                                                                i = R.id.text_view_birthday_section_title;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_birthday_section_title)) != null) {
                                                                                    i = R.id.text_view_header;
                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                                                                        i = R.id.text_view_national_id_section_description;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_national_id_section_description)) != null) {
                                                                                            i = R.id.text_view_national_id_section_title;
                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_national_id_section_title)) != null) {
                                                                                                return new N5.A0((ConstraintLayout) viewInflate, appCompatCheckBox, c0450fA, linearLayout, linearLayout2, constraintLayout, constraintLayout2, kycMayaInputLayout, kycMayaInputLayout2, kycMayaInputLayout3, kycMayaInputLayout4, kycMayaInputLayout5, kycMayaDropDown, mayaRadioOptionView, mayaRadioOptionView2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
