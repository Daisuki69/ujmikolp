package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.MissionMechanics;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MissionMechanics, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_MissionMechanics extends MissionMechanics {
    private final String mButtonLink;
    private final String mButtonTitle;
    private final String mDescription;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MissionMechanics$Builder */
    public static class Builder extends MissionMechanics.Builder {
        private String mButtonLink;
        private String mButtonTitle;
        private String mDescription;

        @Override // com.paymaya.domain.model.MissionMechanics.Builder
        public MissionMechanics build() {
            return new AutoValue_MissionMechanics(this.mDescription, this.mButtonTitle, this.mButtonLink);
        }

        @Override // com.paymaya.domain.model.MissionMechanics.Builder
        public MissionMechanics.Builder mButtonLink(@Nullable String str) {
            this.mButtonLink = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MissionMechanics.Builder
        public MissionMechanics.Builder mButtonTitle(@Nullable String str) {
            this.mButtonTitle = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MissionMechanics.Builder
        public MissionMechanics.Builder mDescription(@Nullable String str) {
            this.mDescription = str;
            return this;
        }
    }

    public C$$AutoValue_MissionMechanics(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.mDescription = str;
        this.mButtonTitle = str2;
        this.mButtonLink = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MissionMechanics) {
            MissionMechanics missionMechanics = (MissionMechanics) obj;
            String str = this.mDescription;
            if (str != null ? str.equals(missionMechanics.mDescription()) : missionMechanics.mDescription() == null) {
                String str2 = this.mButtonTitle;
                if (str2 != null ? str2.equals(missionMechanics.mButtonTitle()) : missionMechanics.mButtonTitle() == null) {
                    String str3 = this.mButtonLink;
                    if (str3 != null ? str3.equals(missionMechanics.mButtonLink()) : missionMechanics.mButtonLink() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mDescription;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mButtonTitle;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mButtonLink;
        return iHashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.MissionMechanics
    @Nullable
    @InterfaceC1498b("button_link")
    public String mButtonLink() {
        return this.mButtonLink;
    }

    @Override // com.paymaya.domain.model.MissionMechanics
    @Nullable
    @InterfaceC1498b("button_title")
    public String mButtonTitle() {
        return this.mButtonTitle;
    }

    @Override // com.paymaya.domain.model.MissionMechanics
    @Nullable
    @InterfaceC1498b("description")
    public String mDescription() {
        return this.mDescription;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MissionMechanics{mDescription=");
        sb2.append(this.mDescription);
        sb2.append(", mButtonTitle=");
        sb2.append(this.mButtonTitle);
        sb2.append(", mButtonLink=");
        return s.p(sb2, this.mButtonLink, "}");
    }
}
