package androidx.privacysandbox.ads.adservices.adselection;

import Bj.C0151l;
import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.common.PlaybackException;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import hj.h;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 4), @RequiresExtension(extension = 31, version = 9)})
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AdSelectionManagerImplCommon extends AdSelectionManager {
    private final android.adservices.adselection.AdSelectionManager mAdSelectionManager;

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 10), @RequiresExtension(extension = 31, version = 10)})
    public static final class Ext10Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @androidx.annotation.RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @androidx.annotation.DoNotInline
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object getAdSelectionData(android.adservices.adselection.AdSelectionManager r5, androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest r6, gj.InterfaceC1526a<? super androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome> r7) {
                /*
                    r4 = this;
                    boolean r0 = r7 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1
                    r0.<init>(r4, r7)
                L18:
                    java.lang.Object r7 = r0.result
                    hj.a r1 = hj.EnumC1578a.f17050a
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L38
                    if (r2 != r3) goto L30
                    java.lang.Object r5 = r0.L$1
                    androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest r5 = (androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest) r5
                    java.lang.Object r5 = r0.L$0
                    androidx.media3.datasource.g.x(r5)
                    bj.AbstractC1039j.b(r7)
                    goto L65
                L30:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L38:
                    bj.AbstractC1039j.b(r7)
                    r0.L$0 = r5
                    r0.L$1 = r6
                    r0.label = r3
                    Bj.l r7 = new Bj.l
                    gj.a r0 = hj.h.b(r0)
                    r7.<init>(r3, r0)
                    r7.r()
                    android.adservices.adselection.GetAdSelectionDataRequest r6 = r6.convertToAdServices$ads_adservices_release()
                    androidx.arch.core.executor.a r0 = new androidx.arch.core.executor.a
                    r2 = 2
                    r0.<init>(r2)
                    android.os.OutcomeReceiver r2 = androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(r7)
                    androidx.core.os.b.v(r5, r6, r0, r2)
                    java.lang.Object r7 = r7.q()
                    if (r7 != r1) goto L65
                    return r1
                L65:
                    android.adservices.adselection.GetAdSelectionDataOutcome r5 = androidx.core.os.b.h(r7)
                    androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome r6 = new androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome
                    r6.<init>(r5)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.Companion.getAdSelectionData(android.adservices.adselection.AdSelectionManager, androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest, gj.a):java.lang.Object");
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @androidx.annotation.RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @androidx.annotation.DoNotInline
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object persistAdSelectionResult(android.adservices.adselection.AdSelectionManager r5, androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest r6, gj.InterfaceC1526a<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> r7) {
                /*
                    r4 = this;
                    boolean r0 = r7 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1
                    r0.<init>(r4, r7)
                L18:
                    java.lang.Object r7 = r0.result
                    hj.a r1 = hj.EnumC1578a.f17050a
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L38
                    if (r2 != r3) goto L30
                    java.lang.Object r5 = r0.L$1
                    androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest r5 = (androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest) r5
                    java.lang.Object r5 = r0.L$0
                    androidx.media3.datasource.g.x(r5)
                    bj.AbstractC1039j.b(r7)
                    goto L65
                L30:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L38:
                    bj.AbstractC1039j.b(r7)
                    r0.L$0 = r5
                    r0.L$1 = r6
                    r0.label = r3
                    Bj.l r7 = new Bj.l
                    gj.a r0 = hj.h.b(r0)
                    r7.<init>(r3, r0)
                    r7.r()
                    android.adservices.adselection.PersistAdSelectionResultRequest r6 = r6.convertToAdServices$ads_adservices_release()
                    androidx.arch.core.executor.a r0 = new androidx.arch.core.executor.a
                    r2 = 2
                    r0.<init>(r2)
                    android.os.OutcomeReceiver r2 = androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(r7)
                    androidx.core.os.b.w(r5, r6, r0, r2)
                    java.lang.Object r7 = r7.q()
                    if (r7 != r1) goto L65
                    return r1
                L65:
                    android.adservices.adselection.AdSelectionOutcome r5 = androidx.media3.datasource.g.o(r7)
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r6 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome
                    r6.<init>(r5)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.Companion.persistAdSelectionResult(android.adservices.adselection.AdSelectionManager, androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest, gj.a):java.lang.Object");
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @androidx.annotation.RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @androidx.annotation.DoNotInline
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object selectAds(android.adservices.adselection.AdSelectionManager r5, androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig r6, gj.InterfaceC1526a<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> r7) {
                /*
                    r4 = this;
                    boolean r0 = r7 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1
                    r0.<init>(r4, r7)
                L18:
                    java.lang.Object r7 = r0.result
                    hj.a r1 = hj.EnumC1578a.f17050a
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L38
                    if (r2 != r3) goto L30
                    java.lang.Object r5 = r0.L$1
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig r5 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig) r5
                    java.lang.Object r5 = r0.L$0
                    androidx.media3.datasource.g.x(r5)
                    bj.AbstractC1039j.b(r7)
                    goto L65
                L30:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L38:
                    bj.AbstractC1039j.b(r7)
                    r0.L$0 = r5
                    r0.L$1 = r6
                    r0.label = r3
                    Bj.l r7 = new Bj.l
                    gj.a r0 = hj.h.b(r0)
                    r7.<init>(r3, r0)
                    r7.r()
                    android.adservices.adselection.AdSelectionFromOutcomesConfig r6 = r6.convertToAdServices$ads_adservices_release()
                    androidx.arch.core.executor.a r0 = new androidx.arch.core.executor.a
                    r2 = 2
                    r0.<init>(r2)
                    android.os.OutcomeReceiver r2 = androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(r7)
                    androidx.core.os.b.u(r5, r6, r0, r2)
                    java.lang.Object r7 = r7.q()
                    if (r7 != r1) goto L65
                    return r1
                L65:
                    android.adservices.adselection.AdSelectionOutcome r5 = androidx.media3.datasource.g.o(r7)
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r6 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome
                    r6.<init>(r5)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.Companion.selectAds(android.adservices.adselection.AdSelectionManager, androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig, gj.a):java.lang.Object");
            }

            private Companion() {
            }
        }

        private Ext10Impl() {
        }
    }

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 8), @RequiresExtension(extension = 31, version = 9)})
    public static final class Ext8Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @DoNotInline
            public final Object reportEvent(android.adservices.adselection.AdSelectionManager adSelectionManager, ReportEventRequest reportEventRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
                C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
                c0151l.r();
                adSelectionManager.reportEvent(reportEventRequest.convertToAdServices$ads_adservices_release(), new androidx.arch.core.executor.a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
                Object objQ = c0151l.q();
                return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
            }

            @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @DoNotInline
            public final Object updateAdCounterHistogram(android.adservices.adselection.AdSelectionManager adSelectionManager, UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
                C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
                c0151l.r();
                adSelectionManager.updateAdCounterHistogram(updateAdCounterHistogramRequest.convertToAdServices$ads_adservices_release(), new androidx.arch.core.executor.a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
                Object objQ = c0151l.q();
                return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
            }

            private Companion() {
            }
        }

        private Ext8Impl() {
        }
    }

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon", f = "AdSelectionManagerImplCommon.kt", l = {44}, m = "selectAds$suspendImpl")
    public static final class AnonymousClass1 extends AbstractC1609c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdSelectionManagerImplCommon.selectAds$suspendImpl(AdSelectionManagerImplCommon.this, (AdSelectionConfig) null, this);
        }
    }

    public AdSelectionManagerImplCommon(android.adservices.adselection.AdSelectionManager mAdSelectionManager) {
        j.g(mAdSelectionManager, "mAdSelectionManager");
        this.mAdSelectionManager = mAdSelectionManager;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static /* synthetic */ Object getAdSelectionData$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, GetAdSelectionDataRequest getAdSelectionDataRequest, InterfaceC1526a<? super GetAdSelectionDataOutcome> interfaceC1526a) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) {
            return Ext10Impl.Companion.getAdSelectionData(adSelectionManagerImplCommon.mAdSelectionManager, getAdSelectionDataRequest, interfaceC1526a);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static /* synthetic */ Object persistAdSelectionResult$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, PersistAdSelectionResultRequest persistAdSelectionResultRequest, InterfaceC1526a<? super AdSelectionOutcome> interfaceC1526a) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) {
            return Ext10Impl.Companion.persistAdSelectionResult(adSelectionManagerImplCommon.mAdSelectionManager, persistAdSelectionResultRequest, interfaceC1526a);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static Object reportEvent$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportEventRequest reportEventRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() < 8 && adServicesInfo.extServicesVersionS() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objReportEvent = Ext8Impl.Companion.reportEvent(adSelectionManagerImplCommon.mAdSelectionManager, reportEventRequest, interfaceC1526a);
        return objReportEvent == EnumC1578a.f17050a ? objReportEvent : Unit.f18162a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static Object reportImpression$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportImpressionRequest reportImpressionRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        adSelectionManagerImplCommon.getMAdSelectionManager().reportImpression(reportImpressionRequest.convertToAdServices$ads_adservices_release(), new androidx.arch.core.executor.a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
        Object objQ = c0151l.q();
        return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.annotation.DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object selectAds$suspendImpl(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon r4, androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig r5, gj.InterfaceC1526a<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            bj.AbstractC1039j.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            bj.AbstractC1039j.b(r6)
            android.adservices.adselection.AdSelectionConfig r5 = r5.convertToAdServices$ads_adservices_release()
            r0.label = r3
            java.lang.Object r6 = r4.selectAdsInternal(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            android.adservices.adselection.AdSelectionOutcome r4 = androidx.media3.datasource.g.o(r6)
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r5 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.selectAds$suspendImpl(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon, androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig, gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public final Object selectAdsInternal(android.adservices.adselection.AdSelectionConfig adSelectionConfig, InterfaceC1526a<? super android.adservices.adselection.AdSelectionOutcome> interfaceC1526a) {
        C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        getMAdSelectionManager().selectAds(adSelectionConfig, new androidx.arch.core.executor.a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
        Object objQ = c0151l.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objQ;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static Object updateAdCounterHistogram$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() < 8 && adServicesInfo.extServicesVersionS() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objUpdateAdCounterHistogram = Ext8Impl.Companion.updateAdCounterHistogram(adSelectionManagerImplCommon.mAdSelectionManager, updateAdCounterHistogramRequest, interfaceC1526a);
        return objUpdateAdCounterHistogram == EnumC1578a.f17050a ? objUpdateAdCounterHistogram : Unit.f18162a;
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public Object getAdSelectionData(GetAdSelectionDataRequest getAdSelectionDataRequest, InterfaceC1526a<? super GetAdSelectionDataOutcome> interfaceC1526a) {
        return getAdSelectionData$suspendImpl(this, getAdSelectionDataRequest, interfaceC1526a);
    }

    public final android.adservices.adselection.AdSelectionManager getMAdSelectionManager() {
        return this.mAdSelectionManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public Object persistAdSelectionResult(PersistAdSelectionResultRequest persistAdSelectionResultRequest, InterfaceC1526a<? super AdSelectionOutcome> interfaceC1526a) {
        return persistAdSelectionResult$suspendImpl(this, persistAdSelectionResultRequest, interfaceC1526a);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public Object reportEvent(ReportEventRequest reportEventRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return reportEvent$suspendImpl(this, reportEventRequest, interfaceC1526a);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public Object reportImpression(ReportImpressionRequest reportImpressionRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return reportImpression$suspendImpl(this, reportImpressionRequest, interfaceC1526a);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public Object selectAds(AdSelectionConfig adSelectionConfig, InterfaceC1526a<? super AdSelectionOutcome> interfaceC1526a) {
        return selectAds$suspendImpl(this, adSelectionConfig, interfaceC1526a);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public Object updateAdCounterHistogram(UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return updateAdCounterHistogram$suspendImpl(this, updateAdCounterHistogramRequest, interfaceC1526a);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public Object selectAds(AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, InterfaceC1526a<? super AdSelectionOutcome> interfaceC1526a) {
        return selectAds$suspendImpl(this, adSelectionFromOutcomesConfig, interfaceC1526a);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static /* synthetic */ Object selectAds$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, InterfaceC1526a<? super AdSelectionOutcome> interfaceC1526a) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() < 10 && adServicesInfo.extServicesVersionS() < 10) {
            throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
        }
        return Ext10Impl.Companion.selectAds(adSelectionManagerImplCommon.mAdSelectionManager, adSelectionFromOutcomesConfig, interfaceC1526a);
    }
}
