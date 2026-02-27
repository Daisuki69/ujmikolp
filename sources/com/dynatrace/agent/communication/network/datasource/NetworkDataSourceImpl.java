package com.dynatrace.agent.communication.network.datasource;

import com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker;
import com.dynatrace.agent.communication.LocalServerData;
import com.dynatrace.agent.communication.api.ServerDataUpdate;
import com.dynatrace.agent.communication.network.request.ConfigRequestFactory;
import com.dynatrace.agent.communication.network.request.DataRequestFactory;
import com.dynatrace.agent.communication.network.response.ConfigurationsParser;
import com.dynatrace.agent.communication.network.response.ResponseResult;
import com.dynatrace.agent.communication.network.response.ResponseResultKt;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import gj.InterfaceC1526a;
import kotlin.jvm.internal.j;
import kotlin.time.a;
import kotlin.time.b;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import zj.y;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkDataSourceImpl implements NetworkDataSource {
    private final Call.Factory client;
    private final ConfigRequestFactory configRequestFactory;
    private final ConfigurationsParser configurationsParser;
    private final NetworkConnectivityChecker connectivityChecker;
    private final DataRequestFactory dataRequestFactory;

    public NetworkDataSourceImpl(Call.Factory client, ConfigRequestFactory configRequestFactory, DataRequestFactory dataRequestFactory, ConfigurationsParser configurationsParser, NetworkConnectivityChecker connectivityChecker) {
        j.g(client, "client");
        j.g(configRequestFactory, "configRequestFactory");
        j.g(dataRequestFactory, "dataRequestFactory");
        j.g(configurationsParser, "configurationsParser");
        j.g(connectivityChecker, "connectivityChecker");
        this.client = client;
        this.configRequestFactory = configRequestFactory;
        this.dataRequestFactory = dataRequestFactory;
        this.configurationsParser = configurationsParser;
        this.connectivityChecker = connectivityChecker;
    }

    private final ResponseResult handleResponse(Response response, LocalServerData localServerData, EndPointInfo endPointInfo) {
        long jF;
        if (ResponseResultKt.isTooManyRequest(response)) {
            String str = response.headers().get("Retry-After");
            Long lG = str != null ? y.g(str) : null;
            if (lG != null) {
                a.C0097a c0097a = a.f18208b;
                jF = b.f(lG.longValue(), Aj.b.f331d);
            } else {
                jF = NetworkDataSourceImplKt.TOO_MANY_REQUESTS_DEFAULT_DELAY;
            }
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "erroneous response: too many requests; retry-after: " + lG);
            return new ResponseResult.TooManyRequests(jF, null);
        }
        if (ResponseResultKt.isUnexpectedError(response)) {
            ResponseBody responseBodyBody = response.body();
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "erroneous response: unexpected response code: " + response.code() + "; body: " + (responseBodyBody != null ? responseBodyBody.string() : null));
            return ResponseResult.UnexpectedError.INSTANCE;
        }
        ResponseBody responseBodyBody2 = response.body();
        String strString = responseBodyBody2 != null ? responseBodyBody2.string() : null;
        if (strString == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "erroneous response: no body; response code: " + response.code());
            return ResponseResult.UnexpectedError.INSTANCE;
        }
        ServerDataUpdate serverDataUpdate = this.configurationsParser.parse$com_dynatrace_agent_release(strString, localServerData, endPointInfo);
        if (serverDataUpdate == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "erroneous config received: parsing error; response code: " + response.code() + "; body: " + strString);
            return ResponseResult.UnexpectedError.INSTANCE;
        }
        if (ResponseResultKt.isSuccess(response)) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "successful response: ".concat(strString));
            return new ResponseResult.Success(serverDataUpdate);
        }
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "retrying due to erroneous response code: " + response.code() + "; body: " + strString);
        return new ResponseResult.Retry(String.valueOf(response.code()), serverDataUpdate);
    }

    @Override // com.dynatrace.agent.communication.network.datasource.NetworkDataSource
    public Object executeConfigRequest(ConfigRequest configRequest, InterfaceC1526a<? super ResponseResult> interfaceC1526a) {
        try {
            if (!this.connectivityChecker.currentNetworkState().isConnected()) {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config request failed: no connectivity");
                return new ResponseResult.RetryNoConnectivity(null, 1, null);
            }
            Call.Factory factory = this.client;
            Request requestCreateRequest = this.configRequestFactory.createRequest(configRequest);
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config request: " + requestCreateRequest);
            return handleResponse(FirebasePerfOkHttpClient.execute(factory.newCall(requestCreateRequest)), configRequest.getServerData(), configRequest.getEndPointInfo());
        } catch (Exception e) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config request failed with exception:", e);
            return ResponseResult.UnexpectedError.INSTANCE;
        }
    }

    @Override // com.dynatrace.agent.communication.network.datasource.NetworkDataSource
    public Object executeDataRequest(DataRequest dataRequest, InterfaceC1526a<? super ResponseResult> interfaceC1526a) {
        try {
            if (!this.connectivityChecker.currentNetworkState().isConnected()) {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "data request failed: no connectivity");
                return new ResponseResult.RetryNoConnectivity(null, 1, null);
            }
            Call.Factory factory = this.client;
            Request requestCreateRequest = this.dataRequestFactory.createRequest(dataRequest);
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "data request: " + requestCreateRequest);
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "data request body: " + dataRequest.getBody());
            return handleResponse(FirebasePerfOkHttpClient.execute(factory.newCall(requestCreateRequest)), dataRequest.getServerData(), dataRequest.getEndPointInfo());
        } catch (Exception e) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "data request failed with exception:", e);
            return ResponseResult.UnexpectedError.INSTANCE;
        }
    }
}
