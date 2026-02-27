package M8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;

/* JADX INFO: renamed from: M8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0407t extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0407t f3369a = new C0407t(3, N5.U.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycAmlcCertificateBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_amlc_certificate, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button_amlc_checkpoint_certificate_add_file;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_amlc_checkpoint_certificate_add_file);
        if (button != null) {
            i = R.id.button_submit;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_submit);
            if (button2 != null) {
                i = R.id.constraint_layout_amlc_checkpoint_certificate_confirm_upload_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_amlc_checkpoint_certificate_confirm_upload_container);
                if (constraintLayout != null) {
                    i = R.id.constraint_layout_amlc_checkpoint_certificate_upload_container;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_amlc_checkpoint_certificate_upload_container);
                    if (constraintLayout2 != null) {
                        i = R.id.image_view_remove_selected_file_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_remove_selected_file_icon);
                        if (imageView != null) {
                            i = R.id.linear_layout_amlc_certificate_upload_container;
                            if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_amlc_certificate_upload_container)) != null) {
                                i = R.id.maya_dropdown_amlc_certificate_type;
                                KycMayaDropDown kycMayaDropDown = (KycMayaDropDown) ViewBindings.findChildViewById(viewInflate, R.id.maya_dropdown_amlc_certificate_type);
                                if (kycMayaDropDown != null) {
                                    i = R.id.maya_input_certificate_expiry_date;
                                    KycMayaInputLayout kycMayaInputLayout = (KycMayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_certificate_expiry_date);
                                    if (kycMayaInputLayout != null) {
                                        i = R.id.nested_scroll_view_form_container;
                                        if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nested_scroll_view_form_container)) != null) {
                                            i = R.id.text_view_amlc_checkpoint_certificate_upload_file_description;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_amlc_checkpoint_certificate_upload_file_description)) != null) {
                                                i = R.id.text_view_amlc_checkpoint_certificate_upload_file_title;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_amlc_checkpoint_certificate_upload_file_title)) != null) {
                                                    i = R.id.text_view_amlc_checkpoint_certificate_uploaded_file_selected_header;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_amlc_checkpoint_certificate_uploaded_file_selected_header)) != null) {
                                                        i = R.id.text_view_document_facing_up_emoji_front;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_document_facing_up_emoji_front)) != null) {
                                                            i = R.id.text_view_document_file_selected_graphic;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_document_file_selected_graphic)) != null) {
                                                                i = R.id.text_view_file_selected_label;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_file_selected_label);
                                                                if (textView != null) {
                                                                    i = R.id.text_view_header;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                                                        i = R.id.text_view_sub_header;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_sub_header)) != null) {
                                                                            return new N5.U((ConstraintLayout) viewInflate, button, button2, constraintLayout, constraintLayout2, imageView, kycMayaDropDown, kycMayaInputLayout, textView);
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
