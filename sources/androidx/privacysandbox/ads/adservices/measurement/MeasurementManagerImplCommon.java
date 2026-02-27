package androidx.privacysandbox.ads.adservices.measurement;

import Bj.C0151l;
import Bj.E;
import Bj.H;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.common.PlaybackException;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import hj.h;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 5), @RequiresExtension(extension = 31, version = 9)})
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MeasurementManagerImplCommon extends MeasurementManager {
    private final android.adservices.measurement.MeasurementManager mMeasurementManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ SourceRegistrationRequest $request;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MeasurementManagerImplCommon this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(SourceRegistrationRequest sourceRegistrationRequest, MeasurementManagerImplCommon measurementManagerImplCommon, InterfaceC1526a<? super AnonymousClass4> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$request = sourceRegistrationRequest;
            this.this$0 = measurementManagerImplCommon;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$request, this.this$0, interfaceC1526a);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass4) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            E e = (E) this.L$0;
            List<Uri> registrationUris = this.$request.getRegistrationUris();
            MeasurementManagerImplCommon measurementManagerImplCommon = this.this$0;
            SourceRegistrationRequest sourceRegistrationRequest = this.$request;
            Iterator<T> it = registrationUris.iterator();
            while (it.hasNext()) {
                H.w(e, null, null, new MeasurementManagerImplCommon$registerSource$4$1$1(measurementManagerImplCommon, (Uri) it.next(), sourceRegistrationRequest, null), 3);
            }
            return Unit.f18162a;
        }
    }

    public MeasurementManagerImplCommon(android.adservices.measurement.MeasurementManager mMeasurementManager) {
        j.g(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    @DoNotInline
    public static Object deleteRegistrations$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, DeletionRequest deletionRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        measurementManagerImplCommon.getMMeasurementManager().deleteRegistrations(deletionRequest.convertToAdServices$ads_adservices_release(), new androidx.arch.core.executor.a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
        Object objQ = c0151l.q();
        return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static Object getMeasurementApiStatus$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, InterfaceC1526a<? super Integer> interfaceC1526a) {
        C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        measurementManagerImplCommon.getMMeasurementManager().getMeasurementApiStatus(new androidx.arch.core.executor.a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
        Object objQ = c0151l.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objQ;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, SourceRegistrationRequest sourceRegistrationRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        Object objL = H.l(new AnonymousClass4(sourceRegistrationRequest, measurementManagerImplCommon, null), interfaceC1526a);
        return objL == EnumC1578a.f17050a ? objL : Unit.f18162a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static Object registerTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InterfaceC1526a<? super Unit> interfaceC1526a) {
        C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        measurementManagerImplCommon.getMMeasurementManager().registerTrigger(uri, new androidx.arch.core.executor.a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
        Object objQ = c0151l.q();
        return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static Object registerWebSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebSourceRegistrationRequest webSourceRegistrationRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        measurementManagerImplCommon.getMMeasurementManager().registerWebSource(webSourceRegistrationRequest.convertToAdServices$ads_adservices_release(), new androidx.arch.core.executor.a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
        Object objQ = c0151l.q();
        return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static Object registerWebTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebTriggerRegistrationRequest webTriggerRegistrationRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        measurementManagerImplCommon.getMMeasurementManager().registerWebTrigger(webTriggerRegistrationRequest.convertToAdServices$ads_adservices_release(), new androidx.arch.core.executor.a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
        Object objQ = c0151l.q();
        return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @DoNotInline
    public Object deleteRegistrations(DeletionRequest deletionRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return deleteRegistrations$suspendImpl(this, deletionRequest, interfaceC1526a);
    }

    public final android.adservices.measurement.MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public Object getMeasurementApiStatus(InterfaceC1526a<? super Integer> interfaceC1526a) {
        return getMeasurementApiStatus$suspendImpl(this, interfaceC1526a);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public Object registerSource(Uri uri, InputEvent inputEvent, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return registerSource$suspendImpl(this, uri, inputEvent, interfaceC1526a);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public Object registerTrigger(Uri uri, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return registerTrigger$suspendImpl(this, uri, interfaceC1526a);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return registerWebSource$suspendImpl(this, webSourceRegistrationRequest, interfaceC1526a);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return registerWebTrigger$suspendImpl(this, webTriggerRegistrationRequest, interfaceC1526a);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, InterfaceC1526a<? super Unit> interfaceC1526a) {
        C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        measurementManagerImplCommon.getMMeasurementManager().registerSource(uri, inputEvent, new androidx.arch.core.executor.a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
        Object objQ = c0151l.q();
        return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    public Object registerSource(SourceRegistrationRequest sourceRegistrationRequest, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return registerSource$suspendImpl(this, sourceRegistrationRequest, interfaceC1526a);
    }
}
