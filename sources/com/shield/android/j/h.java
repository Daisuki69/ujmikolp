package com.shield.android.j;

import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import mx_android.support.v7.media.MediaRouter;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'pd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private static h f15444pd;

    /* JADX INFO: renamed from: pe, reason: collision with root package name */
    private static h f15445pe;
    private static h pf;

    /* JADX INFO: renamed from: pg, reason: collision with root package name */
    private static h f15446pg;

    /* JADX INFO: renamed from: ph, reason: collision with root package name */
    private static h f15447ph;

    /* JADX INFO: renamed from: pi, reason: collision with root package name */
    private static h f15448pi;

    /* JADX INFO: renamed from: pj, reason: collision with root package name */
    private static h f15449pj;

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private static h f15450pk;
    private static h pl;
    private static h pm;
    private static h pn;
    private static final /* synthetic */ h[] pu;
    private final int po;
    private final String pp;
    private final f pq;
    private final com.shield.android.r.h<String, ? extends AlgorithmParameterSpec> pr;
    private final int ps;
    private final int pt;

    static {
        f fVar = f.CHUNKED_SHA256;
        f15444pd = new h("RSA_PSS_WITH_SHA256", 0, 257, fVar, "RSA", com.shield.android.r.h.a("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1)), 24, 23);
        f fVar2 = f.CHUNKED_SHA512;
        f15445pe = new h("RSA_PSS_WITH_SHA512", 1, MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_REMOVED, fVar2, "RSA", com.shield.android.r.h.a("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1)), 24, 23);
        pf = new h("RSA_PKCS1_V1_5_WITH_SHA256", 2, MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_CHANGED, fVar, "RSA", com.shield.android.r.h.a("SHA256withRSA", null), 24, 1);
        f15446pg = new h("RSA_PKCS1_V1_5_WITH_SHA512", 3, MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED, fVar2, "RSA", com.shield.android.r.h.a("SHA512withRSA", null), 24, 1);
        f15447ph = new h("ECDSA_WITH_SHA256", 4, 513, fVar, "EC", com.shield.android.r.h.a("SHA256withECDSA", null), 24, 11);
        f15448pi = new h("ECDSA_WITH_SHA512", 5, MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_PROVIDER_REMOVED, fVar2, "EC", com.shield.android.r.h.a("SHA512withECDSA", null), 24, 11);
        f15449pj = new h("DSA_WITH_SHA256", 6, 769, fVar, "DSA", com.shield.android.r.h.a("SHA256withDSA", null), 24, 1);
        f15450pk = new h("DETDSA_WITH_SHA256", 7, 769, fVar, "DSA", com.shield.android.r.h.a("SHA256withDetDSA", null), 24, 1);
        f fVar3 = f.VERITY_CHUNKED_SHA256;
        pl = new h("VERITY_RSA_PKCS1_V1_5_WITH_SHA256", 8, 1057, fVar3, "RSA", com.shield.android.r.h.a("SHA256withRSA", null), 28, 1);
        pm = new h("VERITY_ECDSA_WITH_SHA256", 9, 1059, fVar3, "EC", com.shield.android.r.h.a("SHA256withECDSA", null), 28, 11);
        h hVar = new h("VERITY_DSA_WITH_SHA256", 10, 1061, fVar3, "DSA", com.shield.android.r.h.a("SHA256withDSA", null), 28, 1);
        pn = hVar;
        pu = new h[]{f15444pd, f15445pe, pf, f15446pg, f15447ph, f15448pi, f15449pj, f15450pk, pl, pm, hVar};
    }

    private h(String str, int i, int i4, f fVar, String str2, com.shield.android.r.h hVar, int i6, int i10) {
        this.po = i4;
        this.pq = fVar;
        this.pp = str2;
        this.pr = hVar;
        this.ps = i6;
        this.pt = i10;
    }

    public static h m(int i) {
        for (h hVar : (h[]) pu.clone()) {
            if (hVar.po == i) {
                return hVar;
            }
        }
        return null;
    }

    public final int dF() {
        return this.po;
    }

    public final f dG() {
        return this.pq;
    }

    public final String dH() {
        return this.pp;
    }

    public final com.shield.android.r.h<String, ? extends AlgorithmParameterSpec> dI() {
        return this.pr;
    }

    public final int dJ() {
        return this.ps;
    }

    public final int dK() {
        return this.pt;
    }
}
