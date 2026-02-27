package androidx.privacysandbox.ads.adservices.topics;

import We.s;
import defpackage.AbstractC1414e;

/* JADX INFO: loaded from: classes2.dex */
public final class Topic {
    private final long modelVersion;
    private final long taxonomyVersion;
    private final int topicId;

    public Topic(long j, long j6, int i) {
        this.taxonomyVersion = j;
        this.modelVersion = j6;
        this.topicId = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) obj;
        return this.taxonomyVersion == topic.taxonomyVersion && this.modelVersion == topic.modelVersion && this.topicId == topic.topicId;
    }

    public final long getModelVersion() {
        return this.modelVersion;
    }

    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        long j = this.taxonomyVersion;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j6 = this.modelVersion;
        return ((i + ((int) ((j6 >>> 32) ^ j6))) * 31) + this.topicId;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TaxonomyVersion=");
        sb2.append(this.taxonomyVersion);
        sb2.append(", ModelVersion=");
        sb2.append(this.modelVersion);
        sb2.append(", TopicCode=");
        return AbstractC1414e.h("Topic { ", s.o(sb2, " }", this.topicId));
    }
}
