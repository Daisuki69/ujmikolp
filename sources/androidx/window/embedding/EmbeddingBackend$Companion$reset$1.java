package androidx.window.embedding;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class EmbeddingBackend$Companion$reset$1 extends k implements Function1<EmbeddingBackend, EmbeddingBackend> {
    public static final EmbeddingBackend$Companion$reset$1 INSTANCE = new EmbeddingBackend$Companion$reset$1();

    public EmbeddingBackend$Companion$reset$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final EmbeddingBackend invoke(EmbeddingBackend it) {
        j.g(it, "it");
        return it;
    }
}
