package com.paymaya.domain.model;

import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class BillersPagedListV3Response {

    @InterfaceC1497a
    @InterfaceC1498b("billers")
    private final List<BillerV3Response> billers;

    @InterfaceC1497a
    @InterfaceC1498b("page")
    private final PageInfoResponse page;

    public BillersPagedListV3Response(PageInfoResponse page, List<BillerV3Response> billers) {
        j.g(page, "page");
        j.g(billers, "billers");
        this.page = page;
        this.billers = billers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BillersPagedListV3Response copy$default(BillersPagedListV3Response billersPagedListV3Response, PageInfoResponse pageInfoResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            pageInfoResponse = billersPagedListV3Response.page;
        }
        if ((i & 2) != 0) {
            list = billersPagedListV3Response.billers;
        }
        return billersPagedListV3Response.copy(pageInfoResponse, list);
    }

    public final PageInfoResponse component1() {
        return this.page;
    }

    public final List<BillerV3Response> component2() {
        return this.billers;
    }

    public final BillersPagedListV3Response copy(PageInfoResponse page, List<BillerV3Response> billers) {
        j.g(page, "page");
        j.g(billers, "billers");
        return new BillersPagedListV3Response(page, billers);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillersPagedListV3Response)) {
            return false;
        }
        BillersPagedListV3Response billersPagedListV3Response = (BillersPagedListV3Response) obj;
        return j.b(this.page, billersPagedListV3Response.page) && j.b(this.billers, billersPagedListV3Response.billers);
    }

    public final List<BillerV3Response> getBillers() {
        return this.billers;
    }

    public final PageInfoResponse getPage() {
        return this.page;
    }

    public int hashCode() {
        return this.billers.hashCode() + (this.page.hashCode() * 31);
    }

    public String toString() {
        return "BillersPagedListV3Response(page=" + this.page + ", billers=" + this.billers + ")";
    }
}
