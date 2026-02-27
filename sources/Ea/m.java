package ea;

import N5.C0452f1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.domain.model.UIValue;
import com.paymaya.mayaui.paybills.view.dialog.impl.MayaSpinnerBottomSheetDialogFragment;
import dOYHB6.tiZVw8.numX49;
import ja.C1678g;
import w5.C2383a;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaSpinnerBottomSheetDialogFragment f16623a;

    public m(MayaSpinnerBottomSheetDialogFragment mayaSpinnerBottomSheetDialogFragment) {
        super(new C2383a());
        this.f16623a = mayaSpinnerBottomSheetDialogFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1678g c1678g = (C1678g) viewHolder;
        kotlin.jvm.internal.j.g(c1678g, numX49.tnTj78("bdWw"));
        Object item = getItem(i);
        c1678g.c = item;
        c1678g.f17733a.c.setText(item instanceof String ? (String) item : item instanceof UIValue ? ((UIValue) item).display() : String.valueOf(item));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("bdWc"));
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.maya_view_holder_spinner_bottom_sheet, viewGroup, false);
        if (viewInflate == null) {
            throw new NullPointerException(numX49.tnTj78("bdWm"));
        }
        TextView textView = (TextView) viewInflate;
        return new C1678g(new C0452f1(textView, textView, 3), this.f16623a);
    }
}
