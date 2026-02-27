package M8;

import N5.C0437a1;
import N5.C0488x0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class I2 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I2 f3178a = new I2(3, C0488x0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycTakeVideoSelfieBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_take_video_selfie, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.kyc_take_video_selfie_button_continue;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.kyc_take_video_selfie_button_continue);
        if (button != null) {
            i = R.id.layout_kyc_take_selfie_tips;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_kyc_take_selfie_tips);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewFindChildViewById;
                int i4 = R.id.guideline_center;
                if (((Guideline) ViewBindings.findChildViewById(viewFindChildViewById, R.id.guideline_center)) != null) {
                    i4 = R.id.image_view_selfie;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_selfie);
                    if (imageView != null) {
                        i4 = R.id.text_view_description;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_description);
                        if (textView != null) {
                            i4 = R.id.text_view_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_title);
                            if (textView2 != null) {
                                C0437a1 c0437a1 = new C0437a1(constraintLayout, constraintLayout, imageView, textView, textView2);
                                i = R.id.layout_kyc_take_video_tips;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.layout_kyc_take_video_tips);
                                if (viewFindChildViewById2 != null) {
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindChildViewById2;
                                    int i6 = R.id.kyc_take_video_selfie_image_view_information;
                                    if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.kyc_take_video_selfie_image_view_information)) != null) {
                                        i6 = R.id.kyc_take_video_selfie_linear_layout;
                                        if (((LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.kyc_take_video_selfie_linear_layout)) != null) {
                                            i6 = R.id.kyc_take_video_selfie_recycler_view;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.kyc_take_video_selfie_recycler_view);
                                            if (recyclerView != null) {
                                                i6 = R.id.kyc_take_video_selfie_text_view_header;
                                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.kyc_take_video_selfie_text_view_header)) != null) {
                                                    i6 = R.id.kyc_take_video_selfie_text_view_header_subtext;
                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.kyc_take_video_selfie_text_view_header_subtext)) != null) {
                                                        i6 = R.id.kyc_take_video_selfie_text_view_information_text;
                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.kyc_take_video_selfie_text_view_information_text)) != null) {
                                                            return new C0488x0((ConstraintLayout) viewInflate, button, c0437a1, new N5.Q0(constraintLayout2, constraintLayout2, recyclerView, 1));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById2.getResources().getResourceName(i6)));
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
