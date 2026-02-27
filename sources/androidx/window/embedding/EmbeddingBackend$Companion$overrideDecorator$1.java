package androidx.window.embedding;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class EmbeddingBackend$Companion$overrideDecorator$1 extends kotlin.jvm.internal.i implements Function1<EmbeddingBackend, EmbeddingBackend> {
    public EmbeddingBackend$Companion$overrideDecorator$1(Object obj) {
        super(obj, "decorate", 1, "decorate(Landroidx/window/embedding/EmbeddingBackend;)Landroidx/window/embedding/EmbeddingBackend;", 0, EmbeddingBackendDecorator.class);
    }

    @Override // kotlin.jvm.functions.Function1
    public final EmbeddingBackend invoke(EmbeddingBackend p02) {
        j.g(p02, "p0");
        return ((EmbeddingBackendDecorator) this.receiver).decorate(p02);
    }
}
