package com.dynatrace.agent.storage.di;

import Bj.E;
import Rg.g;
import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.room.Room;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl;
import com.dynatrace.agent.storage.db.OneAgentDatabase;
import com.dynatrace.agent.storage.memory.DynamicConfigDataSource;
import com.dynatrace.agent.storage.memory.DynamicConfigDataSourceImpl;
import com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource;
import com.dynatrace.agent.storage.preference.EndPointInfoDataSource;
import com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl;
import com.dynatrace.agent.storage.preference.MetricsDiskDataSource;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl;
import com.dynatrace.android.agent.util.Utility;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import tj.InterfaceC2288a;

/* JADX INFO: loaded from: classes2.dex */
public final class StorageModule {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final Context context;
    private final InterfaceC2288a dataStore$delegate;

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    private final OneAgentDatabase f9584db;

    static {
        s sVar = new s(StorageModule.class);
        z.f18196a.getClass();
        $$delegatedProperties = new KProperty[]{sVar};
    }

    public StorageModule(Context context, E externalScope) {
        j.g(context, "context");
        j.g(externalScope, "externalScope");
        this.context = context;
        this.dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("dynatrace-preferences", new ReplaceFileCorruptionHandler(new g(27)), null, externalScope, 4, null);
        this.f9584db = (OneAgentDatabase) Room.databaseBuilder(context, OneAgentDatabase.class, "dynatrace-database").build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Preferences dataStore_delegate$lambda$0(CorruptionException it) {
        j.g(it, "it");
        return PreferencesFactory.createEmpty();
    }

    private final DataStore<Preferences> getDataStore(Context context) {
        return (DataStore) this.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }

    public final DynamicConfigDataSource provideDynamicConfigurationDataSource$com_dynatrace_agent_release() {
        return new DynamicConfigDataSourceImpl();
    }

    public final EventDatabaseDataSource provideEventDatabaseDataSource$com_dynatrace_agent_release() {
        return new EventDatabaseDataSourceImpl(this.f9584db.eventDao());
    }

    public final DataStoreExitReasonTimestampDataSource provideExitReasonDataSource$com_dynatrace_agent_release() {
        return new DataStoreExitReasonTimestampDataSource(getDataStore(this.context));
    }

    public final MetricsDiskDataSource provideMetricsDataSource$com_dynatrace_agent_release() {
        return new MetricsDiskDataSource(getDataStore(this.context));
    }

    public final ServerConfigurationDataSource provideServerConfigurationDataSource$com_dynatrace_agent_release() {
        return new ServerConfigurationDataSourceImpl(getDataStore(this.context));
    }

    public final EndPointInfoDataSource provideStartupConfigurationDataSource$com_dynatrace_agent_release() {
        return new EndPointInfoDataSourceImpl(getDataStore(this.context));
    }

    public final void tearDown() {
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "close DB connection");
        this.f9584db.close();
    }
}
