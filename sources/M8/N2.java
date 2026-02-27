package M8;

import N5.C0490y0;
import N5.C0492z0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class N2 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N2 f3203a = new N2(3, C0490y0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycUploadPhilsysIdBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_upload_philsys_id, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.layout_content;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_content);
        if (viewFindChildViewById != null) {
            int i4 = R.id.button_continue;
            Button button = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_continue);
            if (button != null) {
                i4 = R.id.button_philsys_back_add_file;
                Button button2 = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_philsys_back_add_file);
                if (button2 != null) {
                    i4 = R.id.button_philsys_front_add_file;
                    Button button3 = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_philsys_front_add_file);
                    if (button3 != null) {
                        i4 = R.id.button_replace_back_photo;
                        Button button4 = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_replace_back_photo);
                        if (button4 != null) {
                            i4 = R.id.button_replace_front_photo;
                            Button button5 = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_replace_front_photo);
                            if (button5 != null) {
                                i4 = R.id.constraint_layout_philsys_back_id_container;
                                if (((ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_layout_philsys_back_id_container)) != null) {
                                    i4 = R.id.constraint_layout_philsys_front_id_container;
                                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_layout_philsys_front_id_container)) != null) {
                                        i4 = R.id.image_view_philsys_id_back;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_philsys_id_back);
                                        if (imageView != null) {
                                            i4 = R.id.image_view_philsys_id_front;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_philsys_id_front);
                                            if (imageView2 != null) {
                                                i4 = R.id.linear_layout_philsys_back_id_container;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.linear_layout_philsys_back_id_container);
                                                if (linearLayout != null) {
                                                    i4 = R.id.linear_layout_philsys_container;
                                                    if (((LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.linear_layout_philsys_container)) != null) {
                                                        i4 = R.id.linear_layout_philsys_front_id_container;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.linear_layout_philsys_front_id_container);
                                                        if (linearLayout2 != null) {
                                                            i4 = R.id.nested_scroll_view;
                                                            if (((NestedScrollView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.nested_scroll_view)) != null) {
                                                                i4 = R.id.progress_bar_upload_philsys_back;
                                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewFindChildViewById, R.id.progress_bar_upload_philsys_back);
                                                                if (progressBar != null) {
                                                                    i4 = R.id.progress_bar_upload_philsys_front;
                                                                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(viewFindChildViewById, R.id.progress_bar_upload_philsys_front);
                                                                    if (progressBar2 != null) {
                                                                        i4 = R.id.text_view_document_facing_up_emoji_back;
                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_document_facing_up_emoji_back);
                                                                        if (textView != null) {
                                                                            i4 = R.id.text_view_document_facing_up_emoji_front;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_document_facing_up_emoji_front);
                                                                            if (textView2 != null) {
                                                                                i4 = R.id.text_view_philsys_back_section_header;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_philsys_back_section_header)) != null) {
                                                                                    i4 = R.id.text_view_philsys_back_upload_file_description;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_philsys_back_upload_file_description);
                                                                                    if (textView3 != null) {
                                                                                        i4 = R.id.text_view_philsys_back_upload_file_title;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_philsys_back_upload_file_title)) != null) {
                                                                                            i4 = R.id.text_view_philsys_front_section_header;
                                                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_philsys_front_section_header)) != null) {
                                                                                                i4 = R.id.text_view_philsys_front_upload_file_description;
                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_philsys_front_upload_file_description);
                                                                                                if (textView4 != null) {
                                                                                                    i4 = R.id.text_view_philsys_front_upload_file_title;
                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_philsys_front_upload_file_title)) != null) {
                                                                                                        i4 = R.id.text_view_upload_philsys_header;
                                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_upload_philsys_header);
                                                                                                        if (textView5 != null) {
                                                                                                            i4 = R.id.text_view_upload_philsys_sub_header;
                                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_upload_philsys_sub_header);
                                                                                                            if (textView6 != null) {
                                                                                                                C0492z0 c0492z0 = new C0492z0((ConstraintLayout) viewFindChildViewById, button, button2, button3, button4, button5, imageView, imageView2, linearLayout, linearLayout2, progressBar, progressBar2, textView, textView2, textView3, textView4, textView5, textView6);
                                                                                                                i = R.id.layout_loading;
                                                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.layout_loading);
                                                                                                                if (viewFindChildViewById2 != null) {
                                                                                                                    return new C0490y0((ConstraintLayout) viewInflate, c0492z0, N5.Z.a(viewFindChildViewById2));
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
            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
