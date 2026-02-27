package io.flutter.plugins.googlemobileads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import io.flutter.plugins.googlemobileads.FlutterAdRequest;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class FlutterAdManagerAdRequest extends FlutterAdRequest {

    @Nullable
    private final Map<String, String> customTargeting;

    @Nullable
    private final Map<String, List<String>> customTargetingLists;

    @Nullable
    private final String publisherProvidedId;

    public static class Builder extends FlutterAdRequest.Builder {

        @Nullable
        private Map<String, String> customTargeting;

        @Nullable
        private Map<String, List<String>> customTargetingLists;

        @Nullable
        private String publisherProvidedId;

        public Builder setCustomTargeting(@Nullable Map<String, String> map) {
            this.customTargeting = map;
            return this;
        }

        public Builder setCustomTargetingLists(@Nullable Map<String, List<String>> map) {
            this.customTargetingLists = map;
            return this;
        }

        public Builder setPublisherProvidedId(@Nullable String str) {
            this.publisherProvidedId = str;
            return this;
        }

        @Override // io.flutter.plugins.googlemobileads.FlutterAdRequest.Builder
        public FlutterAdManagerAdRequest build() {
            return new FlutterAdManagerAdRequest(getKeywords(), getContentUrl(), this.customTargeting, this.customTargetingLists, getNonPersonalizedAds(), getNeighboringContentUrls(), getHttpTimeoutMillis(), this.publisherProvidedId, getMediationExtrasIdentifier(), getMediationNetworkExtrasProvider(), getAdMobExtras(), getRequestAgent(), getMediationExtras(), 0);
        }
    }

    public /* synthetic */ FlutterAdManagerAdRequest(List list, String str, Map map, Map map2, Boolean bool, List list2, Integer num, String str2, String str3, MediationNetworkExtrasProvider mediationNetworkExtrasProvider, Map map3, String str4, List list3, int i) {
        this(list, str, map, map2, bool, list2, num, str2, str3, mediationNetworkExtrasProvider, map3, str4, list3);
    }

    public AdManagerAdRequest asAdManagerAdRequest(String str) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        updateAdRequestBuilder(builder, str);
        Map<String, String> map = this.customTargeting;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builder.addCustomTargeting(entry.getKey(), entry.getValue());
            }
        }
        Map<String, List<String>> map2 = this.customTargetingLists;
        if (map2 != null) {
            for (Map.Entry<String, List<String>> entry2 : map2.entrySet()) {
                builder.addCustomTargeting(entry2.getKey(), entry2.getValue());
            }
        }
        String str2 = this.publisherProvidedId;
        if (str2 != null) {
            builder.setPublisherProvidedId(str2);
        }
        return builder.build();
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdRequest
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdManagerAdRequest)) {
            return false;
        }
        FlutterAdManagerAdRequest flutterAdManagerAdRequest = (FlutterAdManagerAdRequest) obj;
        return super.equals(obj) && Objects.equals(this.customTargeting, flutterAdManagerAdRequest.customTargeting) && Objects.equals(this.customTargetingLists, flutterAdManagerAdRequest.customTargetingLists);
    }

    @Nullable
    public Map<String, String> getCustomTargeting() {
        return this.customTargeting;
    }

    @Nullable
    public Map<String, List<String>> getCustomTargetingLists() {
        return this.customTargetingLists;
    }

    @Nullable
    public String getPublisherProvidedId() {
        return this.publisherProvidedId;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdRequest
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.customTargeting, this.customTargetingLists);
    }

    private FlutterAdManagerAdRequest(@Nullable List<String> list, @Nullable String str, @Nullable Map<String, String> map, @Nullable Map<String, List<String>> map2, @Nullable Boolean bool, @Nullable List<String> list2, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable MediationNetworkExtrasProvider mediationNetworkExtrasProvider, @Nullable Map<String, String> map3, @NonNull String str4, @Nullable List<FlutterMediationExtras> list3) {
        super(list, str, bool, list2, num, str3, mediationNetworkExtrasProvider, map3, str4, list3);
        this.customTargeting = map;
        this.customTargetingLists = map2;
        this.publisherProvidedId = str2;
    }
}
