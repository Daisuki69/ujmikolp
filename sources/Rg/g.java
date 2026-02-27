package Rg;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.datastore.core.CorruptionException;
import androidx.work.impl.utils.PreferenceUtils;
import b5.C0910b;
import bg.AbstractC0983W;
import com.dynatrace.agent.metrics.OneAgentMetricsProvider;
import com.dynatrace.agent.storage.di.StorageModule;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.data.SessionParameterStoreKt;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaWelcomeActivity;
import com.paymaya.mayaui.pay.view.impl.MayaPayActivity;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5536a;

    public /* synthetic */ g(int i) {
        this.f5536a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5536a) {
            case 0:
                i DelegatingMutableSet = (i) obj;
                kotlin.jvm.internal.j.g(DelegatingMutableSet, "$this$DelegatingMutableSet");
                return DelegatingMutableSet.f5538a;
            case 1:
                String DelegatingMutableSet2 = (String) obj;
                kotlin.jvm.internal.j.g(DelegatingMutableSet2, "$this$DelegatingMutableSet");
                return AbstractC0983W.f(DelegatingMutableSet2);
            case 2:
                C0910b bannerItemVariables = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables, "bannerItemVariables");
                Log.d("BannerAdsCarousel", "Ad item with unit ID " + bannerItemVariables.f8516a + " tapped!");
                return Unit.f18162a;
            case 3:
                C0910b bannerItemVariables2 = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables2, "bannerItemVariables");
                Log.d("BannerAdsCarousel", "Ad carousel with unit ID " + bannerItemVariables2.f8516a + " loaded!");
                return Unit.f18162a;
            case 4:
                String adUnitId = (String) obj;
                kotlin.jvm.internal.j.g(adUnitId, "adUnitId");
                Log.d("VerticalBannerAd", "Ad item with unit ID " + adUnitId + " tapped!");
                return Unit.f18162a;
            case 5:
                String adUnitId2 = (String) obj;
                kotlin.jvm.internal.j.g(adUnitId2, "adUnitId");
                Log.d("VerticalBannerAd", "Ad carousel with unit ID " + adUnitId2 + " loaded!");
                return Unit.f18162a;
            case 6:
                String adUnitId3 = (String) obj;
                kotlin.jvm.internal.j.g(adUnitId3, "adUnitId");
                Log.d("InlineBannerAd", "Ad item with unit ID " + adUnitId3 + " tapped!");
                return Unit.f18162a;
            case 7:
                String adUnitId4 = (String) obj;
                kotlin.jvm.internal.j.g(adUnitId4, "adUnitId");
                Log.d("InlineBannerAd", "Ad with unit ID " + adUnitId4 + " loaded!");
                return Unit.f18162a;
            case 8:
                c0.f downloadedBitmap = (c0.f) obj;
                kotlin.jvm.internal.j.g(downloadedBitmap, "downloadedBitmap");
                if (T.a.f5741a[downloadedBitmap.f9192b.ordinal()] != 1) {
                    return null;
                }
                Bitmap bitmap = downloadedBitmap.f9191a;
                kotlin.jvm.internal.j.d(bitmap);
                byte[] bArr = downloadedBitmap.f9193d;
                kotlin.jvm.internal.j.d(bArr);
                return new Pair(bitmap, bArr);
            case 9:
                ActivityResult it = (ActivityResult) obj;
                int i = MayaSessionExpiredActivity.f11789v;
                kotlin.jvm.internal.j.g(it, "it");
                return Unit.f18162a;
            case 10:
                ActivityResult it2 = (ActivityResult) obj;
                int i4 = MayaSessionExpiredActivity.f11789v;
                kotlin.jvm.internal.j.g(it2, "it");
                return Unit.f18162a;
            case 11:
                ActivityResult it3 = (ActivityResult) obj;
                int i6 = MayaSessionExpiredActivity.f11789v;
                kotlin.jvm.internal.j.g(it3, "it");
                return Unit.f18162a;
            case 12:
                Map.Entry it4 = (Map.Entry) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                return it4.getKey() + "=" + it4.getValue();
            case 13:
                Map it5 = (Map) obj;
                kotlin.jvm.internal.j.g(it5, "it");
                return Unit.f18162a;
            case 14:
                Pair it6 = (Pair) obj;
                kotlin.jvm.internal.j.g(it6, "it");
                return Unit.f18162a;
            case 15:
                Pair it7 = (Pair) obj;
                kotlin.jvm.internal.j.g(it7, "it");
                return Unit.f18162a;
            case 16:
                Pair it8 = (Pair) obj;
                kotlin.jvm.internal.j.g(it8, "it");
                return Unit.f18162a;
            case 17:
                Pair it9 = (Pair) obj;
                kotlin.jvm.internal.j.g(it9, "it");
                return Unit.f18162a;
            case 18:
                ActivityResult it10 = (ActivityResult) obj;
                int i10 = MayaPayActivity.f13326w;
                kotlin.jvm.internal.j.g(it10, "it");
                return Unit.f18162a;
            case 19:
                return PreferenceUtils.lambda$getLastCancelAllTimeMillisLiveData$0((Long) obj);
            case 20:
                CorruptionException ex = (CorruptionException) obj;
                kotlin.jvm.internal.j.g(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return e3.k.f16577b;
            case 21:
                ActivityResult it11 = (ActivityResult) obj;
                int i11 = MayaLoginActivity.f12721v;
                kotlin.jvm.internal.j.g(it11, "it");
                return Unit.f18162a;
            case 22:
                ActivityResult it12 = (ActivityResult) obj;
                int i12 = MayaLoginActivity.f12721v;
                kotlin.jvm.internal.j.g(it12, "it");
                return Unit.f18162a;
            case 23:
                ActivityResult it13 = (ActivityResult) obj;
                int i13 = MayaLoginActivity.f12721v;
                kotlin.jvm.internal.j.g(it13, "it");
                return Unit.f18162a;
            case 24:
                ActivityResult it14 = (ActivityResult) obj;
                int i14 = MayaWelcomeActivity.f12735u;
                kotlin.jvm.internal.j.g(it14, "it");
                return Unit.f18162a;
            case 25:
                ActivityResult it15 = (ActivityResult) obj;
                int i15 = MayaWelcomeActivity.f12735u;
                kotlin.jvm.internal.j.g(it15, "it");
                return Unit.f18162a;
            case 26:
                return Boolean.valueOf(OneAgentMetricsProvider._init_$lambda$0((Context) obj));
            case 27:
                return StorageModule.dataStore_delegate$lambda$0((CorruptionException) obj);
            case 28:
                return Core.lambda$startup$1((String) obj);
            default:
                return SessionParameterStoreKt.dataStore_delegate$lambda$0((CorruptionException) obj);
        }
    }
}
