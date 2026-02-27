package M8;

import N5.C0475q0;
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

/* JADX INFO: renamed from: M8.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0375k2 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0375k2 f3328a = new C0375k2(3, C0475q0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycSsneSwornStatementBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_ssne_sworn_statement, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button_ssne_sworn_statement_add_file;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_ssne_sworn_statement_add_file);
        if (button != null) {
            i = R.id.button_submit;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_submit);
            if (button2 != null) {
                i = R.id.constraint_layout_ssne_sworn_statement_confirm_upload_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_ssne_sworn_statement_confirm_upload_container);
                if (constraintLayout != null) {
                    i = R.id.constraint_layout_ssne_sworn_statement_upload_container;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_ssne_sworn_statement_upload_container);
                    if (constraintLayout2 != null) {
                        i = R.id.image_view_remove_selected_file_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_remove_selected_file_icon);
                        if (imageView != null) {
                            i = R.id.linear_layout_ssne_sworn_statement_upload_container;
                            if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_ssne_sworn_statement_upload_container)) != null) {
                                i = R.id.nested_scroll_view_form_container;
                                if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nested_scroll_view_form_container)) != null) {
                                    i = R.id.text_view_document_facing_up_emoji_front;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_document_facing_up_emoji_front)) != null) {
                                        i = R.id.text_view_document_file_selected_graphic;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_document_file_selected_graphic)) != null) {
                                            i = R.id.text_view_file_selected_label;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_file_selected_label);
                                            if (textView != null) {
                                                i = R.id.text_view_header;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                                    i = R.id.text_view_ssne_sworn_statement_file_selected_header;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_ssne_sworn_statement_file_selected_header)) != null) {
                                                        i = R.id.text_view_ssne_sworn_statement_upload_file_description;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_ssne_sworn_statement_upload_file_description)) != null) {
                                                            i = R.id.text_view_ssne_sworn_statement_upload_file_title;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_ssne_sworn_statement_upload_file_title)) != null) {
                                                                i = R.id.text_view_sub_header;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_sub_header)) != null) {
                                                                    return new C0475q0((ConstraintLayout) viewInflate, button, button2, constraintLayout, constraintLayout2, imageView, textView);
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
