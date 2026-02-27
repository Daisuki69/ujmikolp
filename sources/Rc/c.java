package Rc;

import A7.l;
import N5.C0466m;
import We.A;
import ad.InterfaceC0684a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.domain.model.CarouselItem;
import com.paymaya.domain.model.ClevertapAd;
import d4.AbstractC1331a;
import ed.C1436a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0684a f5476b;
    public final LayoutInflater c;
    public final int h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f5479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f5480l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f5481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f5482o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f5484q;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ClevertapAd.TextStyle f5483p = ClevertapAd.TextStyle.DEFAULT;
    public ArrayList f = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5477d = new ArrayList();
    public ArrayList e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f5478g = new ArrayList();

    public c(Context context, InterfaceC0684a interfaceC0684a, b bVar, List list, int i, int i4, int i6, Boolean bool, int i10, boolean z4, Double d10, Integer num) {
        this.c = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f5475a = bVar;
        this.f5476b = interfaceC0684a;
        this.f5484q = Collections.unmodifiableList(list);
        this.h = i;
        this.i = i4;
        this.j = i6;
        this.f5479k = bool.booleanValue();
        this.f5480l = i10;
        this.m = z4;
        this.f5481n = d10;
        this.f5482o = num;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            ArrayList arrayList3 = this.f5477d;
            ArrayList arrayList4 = new ArrayList(arrayList3);
            arrayList4.removeAll(arrayList2);
            arrayList4.addAll(arrayList2);
            Collections.sort(arrayList4, new l(2));
            C1436a c1436a = new C1436a();
            c1436a.f16645a = new ArrayList(arrayList3);
            c1436a.f16646b = new ArrayList(arrayList4);
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(c1436a);
            arrayList3.clear();
            arrayList3.addAll(arrayList4);
            diffResultCalculateDiff.dispatchUpdatesTo(this);
            this.f5475a.a(arrayList3.size());
            arrayList4.size();
            yk.a.a();
        }
    }

    public final void f(CarouselItem carouselItem, a aVar) {
        Integer num = this.f5482o;
        if (num != null) {
            A.d().f(num.intValue()).d(aVar);
        } else if (this.e.remove(carouselItem)) {
            this.f5478g.remove(aVar);
            e(this.e, this.f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.util.List r5) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f = r0
            java.util.ArrayList r0 = r4.e
            r0.addAll(r5)
            java.util.ArrayList r0 = r4.f5478g
            if (r0 == 0) goto L4a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4a
            java.util.ArrayList r0 = r4.f5478g
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            We.K r1 = (We.K) r1
            We.A r2 = We.A.d()
            if (r1 == 0) goto L39
            r2.a(r1)
            goto L23
        L39:
            r2.getClass()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "target cannot be null."
            r5.<init>(r0)
            throw r5
        L44:
            java.util.ArrayList r0 = r4.f5478g
            r0.clear()
            goto L51
        L4a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f5478g = r0
        L51:
            java.util.Iterator r5 = r5.iterator()
        L55:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r5.next()
            com.paymaya.domain.model.CarouselItem r0 = (com.paymaya.domain.model.CarouselItem) r0
            boolean r1 = r0 instanceof com.paymaya.domain.model.ClevertapAd
            if (r1 == 0) goto L78
            r1 = r0
            com.paymaya.domain.model.ClevertapAd r1 = (com.paymaya.domain.model.ClevertapAd) r1
            java.lang.String r2 = r1.getMediaLink()
            if (r2 == 0) goto L78
            java.lang.String r1 = r1.getMediaLink()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L88
        L78:
            java.util.ArrayList r1 = r4.e
            boolean r1 = r1.remove(r0)
            if (r1 == 0) goto L88
            java.util.ArrayList r0 = r4.e
            java.util.ArrayList r1 = r4.f
            r4.e(r0, r1)
            goto L55
        L88:
            Rc.a r1 = new Rc.a
            r1.<init>(r4, r0)
            java.util.ArrayList r2 = r4.f5478g
            r2.add(r1)
            We.A r2 = We.A.d()     // Catch: java.lang.Exception -> La5
            r3 = r0
            com.paymaya.domain.model.ClevertapAd r3 = (com.paymaya.domain.model.ClevertapAd) r3     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = r3.getMediaLink()     // Catch: java.lang.Exception -> La5
            We.G r2 = r2.h(r3)     // Catch: java.lang.Exception -> La5
            r2.d(r1)     // Catch: java.lang.Exception -> La5
            goto L55
        La5:
            r0.getCarouselPosition()
            yk.a.d()
            r4.f(r0, r1)
            goto L55
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Rc.c.g(java.util.List):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f5477d;
        if (!this.f5479k || arrayList.size() < this.f5480l) {
            return arrayList.size();
        }
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ArrayList arrayList = this.f5477d;
        return ((CarouselItem) arrayList.get(i % arrayList.size())).getViewType().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z4;
        String message;
        ArrayList arrayList = this.f5477d;
        int size = i % arrayList.size();
        if (CarouselItem.VIEW_TYPE.VIEW_TYPE_CLEVERTAP_AD.getValue() == getItemViewType(size)) {
            ClevertapAd clevertapAd = (ClevertapAd) arrayList.get(size);
            ad.b bVar = (ad.b) viewHolder;
            bVar.getClass();
            j.g(clevertapAd, "clevertapAd");
            bVar.i = clevertapAd;
            bVar.f7130d.setImageBitmap(clevertapAd.getBitmap());
            Pc.b bVar2 = bVar.j;
            bVar2.getClass();
            ad.b bVar3 = bVar2.f5151a;
            ClevertapAd.TextStyle textStyle = bVar3.f7129b;
            int i4 = textStyle == null ? -1 : Pc.a.f5150a[textStyle.ordinal()];
            TextView textView = bVar3.f7133l;
            TextView textView2 = bVar3.f7132k;
            LinearLayout linearLayout = bVar3.f7131g;
            boolean z5 = true;
            if (i4 == 1) {
                linearLayout.setVisibility(8);
                String title = clevertapAd.getTitle();
                if (title == null || C2576A.H(title)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(clevertapAd.getTitle());
                }
                String message2 = clevertapAd.getMessage();
                if (message2 == null || C2576A.H(message2)) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText(clevertapAd.getMessage());
                }
                String title2 = clevertapAd.getTitle();
                if ((title2 == null || C2576A.H(title2)) && ((message = clevertapAd.getMessage()) == null || C2576A.H(message))) {
                    double d10 = bVar3.c;
                    if (d10 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                        ImageView imageView = bVar3.f7130d;
                        imageView.getLayoutParams().height = (int) (((double) imageView.getLayoutParams().width) * d10);
                        CardView cardView = bVar3.h;
                        cardView.getLayoutParams().height = (int) (((double) cardView.getLayoutParams().width) * d10);
                    }
                }
            } else {
                textView2.setVisibility(8);
                textView.setVisibility(8);
                String title3 = clevertapAd.getTitle();
                TextView textView3 = bVar3.e;
                if (title3 == null || C2576A.H(title3)) {
                    textView3.setVisibility(8);
                    z4 = false;
                } else {
                    textView3.setText(clevertapAd.getTitle());
                    textView3.setVisibility(0);
                    z4 = true;
                }
                String message3 = clevertapAd.getMessage();
                TextView textView4 = bVar3.f;
                if (message3 == null || C2576A.H(message3)) {
                    textView4.setVisibility(8);
                    z5 = z4;
                } else {
                    textView4.setText(clevertapAd.getMessage());
                    textView4.setVisibility(0);
                }
                if (z5) {
                    linearLayout.setVisibility(0);
                } else {
                    linearLayout.setVisibility(8);
                }
            }
        }
        Iterator it = this.f5484q.iterator();
        if (it.hasNext()) {
            throw AbstractC1331a.n(it);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (CarouselItem.VIEW_TYPE.VIEW_TYPE_CLEVERTAP_AD.getValue() != i) {
            Iterator it = this.f5484q.iterator();
            if (it.hasNext()) {
                throw AbstractC1331a.n(it);
            }
            throw new PayMayaRuntimeException("Invalid view type");
        }
        View viewInflate = this.c.inflate(R.layout.pma_view_clevertap_ad_item, viewGroup, false);
        int i4 = R.id.container_layout_pma_view_clevertap_ad_item;
        CardView cardView = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.container_layout_pma_view_clevertap_ad_item);
        if (cardView != null) {
            i4 = R.id.image_view_pma_view_clevertap_ad_item;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_pma_view_clevertap_ad_item);
            if (imageView != null) {
                i4 = R.id.message_view_pma_view_clevertap_ad_item;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.message_view_pma_view_clevertap_ad_item);
                if (textView != null) {
                    i4 = R.id.text_container_pma_view_clevertap_ad_item;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.text_container_pma_view_clevertap_ad_item);
                    if (linearLayout != null) {
                        i4 = R.id.text_view_banner_ad_message;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_banner_ad_message);
                        if (textView2 != null) {
                            i4 = R.id.text_view_banner_ad_sub_message;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_banner_ad_sub_message);
                            if (textView3 != null) {
                                i4 = R.id.title_view_pma_view_clevertap_ad_item;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_view_pma_view_clevertap_ad_item);
                                if (textView4 != null) {
                                    C0466m c0466m = new C0466m((ViewGroup) viewInflate, (Object) cardView, (View) imageView, (Object) textView, (Object) linearLayout, (Object) textView2, (View) textView3, (View) textView4, 24);
                                    ClevertapAd.TextStyle textStyle = this.f5483p;
                                    double dDoubleValue = this.f5481n.doubleValue();
                                    return new ad.b(c0466m, this.f5476b, this.h, this.i, this.j, textStyle, this.m, dDoubleValue);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
