package yb;

import N5.i1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.Decoration;
import dOYHB6.tiZVw8.numX49;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import zj.z;

/* JADX INFO: renamed from: yb.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2518b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBaseFragment f21088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f21089b;
    public List c = C1112C.f9377a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21090d = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public C2518b(InterfaceC2517a interfaceC2517a) {
        this.f21088a = (MayaBaseFragment) interfaceC2517a;
    }

    public final void e(Decoration decoration) {
        int i = this.f21090d;
        int i4 = -1;
        if (decoration == null) {
            this.f21090d = -1;
            if (i < 0 || i >= this.c.size()) {
                return;
            }
            notifyItemChanged(i);
            return;
        }
        Iterator it = this.c.iterator();
        int i6 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (j.b(((Decoration) it.next()).getMId(), decoration.getMId())) {
                i4 = i6;
                break;
            }
            i6++;
        }
        if (i4 < 0 || i4 >= this.c.size()) {
            return;
        }
        this.f21090d = i4;
        notifyItemChanged(i);
        notifyItemChanged(this.f21090d);
        RecyclerView recyclerView = this.f21089b;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(this.f21090d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        j.g(recyclerView, numX49.tnTj78("bQWP"));
        super.onAttachedToRecyclerView(recyclerView);
        this.f21089b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Resources.Theme theme;
        Ib.a aVar = (Ib.a) viewHolder;
        j.g(aVar, numX49.tnTj78("bQWb"));
        Decoration decoration = (Decoration) this.c.get(i);
        boolean z4 = i == this.f21090d;
        j.g(decoration, numX49.tnTj78("bQW2"));
        aVar.c = decoration;
        Ae.a aVar2 = aVar.f2272d;
        aVar2.getClass();
        if (z.o(decoration.getMId(), numX49.tnTj78("bQWL"), false) || decoration.getMIconUrl() == null || decoration.getMIconUrl().length() == 0) {
            Ib.a aVar3 = (Ib.a) ((Hb.a) aVar2.c.get());
            Context context = aVar3.itemView.getContext();
            TypedValue typedValue = new TypedValue();
            aVar3.e.setImageDrawable(new ColorDrawable(ContextCompat.getColor(aVar3.itemView.getContext(), (context == null || (theme = context.getTheme()) == null || !theme.resolveAttribute(R.attr.mayaContentViewBackgroundColorSecondary, typedValue, true)) ? R.color.maya_shades_of_grey_2 : typedValue.resourceId)));
        } else {
            Hb.a aVar4 = (Hb.a) aVar2.c.get();
            String mIconUrl = decoration.getMIconUrl();
            Ib.a aVar5 = (Ib.a) aVar4;
            aVar5.getClass();
            j.g(mIconUrl, numX49.tnTj78("bQWr"));
            aVar5.itemView.getContext();
            C.g0(aVar5.e, mIconUrl);
        }
        if (z4) {
            Ib.a aVar6 = (Ib.a) ((Hb.a) aVar2.c.get());
            aVar6.f.setVisibility(0);
            aVar6.f2270a.f4120b.animate().translationZ(0.0f).scaleX(1.125f).scaleY(1.125f).setDuration(150L).setInterpolator(Ib.a.f2269g).start();
        } else {
            Ib.a aVar7 = (Ib.a) ((Hb.a) aVar2.c.get());
            aVar7.f.setVisibility(8);
            aVar7.f2270a.f4120b.animate().translationZ(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(Ib.a.f2269g).start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.paymaya.common.base.MayaBaseFragment, yb.a] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.g(viewGroup, numX49.tnTj78("bQWZ"));
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.maya_view_decoration_theme_item, viewGroup, false);
        CardView cardView = (CardView) viewInflate;
        int i4 = R.id.image_view_theme_design_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_theme_design_icon);
        if (imageView != null) {
            i4 = R.id.view_design_selected_border;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_design_selected_border);
            if (viewFindChildViewById != null) {
                return new Ib.a(new i1(cardView, imageView, viewFindChildViewById), this.f21088a);
            }
        }
        throw new NullPointerException(numX49.tnTj78("bQWk").concat(viewInflate.getResources().getResourceName(i4)));
    }
}
