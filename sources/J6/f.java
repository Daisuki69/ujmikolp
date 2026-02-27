package J6;

import N5.C0453g;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaCashInFragment f2429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f2430b;
    public final ArrayList c;

    public f(Context context, MayaCashInFragment mayaCashInFragment) {
        this.f2429a = mayaCashInFragment;
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f2430b = (LayoutInflater) systemService;
        this.c = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        j.g(holder, "holder");
        LoadUpPartner loadUpPartner = (LoadUpPartner) this.c.get(i);
        M6.g gVar = (M6.g) holder;
        j.g(loadUpPartner, "loadUpPartner");
        J5.c cVar = gVar.f3108d;
        cVar.getClass();
        String strMXhdpi = loadUpPartner.mIconUrl().mXhdpi();
        M6.g gVar2 = (M6.g) cVar.f2418b;
        ImageView imageView = gVar2.f3107b;
        imageView.getContext();
        C.e0(strMXhdpi, imageView, 2131231850);
        String strMName = loadUpPartner.mName();
        j.f(strMName, "mName(...)");
        int i4 = Build.VERSION.SDK_INT;
        TextView textView = gVar2.c;
        if (i4 >= 26) {
            textView.setTooltipText(strMName);
        }
        textView.setText(strMName);
        gVar.f3107b.setOnClickListener(new Ad.a(15, gVar, loadUpPartner));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewInflate = this.f2430b.inflate(R.layout.maya_view_holder_cash_in_partner, parent, false);
        int i4 = R.id.image_view_partner_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_partner_image);
        if (imageView != null) {
            i4 = R.id.text_view_partner_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_partner_title);
            if (textView != null) {
                i4 = R.id.view_partner_divider;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_partner_divider);
                if (viewFindChildViewById != null) {
                    return new M6.g(new C0453g(28, (CardView) viewInflate, imageView, textView, viewFindChildViewById), this.f2429a);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
