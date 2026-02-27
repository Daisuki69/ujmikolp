package androidx.privacysandbox.ads.adservices.measurement;

import We.s;
import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.media3.common.PlaybackException;
import cj.C1112C;
import defpackage.AbstractC1414e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(26)
public final class DeletionRequest {
    public static final Companion Companion = new Companion(null);
    public static final int DELETION_MODE_ALL = 0;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = 1;
    public static final int MATCH_BEHAVIOR_DELETE = 0;
    public static final int MATCH_BEHAVIOR_PRESERVE = 1;
    private final int deletionMode;
    private final List<Uri> domainUris;
    private final Instant end;
    private final int matchBehavior;
    private final List<Uri> originUris;
    private final Instant start;

    @RequiresApi(26)
    public static final class Builder {
        private final int deletionMode;
        private List<? extends Uri> domainUris;
        private Instant end;
        private final int matchBehavior;
        private List<? extends Uri> originUris;
        private Instant start;

        public Builder(int i, int i4) {
            this.deletionMode = i;
            this.matchBehavior = i4;
            Instant MIN = Instant.MIN;
            j.f(MIN, "MIN");
            this.start = MIN;
            Instant MAX = Instant.MAX;
            j.f(MAX, "MAX");
            this.end = MAX;
            C1112C c1112c = C1112C.f9377a;
            this.domainUris = c1112c;
            this.originUris = c1112c;
        }

        public final DeletionRequest build() {
            return new DeletionRequest(this.deletionMode, this.matchBehavior, this.start, this.end, this.domainUris, this.originUris);
        }

        public final Builder setDomainUris(List<? extends Uri> domainUris) {
            j.g(domainUris, "domainUris");
            this.domainUris = domainUris;
            return this;
        }

        public final Builder setEnd(Instant end) {
            j.g(end, "end");
            this.end = end;
            return this;
        }

        public final Builder setOriginUris(List<? extends Uri> originUris) {
            j.g(originUris, "originUris");
            this.originUris = originUris;
            return this;
        }

        public final Builder setStart(Instant start) {
            j.g(start, "start");
            this.start = start;
            return this;
        }
    }

    public static final class Companion {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface DeletionMode {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface MatchBehavior {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeletionRequest(int i, int i4, Instant start, Instant end, List<? extends Uri> domainUris, List<? extends Uri> originUris) {
        j.g(start, "start");
        j.g(end, "end");
        j.g(domainUris, "domainUris");
        j.g(originUris, "originUris");
        this.deletionMode = i;
        this.matchBehavior = i4;
        this.start = start;
        this.end = end;
        this.domainUris = domainUris;
        this.originUris = originUris;
    }

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 4), @RequiresExtension(extension = 31, version = 9)})
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final android.adservices.measurement.DeletionRequest convertToAdServices$ads_adservices_release() {
        android.adservices.measurement.DeletionRequest deletionRequestBuild = androidx.privacysandbox.ads.adservices.customaudience.a.m().setDeletionMode(this.deletionMode).setMatchBehavior(this.matchBehavior).setStart(this.start).setEnd(this.end).setDomainUris(this.domainUris).setOriginUris(this.originUris).build();
        j.f(deletionRequestBuild, "Builder()\n            .s…ris)\n            .build()");
        return deletionRequestBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) obj;
        return this.deletionMode == deletionRequest.deletionMode && new HashSet(this.domainUris).equals(new HashSet(deletionRequest.domainUris)) && new HashSet(this.originUris).equals(new HashSet(deletionRequest.originUris)) && j.b(this.start, deletionRequest.start) && j.b(this.end, deletionRequest.end) && this.matchBehavior == deletionRequest.matchBehavior;
    }

    public final int getDeletionMode() {
        return this.deletionMode;
    }

    public final List<Uri> getDomainUris() {
        return this.domainUris;
    }

    public final Instant getEnd() {
        return this.end;
    }

    public final int getMatchBehavior() {
        return this.matchBehavior;
    }

    public final List<Uri> getOriginUris() {
        return this.originUris;
    }

    public final Instant getStart() {
        return this.start;
    }

    public int hashCode() {
        return ((this.end.hashCode() + ((this.start.hashCode() + AbstractC1414e.d(this.originUris, AbstractC1414e.d(this.domainUris, this.deletionMode * 31, 31), 31)) * 31)) * 31) + this.matchBehavior;
    }

    public String toString() {
        StringBuilder sbX = s.x("DeletionRequest { DeletionMode=", this.deletionMode == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA", ", MatchBehavior=", this.matchBehavior == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE", ", Start=");
        sbX.append(this.start);
        sbX.append(", End=");
        sbX.append(this.end);
        sbX.append(", DomainUris=");
        sbX.append(this.domainUris);
        sbX.append(", OriginUris=");
        return s.r(sbX, this.originUris, " }");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeletionRequest(int i, int i4, Instant MIN, Instant MAX, List list, List list2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i6 & 4) != 0) {
            MIN = Instant.MIN;
            j.f(MIN, "MIN");
        }
        Instant instant = MIN;
        if ((i6 & 8) != 0) {
            MAX = Instant.MAX;
            j.f(MAX, "MAX");
        }
        this(i, i4, instant, MAX, (i6 & 16) != 0 ? C1112C.f9377a : list, (i6 & 32) != 0 ? C1112C.f9377a : list2);
    }
}
