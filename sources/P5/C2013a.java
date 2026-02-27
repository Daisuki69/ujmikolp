package p5;

import N5.r1;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import b5.o;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.paymaya.R;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import p3.s;
import q5.C2163a;
import s5.h;

/* JADX INFO: renamed from: p5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2013a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19071b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f19072d = new s();

    public C2013a(ArrayList arrayList, int i, int i4) {
        this.f19070a = arrayList;
        this.f19071b = i;
        this.c = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f19070a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C2163a holder = (C2163a) viewHolder;
        j.g(holder, "holder");
        ArrayList arrayList = this.f19070a;
        if (arrayList.isEmpty()) {
            return;
        }
        Log.d("VerticalBannerAd", "onBindViewHolder called!");
        o adItem = (o) arrayList.get(i);
        this.f19072d.getClass();
        j.g(adItem, "adItem");
        Z4.a aVar = holder.f19741a;
        r1 r1Var = (r1) aVar.f6890d;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) aVar.c;
        NativeAdView nativeAdView = (NativeAdView) r1Var.c;
        NativeAd nativeAd = adItem.f8536b;
        if (nativeAd == null) {
            Log.d("VerticalBannerAd", "nativeAd is null, showing shimmer!");
            nativeAdView.setVisibility(8);
            lottieAnimationView.setVisibility(0);
            return;
        }
        Log.d("VerticalBannerAd", "nativeAd is not null!");
        nativeAdView.setVisibility(0);
        lottieAnimationView.setVisibility(8);
        nativeAdView.setVisibility(0);
        MediaView mediaView = (MediaView) r1Var.e;
        mediaView.setVisibility(0);
        nativeAdView.setMediaView(mediaView);
        MediaView mediaView2 = nativeAdView.getMediaView();
        if (mediaView2 != null) {
            mediaView2.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            mediaView2.setOnHierarchyChangeListener(new h());
        }
        MediaContent mediaContent = nativeAd.getMediaContent();
        if (mediaContent != null) {
            mediaView.setMediaContent(mediaContent);
        }
        TextView textView = (TextView) r1Var.f4199d;
        nativeAdView.setHeadlineView(textView);
        textView.setText(nativeAd.getHeadline());
        TextView textView2 = (TextView) r1Var.f4198b;
        nativeAdView.setBodyView(textView2);
        String body = nativeAd.getBody();
        if (body == null || body.length() == 0) {
            textView2.setVisibility(4);
        } else {
            textView2.setVisibility(0);
            textView2.setText(nativeAd.getBody());
        }
        nativeAdView.setNativeAd(nativeAd);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        Log.d("VerticalBannerAd", "onCreateViewHolder called!");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_banner_ad_item, parent, false);
        CardView cardView = (CardView) viewInflate;
        int i4 = R.id.shimmer_view_container;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.shimmer_view_container);
        if (lottieAnimationView != null) {
            i4 = R.id.vertical_banner_native_ad;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.vertical_banner_native_ad);
            if (viewFindChildViewById != null) {
                int i6 = R.id.standard_native_ad_body;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.standard_native_ad_body);
                if (textView != null) {
                    i6 = R.id.standard_native_ad_headline;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.standard_native_ad_headline);
                    if (textView2 != null) {
                        i6 = R.id.standard_native_ad_media;
                        MediaView mediaView = (MediaView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.standard_native_ad_media);
                        if (mediaView != null) {
                            NativeAdView nativeAdView = (NativeAdView) viewFindChildViewById;
                            Z4.a aVar = new Z4.a(cardView, lottieAnimationView, new r1((ViewGroup) nativeAdView, textView, textView2, (FrameLayout) mediaView, 12), 0);
                            lottieAnimationView.setVisibility(0);
                            nativeAdView.setVisibility(0);
                            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                            layoutParams.width = this.f19071b;
                            layoutParams.height = this.c;
                            cardView.setLayoutParams(layoutParams);
                            return new C2163a(aVar);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i6)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
