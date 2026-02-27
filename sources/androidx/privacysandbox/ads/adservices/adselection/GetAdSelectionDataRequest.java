package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.media3.common.PlaybackException;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalFeatures.Ext10OptIn
public final class GetAdSelectionDataRequest {
    private final Uri coordinatorOriginUri;
    private final AdTechIdentifier seller;

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 10), @RequiresExtension(extension = 31, version = 10)})
    public static final class Ext10Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final android.adservices.adselection.GetAdSelectionDataRequest convertGetAdSelectionDataRequest(GetAdSelectionDataRequest request) {
                j.g(request, "request");
                android.adservices.adselection.GetAdSelectionDataRequest getAdSelectionDataRequestBuild = androidx.core.os.b.i().setSeller(request.getSeller().convertToAdServices$ads_adservices_release()).build();
                j.f(getAdSelectionDataRequestBuild, "Builder()\n              …                 .build()");
                return getAdSelectionDataRequestBuild;
            }

            private Companion() {
            }
        }

        private Ext10Impl() {
        }
    }

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 12), @RequiresExtension(extension = 31, version = 12)})
    public static final class Ext12Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final android.adservices.adselection.GetAdSelectionDataRequest convertGetAdSelectionDataRequest(GetAdSelectionDataRequest request) {
                j.g(request, "request");
                android.adservices.adselection.GetAdSelectionDataRequest getAdSelectionDataRequestBuild = androidx.core.os.b.i().setSeller(request.getSeller().convertToAdServices$ads_adservices_release()).setCoordinatorOriginUri(request.getCoordinatorOriginUri()).build();
                j.f(getAdSelectionDataRequestBuild, "Builder()\n              …                 .build()");
                return getAdSelectionDataRequestBuild;
            }

            private Companion() {
            }
        }

        private Ext12Impl() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GetAdSelectionDataRequest(AdTechIdentifier seller) {
        this(seller, null, 2, 0 == true ? 1 : 0);
        j.g(seller, "seller");
    }

    @ExperimentalFeatures.Ext12OptIn
    public static /* synthetic */ void getCoordinatorOriginUri$annotations() {
    }

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 10), @RequiresExtension(extension = 31, version = 10)})
    @SuppressLint({"NewApi"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final android.adservices.adselection.GetAdSelectionDataRequest convertToAdServices$ads_adservices_release() {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        return (adServicesInfo.adServicesVersion() >= 12 || adServicesInfo.extServicesVersionS() >= 12) ? Ext12Impl.Companion.convertGetAdSelectionDataRequest(this) : Ext10Impl.Companion.convertGetAdSelectionDataRequest(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAdSelectionDataRequest)) {
            return false;
        }
        GetAdSelectionDataRequest getAdSelectionDataRequest = (GetAdSelectionDataRequest) obj;
        return j.b(this.seller, getAdSelectionDataRequest.seller) && j.b(this.coordinatorOriginUri, getAdSelectionDataRequest.coordinatorOriginUri);
    }

    public final Uri getCoordinatorOriginUri() {
        return this.coordinatorOriginUri;
    }

    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    public int hashCode() {
        int iHashCode = this.seller.hashCode() * 31;
        Uri uri = this.coordinatorOriginUri;
        return iHashCode + (uri != null ? uri.hashCode() : 0);
    }

    public String toString() {
        return "GetAdSelectionDataRequest: seller=" + this.seller + ", coordinatorOriginUri=" + this.coordinatorOriginUri;
    }

    public GetAdSelectionDataRequest(AdTechIdentifier seller, Uri uri) {
        j.g(seller, "seller");
        this.seller = seller;
        this.coordinatorOriginUri = uri;
    }

    public /* synthetic */ GetAdSelectionDataRequest(AdTechIdentifier adTechIdentifier, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adTechIdentifier, (i & 2) != 0 ? null : uri);
    }
}
