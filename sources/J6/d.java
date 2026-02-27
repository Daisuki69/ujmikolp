package J6;

import N5.C0441c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardFormFragment;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.j;
import w.C2360b;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MayaCashInViaCardFormFragment f2425b;
    public final LayoutInflater c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2426d;

    public d(Context context, List mDynamicAmounts, MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment) {
        j.g(mDynamicAmounts, "mDynamicAmounts");
        this.f2424a = mDynamicAmounts;
        this.f2425b = mayaCashInViaCardFormFragment;
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.c = (LayoutInflater) systemService;
        this.f2426d = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f2424a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        M6.f holder = (M6.f) viewHolder;
        j.g(holder, "holder");
        int iIntValue = ((Number) this.f2424a.get(i)).intValue();
        C2360b c2360b = holder.c;
        c2360b.getClass();
        ((M6.f) c2360b.f20516b).f3105b.setText(String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1)));
        M6.e eVar = new M6.e(holder, i, 0);
        AppCompatRadioButton appCompatRadioButton = holder.f3105b;
        appCompatRadioButton.setOnClickListener(eVar);
        if (this.f2426d == i) {
            appCompatRadioButton.setChecked(true);
        } else {
            appCompatRadioButton.setChecked(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewInflate = this.c.inflate(R.layout.maya_view_holder_cash_in_dynamic_amount, parent, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) viewInflate;
        return new M6.f(new C0441c(appCompatRadioButton, appCompatRadioButton, 11), this);
    }
}
