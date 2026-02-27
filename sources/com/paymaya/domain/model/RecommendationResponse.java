package com.paymaya.domain.model;

import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RecommendationResponse {

    @InterfaceC1497a
    @InterfaceC1498b("recommendations")
    private final List<Recommendation> recommendations;

    public RecommendationResponse(List<Recommendation> list) {
        this.recommendations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendationResponse copy$default(RecommendationResponse recommendationResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendationResponse.recommendations;
        }
        return recommendationResponse.copy(list);
    }

    public final List<Recommendation> component1() {
        return this.recommendations;
    }

    public final RecommendationResponse copy(List<Recommendation> list) {
        return new RecommendationResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendationResponse) && j.b(this.recommendations, ((RecommendationResponse) obj).recommendations);
    }

    public final List<Recommendation> getRecommendations() {
        return this.recommendations;
    }

    public int hashCode() {
        List<Recommendation> list = this.recommendations;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "RecommendationResponse(recommendations=" + this.recommendations + ")";
    }
}
