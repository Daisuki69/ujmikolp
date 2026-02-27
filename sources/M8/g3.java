package M8;

import N5.C0464l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g3 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g3 f3307a = new g3(3, N5.C0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycWorkDetailsBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_work_details, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.container_constraintlayout_dnfbp_warning;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.container_constraintlayout_dnfbp_warning);
        if (constraintLayout != null) {
            i = R.id.container_dynamic_questions;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.container_dynamic_questions);
            if (linearLayout != null) {
                i = R.id.container_linearlayout_question;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.container_linearlayout_question);
                if (linearLayout2 != null) {
                    i = R.id.dnfbp_warning_text_view;
                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.dnfbp_warning_text_view);
                    if (htmlTextView != null) {
                        i = R.id.layout_button;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_button);
                        if (viewFindChildViewById != null) {
                            C0464l c0464lA = C0464l.a(viewFindChildViewById);
                            i = R.id.maya_input_job_title;
                            KycMayaDropDown kycMayaDropDown = (KycMayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_job_title);
                            if (kycMayaDropDown != null) {
                                i = R.id.maya_input_name_of_company;
                                KycMayaInputLayout kycMayaInputLayout = (KycMayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_name_of_company);
                                if (kycMayaInputLayout != null) {
                                    i = R.id.maya_input_nature_of_work;
                                    KycMayaDropDown kycMayaDropDown2 = (KycMayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_nature_of_work);
                                    if (kycMayaDropDown2 != null) {
                                        i = R.id.maya_input_source_of_income;
                                        KycMayaDropDown kycMayaDropDown3 = (KycMayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_source_of_income);
                                        if (kycMayaDropDown3 != null) {
                                            i = R.id.nested_scroll_view_form_container;
                                            if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nested_scroll_view_form_container)) != null) {
                                                i = R.id.text_view_header;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                                    i = R.id.text_view_sub_header;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_sub_header)) != null) {
                                                        i = R.id.warning_icon;
                                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.warning_icon)) != null) {
                                                            return new N5.C0((ConstraintLayout) viewInflate, constraintLayout, linearLayout, linearLayout2, htmlTextView, c0464lA, kycMayaDropDown, kycMayaInputLayout, kycMayaDropDown2, kycMayaDropDown3);
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
