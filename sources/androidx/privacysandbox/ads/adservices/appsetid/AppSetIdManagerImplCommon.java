package androidx.privacysandbox.ads.adservices.appsetid;

import Bj.C0151l;
import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.arch.core.executor.a;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.common.PlaybackException;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import hj.h;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 4), @RequiresExtension(extension = 31, version = 9)})
@SuppressLint({"ClassVerificationFailure", "NewApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AppSetIdManagerImplCommon extends AppSetIdManager {
    private final android.adservices.appsetid.AppSetIdManager mAppSetIdManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon", f = "AppSetIdManagerImplCommon.kt", l = {38}, m = "getAppSetId$suspendImpl")
    public static final class AnonymousClass1 extends AbstractC1609c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppSetIdManagerImplCommon.getAppSetId$suspendImpl(AppSetIdManagerImplCommon.this, this);
        }
    }

    public AppSetIdManagerImplCommon(android.adservices.appsetid.AppSetIdManager mAppSetIdManager) {
        j.g(mAppSetIdManager, "mAppSetIdManager");
        this.mAppSetIdManager = mAppSetIdManager;
    }

    private final AppSetId convertResponse(android.adservices.appsetid.AppSetId appSetId) {
        if (appSetId.getScope() == 1) {
            String id = appSetId.getId();
            j.f(id, "response.id");
            return new AppSetId(id, 1);
        }
        String id2 = appSetId.getId();
        j.f(id2, "response.id");
        return new AppSetId(id2, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object getAppSetId$suspendImpl(androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon r4, gj.InterfaceC1526a<? super androidx.privacysandbox.ads.adservices.appsetid.AppSetId> r5) {
        /*
            boolean r0 = r5 instanceof androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1 r0 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1 r0 = new androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon r4 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon) r4
            bj.AbstractC1039j.b(r5)
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            bj.AbstractC1039j.b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.getAppSetIdAsyncInternal(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            android.adservices.appsetid.AppSetId r5 = androidx.privacysandbox.ads.adservices.adselection.a.c(r5)
            androidx.privacysandbox.ads.adservices.appsetid.AppSetId r4 = r4.convertResponse(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon.getAppSetId$suspendImpl(androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon, gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAppSetIdAsyncInternal(InterfaceC1526a<? super android.adservices.appsetid.AppSetId> interfaceC1526a) {
        C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        this.mAppSetIdManager.getAppSetId(new a(2), OutcomeReceiverKt.asOutcomeReceiver(c0151l));
        Object objQ = c0151l.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objQ;
    }

    @Override // androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager
    @DoNotInline
    public Object getAppSetId(InterfaceC1526a<? super AppSetId> interfaceC1526a) {
        return getAppSetId$suspendImpl(this, interfaceC1526a);
    }
}
