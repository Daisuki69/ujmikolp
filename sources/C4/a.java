package C4;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;
import pg.t;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f730b;
    public final /* synthetic */ t c;

    public a(c cVar, String str, t tVar) {
        this.f729a = cVar;
        this.f730b = str;
        this.c = tVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError adError) {
        j.g(adError, "adError");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c cVar = this.f729a;
        linkedHashMap.put(cVar.h, this.f730b);
        linkedHashMap.put(cVar.f736k, Integer.valueOf(adError.getCode()));
        linkedHashMap.put(cVar.j, adError.getMessage());
        String str = cVar.f737l;
        AdError cause = adError.getCause();
        linkedHashMap.put(str, cause != null ? cause.getMessage() : null);
        linkedHashMap.put(cVar.i, adError.getDomain());
        this.c.error("LOAD_AD_FAILED", "Failed to load ad: " + adError.getMessage(), linkedHashMap);
    }
}
