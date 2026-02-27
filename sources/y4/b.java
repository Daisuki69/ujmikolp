package Y4;

import Bj.r;
import b5.AbstractC0911c;
import b5.C0909a;
import b5.C0913e;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbgr;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AdListener implements zzg, zze, zzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6751a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6752b;
    public final Object c;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f6752b = abstractAdViewAdapter;
        this.c = mediationNativeListener;
    }

    private final void a() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        switch (this.f6751a) {
            case 1:
                ((MediationNativeListener) this.c).onAdClicked((AbstractAdViewAdapter) this.f6752b);
                break;
            default:
                super.onAdClicked();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        switch (this.f6751a) {
            case 1:
                ((MediationNativeListener) this.c).onAdClosed((AbstractAdViewAdapter) this.f6752b);
                break;
            default:
                super.onAdClosed();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError adError) {
        switch (this.f6751a) {
            case 0:
                j.g(adError, "adError");
                int code = adError.getCode();
                String message = adError.getMessage();
                j.f(message, "getMessage(...)");
                AdError cause = adError.getCause();
                ((r) this.f6752b).T(new C0913e(new C0909a(code, message, cause != null ? cause.getMessage() : null), (AbstractC0911c) this.c));
                break;
            default:
                ((MediationNativeListener) this.c).onAdFailedToLoad((AbstractAdViewAdapter) this.f6752b, adError);
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        switch (this.f6751a) {
            case 1:
                ((MediationNativeListener) this.c).onAdImpression((AbstractAdViewAdapter) this.f6752b);
                break;
            default:
                super.onAdImpression();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        switch (this.f6751a) {
            case 1:
                break;
            default:
                super.onAdLoaded();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        switch (this.f6751a) {
            case 1:
                ((MediationNativeListener) this.c).onAdOpened((AbstractAdViewAdapter) this.f6752b);
                break;
            default:
                super.onAdOpened();
                break;
        }
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public void zza(UnifiedNativeAd unifiedNativeAd) {
        com.google.ads.mediation.a aVar = new com.google.ads.mediation.a();
        aVar.setHeadline(unifiedNativeAd.zza());
        aVar.setImages(unifiedNativeAd.zzb());
        aVar.setBody(unifiedNativeAd.zzc());
        aVar.setIcon(unifiedNativeAd.zzd());
        aVar.setCallToAction(unifiedNativeAd.zze());
        aVar.setAdvertiser(unifiedNativeAd.zzf());
        aVar.setStarRating(unifiedNativeAd.zzg());
        aVar.setStore(unifiedNativeAd.zzh());
        aVar.setPrice(unifiedNativeAd.zzi());
        aVar.zzb(unifiedNativeAd.zzk());
        aVar.setOverrideImpressionRecording(true);
        aVar.setOverrideClickHandling(true);
        aVar.zza(unifiedNativeAd.zzj());
        ((MediationNativeListener) this.c).onAdLoaded((AbstractAdViewAdapter) this.f6752b, aVar);
    }

    @Override // com.google.android.gms.ads.formats.zze
    public void zzb(zzbgr zzbgrVar) {
        ((MediationNativeListener) this.c).zzc((AbstractAdViewAdapter) this.f6752b, zzbgrVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public void zzc(zzbgr zzbgrVar, String str) {
        ((MediationNativeListener) this.c).zzd((AbstractAdViewAdapter) this.f6752b, zzbgrVar, str);
    }

    public b(r rVar, AbstractC0911c abstractC0911c) {
        this.f6752b = rVar;
        this.c = abstractC0911c;
    }
}
