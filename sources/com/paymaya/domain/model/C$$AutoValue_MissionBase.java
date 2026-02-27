package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.MissionBase;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MissionBase, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_MissionBase extends MissionBase {
    private final List<Mission> mMissions;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MissionBase$Builder */
    public static class Builder extends MissionBase.Builder {
        private List<Mission> mMissions;

        @Override // com.paymaya.domain.model.MissionBase.Builder
        public MissionBase build() {
            String str = this.mMissions == null ? " mMissions" : "";
            if (str.isEmpty()) {
                return new AutoValue_MissionBase(this.mMissions);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.MissionBase.Builder
        public MissionBase.Builder mMissions(List<Mission> list) {
            if (list == null) {
                throw new NullPointerException("Null mMissions");
            }
            this.mMissions = list;
            return this;
        }
    }

    public C$$AutoValue_MissionBase(List<Mission> list) {
        if (list == null) {
            throw new NullPointerException("Null mMissions");
        }
        this.mMissions = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MissionBase) {
            return this.mMissions.equals(((MissionBase) obj).mMissions());
        }
        return false;
    }

    public int hashCode() {
        return this.mMissions.hashCode() ^ 1000003;
    }

    @Override // com.paymaya.domain.model.MissionBase
    @InterfaceC1498b("missions")
    public List<Mission> mMissions() {
        return this.mMissions;
    }

    public String toString() {
        return s.r(new StringBuilder("MissionBase{mMissions="), this.mMissions, "}");
    }
}
