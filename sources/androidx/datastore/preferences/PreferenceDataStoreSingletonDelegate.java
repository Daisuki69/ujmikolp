package androidx.datastore.preferences;

import Bj.E;
import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.reflect.KProperty;
import tj.InterfaceC2288a;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate implements InterfaceC2288a {

    @GuardedBy("lock")
    private volatile DataStore<Preferences> INSTANCE;
    private final ReplaceFileCorruptionHandler<Preferences> corruptionHandler;
    private final Object lock;
    private final String name;
    private final Function1<Context, List<DataMigration<Preferences>>> produceMigrations;
    private final E scope;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreSingletonDelegate(String name, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, Function1<? super Context, ? extends List<? extends DataMigration<Preferences>>> produceMigrations, E scope) {
        j.g(name, "name");
        j.g(produceMigrations, "produceMigrations");
        j.g(scope, "scope");
        this.name = name;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // tj.InterfaceC2288a
    public DataStore<Preferences> getValue(Context thisRef, KProperty property) {
        DataStore<Preferences> dataStore;
        j.g(thisRef, "thisRef");
        j.g(property, "property");
        DataStore<Preferences> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.INSTANCE;
                    ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler = this.corruptionHandler;
                    Function1<Context, List<DataMigration<Preferences>>> function1 = this.produceMigrations;
                    j.f(applicationContext, "applicationContext");
                    this.INSTANCE = preferenceDataStoreFactory.create(replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) function1.invoke(applicationContext), this.scope, new PreferenceDataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
                }
                dataStore = this.INSTANCE;
                j.d(dataStore);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dataStore;
    }
}
