package androidx.window.embedding;

import androidx.window.embedding.EmbeddingCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return EmbeddingCompat.Companion.emptyActivityEmbeddingProxy$lambda$2(obj, method, objArr);
    }
}
