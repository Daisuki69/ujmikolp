package M8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;

/* JADX INFO: renamed from: M8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0360h extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0360h f3308a = new C0360h(3, N5.T.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycAdditionalDocumentsBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_additional_documents, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.layout_content;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_content);
        if (viewFindChildViewById != null) {
            int i4 = R.id.button_download_form;
            Button button = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_download_form);
            if (button != null) {
                i4 = R.id.button_next;
                Button button2 = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_next);
                if (button2 != null) {
                    i4 = R.id.constraint_layout_content_container;
                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_layout_content_container)) != null) {
                        i4 = R.id.image_view_birth_certificate;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_birth_certificate);
                        if (imageView != null) {
                            i4 = R.id.image_view_consent_form;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_consent_form);
                            if (imageView2 != null) {
                                i4 = R.id.image_view_parent_id;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_parent_id);
                                if (imageView3 != null) {
                                    i4 = R.id.linear_layout_birth_certificate_container;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.linear_layout_birth_certificate_container);
                                    if (linearLayout != null) {
                                        i4 = R.id.linear_layout_consent_form_container;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.linear_layout_consent_form_container);
                                        if (linearLayout2 != null) {
                                            i4 = R.id.linear_layout_parent_id_container;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.linear_layout_parent_id_container);
                                            if (linearLayout3 != null) {
                                                i4 = R.id.multi_color_text_view_birth_certificate;
                                                MultiColorTextView multiColorTextView = (MultiColorTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.multi_color_text_view_birth_certificate);
                                                if (multiColorTextView != null) {
                                                    i4 = R.id.multi_color_text_view_consent_form;
                                                    MultiColorTextView multiColorTextView2 = (MultiColorTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.multi_color_text_view_consent_form);
                                                    if (multiColorTextView2 != null) {
                                                        i4 = R.id.multi_color_text_view_parent_id;
                                                        MultiColorTextView multiColorTextView3 = (MultiColorTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.multi_color_text_view_parent_id);
                                                        if (multiColorTextView3 != null) {
                                                            i4 = R.id.text_view_birth_certificate_header;
                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_birth_certificate_header)) != null) {
                                                                i4 = R.id.text_view_consent_form_header;
                                                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_consent_form_header)) != null) {
                                                                    i4 = R.id.text_view_consent_form_header_subtext;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_consent_form_header_subtext)) != null) {
                                                                        i4 = R.id.text_view_header;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_header)) != null) {
                                                                            i4 = R.id.text_view_parent_id_header;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_parent_id_header)) != null) {
                                                                                i4 = R.id.text_view_sub_header;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_sub_header)) != null) {
                                                                                    N5.E e = new N5.E((ScrollView) viewFindChildViewById, button, button2, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, multiColorTextView, multiColorTextView2, multiColorTextView3);
                                                                                    i = R.id.layout_loading;
                                                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.layout_loading);
                                                                                    if (viewFindChildViewById2 != null) {
                                                                                        return new N5.T((ConstraintLayout) viewInflate, e, N5.Z.a(viewFindChildViewById2));
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
            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
