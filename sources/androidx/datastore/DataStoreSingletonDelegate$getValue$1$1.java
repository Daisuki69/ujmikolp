package androidx.datastore;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreSingletonDelegate$getValue$1$1 extends k implements Function0<Path> {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ DataStoreSingletonDelegate<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreSingletonDelegate$getValue$1$1(Context context, DataStoreSingletonDelegate<T> dataStoreSingletonDelegate) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = dataStoreSingletonDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Path invoke() {
        Path.Companion companion = Path.Companion;
        Context applicationContext = this.$applicationContext;
        j.f(applicationContext, "applicationContext");
        String absolutePath = DataStoreFile.dataStoreFile(applicationContext, ((DataStoreSingletonDelegate) this.this$0).fileName).getAbsolutePath();
        j.f(absolutePath, "applicationContext.dataS…le(fileName).absolutePath");
        return Path.Companion.get$default(companion, absolutePath, false, 1, (Object) null);
    }
}
