package kotlinx.serialization;

import We.s;

/* JADX INFO: loaded from: classes4.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        super(s.f(i, "An unknown field for index "));
    }
}
