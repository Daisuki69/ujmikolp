package com.dynatrace.agent.communication.di;

import Bj.E;
import com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.communication.CommunicationManager;
import com.dynatrace.agent.communication.CommunicationManagerImpl;
import com.dynatrace.agent.communication.ResponseProcessorImpl;
import com.dynatrace.agent.communication.api.ServerDataListener;
import com.dynatrace.agent.communication.mapper.DbRecordsToRequestBodyMapperImpl;
import com.dynatrace.agent.communication.network.DynatraceOkHttpClientFactory;
import com.dynatrace.agent.communication.network.datasource.NetworkDataSourceImpl;
import com.dynatrace.agent.communication.network.request.ConfigRequestFactory;
import com.dynatrace.agent.communication.network.request.DataRequestFactory;
import com.dynatrace.agent.communication.network.response.ConfigurationsParser;
import com.dynatrace.agent.communication.network.response.ServerConfigurationManagerV4;
import com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.android.agent.conf.ServerConfigurationManager;
import kotlin.jvm.internal.j;
import okhttp3.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class CommunicationModule {
    private final EndPointInfo activeEndpoint;
    private final NetworkConnectivityChecker connectivityChecker;
    private final EventDatabaseDataSource dataBaseDataSource;
    private final E externalScope;
    private final Call.Factory httpFactory;
    private final ServerDataListener serverDataListener;
    private final TimeProvider timeProvider;
    private final String version;

    public CommunicationModule(Call.Factory factory, TimeProvider timeProvider, String version, EventDatabaseDataSource dataBaseDataSource, EndPointInfo activeEndpoint, ServerDataListener serverDataListener, E externalScope, NetworkConnectivityChecker connectivityChecker) {
        j.g(timeProvider, "timeProvider");
        j.g(version, "version");
        j.g(dataBaseDataSource, "dataBaseDataSource");
        j.g(activeEndpoint, "activeEndpoint");
        j.g(serverDataListener, "serverDataListener");
        j.g(externalScope, "externalScope");
        j.g(connectivityChecker, "connectivityChecker");
        this.httpFactory = factory;
        this.timeProvider = timeProvider;
        this.version = version;
        this.dataBaseDataSource = dataBaseDataSource;
        this.activeEndpoint = activeEndpoint;
        this.serverDataListener = serverDataListener;
        this.externalScope = externalScope;
        this.connectivityChecker = connectivityChecker;
    }

    public final CommunicationManager provideCommunicationManager() {
        Call.Factory factoryBuild = this.httpFactory;
        if (factoryBuild == null) {
            factoryBuild = DynatraceOkHttpClientFactory.INSTANCE.createOkHttpClientBuilder().build();
        }
        return new CommunicationManagerImpl(new NetworkDataSourceImpl(factoryBuild, new ConfigRequestFactory(this.version), new DataRequestFactory(this.version, new CommunicationModule$provideCommunicationManager$networkDataSource$1(this.timeProvider), true), new ConfigurationsParser(new ServerConfigurationManager(this.activeEndpoint.getApplicationId()), new ServerConfigurationManagerV4()), this.connectivityChecker), new DispatchableDataProvider(this.activeEndpoint, this.dataBaseDataSource, DbRecordsToRequestBodyMapperImpl.Companion.getEnvelopSize$com_dynatrace_agent_release(1), this.timeProvider), new ResponseProcessorImpl(this.dataBaseDataSource, this.timeProvider), this.serverDataListener, this.externalScope, this.connectivityChecker);
    }
}
