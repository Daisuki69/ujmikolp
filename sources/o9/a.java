package O9;

import N5.s1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.domain.model.CreditTransactionItem;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewMayaCreditFragment f4764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4765b;
    public final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f4766d;

    public a(Context context, NewMayaCreditFragment newMayaCreditFragment, boolean z4) {
        this.f4764a = newMayaCreditFragment;
        this.f4765b = z4;
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f4766d = (LayoutInflater) systemService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        j.g(holder, "holder");
        Object obj = this.c.get(i);
        j.e(obj, "null cannot be cast to non-null type com.paymaya.domain.model.CreditTransactionItem");
        ((S9.b) holder).D((CreditTransactionItem) obj, true, this.f4765b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        return new S9.b(s1.a(this.f4766d, parent), this.f4764a);
    }
}
