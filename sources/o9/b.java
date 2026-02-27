package O9;

import J7.k;
import N5.C0453g;
import N5.s1;
import We.s;
import Z6.e;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.domain.model.CreditTransactionItem;
import com.paymaya.domain.model.DateHeader;
import com.paymaya.domain.model.Dated;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransactionListFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.Adapter implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MayaCreditTransactionListFragment f4768b;
    public final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4769d;
    public final LayoutInflater e;

    public b(Context context, MayaCreditTransactionListFragment mayaCreditTransactionListFragment) {
        this.f4767a = context;
        this.f4768b = mayaCreditTransactionListFragment;
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.e = (LayoutInflater) systemService;
    }

    @Override // J7.k
    public final boolean a(int i) {
        if (i >= this.c.size()) {
            return false;
        }
        int itemViewType = getItemViewType(i);
        return itemViewType == 0 || itemViewType == 1 || itemViewType == 2;
    }

    @Override // J7.k
    public final void b(int i, View view) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            View viewFindViewById = view.findViewById(R.id.text_view_date);
            j.e(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById).setText(((Dated) arrayList.get(i)).getMayaLocalDateTimeForDateHeader(this.f4767a.getResources().getConfiguration().locale, false));
        }
    }

    @Override // J7.k
    public final boolean c(int i) {
        return i < getItemCount() && getItemViewType(i) == 0;
    }

    public final void e(boolean z4) {
        if (z4 && !this.f4769d) {
            this.f4769d = true;
            notifyItemInserted(getItemCount());
        } else {
            if (z4 || !this.f4769d) {
                return;
            }
            this.f4769d = false;
            notifyItemRemoved(getItemCount() + 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size() + (this.f4769d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (this.f4769d && i == getItemCount() - 1) {
            return 3;
        }
        Dated dated = (Dated) this.c.get(i);
        if (dated instanceof CreditTransactionItem) {
            return 2;
        }
        if (dated instanceof DateHeader) {
            return 0;
        }
        throw new PayMayaRuntimeException(s.f(i, "Cant determine view type at position "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        j.g(holder, "holder");
        int itemViewType = getItemViewType(i);
        ArrayList arrayList = this.c;
        if (itemViewType == 0) {
            ((I7.a) holder).D(i, arrayList);
            return;
        }
        if (itemViewType != 2) {
            if (itemViewType != 3) {
                throw new PayMayaRuntimeException(s.f(getItemViewType(i), "Invalid view type "));
            }
        } else {
            Object obj = arrayList.get(i);
            j.e(obj, "null cannot be cast to non-null type com.paymaya.domain.model.CreditTransactionItem");
            ((S9.b) holder).D((CreditTransactionItem) obj, false, true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        LayoutInflater layoutInflater = this.e;
        if (i == 0) {
            return new I7.a(C0453g.b(layoutInflater, parent));
        }
        if (i == 2) {
            return new S9.b(s1.a(layoutInflater, parent), this.f4768b);
        }
        if (i != 3) {
            throw new PayMayaRuntimeException(s.f(i, "Invalid view type "));
        }
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading, parent, false);
        j.f(viewInflate, "inflate(...)");
        return new e(viewInflate);
    }
}
