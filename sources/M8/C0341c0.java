package M8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import com.paymaya.mayaui.kyczoloz.view.widget.ExpandableBenefitsRecyclerView;

/* JADX INFO: renamed from: M8.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0341c0 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0341c0 f3277a = new C0341c0(3, N5.Y.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycCompleteYourMayaExperienceBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_complete_your_maya_experience, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.linear_layout_data_privacy;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_data_privacy);
        if (linearLayout != null) {
            i = R.id.linear_layout_get_identified_easier;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_get_identified_easier);
            if (linearLayout2 != null) {
                i = R.id.maya_kyc_accepted_ids_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_accepted_ids_text_view);
                if (textView != null) {
                    i = R.id.maya_kyc_bottom_button;
                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_bottom_button);
                    if (button != null) {
                        i = R.id.maya_kyc_expandable_benefits_recycler_view;
                        ExpandableBenefitsRecyclerView expandableBenefitsRecyclerView = (ExpandableBenefitsRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_expandable_benefits_recycler_view);
                        if (expandableBenefitsRecyclerView != null) {
                            i = R.id.maya_kyc_first_step_content_text_view;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_first_step_content_text_view)) != null) {
                                i = R.id.maya_kyc_first_step_text_view;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_first_step_text_view)) != null) {
                                    i = R.id.maya_kyc_first_to_second_dotted_image_view;
                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_first_to_second_dotted_image_view)) != null) {
                                        i = R.id.maya_kyc_header_multi_color_text_view;
                                        if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_header_multi_color_text_view)) != null) {
                                            i = R.id.maya_kyc_information_image_view;
                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_information_image_view)) != null) {
                                                i = R.id.maya_kyc_note_multi_color_text_view;
                                                if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_note_multi_color_text_view)) != null) {
                                                    i = R.id.maya_kyc_second_step_content_text_view;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_second_step_content_text_view)) != null) {
                                                        i = R.id.maya_kyc_second_step_text_view;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_second_step_text_view)) != null) {
                                                            i = R.id.maya_kyc_second_to_third_dotted_image_view;
                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_second_to_third_dotted_image_view)) != null) {
                                                                i = R.id.maya_kyc_steps_information_text_view;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_steps_information_text_view)) != null) {
                                                                    i = R.id.maya_kyc_sub_header_text_view;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_sub_header_text_view);
                                                                    if (textView2 != null) {
                                                                        i = R.id.maya_kyc_third_step_content_text_view;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_third_step_content_text_view)) != null) {
                                                                            i = R.id.maya_kyc_third_step_text_view;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_third_step_text_view)) != null) {
                                                                                i = R.id.multi_color_text_view_data_privacy;
                                                                                if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.multi_color_text_view_data_privacy)) != null) {
                                                                                    i = R.id.multi_color_text_view_get_identified_easier_information;
                                                                                    if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.multi_color_text_view_get_identified_easier_information)) != null) {
                                                                                        i = R.id.text_view_get_data_privacy_header;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_get_data_privacy_header)) != null) {
                                                                                            i = R.id.text_view_get_identified_easier_header;
                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_get_identified_easier_header)) != null) {
                                                                                                i = R.id.textview_do_it_later;
                                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.textview_do_it_later);
                                                                                                if (textView3 != null) {
                                                                                                    i = R.id.view_divider_identified;
                                                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_identified);
                                                                                                    if (viewFindChildViewById != null) {
                                                                                                        i = R.id.view_divider_privacy;
                                                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_privacy);
                                                                                                        if (viewFindChildViewById2 != null) {
                                                                                                            i = R.id.view_divider_steps;
                                                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_steps);
                                                                                                            if (viewFindChildViewById3 != null) {
                                                                                                                return new N5.Y((NestedScrollView) viewInflate, linearLayout, linearLayout2, textView, button, expandableBenefitsRecyclerView, textView2, textView3, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
