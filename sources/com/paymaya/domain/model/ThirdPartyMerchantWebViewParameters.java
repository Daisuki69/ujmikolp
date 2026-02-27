package com.paymaya.domain.model;

import We.s;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ThirdPartyMerchantWebViewParameters {

    @InterfaceC1497a
    @InterfaceC1498b("redirect_url")
    private final String redirectUrl;

    @InterfaceC1497a
    @InterfaceC1498b("ticket_id")
    private final String ticketId;

    public ThirdPartyMerchantWebViewParameters(String ticketId, String redirectUrl) {
        j.g(ticketId, "ticketId");
        j.g(redirectUrl, "redirectUrl");
        this.ticketId = ticketId;
        this.redirectUrl = redirectUrl;
    }

    public static /* synthetic */ ThirdPartyMerchantWebViewParameters copy$default(ThirdPartyMerchantWebViewParameters thirdPartyMerchantWebViewParameters, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = thirdPartyMerchantWebViewParameters.ticketId;
        }
        if ((i & 2) != 0) {
            str2 = thirdPartyMerchantWebViewParameters.redirectUrl;
        }
        return thirdPartyMerchantWebViewParameters.copy(str, str2);
    }

    public final String component1() {
        return this.ticketId;
    }

    public final String component2() {
        return this.redirectUrl;
    }

    public final ThirdPartyMerchantWebViewParameters copy(String ticketId, String redirectUrl) {
        j.g(ticketId, "ticketId");
        j.g(redirectUrl, "redirectUrl");
        return new ThirdPartyMerchantWebViewParameters(ticketId, redirectUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdPartyMerchantWebViewParameters)) {
            return false;
        }
        ThirdPartyMerchantWebViewParameters thirdPartyMerchantWebViewParameters = (ThirdPartyMerchantWebViewParameters) obj;
        return j.b(this.ticketId, thirdPartyMerchantWebViewParameters.ticketId) && j.b(this.redirectUrl, thirdPartyMerchantWebViewParameters.redirectUrl);
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public int hashCode() {
        return this.redirectUrl.hashCode() + (this.ticketId.hashCode() * 31);
    }

    public String toString() {
        return s.l("ThirdPartyMerchantWebViewParameters(ticketId=", this.ticketId, ", redirectUrl=", this.redirectUrl, ")");
    }
}
