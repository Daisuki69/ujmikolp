package A6;

import D6.b;
import N5.C0441c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.domain.model.FundSource;
import com.paymaya.mayaui.cards.view.fragment.impl.MayaCardsFragment;
import com.paymaya.mayaui.common.view.widget.MayaHorizontalLabelWithArrow;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import qc.c;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MayaCardsFragment f181b;
    public ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f182d;

    public a(Context context, MayaCardsFragment mayaCardsFragment) {
        this.f180a = context;
        this.f181b = mayaCardsFragment;
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f182d = (LayoutInflater) systemService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        b holder = (b) viewHolder;
        j.g(holder, "holder");
        FundSource fundSource = (FundSource) this.c.get(i);
        j.g(fundSource, "fundSource");
        c cVar = holder.f985d;
        cVar.getClass();
        boolean zIsTypeVirtual = fundSource.isTypeVirtual();
        b bVar = (b) cVar.f19770b;
        Context context = bVar.f983a;
        C0441c c0441c = bVar.c;
        if (zIsTypeVirtual) {
            Drawable drawable = ContextCompat.getDrawable(context, 2131231286);
            if (drawable != null) {
                ((MayaHorizontalLabelWithArrow) c0441c.c).setIcon(drawable);
            }
        } else if (fundSource.isTypePhysical()) {
            Drawable drawable2 = ContextCompat.getDrawable(context, 2131231282);
            if (drawable2 != null) {
                ((MayaHorizontalLabelWithArrow) c0441c.c).setIcon(drawable2);
            }
        } else {
            Drawable drawable3 = ContextCompat.getDrawable(context, 2131231280);
            if (drawable3 != null) {
                ((MayaHorizontalLabelWithArrow) c0441c.c).setIcon(drawable3);
            }
        }
        if (fundSource.isTypeVirtual()) {
            String string = context.getResources().getString(R.string.maya_label_cards_virtual_card_name);
            j.f(string, "getString(...)");
            ((MayaHorizontalLabelWithArrow) c0441c.c).setLabel(string);
        } else if (fundSource.isTypePhysical()) {
            String strMName = fundSource.mName();
            ((MayaHorizontalLabelWithArrow) c0441c.c).setLabel(strMName != null ? z.t(strMName, "PayMaya Card", "Maya card") : "Unknown Card Name");
        } else if (fundSource.isTypeBuyCard()) {
            String string2 = context.getResources().getString(R.string.pma_label_get_a_paymaya_card);
            j.f(string2, "getString(...)");
            ((MayaHorizontalLabelWithArrow) c0441c.c).setLabel(string2);
        }
        if (fundSource.isTypeVirtual()) {
            if (fundSource.isStatusActiveVirtual()) {
                ((MayaHorizontalLabelWithArrow) c0441c.c).setOnClickListener(new D6.a(bVar, 2));
                return;
            } else {
                ((MayaHorizontalLabelWithArrow) c0441c.c).setOnClickListener(new D6.a(bVar, 3));
                return;
            }
        }
        if (fundSource.isTypePhysical() && fundSource.isStatusActivePhysical()) {
            ((MayaHorizontalLabelWithArrow) c0441c.c).setOnClickListener(new D6.a(bVar, fundSource.mId(), fundSource.mName()));
        } else if (fundSource.isTypeBuyCard()) {
            ((MayaHorizontalLabelWithArrow) c0441c.c).setOnClickListener(new D6.a(bVar, 0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewInflate = this.f182d.inflate(R.layout.maya_view_holder_card_item, parent, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        MayaHorizontalLabelWithArrow mayaHorizontalLabelWithArrow = (MayaHorizontalLabelWithArrow) viewInflate;
        return new b(this.f180a, new C0441c(mayaHorizontalLabelWithArrow, mayaHorizontalLabelWithArrow, 10), this.f181b);
    }
}
