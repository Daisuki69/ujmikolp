package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.Route;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Route, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Route extends Route {
    private final Stop mDestination;
    private final String mId;
    private final String mName;
    private final String mOperator;
    private final Stop mOrigin;
    private final List<Stop> mStops;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Route$Builder */
    public static class Builder extends Route.Builder {
        private Stop mDestination;
        private String mId;
        private String mName;
        private String mOperator;
        private Stop mOrigin;
        private List<Stop> mStops;

        public /* synthetic */ Builder(Route route, int i) {
            this(route);
        }

        @Override // com.paymaya.domain.model.Route.Builder
        public Route build() {
            String strI = this.mName == null ? " mName" : "";
            if (this.mOrigin == null) {
                strI = s.i(strI, " mOrigin");
            }
            if (this.mDestination == null) {
                strI = s.i(strI, " mDestination");
            }
            if (strI.isEmpty()) {
                return new AutoValue_Route(this.mId, this.mName, this.mOperator, this.mOrigin, this.mDestination, this.mStops);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.Route.Builder
        public Route.Builder mDestination(Stop stop) {
            if (stop == null) {
                throw new NullPointerException("Null mDestination");
            }
            this.mDestination = stop;
            return this;
        }

        @Override // com.paymaya.domain.model.Route.Builder
        public Route.Builder mId(String str) {
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Route.Builder
        public Route.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Route.Builder
        public Route.Builder mOperator(String str) {
            this.mOperator = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Route.Builder
        public Route.Builder mOrigin(Stop stop) {
            if (stop == null) {
                throw new NullPointerException("Null mOrigin");
            }
            this.mOrigin = stop;
            return this;
        }

        @Override // com.paymaya.domain.model.Route.Builder
        public Route.Builder mStops(List<Stop> list) {
            this.mStops = list;
            return this;
        }

        public Builder() {
        }

        private Builder(Route route) {
            this.mId = route.mId();
            this.mName = route.mName();
            this.mOperator = route.mOperator();
            this.mOrigin = route.mOrigin();
            this.mDestination = route.mDestination();
            this.mStops = route.mStops();
        }
    }

    public C$$AutoValue_Route(@Nullable String str, String str2, @Nullable String str3, Stop stop, Stop stop2, @Nullable List<Stop> list) {
        this.mId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str2;
        this.mOperator = str3;
        if (stop == null) {
            throw new NullPointerException("Null mOrigin");
        }
        this.mOrigin = stop;
        if (stop2 == null) {
            throw new NullPointerException("Null mDestination");
        }
        this.mDestination = stop2;
        this.mStops = list;
    }

    public boolean equals(Object obj) {
        String str;
        List<Stop> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Route) {
            Route route = (Route) obj;
            String str2 = this.mId;
            if (str2 != null ? str2.equals(route.mId()) : route.mId() == null) {
                if (this.mName.equals(route.mName()) && ((str = this.mOperator) != null ? str.equals(route.mOperator()) : route.mOperator() == null) && this.mOrigin.equals(route.mOrigin()) && this.mDestination.equals(route.mDestination()) && ((list = this.mStops) != null ? list.equals(route.mStops()) : route.mStops() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mId;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.mName.hashCode()) * 1000003;
        String str2 = this.mOperator;
        int iHashCode2 = (((((iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.mOrigin.hashCode()) * 1000003) ^ this.mDestination.hashCode()) * 1000003;
        List<Stop> list = this.mStops;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.Route
    @InterfaceC1498b("destination")
    public Stop mDestination() {
        return this.mDestination;
    }

    @Override // com.paymaya.domain.model.Route
    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.Route
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.Route
    @Nullable
    @InterfaceC1498b("operator")
    public String mOperator() {
        return this.mOperator;
    }

    @Override // com.paymaya.domain.model.Route
    @InterfaceC1498b("origin")
    public Stop mOrigin() {
        return this.mOrigin;
    }

    @Override // com.paymaya.domain.model.Route
    @Nullable
    @InterfaceC1498b("stops")
    public List<Stop> mStops() {
        return this.mStops;
    }

    @Override // com.paymaya.domain.model.Route
    public Route.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Route{mId=");
        sb2.append(this.mId);
        sb2.append(", mName=");
        sb2.append(this.mName);
        sb2.append(", mOperator=");
        sb2.append(this.mOperator);
        sb2.append(", mOrigin=");
        sb2.append(this.mOrigin);
        sb2.append(", mDestination=");
        sb2.append(this.mDestination);
        sb2.append(", mStops=");
        return s.r(sb2, this.mStops, "}");
    }
}
