package com.paymaya.domain.model;

/* JADX INFO: loaded from: classes4.dex */
public final class UnderwritingDetailsRequestBuilder {
    private ProfileTin sss;
    private ProfileTin tin;
    private WorkDetails workDetails;

    public final UnderwritingDetails build() {
        return new UnderwritingDetails(this.workDetails, this.tin, this.sss);
    }

    public final ProfileTin getSss() {
        return this.sss;
    }

    public final ProfileTin getTin() {
        return this.tin;
    }

    public final WorkDetails getWorkDetails() {
        return this.workDetails;
    }

    /* JADX INFO: renamed from: setSss, reason: collision with other method in class */
    public final void m178setSss(ProfileTin profileTin) {
        this.sss = profileTin;
    }

    /* JADX INFO: renamed from: setTin, reason: collision with other method in class */
    public final void m179setTin(ProfileTin profileTin) {
        this.tin = profileTin;
    }

    /* JADX INFO: renamed from: setWorkDetails, reason: collision with other method in class */
    public final void m180setWorkDetails(WorkDetails workDetails) {
        this.workDetails = workDetails;
    }

    public final UnderwritingDetailsRequestBuilder setSss(ProfileTin profileTin) {
        this.sss = profileTin;
        return this;
    }

    public final UnderwritingDetailsRequestBuilder setTin(ProfileTin profileTin) {
        this.tin = profileTin;
        return this;
    }

    public final UnderwritingDetailsRequestBuilder setWorkDetails(WorkDetails workDetails) {
        this.workDetails = workDetails;
        return this;
    }
}
