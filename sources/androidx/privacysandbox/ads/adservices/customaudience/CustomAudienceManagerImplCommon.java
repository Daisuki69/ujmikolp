package androidx.privacysandbox.ads.adservices.customaudience;

import Bj.C0151l;
import android.adservices.common.AdData;
import android.adservices.customaudience.CustomAudience;
import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.common.PlaybackException;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import hj.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 4), @RequiresExtension(extension = 31, version = 9)})
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class CustomAudienceManagerImplCommon extends CustomAudienceManager {
    private final android.adservices.customaudience.CustomAudienceManager customAudienceManager;

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 10), @RequiresExtension(extension = 31, version = 10)})
    public static final class Ext10Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @DoNotInline
            public final Object fetchAndJoinCustomAudience(android.adservices.customaudience.CustomAudienceManager customAudienceManager, FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
                C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
                c0151l.r();
                customAudienceManager.fetchAndJoinCustomAudience(fetchAndJoinCustomAudienceRequest.convertToAdServices$ads_adservices_release(), new androidx.arch.core.executor.a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
                Object objQ = c0151l.q();
                return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
            }

            private Companion() {
            }
        }

        private Ext10Impl() {
        }
    }

    public CustomAudienceManagerImplCommon(android.adservices.customaudience.CustomAudienceManager customAudienceManager) {
        j.g(customAudienceManager, "customAudienceManager");
        this.customAudienceManager = customAudienceManager;
    }

    private final List<AdData> convertAds(List<androidx.privacysandbox.ads.adservices.common.AdData> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.privacysandbox.ads.adservices.common.AdData> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().convertToAdServices$ads_adservices_release());
        }
        return arrayList;
    }

    private final android.adservices.customaudience.CustomAudience convertCustomAudience(CustomAudience customAudience) {
        CustomAudience.Builder trustedBiddingData = a.a().setActivationTime(customAudience.getActivationTime()).setAds(convertAds(customAudience.getAds())).setBiddingLogicUri(customAudience.getBiddingLogicUri()).setBuyer(customAudience.getBuyer().convertToAdServices$ads_adservices_release()).setDailyUpdateUri(customAudience.getDailyUpdateUri()).setExpirationTime(customAudience.getExpirationTime()).setName(customAudience.getName()).setTrustedBiddingData(convertTrustedSignals(customAudience.getTrustedBiddingSignals()));
        AdSelectionSignals userBiddingSignals = customAudience.getUserBiddingSignals();
        android.adservices.customaudience.CustomAudience customAudienceBuild = trustedBiddingData.setUserBiddingSignals(userBiddingSignals != null ? userBiddingSignals.convertToAdServices$ads_adservices_release() : null).build();
        j.f(customAudienceBuild, "Builder()\n            .s…s())\n            .build()");
        return customAudienceBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.adservices.customaudience.JoinCustomAudienceRequest convertJoinRequest(JoinCustomAudienceRequest joinCustomAudienceRequest) {
        android.adservices.customaudience.JoinCustomAudienceRequest joinCustomAudienceRequestBuild = a.c().setCustomAudience(convertCustomAudience(joinCustomAudienceRequest.getCustomAudience())).build();
        j.f(joinCustomAudienceRequestBuild, "Builder()\n            .s…ce))\n            .build()");
        return joinCustomAudienceRequestBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.adservices.customaudience.LeaveCustomAudienceRequest convertLeaveRequest(LeaveCustomAudienceRequest leaveCustomAudienceRequest) {
        android.adservices.customaudience.LeaveCustomAudienceRequest leaveCustomAudienceRequestBuild = a.f().setBuyer(leaveCustomAudienceRequest.getBuyer().convertToAdServices$ads_adservices_release()).setName(leaveCustomAudienceRequest.getName()).build();
        j.f(leaveCustomAudienceRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return leaveCustomAudienceRequestBuild;
    }

    private final android.adservices.customaudience.TrustedBiddingData convertTrustedSignals(TrustedBiddingData trustedBiddingData) {
        if (trustedBiddingData == null) {
            return null;
        }
        return a.i().setTrustedBiddingKeys(trustedBiddingData.getTrustedBiddingKeys()).setTrustedBiddingUri(trustedBiddingData.getTrustedBiddingUri()).build();
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static Object fetchAndJoinCustomAudience$suspendImpl(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() < 10 && adServicesInfo.extServicesVersionS() < 10) {
            throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
        }
        Object objFetchAndJoinCustomAudience = Ext10Impl.Companion.fetchAndJoinCustomAudience(customAudienceManagerImplCommon.customAudienceManager, fetchAndJoinCustomAudienceRequest, interfaceC1526a);
        return objFetchAndJoinCustomAudience == EnumC1578a.f17050a ? objFetchAndJoinCustomAudience : Unit.f18162a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static Object joinCustomAudience$suspendImpl(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, JoinCustomAudienceRequest joinCustomAudienceRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        customAudienceManagerImplCommon.getCustomAudienceManager().joinCustomAudience(customAudienceManagerImplCommon.convertJoinRequest(joinCustomAudienceRequest), new androidx.arch.core.executor.a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
        Object objQ = c0151l.q();
        return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static Object leaveCustomAudience$suspendImpl(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, LeaveCustomAudienceRequest leaveCustomAudienceRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        customAudienceManagerImplCommon.getCustomAudienceManager().leaveCustomAudience(customAudienceManagerImplCommon.convertLeaveRequest(leaveCustomAudienceRequest), new androidx.arch.core.executor.a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
        Object objQ = c0151l.q();
        return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public Object fetchAndJoinCustomAudience(FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return fetchAndJoinCustomAudience$suspendImpl(this, fetchAndJoinCustomAudienceRequest, interfaceC1526a);
    }

    public final android.adservices.customaudience.CustomAudienceManager getCustomAudienceManager() {
        return this.customAudienceManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public Object joinCustomAudience(JoinCustomAudienceRequest joinCustomAudienceRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return joinCustomAudience$suspendImpl(this, joinCustomAudienceRequest, interfaceC1526a);
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public Object leaveCustomAudience(LeaveCustomAudienceRequest leaveCustomAudienceRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return leaveCustomAudience$suspendImpl(this, leaveCustomAudienceRequest, interfaceC1526a);
    }
}
