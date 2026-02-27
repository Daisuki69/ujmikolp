package io.split.android.client.storage.attributes;

import com.google.gson.reflect.TypeToken;
import io.split.android.client.storage.db.attributes.AttributesDao;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements d {
    public static final Type c = new TypeToken<Map<String, Object>>() { // from class: io.split.android.client.storage.attributes.SqLitePersistentAttributesStorage$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AttributesDao f17618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gi.d f17619b;

    public e(AttributesDao attributesDao, Gi.d dVar) {
        Objects.requireNonNull(attributesDao);
        this.f17618a = attributesDao;
        Objects.requireNonNull(dVar);
        this.f17619b = dVar;
    }
}
