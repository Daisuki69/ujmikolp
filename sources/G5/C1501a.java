package g5;

import F.i;
import N5.C0452f1;
import N5.k1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import b5.C0910b;
import b5.C0912d;
import cj.C1110A;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.paymaya.R;
import h5.C1539a;
import h5.ViewOnClickListenerC1540b;
import h5.ViewTreeObserverOnPreDrawListenerC1541c;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: g5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1501a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16789b = false;
    public final Function1 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f16790d;

    public C1501a(ArrayList arrayList, Float f, com.squareup.wire.internal.a aVar, Function1 function1) {
        this.f16788a = arrayList;
        this.c = function1;
        this.f16790d = new i(f, aVar, function1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        boolean z4 = this.f16789b;
        ArrayList arrayList = this.f16788a;
        if (!z4 || arrayList.size() <= 1) {
            return arrayList.size();
        }
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1539a holder = (C1539a) viewHolder;
        j.g(holder, "holder");
        ArrayList arrayList = this.f16788a;
        if (arrayList.isEmpty()) {
            return;
        }
        C0912d c0912d = (C0912d) C1110A.C(i % arrayList.size(), arrayList);
        Context context = holder.itemView.getContext();
        j.f(context, "getContext(...)");
        i iVar = this.f16790d;
        iVar.getClass();
        k1 k1Var = holder.f16930a;
        Float f = (Float) iVar.f1503b;
        if (f != null) {
            ((CardView) k1Var.f).setRadius(f.floatValue() * context.getResources().getDisplayMetrics().density);
        } else {
            ((CardView) k1Var.f).setRadius(context.getResources().getDimension(R.dimen.adkit_radius_16dp));
        }
        NativeCustomFormatAd nativeCustomFormatAd = c0912d != null ? c0912d.f8521b : null;
        C0910b c0910b = c0912d != null ? c0912d.c : null;
        if (nativeCustomFormatAd == null || c0910b == null) {
            ((LottieAnimationView) k1Var.f4139d).setVisibility(0);
            ((ImageView) k1Var.f4138b).setVisibility(8);
            ((C0452f1) k1Var.c).c.setVisibility(8);
            ((CardView) k1Var.e).setOnClickListener(null);
            return;
        }
        ((LottieAnimationView) k1Var.f4139d).setVisibility(8);
        ImageView imageView = (ImageView) k1Var.f4138b;
        imageView.setVisibility(0);
        ((C0452f1) k1Var.c).c.setVisibility(c0910b.f8519g ? 8 : 0);
        Drawable drawable = c0910b.c;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            if (iVar.c == 0) {
                imageView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1541c(iVar, holder));
            }
        }
        ((CardView) k1Var.e).setOnClickListener(new ViewOnClickListenerC1540b(nativeCustomFormatAd, iVar, c0910b, context, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.banner_ad_carousel_item, parent, false);
        int i4 = R.id.ad_badge_container;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.ad_badge_container);
        if (viewFindChildViewById != null) {
            TextView textView = (TextView) viewFindChildViewById;
            C0452f1 c0452f1 = new C0452f1(textView, textView, 5);
            i4 = R.id.ad_image_view;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.ad_image_view);
            if (imageView != null) {
                CardView cardView = (CardView) viewInflate;
                i4 = R.id.shimmer_view_container;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.shimmer_view_container);
                if (lottieAnimationView != null) {
                    k1 k1Var = new k1(cardView, c0452f1, imageView, cardView, lottieAnimationView);
                    lottieAnimationView.setVisibility(0);
                    imageView.setVisibility(8);
                    textView.setVisibility(8);
                    lottieAnimationView.getLayoutParams().height = (int) TypedValue.applyDimension(1, 110.0f, parent.getContext().getResources().getDisplayMetrics());
                    return new C1539a(k1Var);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
