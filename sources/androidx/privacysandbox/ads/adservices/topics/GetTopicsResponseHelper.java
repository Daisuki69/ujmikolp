package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.media3.common.PlaybackException;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class GetTopicsResponseHelper {
    public static final GetTopicsResponseHelper INSTANCE = new GetTopicsResponseHelper();

    private GetTopicsResponseHelper() {
    }

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 4), @RequiresExtension(extension = 31, version = 9)})
    public final GetTopicsResponse convertResponse$ads_adservices_release(android.adservices.topics.GetTopicsResponse response) {
        j.g(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic topicS = androidx.privacysandbox.ads.adservices.measurement.a.s(it.next());
            arrayList.add(new Topic(topicS.getTaxonomyVersion(), topicS.getModelVersion(), topicS.getTopicId()));
        }
        return new GetTopicsResponse(arrayList);
    }

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 11), @RequiresExtension(extension = 31, version = 11)})
    @ExperimentalFeatures.Ext11OptIn
    public final GetTopicsResponse convertResponseWithEncryptedTopics$ads_adservices_release(android.adservices.topics.GetTopicsResponse response) {
        j.g(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic topicS = androidx.privacysandbox.ads.adservices.measurement.a.s(it.next());
            arrayList.add(new Topic(topicS.getTaxonomyVersion(), topicS.getModelVersion(), topicS.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = response.getEncryptedTopics().iterator();
        while (it2.hasNext()) {
            android.adservices.topics.EncryptedTopic encryptedTopicD = a.d(it2.next());
            byte[] encryptedTopic = encryptedTopicD.getEncryptedTopic();
            j.f(encryptedTopic, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopicD.getKeyIdentifier();
            j.f(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopicD.getEncapsulatedKey();
            j.f(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new EncryptedTopic(encryptedTopic, keyIdentifier, encapsulatedKey));
        }
        return new GetTopicsResponse(arrayList, arrayList2);
    }
}
