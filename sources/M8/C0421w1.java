package M8;

import N5.C0450f;
import N5.C0461j0;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: renamed from: M8.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0421w1 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0421w1 f3382a = new C0421w1(3, C0461j0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycMinorTakeAPhotoBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_minor_take_a_photo, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.layout_camera;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_camera);
        if (viewFindChildViewById != null) {
            int i4 = R.id.image_view_capture_photo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_capture_photo);
            if (imageView != null) {
                i4 = R.id.linear_layout_user_controls_container;
                if (((LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.linear_layout_user_controls_container)) != null) {
                    i4 = R.id.surface_view_preview;
                    SurfaceView surfaceView = (SurfaceView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.surface_view_preview);
                    if (surfaceView != null) {
                        i4 = R.id.text_view_description;
                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_description)) != null) {
                            i4 = R.id.text_view_title;
                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_title)) != null) {
                                C0450f c0450f = new C0450f((ViewGroup) viewFindChildViewById, (View) imageView, (View) surfaceView, 9);
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.layout_camera_permission);
                                if (viewFindChildViewById2 != null) {
                                    return new C0461j0((FrameLayout) viewInflate, c0450f, N5.D0.a(viewFindChildViewById2));
                                }
                                i = R.id.layout_camera_permission;
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
