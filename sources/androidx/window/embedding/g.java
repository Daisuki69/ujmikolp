package androidx.window.embedding;

import android.content.Context;
import androidx.window.embedding.EmbeddingBackend;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class g {
    static {
        EmbeddingBackend.Companion companion = EmbeddingBackend.Companion;
    }

    public static EmbeddingBackend a(Context context) {
        return EmbeddingBackend.Companion.getInstance(context);
    }

    public static void b(EmbeddingBackendDecorator embeddingBackendDecorator) {
        EmbeddingBackend.Companion.overrideDecorator(embeddingBackendDecorator);
    }

    public static void c() {
        EmbeddingBackend.Companion.reset();
    }
}
