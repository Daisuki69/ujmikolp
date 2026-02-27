package bg;

import android.content.Context;
import cj.C1127m;
import java.io.BufferedInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: bg.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1020x extends kotlin.jvm.internal.k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R4.i f9137b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1020x(R4.i iVar, int i) {
        super(0);
        this.f9136a = i;
        this.f9137b = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws CertificateException {
        R4.i iVar = this.f9137b;
        switch (this.f9136a) {
            case 0:
                Object obj = ((LinkedHashMap) iVar.f5470b).get(Context.class.getName());
                if (obj == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke = ((Function0) obj).invoke();
                if (objInvoke == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
                }
                Context context = (Context) objInvoke;
                Function0 function0 = (Function0) ((LinkedHashMap) iVar.f5470b).get(Xf.b.class.getName());
                Object objInvoke2 = function0 != null ? function0.invoke() : null;
                return new o0(context, (Xf.b) (objInvoke2 instanceof Xf.b ? objInvoke2 : null));
            case 1:
                Object obj2 = ((LinkedHashMap) iVar.f5470b).get(C1013q.class.getName());
                if (obj2 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke3 = ((Function0) obj2).invoke();
                if (objInvoke3 != null) {
                    return (C1013q) objInvoke3;
                }
                throw new TypeCastException("null cannot be cast to non-null type credoapp.service.ModuleDiscoveryService");
            case 2:
                Object obj3 = ((LinkedHashMap) iVar.f5470b).get(C1013q.class.getName());
                if (obj3 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke4 = ((Function0) obj3).invoke();
                if (objInvoke4 != null) {
                    return (C1013q) objInvoke4;
                }
                throw new TypeCastException("null cannot be cast to non-null type credoapp.service.ModuleDiscoveryService");
            case 3:
                Object obj4 = ((LinkedHashMap) iVar.f5470b).get(C1013q.class.getName());
                if (obj4 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke5 = ((Function0) obj4).invoke();
                if (objInvoke5 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.contract.IModuleDiscovery");
                }
                Function0 function02 = (Function0) ((LinkedHashMap) iVar.f5470b).get(Xf.b.class.getName());
                Object objInvoke6 = function02 != null ? function02.invoke() : null;
                return new v0((Xf.b) (objInvoke6 instanceof Xf.b ? objInvoke6 : null));
            case 4:
                Function0 function03 = (Function0) ((LinkedHashMap) iVar.f5470b).get(Xf.b.class.getName());
                Object objInvoke7 = function03 != null ? function03.invoke() : null;
                return new C1003i((Xf.b) (objInvoke7 instanceof Xf.b ? objInvoke7 : null));
            case 5:
                Object obj5 = ((LinkedHashMap) iVar.f5470b).get(Wf.d.class.getName());
                if (obj5 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke8 = ((Function0) obj5).invoke();
                if (objInvoke8 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.CredoAppService");
                }
                Wf.d dVar = (Wf.d) objInvoke8;
                Object obj6 = ((LinkedHashMap) iVar.f5470b).get(Context.class.getName());
                if (obj6 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke9 = ((Function0) obj6).invoke();
                if (objInvoke9 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
                }
                Pair pair = new Pair("v1.context", (Context) objInvoke9);
                LinkedHashMap linkedHashMap = (LinkedHashMap) iVar.f5470b;
                Object obj7 = linkedHashMap.get(x0.class.getName());
                if (obj7 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke10 = ((Function0) obj7).invoke();
                if (objInvoke10 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.internal.v1.contract.ILocationTransformer");
                }
                Pair pair2 = new Pair("v1.location_transformer", (x0) objInvoke10);
                Object obj8 = linkedHashMap.get(n0.class.getName());
                if (obj8 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke11 = ((Function0) obj8).invoke();
                if (objInvoke11 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.internal.v1.contract.IPermissionHelper");
                }
                Pair pair3 = new Pair("v1.permission_helper", (n0) objInvoke11);
                Object obj9 = linkedHashMap.get(C0966H.class.getName());
                if (obj9 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke12 = ((Function0) obj9).invoke();
                if (objInvoke12 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.internal.v1.contract.IAccountManager");
                }
                Pair pair4 = new Pair("v1.account_manager", (C0966H) objInvoke12);
                Object obj10 = linkedHashMap.get(t0.class.getName());
                if (obj10 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke13 = ((Function0) obj10).invoke();
                if (objInvoke13 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.internal.v1.contract.IPhoneNumberManager");
                }
                Pair pair5 = new Pair("v1.pn_manager", (t0) objInvoke13);
                Object obj11 = linkedHashMap.get(o0.class.getName());
                if (obj11 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke14 = ((Function0) obj11).invoke();
                if (objInvoke14 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.internal.v1.contract.IContactManager");
                }
                Pair pair6 = new Pair("v1.contact_manager", (o0) objInvoke14);
                Object obj12 = linkedHashMap.get(u0.class.getName());
                if (obj12 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke15 = ((Function0) obj12).invoke();
                if (objInvoke15 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.utils.DataCollectionObserver");
                }
                Pair pair7 = new Pair("v1.dc_observer", (u0) objInvoke15);
                Function0 function04 = (Function0) linkedHashMap.get(Xf.b.class.getName());
                Object objInvoke16 = function04 != null ? function04.invoke() : null;
                if (!(objInvoke16 instanceof Xf.b)) {
                    objInvoke16 = null;
                }
                Pair pair8 = new Pair("v1.logger", (Xf.b) objInvoke16);
                Function0 function05 = (Function0) linkedHashMap.get(AbstractC0983W.class.getName());
                if (function05 != null) {
                    function05.invoke();
                }
                return new Wf.c(dVar, cj.M.h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("v1.au_info", null)));
            case 6:
                Object obj13 = ((LinkedHashMap) iVar.f5470b).get(Context.class.getName());
                if (obj13 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke17 = ((Function0) obj13).invoke();
                if (objInvoke17 != null) {
                    return new n0((Context) objInvoke17);
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
            case 7:
                Object obj14 = ((LinkedHashMap) iVar.f5470b).get(C0952A.class.getName());
                if (obj14 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke18 = ((Function0) obj14).invoke();
                if (objInvoke18 != null) {
                    return new r0((C0952A) objInvoke18);
                }
                throw new TypeCastException("null cannot be cast to non-null type credoapp.contract.ISignature");
            case 8:
                Object obj15 = ((LinkedHashMap) iVar.f5470b).get(C0972K.class.getName());
                if (obj15 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke19 = ((Function0) obj15).invoke();
                if (objInvoke19 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.core.crypt.IAesEncryptor");
                }
                Object obj16 = ((LinkedHashMap) iVar.f5470b).get(C0957C0.class.getName());
                if (obj16 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke20 = ((Function0) obj16).invoke();
                if (objInvoke20 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.core.crypt.IRsaEncryptor");
                }
                return new C1015s();
            default:
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                Object obj17 = ((LinkedHashMap) iVar.f5470b).get(Context.class.getName());
                if (obj17 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke21 = ((Function0) obj17).invoke();
                if (objInvoke21 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
                }
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new BufferedInputStream(((Context) objInvoke21).getAssets().open("credoapp.crt")));
                if (certificateGenerateCertificate == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                C0957C0 c0957c0 = new C0957C0();
                byte[] extensionValue = ((X509Certificate) certificateGenerateCertificate).getExtensionValue("2.5.29.14");
                C1127m.k(extensionValue.length - 20, extensionValue.length, extensionValue);
                return c0957c0;
        }
    }
}
