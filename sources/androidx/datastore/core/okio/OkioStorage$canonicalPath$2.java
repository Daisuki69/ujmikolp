package androidx.datastore.core.okio;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public final class OkioStorage$canonicalPath$2 extends k implements Function0<Path> {
    final /* synthetic */ OkioStorage<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorage$canonicalPath$2(OkioStorage<T> okioStorage) {
        super(0);
        this.this$0 = okioStorage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Path invoke() {
        Path path = (Path) ((OkioStorage) this.this$0).producePath.invoke();
        boolean zIsAbsolute = path.isAbsolute();
        OkioStorage<T> okioStorage = this.this$0;
        if (zIsAbsolute) {
            return path.normalized();
        }
        throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + ((OkioStorage) okioStorage).producePath + ", instead got " + path).toString());
    }
}
