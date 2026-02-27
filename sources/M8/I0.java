package M8;

import N5.C0442c0;
import N5.C0466m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.widget.MayaRadioGroupView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class I0 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I0 f3176a = new I0(3, C0442c0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycDosriBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_dosri, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.layout_form;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_form);
        if (viewFindChildViewById != null) {
            int i4 = R.id.button_continue_action;
            Button button = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_continue_action);
            if (button != null) {
                i4 = R.id.card_view_maya_job_roles;
                if (((CardView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.card_view_maya_job_roles)) != null) {
                    i4 = R.id.constraint_layout_form_container;
                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_layout_form_container)) != null) {
                        i4 = R.id.guideline_end;
                        if (((Guideline) ViewBindings.findChildViewById(viewFindChildViewById, R.id.guideline_end)) != null) {
                            i4 = R.id.guideline_start;
                            if (((Guideline) ViewBindings.findChildViewById(viewFindChildViewById, R.id.guideline_start)) != null) {
                                i4 = R.id.linear_layout_relatives_container;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.linear_layout_relatives_container);
                                if (linearLayout != null) {
                                    NestedScrollView nestedScrollView = (NestedScrollView) viewFindChildViewById;
                                    i4 = R.id.radio_group_maya_dosri_types;
                                    MayaRadioGroupView mayaRadioGroupView = (MayaRadioGroupView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.radio_group_maya_dosri_types);
                                    if (mayaRadioGroupView != null) {
                                        i4 = R.id.text_view_add_relative;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_add_relative);
                                        if (textView != null) {
                                            i4 = R.id.text_view_form_header;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_form_header);
                                            if (textView2 != null) {
                                                i4 = R.id.text_view_form_sub_header;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_form_sub_header);
                                                if (textView3 != null) {
                                                    i4 = R.id.view_divider;
                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_divider);
                                                    if (viewFindChildViewById2 != null) {
                                                        C0466m c0466m = new C0466m((ViewGroup) nestedScrollView, (View) button, (View) linearLayout, (View) mayaRadioGroupView, (View) textView, (View) textView2, (View) textView3, viewFindChildViewById2, 9);
                                                        i = R.id.layout_loading;
                                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.layout_loading);
                                                        if (viewFindChildViewById3 != null) {
                                                            N5.Z.a(viewFindChildViewById3);
                                                            return new C0442c0((FrameLayout) viewInflate, c0466m);
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
