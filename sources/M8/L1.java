package M8;

import N5.C0462k;
import N5.C0469n0;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class L1 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L1 f3193a = new L1(3, C0469n0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycSimpleCaptureBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_simple_capture, viewGroup, false);
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
                    i4 = R.id.image_view_kyc_information_icon;
                    if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_kyc_information_icon)) != null) {
                        i4 = R.id.kyc_simple_capture_app_bar_layout;
                        if (((AppBarLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.kyc_simple_capture_app_bar_layout)) != null) {
                            i4 = R.id.maya_toolbar_view;
                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_toolbar_view);
                            if (toolbar != null) {
                                i4 = R.id.right_inset_space;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.right_inset_space);
                                if (viewFindChildViewById2 != null) {
                                    i4 = R.id.steps_indicator_text_view;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.steps_indicator_text_view);
                                    if (textView != null) {
                                        i4 = R.id.surface_view_preview;
                                        SurfaceView surfaceView = (SurfaceView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.surface_view_preview);
                                        if (surfaceView != null) {
                                            i4 = R.id.text_view_capture_photo;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_capture_photo);
                                            if (textView2 != null) {
                                                i4 = R.id.text_view_capture_tips;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_capture_tips);
                                                if (textView3 != null) {
                                                    i4 = R.id.text_view_position_title;
                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_position_title)) != null) {
                                                        i4 = R.id.toolbar_content_constraint_layout;
                                                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.toolbar_content_constraint_layout)) != null) {
                                                            i4 = R.id.toolbar_title_text_view;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.toolbar_title_text_view);
                                                            if (textView4 != null) {
                                                                i4 = R.id.view_camera_frame;
                                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_camera_frame);
                                                                if (viewFindChildViewById3 != null) {
                                                                    C0462k c0462k = new C0462k((ConstraintLayout) viewFindChildViewById, constraintLayout, toolbar, viewFindChildViewById2, textView, surfaceView, textView2, textView3, textView4, viewFindChildViewById3);
                                                                    i = R.id.layout_camera_permission;
                                                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.layout_camera_permission);
                                                                    if (viewFindChildViewById4 != null) {
                                                                        return new C0469n0((FrameLayout) viewInflate, c0462k, N5.D0.a(viewFindChildViewById4));
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
