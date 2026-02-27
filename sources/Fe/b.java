package fe;

import N5.i1;
import Q6.l;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.Decoration;
import com.paymaya.ui.sendmoney.view.fragment.impl.SendMoneyCardPreviewFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import kotlin.jvm.internal.j;
import le.InterfaceC1826a;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendMoneyCardPreviewFragment f16753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f16754b = C1112C.f9377a;
    public int c;

    public b(SendMoneyCardPreviewFragment sendMoneyCardPreviewFragment) {
        this.f16753a = sendMoneyCardPreviewFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f16754b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        me.a aVar = (me.a) viewHolder;
        j.g(aVar, numX49.tnTj78("bidP"));
        Decoration decoration = (Decoration) this.f16754b.get(i);
        boolean z4 = i == this.c;
        j.g(decoration, numX49.tnTj78("bidb"));
        aVar.c = decoration;
        l lVar = aVar.f18405d;
        lVar.getClass();
        if (z.o(decoration.getMId(), numX49.tnTj78("bid2"), false) || decoration.getMIconUrl() == null || decoration.getMIconUrl().length() == 0) {
            me.a aVar2 = (me.a) ((InterfaceC1826a) lVar.c.get());
            aVar2.f18403a.f4121d.setImageDrawable(new ColorDrawable(ContextCompat.getColor(aVar2.itemView.getContext(), R.color.pearl_white)));
        } else {
            InterfaceC1826a interfaceC1826a = (InterfaceC1826a) lVar.c.get();
            String mIconUrl = decoration.getMIconUrl();
            me.a aVar3 = (me.a) interfaceC1826a;
            aVar3.getClass();
            j.g(mIconUrl, numX49.tnTj78("bidL"));
            aVar3.itemView.getContext();
            C.g0(aVar3.f18403a.f4121d, mIconUrl);
        }
        if (z4) {
            i1 i1Var = ((me.a) ((InterfaceC1826a) lVar.c.get())).f18403a;
            i1Var.c.setVisibility(0);
            ViewPropertyAnimator viewPropertyAnimatorTranslationZ = i1Var.f4120b.animate().translationZ(4.0f);
            float f = me.a.f18402g;
            viewPropertyAnimatorTranslationZ.scaleX(f).scaleY(f).setDuration(150L).setInterpolator(me.a.e).start();
            return;
        }
        i1 i1Var2 = ((me.a) ((InterfaceC1826a) lVar.c.get())).f18403a;
        i1Var2.c.setVisibility(8);
        ViewPropertyAnimator viewPropertyAnimatorTranslationZ2 = i1Var2.f4120b.animate().translationZ(0.0f);
        float f3 = me.a.f;
        viewPropertyAnimatorTranslationZ2.scaleX(f3).scaleY(f3).setDuration(150L).setInterpolator(me.a.e).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.g(viewGroup, numX49.tnTj78("bidr"));
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pma_view_holder_card_design, viewGroup, false);
        int i4 = R.id.border_view_pma_view_holder_card_design;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.border_view_pma_view_holder_card_design);
        if (viewFindChildViewById != null) {
            CardView cardView = (CardView) viewInflate;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_pma_view_holder_card_design);
            if (imageView != null) {
                return new me.a(new i1(cardView, viewFindChildViewById, imageView), this.f16753a);
            }
            i4 = R.id.image_view_pma_view_holder_card_design;
        }
        throw new NullPointerException(numX49.tnTj78("bidZ").concat(viewInflate.getResources().getResourceName(i4)));
    }
}
