package M8;

import N5.C0479t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: renamed from: M8.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0363h2 extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0363h2 f3311a = new C0363h2(3, C0479t.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaBottomSheetDialogFragmentKycSingleSelectionBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_bottom_sheet_dialog_fragment_kyc_single_selection, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.edit_text_search_field;
        AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(viewInflate, R.id.edit_text_search_field);
        if (appCompatEditText != null) {
            i = R.id.ll_no_result_found;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_no_result_found);
            if (linearLayout != null) {
                i = R.id.recycler_view_item_list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_item_list);
                if (recyclerView != null) {
                    i = R.id.text_view_header;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header);
                    if (textView != null) {
                        i = R.id.text_view_sub_header;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_sub_header);
                        if (textView2 != null) {
                            return new C0479t((LinearLayout) viewInflate, appCompatEditText, linearLayout, recyclerView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
