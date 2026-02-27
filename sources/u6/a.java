package U6;

import N5.C0452f1;
import N5.C0455g1;
import Q6.n;
import We.s;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.domain.model.MayaChoicesAdapterItem;
import com.paymaya.domain.model.Stop;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f5946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5947b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f5948d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5949g;
    public Stop h;
    public int i;

    public a(Context context, n nVar, int i) {
        ArrayList arrayList = new ArrayList();
        this.f5946a = nVar;
        this.f5947b = arrayList;
        this.c = i;
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f5948d = (LayoutInflater) systemService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f5947b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((MayaChoicesAdapterItem) this.f5947b.get(i)).getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        j.g(holder, "holder");
        MayaChoicesAdapterItem mayaChoicesAdapterItem = (MayaChoicesAdapterItem) this.f5947b.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            Z6.a aVar = (Z6.a) holder;
            String item = mayaChoicesAdapterItem.getItemAsString();
            String itemAsString = mayaChoicesAdapterItem.getItemAsString();
            j.g(item, "item");
            TextView textView = aVar.f6892b;
            textView.setText(itemAsString);
            textView.setOnClickListener(new Ad.a(aVar, item, i, 28));
            int i4 = this.e;
            Z6.a aVar2 = (Z6.a) aVar.c.f1965b;
            if (i4 != 0) {
                TextViewCompat.setTextAppearance(aVar2.f6892b, i4);
                return;
            }
            return;
        }
        if (itemViewType != 1) {
            throw new PayMayaRuntimeException(s.f(getItemViewType(i), "Invalid view type "));
        }
        Z6.b bVar = (Z6.b) holder;
        bVar.c.setText(mayaChoicesAdapterItem.getItemAsString());
        bVar.f6894b.setOnClickListener(new Ad.a(bVar, mayaChoicesAdapterItem, i, 29));
        int i6 = this.f;
        int i10 = this.f5949g;
        int i11 = this.c;
        Z6.b bVar2 = (Z6.b) bVar.e.f1822b;
        TextView textView2 = bVar2.c;
        if (i6 != 0) {
            TextViewCompat.setTextAppearance(textView2, i6);
        }
        if (i10 != 0) {
            ConstraintLayout constraintLayout = bVar2.f6894b;
            constraintLayout.setBackground(ResourcesCompat.getDrawable(constraintLayout.getResources(), i10, constraintLayout.getContext().getTheme()));
        }
        if (i11 == -1) {
            textView2.setMaxLines(Integer.MAX_VALUE);
        } else {
            textView2.setMaxLines(i11);
        }
        Stop stop = this.h;
        if (stop != null) {
            boolean zEquals = stop.equals(mayaChoicesAdapterItem);
            int i12 = this.i;
            ImageView imageView = ((Z6.b) bVar.e.f1822b).f6895d;
            if (!zEquals || i12 == 0) {
                imageView.setImageResource(0);
                imageView.setVisibility(8);
            } else {
                imageView.setImageResource(i12);
                imageView.setVisibility(0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        n nVar = this.f5946a;
        LayoutInflater layoutInflater = this.f5948d;
        if (i == 0) {
            View viewInflate = layoutInflater.inflate(R.layout.maya_view_choices_header, parent, false);
            if (viewInflate == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView = (TextView) viewInflate;
            return new Z6.a(new C0452f1(textView, textView, 0), nVar);
        }
        if (i != 1) {
            throw new PayMayaRuntimeException(s.f(i, "Invalid view type "));
        }
        View viewInflate2 = layoutInflater.inflate(R.layout.maya_view_choices_item, parent, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2;
        int i4 = R.id.image_view_selected_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.image_view_selected_item);
        if (imageView != null) {
            i4 = R.id.text_view_choices_item;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.text_view_choices_item);
            if (textView2 != null) {
                return new Z6.b(new C0455g1(constraintLayout, constraintLayout, imageView, textView2, 0), nVar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i4)));
    }
}
