package M8;

import N5.C0482u0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: renamed from: M8.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0410t2 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0410t2 f3372a = new C0410t2(3, C0482u0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycSubmitIdBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_submit_id, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button_continue;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.constraint_layout_secondary_ids_text_view;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_secondary_ids_text_view);
            if (constraintLayout2 != null) {
                i = R.id.group_other_ids;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_other_ids);
                if (group != null) {
                    i = R.id.image_view_other_id_info;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_other_id_info)) != null) {
                        i = R.id.recycler_view_accepted_ids;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_accepted_ids);
                        if (recyclerView != null) {
                            i = R.id.recycler_view_primary_ids;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_primary_ids);
                            if (recyclerView2 != null) {
                                i = R.id.recycler_view_secondary_ids;
                                RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_secondary_ids);
                                if (recyclerView3 != null) {
                                    i = R.id.text_view_accepted_ids;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_accepted_ids);
                                    if (textView != null) {
                                        i = R.id.text_view_header;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                            i = R.id.text_view_header_subtext;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_subtext)) != null) {
                                                i = R.id.text_view_primary_ids;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_primary_ids);
                                                if (textView2 != null) {
                                                    i = R.id.text_view_secondary_ids;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_secondary_ids);
                                                    if (textView3 != null) {
                                                        i = R.id.text_view_select_other_id_documents_message;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_select_other_id_documents_message)) != null) {
                                                            i = R.id.text_view_select_other_id_message;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_select_other_id_message)) != null) {
                                                                i = R.id.text_view_show_more_ids_title;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_show_more_ids_title);
                                                                if (textView4 != null) {
                                                                    i = R.id.text_view_two_ids_are_required;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_two_ids_are_required);
                                                                    if (textView5 != null) {
                                                                        return new C0482u0(constraintLayout, button, constraintLayout, constraintLayout2, group, recyclerView, recyclerView2, recyclerView3, textView, textView2, textView3, textView4, textView5);
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
