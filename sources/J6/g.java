package J6;

import M6.m;
import N5.F;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.domain.model.AddMoneyViaCardSettings;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaVaultedCardsFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaVaultedCardsFragment f2431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2432b = new ArrayList();
    public AddMoneyViaCardSettings c;

    public g(MayaVaultedCardsFragment mayaVaultedCardsFragment) {
        this.f2431a = mayaVaultedCardsFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f2432b.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r7, int r8) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J6.g.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        return new m(F.a(LayoutInflater.from(parent.getContext()).inflate(R.layout.maya_view_holder_vaulted_card, parent, false)), this.f2431a);
    }
}
