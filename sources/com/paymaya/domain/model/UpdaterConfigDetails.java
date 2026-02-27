package com.paymaya.domain.model;

import Q5.a;
import We.s;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.r;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class UpdaterConfigDetails {
    private static final int DEFAULT_VALUE_BUILD_NUMBER = 0;
    private static final boolean DEFAULT_VALUE_IS_MANDATORY = true;
    private static final String DEFAULT_VALUE_STORE_LINK = "https://play.google.com/store/apps/details?id=com.paymaya";
    private static final String SERIALIZED_NAME_BUILD_NUMBER = "buildNumber";
    private static final String SERIALIZED_NAME_IS_MANDATORY = "isMandatory";
    private static final String SERIALIZED_NAME_STORE_LINK = "storeLink";

    @InterfaceC1497a
    @InterfaceC1498b(SERIALIZED_NAME_BUILD_NUMBER)
    private final int buildNumber;

    @InterfaceC1497a
    @InterfaceC1498b(SERIALIZED_NAME_IS_MANDATORY)
    private final boolean isMandatory;

    @InterfaceC1497a
    @InterfaceC1498b(SERIALIZED_NAME_STORE_LINK)
    private final String storeLink;
    public static final Companion Companion = new Companion(null);
    private static final n deserializer = new a(4);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n getDeserializer() {
            return UpdaterConfigDetails.deserializer;
        }

        private Companion() {
        }
    }

    public UpdaterConfigDetails() {
        this(0, false, null, 7, null);
    }

    public static /* synthetic */ UpdaterConfigDetails copy$default(UpdaterConfigDetails updaterConfigDetails, int i, boolean z4, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = updaterConfigDetails.buildNumber;
        }
        if ((i4 & 2) != 0) {
            z4 = updaterConfigDetails.isMandatory;
        }
        if ((i4 & 4) != 0) {
            str = updaterConfigDetails.storeLink;
        }
        return updaterConfigDetails.copy(i, z4, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdaterConfigDetails deserializer$lambda$3(o oVar, Type type, m mVar) {
        String strJ;
        try {
            q qVarG = oVar.g();
            o oVarM = qVarG.m(SERIALIZED_NAME_BUILD_NUMBER);
            r rVar = oVarM instanceof r ? (r) oVarM : null;
            if (rVar != null) {
                if (!(rVar.f10035a instanceof Number)) {
                    rVar = null;
                }
                if (rVar != null) {
                    int iE = rVar.e();
                    o oVarM2 = qVarG.m(SERIALIZED_NAME_IS_MANDATORY);
                    r rVar2 = oVarM2 instanceof r ? (r) oVarM2 : null;
                    if (rVar2 != null) {
                        if (!(rVar2.f10035a instanceof Boolean)) {
                            rVar2 = null;
                        }
                        if (rVar2 != null) {
                            boolean zC = rVar2.c();
                            o oVarM3 = qVarG.m(SERIALIZED_NAME_STORE_LINK);
                            r rVar3 = oVarM3 instanceof r ? (r) oVarM3 : null;
                            if (rVar3 != null) {
                                r rVar4 = rVar3.f10035a instanceof String ? rVar3 : null;
                                if (rVar4 != null && (strJ = rVar4.j()) != null) {
                                    return new UpdaterConfigDetails(iE, zC, strJ);
                                }
                            }
                            return new UpdaterConfigDetails(0, false, null, 7, null);
                        }
                    }
                    return new UpdaterConfigDetails(0, false, null, 7, null);
                }
            }
            return new UpdaterConfigDetails(0, false, null, 7, null);
        } catch (Exception e) {
            e.printStackTrace();
            return new UpdaterConfigDetails(0, false, null, 7, null);
        }
    }

    public final int component1() {
        return this.buildNumber;
    }

    public final boolean component2() {
        return this.isMandatory;
    }

    public final String component3() {
        return this.storeLink;
    }

    public final UpdaterConfigDetails copy(int i, boolean z4, String storeLink) {
        j.g(storeLink, "storeLink");
        return new UpdaterConfigDetails(i, z4, storeLink);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdaterConfigDetails)) {
            return false;
        }
        UpdaterConfigDetails updaterConfigDetails = (UpdaterConfigDetails) obj;
        return this.buildNumber == updaterConfigDetails.buildNumber && this.isMandatory == updaterConfigDetails.isMandatory && j.b(this.storeLink, updaterConfigDetails.storeLink);
    }

    public final int getBuildNumber() {
        return this.buildNumber;
    }

    public final String getStoreLink() {
        return this.storeLink;
    }

    public int hashCode() {
        return this.storeLink.hashCode() + (((this.buildNumber * 31) + (this.isMandatory ? 1231 : 1237)) * 31);
    }

    public final boolean isMandatory() {
        return this.isMandatory;
    }

    public String toString() {
        int i = this.buildNumber;
        boolean z4 = this.isMandatory;
        String str = this.storeLink;
        StringBuilder sb2 = new StringBuilder("UpdaterConfigDetails(buildNumber=");
        sb2.append(i);
        sb2.append(", isMandatory=");
        sb2.append(z4);
        sb2.append(", storeLink=");
        return s.p(sb2, str, ")");
    }

    public UpdaterConfigDetails(int i, boolean z4, String storeLink) {
        j.g(storeLink, "storeLink");
        this.buildNumber = i;
        this.isMandatory = z4;
        this.storeLink = storeLink;
    }

    public /* synthetic */ UpdaterConfigDetails(int i, boolean z4, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? true : z4, (i4 & 4) != 0 ? DEFAULT_VALUE_STORE_LINK : str);
    }
}
