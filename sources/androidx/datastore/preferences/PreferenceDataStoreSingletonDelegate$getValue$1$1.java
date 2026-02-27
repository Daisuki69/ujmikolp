package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate$getValue$1$1 extends k implements Function0<File> {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ PreferenceDataStoreSingletonDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreSingletonDelegate$getValue$1$1(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = preferenceDataStoreSingletonDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        Context applicationContext = this.$applicationContext;
        j.f(applicationContext, "applicationContext");
        return PreferenceDataStoreFile.preferencesDataStoreFile(applicationContext, this.this$0.name);
    }
}
