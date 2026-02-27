package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ WebSourceParams.Builder d(Uri uri) {
        return new WebSourceParams.Builder(uri);
    }

    public static /* synthetic */ WebSourceRegistrationRequest.Builder h(List list, Uri uri) {
        return new WebSourceRegistrationRequest.Builder(list, uri);
    }

    public static /* synthetic */ WebTriggerParams.Builder k(Uri uri) {
        return new WebTriggerParams.Builder(uri);
    }

    public static /* synthetic */ WebTriggerRegistrationRequest.Builder m(List list, Uri uri) {
        return new WebTriggerRegistrationRequest.Builder(list, uri);
    }

    public static /* synthetic */ GetTopicsRequest.Builder o() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ Topic s(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ Class u() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void w() {
    }
}
