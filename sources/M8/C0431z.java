package M8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInfoSection;

/* JADX INFO: renamed from: M8.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0431z extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0431z f3393a = new C0431z(3, N5.V.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycAmlcUploadDocumentsBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_amlc_upload_documents, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button_cancel;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_cancel);
        if (button != null) {
            i = R.id.button_confirm;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_confirm);
            if (button2 != null) {
                i = R.id.constraint_layout_steps_container;
                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_steps_container)) != null) {
                    i = R.id.image_view_upload;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_upload)) != null) {
                        i = R.id.maya_info_section;
                        KycMayaInfoSection kycMayaInfoSection = (KycMayaInfoSection) ViewBindings.findChildViewById(viewInflate, R.id.maya_info_section);
                        if (kycMayaInfoSection != null) {
                            i = R.id.maya_kyc_first_step_content_text_view;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_first_step_content_text_view)) != null) {
                                i = R.id.maya_kyc_first_step_text_view;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_first_step_text_view)) != null) {
                                    i = R.id.maya_kyc_first_to_second_dotted_image_view;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_first_to_second_dotted_image_view);
                                    if (viewFindChildViewById != null) {
                                        i = R.id.maya_kyc_second_step_content_text_view;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_second_step_content_text_view)) != null) {
                                            i = R.id.maya_kyc_second_step_text_view;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_second_step_text_view)) != null) {
                                                i = R.id.maya_kyc_second_to_third_dotted_image_view;
                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_second_to_third_dotted_image_view);
                                                if (viewFindChildViewById2 != null) {
                                                    i = R.id.maya_kyc_third_step_content_text_view;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_third_step_content_text_view)) != null) {
                                                        i = R.id.maya_kyc_third_step_text_view;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_third_step_text_view)) != null) {
                                                            i = R.id.nested_scroll_view_form_container;
                                                            if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nested_scroll_view_form_container)) != null) {
                                                                i = R.id.text_view_header;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                                                    i = R.id.text_view_next_step_header;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_next_step_header)) != null) {
                                                                        i = R.id.text_view_sub_header;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_sub_header)) != null) {
                                                                            i = R.id.text_view_why_needed;
                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_why_needed);
                                                                            if (textView != null) {
                                                                                return new N5.V((ConstraintLayout) viewInflate, button, button2, kycMayaInfoSection, viewFindChildViewById, viewFindChildViewById2, textView);
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
