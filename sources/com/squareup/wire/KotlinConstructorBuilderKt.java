package com.squareup.wire;

/* JADX INFO: loaded from: classes4.dex */
public final class KotlinConstructorBuilderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMap(WireField wireField) {
        return wireField.keyAdapter().length() > 0;
    }
}
