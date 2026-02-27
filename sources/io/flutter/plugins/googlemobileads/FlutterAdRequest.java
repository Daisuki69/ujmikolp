package io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class FlutterAdRequest {

    @Nullable
    private final Map<String, String> adMobExtras;

    @Nullable
    private final String contentUrl;

    @Nullable
    private final Integer httpTimeoutMillis;

    @Nullable
    private final List<String> keywords;

    @Nullable
    private final List<FlutterMediationExtras> mediationExtras;

    @Nullable
    private final String mediationExtrasIdentifier;

    @Nullable
    private final MediationNetworkExtrasProvider mediationNetworkExtrasProvider;

    @Nullable
    private final List<String> neighboringContentUrls;

    @Nullable
    private final Boolean nonPersonalizedAds;

    @NonNull
    private final String requestAgent;

    public static class Builder {

        @Nullable
        private Map<String, String> adMobExtras;

        @Nullable
        private String contentUrl;

        @Nullable
        private Integer httpTimeoutMillis;

        @Nullable
        private List<String> keywords;

        @Nullable
        private List<FlutterMediationExtras> mediationExtras;

        @Nullable
        private String mediationExtrasIdentifier;

        @Nullable
        private MediationNetworkExtrasProvider mediationNetworkExtrasProvider;

        @Nullable
        private List<String> neighboringContentUrls;

        @Nullable
        private Boolean nonPersonalizedAds;

        @NonNull
        private String requestAgent;

        public FlutterAdRequest build() {
            return new FlutterAdRequest(this.keywords, this.contentUrl, this.nonPersonalizedAds, this.neighboringContentUrls, this.httpTimeoutMillis, this.mediationExtrasIdentifier, this.mediationNetworkExtrasProvider, this.adMobExtras, this.requestAgent, this.mediationExtras);
        }

        @Nullable
        public Map<String, String> getAdMobExtras() {
            return this.adMobExtras;
        }

        @Nullable
        public String getContentUrl() {
            return this.contentUrl;
        }

        @Nullable
        public Integer getHttpTimeoutMillis() {
            return this.httpTimeoutMillis;
        }

        @Nullable
        public List<String> getKeywords() {
            return this.keywords;
        }

        @Nullable
        public List<FlutterMediationExtras> getMediationExtras() {
            return this.mediationExtras;
        }

        @Nullable
        public String getMediationExtrasIdentifier() {
            return this.mediationExtrasIdentifier;
        }

        @Nullable
        public MediationNetworkExtrasProvider getMediationNetworkExtrasProvider() {
            return this.mediationNetworkExtrasProvider;
        }

        @Nullable
        public List<String> getNeighboringContentUrls() {
            return this.neighboringContentUrls;
        }

        @Nullable
        public Boolean getNonPersonalizedAds() {
            return this.nonPersonalizedAds;
        }

        @NonNull
        public String getRequestAgent() {
            return this.requestAgent;
        }

        public Builder setAdMobExtras(@Nullable Map<String, String> map) {
            this.adMobExtras = map;
            return this;
        }

        public Builder setContentUrl(@Nullable String str) {
            this.contentUrl = str;
            return this;
        }

        public Builder setHttpTimeoutMillis(@Nullable Integer num) {
            this.httpTimeoutMillis = num;
            return this;
        }

        public Builder setKeywords(@Nullable List<String> list) {
            this.keywords = list;
            return this;
        }

        public Builder setMediationExtras(@Nullable List<FlutterMediationExtras> list) {
            this.mediationExtras = list;
            return this;
        }

        public Builder setMediationNetworkExtrasIdentifier(@Nullable String str) {
            this.mediationExtrasIdentifier = str;
            return this;
        }

        public Builder setMediationNetworkExtrasProvider(@Nullable MediationNetworkExtrasProvider mediationNetworkExtrasProvider) {
            this.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider;
            return this;
        }

        public Builder setNeighboringContentUrls(@Nullable List<String> list) {
            this.neighboringContentUrls = list;
            return this;
        }

        public Builder setNonPersonalizedAds(@Nullable Boolean bool) {
            this.nonPersonalizedAds = bool;
            return this;
        }

        public Builder setRequestAgent(String str) {
            this.requestAgent = str;
            return this;
        }
    }

    public FlutterAdRequest(@Nullable List<String> list, @Nullable String str, @Nullable Boolean bool, @Nullable List<String> list2, @Nullable Integer num, @Nullable String str2, @Nullable MediationNetworkExtrasProvider mediationNetworkExtrasProvider, @Nullable Map<String, String> map, String str3, @Nullable List<FlutterMediationExtras> list3) {
        this.keywords = list;
        this.contentUrl = str;
        this.nonPersonalizedAds = bool;
        this.neighboringContentUrls = list2;
        this.httpTimeoutMillis = num;
        this.mediationExtrasIdentifier = str2;
        this.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider;
        this.adMobExtras = map;
        this.requestAgent = str3;
        this.mediationExtras = list3;
    }

    private <T extends AbstractAdRequestBuilder<T>> void addNetworkExtras(AbstractAdRequestBuilder<T> abstractAdRequestBuilder, String str) {
        HashMap map = new HashMap();
        List<FlutterMediationExtras> list = this.mediationExtras;
        if (list != null) {
            Iterator<FlutterMediationExtras> it = list.iterator();
            while (it.hasNext()) {
                Pair<Class<? extends MediationExtrasReceiver>, Bundle> mediationExtras = it.next().getMediationExtras();
                map.put((Class) mediationExtras.first, (Bundle) mediationExtras.second);
            }
        } else {
            MediationNetworkExtrasProvider mediationNetworkExtrasProvider = this.mediationNetworkExtrasProvider;
            if (mediationNetworkExtrasProvider != null) {
                map.putAll(mediationNetworkExtrasProvider.getMediationExtras(str, this.mediationExtrasIdentifier));
            }
        }
        Map<String, String> map2 = this.adMobExtras;
        if (map2 != null && !map2.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.adMobExtras.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            map.put(AdMobAdapter.class, bundle);
        }
        Boolean bool = this.nonPersonalizedAds;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) map.get(AdMobAdapter.class);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            map.put(AdMobAdapter.class, bundle2);
        }
        for (Map.Entry entry2 : map.entrySet()) {
            abstractAdRequestBuilder.addNetworkExtrasBundle((Class) entry2.getKey(), (Bundle) entry2.getValue());
        }
    }

    public AdRequest asAdRequest(String str) {
        return ((AdRequest.Builder) updateAdRequestBuilder(new AdRequest.Builder(), str)).build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdRequest)) {
            return false;
        }
        FlutterAdRequest flutterAdRequest = (FlutterAdRequest) obj;
        return Objects.equals(this.keywords, flutterAdRequest.keywords) && Objects.equals(this.contentUrl, flutterAdRequest.contentUrl) && Objects.equals(this.nonPersonalizedAds, flutterAdRequest.nonPersonalizedAds) && Objects.equals(this.neighboringContentUrls, flutterAdRequest.neighboringContentUrls) && Objects.equals(this.httpTimeoutMillis, flutterAdRequest.httpTimeoutMillis) && Objects.equals(this.mediationExtrasIdentifier, flutterAdRequest.mediationExtrasIdentifier) && Objects.equals(this.mediationNetworkExtrasProvider, flutterAdRequest.mediationNetworkExtrasProvider) && Objects.equals(this.adMobExtras, flutterAdRequest.adMobExtras) && Objects.equals(this.mediationExtras, flutterAdRequest.mediationExtras);
    }

    @Nullable
    public Map<String, String> getAdMobExtras() {
        return this.adMobExtras;
    }

    @Nullable
    public String getContentUrl() {
        return this.contentUrl;
    }

    @Nullable
    public Integer getHttpTimeoutMillis() {
        return this.httpTimeoutMillis;
    }

    @Nullable
    public List<String> getKeywords() {
        return this.keywords;
    }

    @Nullable
    public List<FlutterMediationExtras> getMediationExtras() {
        return this.mediationExtras;
    }

    @Nullable
    public String getMediationExtrasIdentifier() {
        return this.mediationExtrasIdentifier;
    }

    @Nullable
    public List<String> getNeighboringContentUrls() {
        return this.neighboringContentUrls;
    }

    @Nullable
    public Boolean getNonPersonalizedAds() {
        return this.nonPersonalizedAds;
    }

    @NonNull
    public String getRequestAgent() {
        return this.requestAgent;
    }

    public int hashCode() {
        return Objects.hash(this.keywords, this.contentUrl, this.nonPersonalizedAds, this.neighboringContentUrls, this.httpTimeoutMillis, this.mediationExtrasIdentifier, this.mediationNetworkExtrasProvider, this.mediationExtras);
    }

    public <T extends AbstractAdRequestBuilder<T>> AbstractAdRequestBuilder<T> updateAdRequestBuilder(AbstractAdRequestBuilder<T> abstractAdRequestBuilder, String str) {
        List<String> list = this.keywords;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                abstractAdRequestBuilder.addKeyword(it.next());
            }
        }
        String str2 = this.contentUrl;
        if (str2 != null) {
            abstractAdRequestBuilder.setContentUrl(str2);
        }
        addNetworkExtras(abstractAdRequestBuilder, str);
        List<String> list2 = this.neighboringContentUrls;
        if (list2 != null) {
            abstractAdRequestBuilder.setNeighboringContentUrls(list2);
        }
        Integer num = this.httpTimeoutMillis;
        if (num != null) {
            abstractAdRequestBuilder.setHttpTimeoutMillis(num.intValue());
        }
        abstractAdRequestBuilder.setRequestAgent(this.requestAgent);
        return abstractAdRequestBuilder;
    }
}
