package io.split.android.client.dtos;

import Hi.a;
import defpackage.AbstractC1414e;
import fi.b;
import g3.InterfaceC1498b;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class KeyImpression implements a, Identifiable {
    static final String FIELD_BUCKETING_KEY = "b";
    static final String FIELD_CHANGE_NUMBER = "c";
    static final String FIELD_KEY_NAME = "k";
    static final String FIELD_LABEL = "r";
    static final String FIELD_PREVIOUS_TIME = "pt";
    static final String FIELD_PROPERTIES = "properties";
    static final String FIELD_TIME = "m";
    static final String FIELD_TREATMENT = "t";

    @InterfaceC1498b(FIELD_BUCKETING_KEY)
    public String bucketingKey;

    @InterfaceC1498b(FIELD_CHANGE_NUMBER)
    public Long changeNumber;
    public transient String feature;

    @InterfaceC1498b(FIELD_KEY_NAME)
    public String keyName;

    @InterfaceC1498b(FIELD_LABEL)
    public String label;

    @InterfaceC1498b(FIELD_PREVIOUS_TIME)
    public Long previousTime;

    @InterfaceC1498b("properties")
    public String properties;
    public transient long storageId;

    @InterfaceC1498b(FIELD_TIME)
    public long time;

    @InterfaceC1498b(FIELD_TREATMENT)
    public String treatment;

    public KeyImpression() {
    }

    public static KeyImpression fromImpression(b bVar) {
        KeyImpression keyImpression = new KeyImpression();
        keyImpression.feature = bVar.f16761b;
        keyImpression.keyName = bVar.f16760a;
        keyImpression.bucketingKey = null;
        keyImpression.time = bVar.f16762d;
        keyImpression.changeNumber = bVar.f;
        keyImpression.treatment = bVar.c;
        keyImpression.label = bVar.e;
        keyImpression.previousTime = bVar.f16763g;
        return keyImpression;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeyImpression keyImpression = (KeyImpression) obj;
        if (this.time != keyImpression.time || !Objects.equals(this.feature, keyImpression.feature) || !this.keyName.equals(keyImpression.keyName) || !this.treatment.equals(keyImpression.treatment)) {
            return false;
        }
        if (this.bucketingKey == null) {
            return keyImpression.bucketingKey == null;
        }
        if (this.previousTime.equals(keyImpression.previousTime) && Objects.equals(this.properties, keyImpression.properties)) {
            return this.bucketingKey.equals(keyImpression.bucketingKey);
        }
        return false;
    }

    @Override // io.split.android.client.dtos.Identifiable
    public long getId() {
        return this.storageId;
    }

    @Override // Hi.a
    public long getSizeInBytes() {
        return 150L;
    }

    public int hashCode() {
        String str = this.feature;
        int iC = AbstractC1414e.c((str != null ? str.hashCode() : 0) * 31, 31, this.keyName);
        String str2 = this.bucketingKey;
        int iC2 = AbstractC1414e.c((iC + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.treatment);
        long j = this.time;
        return this.previousTime.hashCode() + ((iC2 + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public KeyImpression(b bVar) {
        this.feature = bVar.f16761b;
        this.keyName = bVar.f16760a;
        this.bucketingKey = null;
        this.label = bVar.e;
        this.treatment = bVar.c;
        this.time = bVar.f16762d;
        this.changeNumber = bVar.f;
        this.previousTime = bVar.f16763g;
        this.properties = null;
    }
}
