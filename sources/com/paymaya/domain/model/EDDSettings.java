package com.paymaya.domain.model;

import We.s;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public final class EDDSettings {

    @InterfaceC1497a
    @InterfaceC1498b("max_alternative_income_sources")
    private final int maxAlternativeIncomeSources;

    @InterfaceC1497a
    @InterfaceC1498b("max_banks")
    private final int maxBanks;

    @InterfaceC1497a
    @InterfaceC1498b("max_financial_docs")
    private final int maxFinancialDocs;

    @InterfaceC1497a
    @InterfaceC1498b("max_related_companies")
    private final int maxRelatedCompanies;

    public EDDSettings(int i, int i4, int i6, int i10) {
        this.maxBanks = i;
        this.maxAlternativeIncomeSources = i4;
        this.maxRelatedCompanies = i6;
        this.maxFinancialDocs = i10;
    }

    public static /* synthetic */ EDDSettings copy$default(EDDSettings eDDSettings, int i, int i4, int i6, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = eDDSettings.maxBanks;
        }
        if ((i11 & 2) != 0) {
            i4 = eDDSettings.maxAlternativeIncomeSources;
        }
        if ((i11 & 4) != 0) {
            i6 = eDDSettings.maxRelatedCompanies;
        }
        if ((i11 & 8) != 0) {
            i10 = eDDSettings.maxFinancialDocs;
        }
        return eDDSettings.copy(i, i4, i6, i10);
    }

    public final int component1() {
        return this.maxBanks;
    }

    public final int component2() {
        return this.maxAlternativeIncomeSources;
    }

    public final int component3() {
        return this.maxRelatedCompanies;
    }

    public final int component4() {
        return this.maxFinancialDocs;
    }

    public final EDDSettings copy(int i, int i4, int i6, int i10) {
        return new EDDSettings(i, i4, i6, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EDDSettings)) {
            return false;
        }
        EDDSettings eDDSettings = (EDDSettings) obj;
        return this.maxBanks == eDDSettings.maxBanks && this.maxAlternativeIncomeSources == eDDSettings.maxAlternativeIncomeSources && this.maxRelatedCompanies == eDDSettings.maxRelatedCompanies && this.maxFinancialDocs == eDDSettings.maxFinancialDocs;
    }

    public final int getMaxAlternativeIncomeSources() {
        return this.maxAlternativeIncomeSources;
    }

    public final int getMaxBanks() {
        return this.maxBanks;
    }

    public final int getMaxFinancialDocs() {
        return this.maxFinancialDocs;
    }

    public final int getMaxRelatedCompanies() {
        return this.maxRelatedCompanies;
    }

    public int hashCode() {
        return (((((this.maxBanks * 31) + this.maxAlternativeIncomeSources) * 31) + this.maxRelatedCompanies) * 31) + this.maxFinancialDocs;
    }

    public String toString() {
        int i = this.maxBanks;
        int i4 = this.maxAlternativeIncomeSources;
        int i6 = this.maxRelatedCompanies;
        int i10 = this.maxFinancialDocs;
        StringBuilder sbU = s.u("EDDSettings(maxBanks=", i, ", maxAlternativeIncomeSources=", i4, ", maxRelatedCompanies=");
        sbU.append(i6);
        sbU.append(", maxFinancialDocs=");
        sbU.append(i10);
        sbU.append(")");
        return sbU.toString();
    }
}
