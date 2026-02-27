package M8;

import N5.C0473p0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Z1 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z1 f3259a = new Z1(3, C0473p0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycSimpleCaptureV3Binding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_simple_capture_v3, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.layout_camera;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_camera);
        if (viewFindChildViewById != null) {
            int i4 = R.id.constraint_layout_take_id_photo;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_layout_take_id_photo)) != null) {
                i4 = R.id.constraint_view_tips_for_capturing;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_view_tips_for_capturing);
                if (constraintLayout != null) {
                    i4 = R.id.image_view_capture_photo;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_capture_photo);
                    if (imageView != null) {
                        i4 = R.id.image_view_tap_area;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_tap_area);
                        if (imageView2 != null) {
                            i4 = R.id.kyc_simple_capture_app_bar_layout;
                            if (((AppBarLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.kyc_simple_capture_app_bar_layout)) != null) {
                                i4 = R.id.linear_layout_view_tips_for_capturing;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.linear_layout_view_tips_for_capturing);
                                if (linearLayout != null) {
                                    i4 = R.id.maya_toolbar_view;
                                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_toolbar_view);
                                    if (toolbar != null) {
                                        i4 = R.id.preview_view;
                                        PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.preview_view);
                                        if (previewView != null) {
                                            i4 = R.id.right_inset_space;
                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.right_inset_space);
                                            if (viewFindChildViewById2 != null) {
                                                i4 = R.id.steps_indicator_text_view;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.steps_indicator_text_view);
                                                if (textView != null) {
                                                    i4 = R.id.text_view_capture_tips;
                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_capture_tips)) != null) {
                                                        i4 = R.id.text_view_document_title;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_document_title);
                                                        if (textView2 != null) {
                                                            i4 = R.id.text_view_feedback_label;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_feedback_label);
                                                            if (textView3 != null) {
                                                                i4 = R.id.text_view_focusing_label;
                                                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_focusing_label)) != null) {
                                                                    i4 = R.id.text_view_position_title;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_position_title);
                                                                    if (textView4 != null) {
                                                                        i4 = R.id.toolbar_content_constraint_layout;
                                                                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.toolbar_content_constraint_layout)) != null) {
                                                                            i4 = R.id.toolbar_title_text_view;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.toolbar_title_text_view)) != null) {
                                                                                i4 = R.id.view_background_bottom;
                                                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_background_bottom);
                                                                                if (viewFindChildViewById3 != null) {
                                                                                    i4 = R.id.view_background_top;
                                                                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_background_top);
                                                                                    if (viewFindChildViewById4 != null) {
                                                                                        i4 = R.id.view_camera_frame;
                                                                                        View viewFindChildViewById5 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_camera_frame);
                                                                                        if (viewFindChildViewById5 != null) {
                                                                                            N5.M m = new N5.M((ConstraintLayout) viewFindChildViewById, constraintLayout, imageView, imageView2, linearLayout, toolbar, previewView, viewFindChildViewById2, textView, textView2, textView3, textView4, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5);
                                                                                            i = R.id.layout_camera_permission;
                                                                                            View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.layout_camera_permission);
                                                                                            if (viewFindChildViewById6 != null) {
                                                                                                return new C0473p0((FrameLayout) viewInflate, m, N5.D0.a(viewFindChildViewById6));
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
