package M8;

import N5.C0457h0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;

/* JADX INFO: renamed from: M8.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0353f0 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0353f0 f3296a = new C0353f0(3, C0457h0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycIntroBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_intro, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.image_view_maintenance;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_maintenance);
        if (imageView != null) {
            i = R.id.linear_layout_bottom_container;
            if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_bottom_container)) != null) {
                i = R.id.linear_layout_get_identified_easier;
                if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_get_identified_easier)) != null) {
                    i = R.id.maya_kyc_bottom_button;
                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_bottom_button);
                    if (button != null) {
                        i = R.id.maya_kyc_header_multi_color_text_view;
                        MultiColorTextView multiColorTextView = (MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_header_multi_color_text_view);
                        if (multiColorTextView != null) {
                            i = R.id.maya_kyc_sub_header_text_view;
                            HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_sub_header_text_view);
                            if (htmlTextView != null) {
                                i = R.id.nested_scroll_view;
                                if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nested_scroll_view)) != null) {
                                    i = R.id.recyclerUpgradeSteps;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recyclerUpgradeSteps);
                                    if (recyclerView != null) {
                                        i = R.id.text_view_invite_code;
                                        HtmlTextView htmlTextView2 = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_invite_code);
                                        if (htmlTextView2 != null) {
                                            i = R.id.text_view_safe_transaction_description;
                                            HtmlTextView htmlTextView3 = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_safe_transaction_description);
                                            if (htmlTextView3 != null) {
                                                i = R.id.text_view_safe_transaction_header;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_safe_transaction_header);
                                                if (textView != null) {
                                                    i = R.id.text_view_unlock_everything_details;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_unlock_everything_details);
                                                    if (textView2 != null) {
                                                        i = R.id.text_view_unlock_everything_header;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_unlock_everything_header);
                                                        if (textView3 != null) {
                                                            i = R.id.text_view_upgrade_header;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_upgrade_header);
                                                            if (textView4 != null) {
                                                                i = R.id.text_view_upgrade_sub_header;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_upgrade_sub_header);
                                                                if (textView5 != null) {
                                                                    i = R.id.textview_do_it_later;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.textview_do_it_later);
                                                                    if (textView6 != null) {
                                                                        i = R.id.view_divider_privacy;
                                                                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_privacy);
                                                                        if (viewFindChildViewById != null) {
                                                                            return new C0457h0((ConstraintLayout) viewInflate, imageView, button, multiColorTextView, htmlTextView, recyclerView, htmlTextView2, htmlTextView3, textView, textView2, textView3, textView4, textView5, textView6, viewFindChildViewById);
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
