package ad;

import N5.C0466m;
import Y6.o;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import cj.M;
import com.paymaya.R;
import com.paymaya.domain.model.ClevertapAd;
import dOYHB6.tiZVw8.numX49;
import k2.v0;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0684a f7128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClevertapAd.TextStyle f7129b;
    public final double c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f7130d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f7131g;
    public final CardView h;
    public ClevertapAd i;
    public final Pc.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f7132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f7133l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C0466m c0466m, InterfaceC0684a interfaceC0684a, int i, int i4, int i6, ClevertapAd.TextStyle textStyle, boolean z4, double d10) {
        super((ConstraintLayout) c0466m.f4150b);
        j.g(interfaceC0684a, numX49.tnTj78("buQP"));
        j.g(textStyle, numX49.tnTj78("buQb"));
        this.f7128a = interfaceC0684a;
        this.f7129b = textStyle;
        this.c = d10;
        ImageView imageView = (ImageView) c0466m.f4151d;
        this.f7130d = imageView;
        TextView textView = (TextView) c0466m.i;
        this.e = textView;
        TextView textView2 = (TextView) c0466m.e;
        this.f = textView2;
        LinearLayout linearLayout = (LinearLayout) c0466m.f;
        this.f7131g = linearLayout;
        CardView cardView = (CardView) c0466m.c;
        this.h = cardView;
        this.j = new Pc.b(this);
        this.f7132k = (TextView) c0466m.f4152g;
        this.f7133l = (TextView) c0466m.h;
        imageView.getLayoutParams().width = i;
        cardView.getLayoutParams().width = i;
        imageView.getLayoutParams().height = i4;
        cardView.getLayoutParams().height = i4;
        cardView.setRadius(i6);
        imageView.setOnClickListener(new o(this, 7));
        int iO = v0.o(16);
        if (textStyle == ClevertapAd.TextStyle.FULL_SIZE_BANNER) {
            TextViewCompat.setTextAppearance(textView, R.style.FullSizeClevertapBannerTitle);
            TextViewCompat.setTextAppearance(textView2, R.style.FullSizeClevertapBannerMessage);
            int i10 = iO / 2;
            linearLayout.setPadding(iO, i10, iO, i10);
        }
        if (z4) {
            textView.setTextAppearance(this.itemView.getContext(), R.style.Heading05BoldGray140);
            textView2.setTextAppearance(this.itemView.getContext(), R.style.BodySmallStandardGray140);
            textView.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.light_light));
            textView2.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.light_light));
        }
    }

    public static final void D(b bVar) {
        String unitId;
        String name;
        String bannerKey;
        Pc.b bVar2 = bVar.j;
        ClevertapAd clevertapAd = bVar.i;
        String action = clevertapAd != null ? clevertapAd.getAction() : null;
        bVar2.getClass();
        if (action == null || C2576A.H(action)) {
            return;
        }
        b bVar3 = bVar2.f5151a;
        Pair pair = new Pair(numX49.tnTj78("buQ2"), action);
        ClevertapAd clevertapAd2 = bVar3.i;
        String strTnTj78 = numX49.tnTj78("buQL");
        if (clevertapAd2 == null || (unitId = clevertapAd2.getUnitId()) == null) {
            unitId = strTnTj78;
        }
        Pair pair2 = new Pair(numX49.tnTj78("buQr"), unitId);
        ClevertapAd clevertapAd3 = bVar3.i;
        Pair pair3 = new Pair(numX49.tnTj78("buQZ"), String.valueOf(clevertapAd3 != null ? Integer.valueOf(clevertapAd3.getCarouselPosition() + 1) : null));
        ClevertapAd clevertapAd4 = bVar3.i;
        if (clevertapAd4 == null || (name = clevertapAd4.getName()) == null) {
            name = strTnTj78;
        }
        Pair pair4 = new Pair(numX49.tnTj78("buQk"), name);
        ClevertapAd clevertapAd5 = bVar3.i;
        if (clevertapAd5 != null && (bannerKey = clevertapAd5.getBannerKey()) != null) {
            strTnTj78 = bannerKey;
        }
        Pair pair5 = new Pair(numX49.tnTj78("buQB"), strTnTj78);
        ClevertapAd clevertapAd6 = bVar3.i;
        bVar3.f7128a.B0(M.g(pair, pair2, pair3, pair4, pair5, new Pair(numX49.tnTj78("buQu"), String.valueOf(clevertapAd6 != null ? Integer.valueOf(clevertapAd6.getBannerPriority()) : null))));
    }
}
