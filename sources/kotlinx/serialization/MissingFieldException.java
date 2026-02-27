package kotlinx.serialization;

import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MissingFieldException extends SerializationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18215a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(ArrayList missingFields, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        j.g(missingFields, "missingFields");
        this.f18215a = missingFields;
    }
}
